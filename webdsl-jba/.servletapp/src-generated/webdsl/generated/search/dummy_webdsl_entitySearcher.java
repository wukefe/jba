package webdsl.generated.search;

import utils.HibernateUtilConfigured;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Date;
import org.apache.lucene.index.IndexReader;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.SearchFactory;
import org.hibernate.search.store.DirectoryProvider;
import org.apache.lucene.search.BooleanClause.Occur;
import org.apache.lucene.store.Directory;
import org.apache.lucene.analysis.PerFieldAnalyzerWrapper;
import org.apache.lucene.analysis.Analyzer;
import org.webdsl.search.SearchSuggester;
import org.webdsl.search.QueryDef;
import com.browseengine.bobo.api.BoboIndexReader;
import com.browseengine.bobo.facets.FacetHandler;

public class dummy_webdsl_entitySearcher extends org.webdsl.search.AbstractEntitySearcher<webdsl.generated.domain.dummy_webdsl_entity, dummy_webdsl_entitySearcher> 
{ 
  private static Analyzer _analyzer;

  private static Analyzer _highlightAnalyzer;

  private static BoboIndexReader _boboReader;

  static
  { 
    _highlightAnalyzer = org.hibernate.search.Search.getFullTextSession(utils.HibernateUtil.getCurrentSession()).getSearchFactory().getAnalyzer(webdsl.generated.domain.dummy_webdsl_entity.class);
    _analyzer = org.hibernate.search.Search.getFullTextSession(utils.HibernateUtil.getCurrentSession()).getSearchFactory().getAnalyzer(webdsl.generated.domain.dummy_webdsl_entity.class);
  }

  public dummy_webdsl_entitySearcher () 
  { 
    entityClass = webdsl.generated.domain.dummy_webdsl_entity.class;
    analyzer = _analyzer;
    highlightAnalyzer = _highlightAnalyzer;
    searchFields = defaultSearchFields = new String[]{"text"};
    untokenizedFields = new String[]{};
    mltSearchFields = new String[]{"text"};
    rootQD = parentQD = currentQD = new QueryDef(Occur.SHOULD, new String[]{"text"});
  }

  public static dummy_webdsl_entitySearcher fromString(String str)
  { 
    return (dummy_webdsl_entitySearcher)fromParamMap(utils.URLFilter.URLEncodingToParamMap(str));
  }

  public boolean instanceOf(String s)
  { 
    return s.equals("dummy_webdsl_entitySearcher");
  }

  public static ArrayList<String> spellSuggest(String toSuggestOn, List<String> fields, float accuracy, int noSug)
  { 
    return spellSuggest(toSuggestOn, "", fields, accuracy, noSug);
  }

  public static ArrayList<String> spellSuggest(String toSuggestOn, String field, float accuracy, int noSug)
  { 
    return spellSuggest(toSuggestOn, "", field, accuracy, noSug);
  }

  public static ArrayList<String> spellSuggest(String toSuggestOn, String namespace, List<String> fields, float accuracy, int noSug)
  { 
    String baseDir = IndexManager.indexDirSpellCheck(webdsl.generated.domain.dummy_webdsl_entity.class, "", namespace);
    return SearchSuggester.findSpellSuggestions(webdsl.generated.domain.dummy_webdsl_entity.class, baseDir, fields, noSug, accuracy, true, _analyzer, toSuggestOn);
  }

  public static ArrayList<String> spellSuggest(String toSuggestOn, String namespace, String field, float accuracy, int noSug)
  { 
    String baseDir = IndexManager.indexDirSpellCheck(webdsl.generated.domain.dummy_webdsl_entity.class, "", namespace);
    return SearchSuggester.findSpellSuggestionsForField(webdsl.generated.domain.dummy_webdsl_entity.class, baseDir, field, noSug, accuracy, true, _analyzer, toSuggestOn);
  }

  public static ArrayList<String> autoCompleteSuggest(String toSuggestOn, List<String> fields, int noSug)
  { 
    return autoCompleteSuggest(toSuggestOn, "", fields, noSug);
  }

  public static ArrayList<String> autoCompleteSuggest(String toSuggestOn, String field, int noSug)
  { 
    return autoCompleteSuggest(toSuggestOn, "", field, noSug);
  }

  public static ArrayList<String> autoCompleteSuggest(String toSuggestOn, String namespace, List<String> fields, int noSug)
  { 
    String baseDir = IndexManager.indexDirAutoComplete(webdsl.generated.domain.dummy_webdsl_entity.class, "", namespace);
    return SearchSuggester.findAutoCompletions(webdsl.generated.domain.dummy_webdsl_entity.class, baseDir, fields, noSug, _analyzer, toSuggestOn);
  }

  public static ArrayList<String> autoCompleteSuggest(String toSuggestOn, String namespace, String field, int noSug)
  { 
    String baseDir = IndexManager.indexDirAutoComplete(webdsl.generated.domain.dummy_webdsl_entity.class, "", namespace);
    return SearchSuggester.findAutoCompletionsForField(webdsl.generated.domain.dummy_webdsl_entity.class, baseDir, field, noSug, _analyzer, toSuggestOn);
  }

  public Class<?> fieldType(String field)
  { 
    return String.class;
  }

  public dummy_webdsl_entitySearcher reset()
  { 
    clearFacetSelection();
    clearFieldFilters();
    clearSorting();
    removeNamespace();
    rootQD = parentQD = currentQD = new QueryDef(Occur.SHOULD, new String[]{"text"});
    mainQuery = null;
    searchFields = defaultSearchFields;
    nonDefaultSearchFields = false;
    untokenizedFields = new String[]{};
    mltSearchFields = new String[]{"text"};
    updateLuceneQuery = true;
    return this;
  }

  protected synchronized BoboIndexReader getBoboReader(String field)
  { 
    if(_boboReader == null || _boboReader.getFacetHandler(field) == null)
    { 
      renewBoboReader(discreteFacetRequests.keySet());
    }
    return _boboReader;
  }

  public final synchronized static void tryRenewBoboReader()
  { 
    if(_boboReader != null)
    { 
      renewBoboReader(new ArrayList<String>());
    }
  }

  public final synchronized static void closeBoboReader()
  { 
    closeBoboReader(_boboReader);
  }

  public final synchronized static void closeBoboReader(BoboIndexReader reader)
  { 
    if(reader != null)
    { 
      try
      { 
        reader.close();
      }
      catch(IOException ex)
      { 
        org.webdsl.logging.Logger.error("Error when closing bobo facet reader", ex);
      }
    }
  }

  private final synchronized static void renewBoboReader(Collection<String> allFields)
  { 
    org.webdsl.logging.Logger.info("renewing faceting index reader for entity " + "dummy_webdsl_entity");
    BoboIndexReader boboReader_OLD = _boboReader;
    List<FacetHandler<?>> facetHandlerList = new ArrayList<FacetHandler<?>>();
    if(_boboReader != null)
    { 
      facetHandlerList.addAll(_boboReader.getFacetHandlerMap().values());
    }
    Map<String, FacetHandler<?>> facetHandlerMap = new HashMap<String, FacetHandler<?>>();
    for(FacetHandler<?> facetHandler : facetHandlerList)
    { 
      facetHandlerMap.put(facetHandler.getName(), facetHandler);
    }
    for(String fld : allFields)
    { 
      if(!facetHandlerMap.containsKey(fld))
        facetHandlerList.add(getFacetHandlerForField(fld));
    }
    SearchFactory searchFactory = org.hibernate.search.Search.getFullTextSession(utils.HibernateUtil.getCurrentSession()).getSearchFactory();
    DirectoryProvider<?>[] providers = searchFactory.getDirectoryProviders(webdsl.generated.domain.dummy_webdsl_entity.class);
    try
    { 
      Directory idx = providers[0].getDirectory();
      IndexReader reader = IndexReader.open(idx, true);
      _boboReader = BoboIndexReader.getInstance(reader, facetHandlerList);
    }
    catch(IOException ex)
    { 
      org.webdsl.logging.Logger.error("Error during renewal of bobo facet readers", ex);
    }
    finally
    { 
      closeBoboReader(boboReader_OLD);
    }
  }
}