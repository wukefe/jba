package webdsl.generated.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import org.apache.lucene.analysis.WhitespaceAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.IndexWriterConfig.OpenMode;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.spell.SpellChecker;
import org.apache.lucene.search.spell.Dictionary;
import org.apache.lucene.search.spell.LuceneDictionary;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.BooleanClause.Occur;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.MatchAllDocsQuery;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.SearchFactory;
import org.hibernate.search.reader.ReaderProvider;
import org.hibernate.search.store.DirectoryProvider;
import org.hibernate.search.store.FSDirectoryProvider;
import org.webdsl.search.AutoCompleter;
import org.webdsl.search.SearchSuggester;
import org.webdsl.search.SearchHelper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.*;
import webdsl.generated.domain.*;
import org.webdsl.lang.*;

@SuppressWarnings("all") public class IndexManager  
{ 
  private static long lastFacetReaderRenewal;

  private static String currentNamespace = null;

  private static IndexReader currentSourceReader = null;

  private static IndexReader currentNamespaceReader = null;

  public static void main(String[] args)
  { 
    reindex(Arrays.asList(args));
    System.exit(0);
  }

  static
  { 
    org.webdsl.logging.Logger.info("Absolute path of indexdir: " + new File(indexDir()).getAbsolutePath());
    lastFacetReaderRenewal = 0;
  }

  public static void tryDropIndex()
  { 
    if("create-drop".equals(utils.BuildProperties.getDbMode()))
    { 
      log("Db-mode is set to create-drop -> Clearing search indexes");
      FullTextSession fts = getFullTextSession();
      fts.purgeAll(Object.class);
      fts.getSearchFactory().optimize();
      fts.flushToIndexes();
      log("Clearing search indexes successful");
    }
  }

  public static void reindex()
  { 
    reindex(new ArrayList<String>());
  }

  private static void reindex(List<String> entities)
  { 
    log("Starting reindexing of searchable data...");
    long time = System.currentTimeMillis();
    if(entities == null || entities.isEmpty() || entities.contains("dummy_webdsl_entity") || entities.contains("webdsl.generated.domain.dummy_webdsl_entity"))
    { 
      reindexEntityClass(webdsl.generated.domain.dummy_webdsl_entity.class);
    }
    indexSuggestions();
    time = System.currentTimeMillis() - time;
    log("Reindexing finished in " + time + "ms total.");
  }

  public static void renewFacetIndexReaders()
  { 
    new FacetRenewerThread().start();
  }

  public static void closeFacetIndexReaders()
  { 
    dummy_webdsl_entitySearcher.closeBoboReader();
    lastFacetReaderRenewal = 0l;
  }

  private static void renewFacetIndexReadersInternal()
  { 
    if(getModifiedTimeIndex(dummy_webdsl_entity.class) > lastFacetReaderRenewal)
    { 
      dummy_webdsl_entitySearcher.tryRenewBoboReader();
    }
    lastFacetReaderRenewal = System.currentTimeMillis();
  }

  public static void reindex(org.webdsl.WebDSLEntity ent)
  { 
    getFullTextSession().index(ent);
  }

  public static void removeFromIndex(org.webdsl.WebDSLEntity ent)
  { 
    getFullTextSession().purge(ent.getClass(), ent.getId());
  }

  private static boolean reindexEntityClass(Class<?> c)
  { 
    String entityName = c.getName().substring(c.getPackage().getName().length() + 1);
    log("---Reindexing: " + entityName + "---");
    long time = System.currentTimeMillis();
    org.hibernate.search.FullTextSession ftSession = getFullTextSession();
    try
    { 
      ftSession.createIndexer(c).progressMonitor(new org.webdsl.search.IndexProgressMonitor(2000, entityName)).batchSizeToLoadObjects(10).threadsToLoadObjects(4).threadsForSubsequentFetching(8).threadsForIndexWriter(3).purgeAllOnStart(true).startAndWait();
    }
    catch(Exception ex)
    { 
      org.webdsl.logging.Logger.error("Error during reindexing of entity: " + entityName, ex);
      return false;
    }
    finally
    { 
      if(ftSession != null)
      { 
        ftSession.close();
        ftSession = null;
      }
    }
    time = System.currentTimeMillis() - time;
    log("---Done in " + time + "ms.---");
    return true;
  }

  public static void indexSuggestions()
  { 
    indexSuggestions(null);
  }

  public static void indexSuggestions(List<String> namespaces)
  { }

  private static boolean clearIndex(File path)
  { 
    try
    { 
      if(path == null || !path.exists())
        return true;
      FSDirectory indexDir = new FSDirectoryProvider().getDirectory();
      IndexWriter writer = new IndexWriter(indexDir.open(path), new IndexWriterConfig(Version.LUCENE_CURRENT, new WhitespaceAnalyzer(Version.LUCENE_CURRENT)));
      writer.deleteAll();
      writer.close();
      return true;
    }
    catch(Exception ex)
    { 
      org.webdsl.logging.Logger.error("Error while clearing index on location: " + path, ex);
      return false;
    }
  }

  public static void clearAutoCompleteIndex(String entity)
  { 
  }

  public static void clearSpellCheckIndex(String entity)
  { 
  }

  public static void clearAutoCompleteIndex(String entity, String[] fields)
  { 
    Class<?> entityClass = null;
    if(entityClass == null)
      return;
    for(int c = 0; c < fields.length; c++)
    { 
      log("Clearing autocomplete index for entity: " + entity + ", field: " + fields[c]);
      File path = new File(indexDirAutoComplete(entityClass, fields[c]));
      if(clearIndex(path))
        log("Clearing autocomplete index successful");
      else
        log("Clearing autocomplete index unsuccessful");
    }
  }

  public static void clearSpellCheckIndex(String entity, String[] fields)
  { 
    Class<?> entityClass = null;
    if(entityClass == null)
      return;
    for(int c = 0; c < fields.length; c++)
    { 
      log("Clearing spellcheck index for entity: " + entity + ", field: " + fields[c]);
      File path = new File(indexDirSpellCheck(entityClass, fields[c]));
      if(clearIndex(path))
        log("Clearing spellcheck index successful");
      else
        log("Clearing spellcheck index unsuccessful");
    }
  }

  public static void optimizeIndex()
  { 
    log("Optimizing search index started.");
    getSearchFactory().optimize();
    log("Optimizing search index finished succesfully.");
  }

  public static long getModifiedTimeIndex(Class<?> entityClass)
  { 
    try
    { 
      DirectoryProvider[] directoryProviders = getSearchFactory().getDirectoryProviders(entityClass);
      if(directoryProviders == null || directoryProviders.length < 1)
        return 0;
      Directory dir = directoryProviders[0].getDirectory();
      if(dir == null)
        return 0;
      return IndexReader.lastModified(dir);
    }
    catch(Exception ex)
    { 
      org.webdsl.logging.Logger.error("Could not retrieve modified timestamp of search index.", ex);
      return 0;
    }
  }

  public static String indexDir()
  { 
    return "searchindex/web-dsl-simple";
  }

  public static String indexDirSpellCheck(Class<?> entityClass, String field)
  { 
    return indexDir() + "/SpellCheck/" + entityClass.getName() + "/" + field;
  }

  public static String indexDirSpellCheck(Class<?> entityClass, String field, String namespace)
  { 
    if(namespace == null || namespace.isEmpty())
      return indexDirSpellCheck(entityClass, field);
    try
    { 
      return indexDir() + "/SpellCheck/" + entityClass.getName() + "." + java.net.URLEncoder.encode(namespace, "UTF-8") + "/" + field;
    }
    catch(java.io.UnsupportedEncodingException ex)
    { 
      org.webdsl.logging.Logger.error("Could not encode namespace property '" + namespace + "'", ex);
      return indexDir() + "/SpellCheck/" + entityClass.getName() + "." + namespace + "/" + field;
    }
  }

  public static String indexDirAutoComplete(Class<?> entityClass, String field)
  { 
    return indexDir() + "/AutoComplete/" + entityClass.getName() + "/" + field;
  }

  public static String indexDirAutoComplete(Class<?> entityClass, String field, String namespace)
  { 
    if(namespace == null || namespace.isEmpty())
      return indexDirAutoComplete(entityClass, field);
    try
    { 
      return indexDir() + "/AutoComplete/" + entityClass.getName() + "." + java.net.URLEncoder.encode(namespace, "UTF-8") + "/" + field;
    }
    catch(java.io.UnsupportedEncodingException ex)
    { 
      org.webdsl.logging.Logger.error("Could not encode namespace property '" + namespace + "'", ex);
      return indexDir() + "/AutoComplete/" + entityClass.getName() + "." + namespace + "/" + field;
    }
  }

  public static String indexName(Class<?> entityClass)
  { 
    if(webdsl.generated.domain.dummy_webdsl_entity.class.equals(entityClass))
    { 
      return "webdsl.generated.domain.dummy_webdsl_entity";
    }
    return null;
  }

  private static FullTextSession getFullTextSession()
  { 
    return org.hibernate.search.Search.getFullTextSession(utils.HibernateUtil.getCurrentSession());
  }

  private static SearchFactory getSearchFactory()
  { 
    return getFullTextSession().getSearchFactory();
  }

  public static void reindexSuggestions(Class<?> entityClass, String[] completionFields, String[] spellcheckFields)
  { 
    reindexSuggestions(entityClass, completionFields, spellcheckFields, null);
  }

  @SuppressWarnings("deprecation") public synchronized static void reindexSuggestions(Class<?> entityClass, String[] completionFields, String[] spellcheckFields, List<String> namespaces)
  { 
    SearchFactory searchFactory = getSearchFactory();
    DirectoryProvider[] directoryProviders = searchFactory.getDirectoryProviders(entityClass);
    ReaderProvider readerProvider = searchFactory.getReaderProvider();
    IndexReader sourceReader = readerProvider.openReader(directoryProviders);
    Directory sourceDir = (Directory)directoryProviders[0].getDirectory();
    try
    { 
      LuceneDictionary dict = null;
      Iterator<String> namespaceIt;
      long lastModified;
      try
      { 
        lastModified = IndexReader.lastModified(sourceDir);
      }
      catch(Exception ex)
      { 
        org.webdsl.logging.Logger.error("EXCEPTION", ex);
        lastModified = 0;
      }
      if(namespaces == null || namespaces.isEmpty())
      { 
        dict = new LuceneDictionary(sourceReader, SearchHelper.NAMESPACEFIELD);
        namespaceIt = dict.getWordsIterator();
      }
      else
      { 
        namespaceIt = namespaces.iterator();
      }
      reindexAutoCompletion(sourceReader, entityClass, completionFields, null, lastModified);
      reindexSpellCheck(sourceReader, entityClass, spellcheckFields, null, lastModified);
      try
      { 
        String currentNamespace = "";
        while(namespaceIt.hasNext() && !org.webdsl.servlet.ServletState.isServletDestroying())
        { 
          currentNamespace = namespaceIt.next();
          try
          { 
            reindexAutoCompletion(sourceReader, entityClass, completionFields, currentNamespace, lastModified);
            reindexSpellCheck(sourceReader, entityClass, spellcheckFields, currentNamespace, lastModified);
          }
          catch(Exception ex)
          { 
            org.webdsl.logging.Logger.error("Error during renewal of suggestion indexes:", ex);
          }
          finally
          { 
            if(currentNamespaceReader != null)
            { 
              try
              { 
                currentNamespaceReader.close();
              }
              catch(Exception ex)
              { 
                org.webdsl.logging.Logger.error("Could not close temporary namespace index reader:", ex);
              }
              currentNamespaceReader = null;
            }
          }
        }
      }
      catch(Exception ex)
      { 
        org.webdsl.logging.Logger.error("EXCEPTION", ex);
      }
      if(dict != null)
      { 
        cleanupUnusedSuggestIndices(entityClass, dict.getWordsIterator());
      }
    }
    finally
    { 
      readerProvider.closeReader(sourceReader);
    }
  }

  private static synchronized IndexReader getNamespaceFilteredReader(IndexReader sourceReader, String namespace)
  { 
    if(namespace == null || namespace.isEmpty())
    { 
      return sourceReader;
    }
    if(currentSourceReader == sourceReader && currentNamespace == namespace && currentNamespaceReader != null)
    { 
      return currentNamespaceReader;
    }
    currentSourceReader = sourceReader;
    currentNamespace = namespace;
    Query negatedNamespaceQuery = mustNotNamespaceQuery(currentNamespace);
    String tmpIndexPath = IndexManager.indexDir() + "/tmp";
    Directory tmpDir = null;
    IndexWriter nsIndexWriter = null;
    try
    { 
      tmpDir = FSDirectory.open(new File(tmpIndexPath));
      if(currentNamespaceReader != null)
      { 
        try
        { 
          currentNamespaceReader.close();
        }
        catch(Exception ex)
        { 
          org.webdsl.logging.Logger.error("EXCEPTION", ex);
        }
        currentNamespaceReader = null;
      }
      tmpDir = FSDirectory.open(new File(tmpIndexPath));
      IndexWriterConfig writerCfg = new IndexWriterConfig(Version.LUCENE_CURRENT, new WhitespaceAnalyzer(Version.LUCENE_CURRENT)).setRAMBufferSizeMB((int)IndexWriterConfig.DEFAULT_RAM_BUFFER_SIZE_MB);
      writerCfg.setOpenMode(OpenMode.CREATE);
      nsIndexWriter = new IndexWriter(tmpDir, writerCfg);
      nsIndexWriter.addIndexes(sourceReader);
      nsIndexWriter.deleteDocuments(negatedNamespaceQuery);
      nsIndexWriter.optimize();
    }
    catch(Exception ex)
    { 
      org.webdsl.logging.Logger.error("Error during renewal of suggestion indexes", ex);
    }
    finally
    { 
      if(nsIndexWriter != null)
      { 
        try
        { 
          nsIndexWriter.close();
        }
        catch(Exception ex2)
        { 
          org.webdsl.logging.Logger.error("EXCEPTION", ex2);
        }
      }
    }
    try
    { 
      currentNamespaceReader = IndexReader.open(tmpDir);
    }
    catch(Exception ex)
    { 
      org.webdsl.logging.Logger.error("EXCEPTION", ex);
    }
    try
    { 
      tmpDir.close();
    }
    catch(IOException ex)
    { 
      org.webdsl.logging.Logger.error("EXCEPTION", ex);
    }
    return currentNamespaceReader;
  }

  private static void log(String message)
  { 
    org.webdsl.logging.Logger.info(message);
  }

  private static void reindexAutoCompletion(IndexReader sourceReader, Class<?> entityClass, String[] completionFields, String namespace, long lastModified)
  { 
    Directory acDir = null;
    AutoCompleter ac = null;
    IndexReader rdr = null;
    String namespaceInfo = namespace == null || namespace.isEmpty() ? "" : ", namespace: " + namespace;
    String entityName = entityClass.getName().substring(entityClass.getPackage().getName().length() + 1);
    for(String field : completionFields)
    { 
      if(org.webdsl.servlet.ServletState.isServletDestroying())
      { 
        return;
      }
      log("Creating/updating autocomplete index [field: " + entityName + ">" + field + namespaceInfo + "]");
      try
      { 
        String acPath = IndexManager.indexDirAutoComplete(entityClass, field, namespace);
        File f = new File(acPath);
        if(f.exists())
        { 
          acDir = FSDirectory.open(f);
          if(IndexReader.lastModified(acDir) > lastModified)
          { 
            log("no updates");
            continue;
          }
        }
        else
        { 
          acDir = FSDirectory.open(f);
        }
        rdr = getNamespaceFilteredReader(sourceReader, namespace);
        if(rdr.numDocs() < 1)
        { 
          log("no updates");
          continue;
        }
        ac = new AutoCompleter(acDir);
        ac.indexDictionary(rdr, field);
        SearchSuggester.forceAutoCompleterRenewal(acPath);
      }
      catch(Exception ex)
      { 
        org.webdsl.logging.Logger.error("EXCEPTION", ex);
      }
      finally
      { 
        if(ac != null)
        { 
          try
          { 
            ac.close();
          }
          catch(Exception ex)
          { 
            org.webdsl.logging.Logger.error("EXCEPTION", ex);
          }
          ac = null;
        }
        if(acDir != null)
        { 
          try
          { 
            acDir.close();
          }
          catch(Exception ex)
          { 
            org.webdsl.logging.Logger.error("EXCEPTION", ex);
          }
          acDir = null;
        }
      }
      log("Done");
    }
  }

  private static void reindexSpellCheck(IndexReader sourceReader, Class<?> entityClass, String[] spellCheckFields, String namespace, long lastModified)
  { 
    Directory scDir = null;
    SpellChecker sc = null;
    IndexReader rdr = null;
    String namespaceInfo = namespace == null || namespace.isEmpty() ? ", namespace: " + namespace : "";
    String entityName = entityClass.getName().substring(entityClass.getPackage().getName().length() + 1);
    for(String field : spellCheckFields)
    { 
      if(org.webdsl.servlet.ServletState.isServletDestroying())
      { 
        return;
      }
      log("Creating/updating spellcheck index [field: " + entityName + ">" + field + namespaceInfo + "]");
      try
      { 
        String scPath = IndexManager.indexDirSpellCheck(entityClass, field, namespace);
        File f = new File(scPath);
        if(f.exists())
        { 
          scDir = FSDirectory.open(f);
          if(IndexReader.lastModified(scDir) > lastModified)
          { 
            log("no updates");
            continue;
          }
        }
        else
        { 
          scDir = FSDirectory.open(f);
        }
        rdr = getNamespaceFilteredReader(sourceReader, namespace);
        if(rdr.numDocs() < 1)
        { 
          log("no updates");
          continue;
        }
        sc = new SpellChecker(scDir);
        Dictionary dictionary = new LuceneDictionary(rdr, field);
        sc.indexDictionary(dictionary, new IndexWriterConfig(Version.LUCENE_CURRENT, new WhitespaceAnalyzer(Version.LUCENE_CURRENT)), true);
        SearchSuggester.forceSpellCheckerRenewal(scPath);
      }
      catch(Exception ex)
      { 
        org.webdsl.logging.Logger.error("EXCEPTION", ex);
      }
      finally
      { 
        if(sc != null)
        { 
          try
          { 
            sc.close();
          }
          catch(Exception ex)
          { 
            org.webdsl.logging.Logger.error("EXCEPTION", ex);
          }
          sc = null;
        }
        if(scDir != null)
        { 
          try
          { 
            scDir.close();
          }
          catch(Exception ex)
          { 
            org.webdsl.logging.Logger.error("EXCEPTION", ex);
          }
          scDir = null;
        }
      }
      log("Done ");
    }
  }

  private static Query mustNotNamespaceQuery(String namespace)
  { 
    BooleanQuery q = new BooleanQuery();
    q.add(new MatchAllDocsQuery(), Occur.SHOULD);
    q.add(new TermQuery(new Term(SearchHelper.NAMESPACEFIELD, namespace)), Occur.MUST_NOT);
    return q;
  }

  private static void cleanupUnusedSuggestIndices(Class<?> entityClass, Iterator<String> namespacesIt)
  { 
    String className = entityClass.getName();
    final ArrayList<String> namespacesEncoded = new ArrayList<String>();
    final Pattern pattern = Pattern.compile(className.replaceAll("\\.", "\\\\.") + "\\.(.+)");
    String ns, nsEncoded;
    while(namespacesIt.hasNext())
    { 
      ns = namespacesIt.next();
      try
      { 
        nsEncoded = java.net.URLEncoder.encode(ns, "UTF-8");
      }
      catch(java.io.UnsupportedEncodingException ex)
      { 
        nsEncoded = ns;
      }
      if(!ns.isEmpty())
      { 
        namespacesEncoded.add(nsEncoded);
      }
    }
    FileFilter activeNamespaceDirFilter = new FileFilter()
                                          { 
                                            public boolean accept(File file)
                                            { 
                                              Matcher m = pattern.matcher(file.getAbsolutePath());
                                              m.find();
                                              try
                                              { 
                                                return file.isDirectory() && !namespacesEncoded.contains(m.group(1));
                                              }
                                              catch(java.lang.IllegalStateException exception)
                                              { 
                                                return false;
                                              }
                                            }
                                          };
    File dir;
    dir = new File(indexDir() + "/SpellCheck");
    if(dir.exists())
    { 
      File[] files = dir.listFiles(activeNamespaceDirFilter);
      for(File file : files)
      { 
        String pathKey = file.getAbsolutePath().substring(file.getAbsolutePath().indexOf(indexDir()));
        SearchSuggester.forceSpellCheckerRenewal(pathKey);
        log("Removing unused suggestion index: " + file.getAbsolutePath());
        delete(file);
      }
    }
    dir = new File(indexDir() + "/AutoComplete");
    if(dir.exists())
    { 
      File[] files = dir.listFiles(activeNamespaceDirFilter);
      for(File file : files)
      { 
        String pathKey = file.getAbsolutePath().substring(file.getAbsolutePath().indexOf(indexDir()));
        SearchSuggester.forceAutoCompleterRenewal(pathKey);
        log("Removing unused suggestion index: " + file.getAbsolutePath());
        delete(file);
      }
    }
  }

  private static void delete(File f)
  { 
    if(f == null)
      return;
    if(f.isDirectory())
    { 
      for(File c : f.listFiles())
        delete(c);
    }
    if(!f.delete())
      org.webdsl.logging.Logger.error("EXCEPTION", new FileNotFoundException("Failed to delete file: " + f));
  }

  private static class FacetRenewerThread extends Thread 
  { 
    public void run()
    { 
      try
      { 
        Thread.sleep(3000);
      }
      catch(Exception ex)
      { 
        org.webdsl.logging.Logger.error(ex);
      }
      webdsl.generated.search.IndexManager.renewFacetIndexReadersInternal();
    }
  }
}