package webdsl.generated.templates;

import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.apache.commons.lang3.ArrayUtils;
import utils.*;
import org.webdsl.tools.Utils;
import org.webdsl.lang.Environment;
import org.webdsl.WebDSLEntity;
import webdsl.generated.domain.*;
import webdsl.generated.actions.*;

public @SuppressWarnings("all") class table_content_Template extends TemplateServlet 
{ 
  private webdsl.generated.domain.SecurityContext securityContextCache = null;

  protected webdsl.generated.domain.SecurityContext getCachedSessionSecurityContext()
  { 
    if(securityContextCache == null)
    { 
      securityContextCache = (webdsl.generated.domain.SecurityContext)env.getSessionVariable("securityContext");
    }
    return securityContextCache;
  }

  public void prefetchFor(int i, java.util.Collection<? extends org.webdsl.WebDSLEntity> elems)
  { 
    if(utils.QueryOptimization.isOptimizationEnabled())
    { 
      if(i == 1)
      { 
        java.util.ArrayList<webdsl.generated.domain.Admin> elems6 = new java.util.ArrayList<webdsl.generated.domain.Admin>();
        for(org.webdsl.WebDSLEntity ent : elems)
        { 
          if(ent.instanceOf("Admin"))
          { 
            elems6.add((webdsl.generated.domain.Admin)ent);
          }
        }
      }
    }
  }

  public void prefetchFor0(java.util.List<webdsl.generated.domain.MyArticle> list, boolean early)
  { 
    if(early)
    { }
    else
    { }
  }

  public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    table_contentAdmin_Int_s_ad2String_MyArticle_Int_Admin_Template.loadTemplateMap(table_contentAdmin_Int_s_ad1String_MyArticle_Int_Admin_Template.loadTemplateMap(table_contentAdmin_Int_s_ad0String_MyArticle_Int_Admin_Template.loadTemplateMap(staticEnv)));
  }

  public static void loadRefArgClasses(Map<String, Class<?>> refargclasses)
  { 
    refargclasses.put("RefArg_outputDateTime_1_table_contentpc0", RefArg_outputDateTime_1_table_contentpc0.class);
    refargclasses.put("RefArg_outputDateTime_1_table_contentpc1", RefArg_outputDateTime_1_table_contentpc1.class);
    table_contentAdmin_Int_s_ad0String_MyArticle_Int_Admin_Template.loadRefArgClasses(refargclasses);
    table_contentAdmin_Int_s_ad1String_MyArticle_Int_Admin_Template.loadRefArgClasses(refargclasses);
    table_contentAdmin_Int_s_ad2String_MyArticle_Int_Admin_Template.loadRefArgClasses(refargclasses);
  }

  public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    loadTemplateMap(null, staticEnv);
    return staticEnv;
  }

  public static Environment loadTemplateMap(String keyOverwrite, org.webdsl.lang.Environment staticEnv)
  { 
    staticEnv.putTemplate(keyOverwrite == null ? "table_content" : keyOverwrite, table_content_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    admin_ = (webdsl.generated.domain.Admin)args[0];
    len_ = (Integer)args[1];
  }

  public String getUniqueName()
  { 
    return "table_content";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + (admin_ != null ? admin_.getVersion() == 0 ? "_" : admin_.getId().toString() : "null");
  }

  public String getTemplateSignature()
  { 
    return "page table_content(admin : Admin, len : Int)";
  }

  public String getElementsContext()
  { 
    if(calledName == null)
    { 
      return "table_content";
    }
    else
    { 
      return calledName;
    }
  }

  private webdsl.generated.domain.Admin admin_ = null;

  public void setAdmin_(webdsl.generated.domain.Admin admin_)
  { 
    this.admin_ = admin_;
  }

  public webdsl.generated.domain.Admin getAdmin_()
  { 
    return admin_;
  }

  private Integer len_ = 0;

  public void setLen_(Integer len_)
  { 
    this.len_ = len_;
  }

  public Integer getLen_()
  { 
    return len_;
  }

  protected void handlePhase(int phase)
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    PrintWriter out = ThreadLocalOut.peek();
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall9", "dslinit", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{}, "dslinit"), new Environment(env).putWithcall("elements#dslinit", new utils.TemplateCall("elementsempty", null, null, null)), "dslinit", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "dslinit() at ../myadminall.app:111/3");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "div");
      { 
        StringBuilder classattrs = new StringBuilder();
        StringBuilder styleattrs = new StringBuilder();
        java.util.List<String> ignore = new java.util.ArrayList<String>();
        utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
        for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
        { 
          AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
        }
        utils.TemplateCall.appendWithPadding(classattrs, "row");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall11", "page_left_barAdmin_Int", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{admin_, webdsl.generated.functions.findtotal_.findtotal_()}, "page_left_barAdmin_Int"), new Environment(env).putWithcall("elements#page_left_barAdmin_Int", new utils.TemplateCall("elementsempty", null, null, null)), "page_left_barAdmin_Int", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "page_left_barAdmin_Int(admin, findtotal()) at ../myadminall.app:113/3");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "div");
      { 
        StringBuilder classattrs = new StringBuilder();
        StringBuilder styleattrs = new StringBuilder();
        java.util.List<String> ignore = new java.util.ArrayList<String>();
        utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
        for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
        { 
          AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
        }
        utils.TemplateCall.appendWithPadding(classattrs, "col-sm-8");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "div");
      { 
        StringBuilder classattrs = new StringBuilder();
        StringBuilder styleattrs = new StringBuilder();
        java.util.List<String> ignore = new java.util.ArrayList<String>();
        utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
        for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
        { 
          AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
        }
        utils.TemplateCall.appendWithPadding(classattrs, "center");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "h2");
      { 
        StringBuilder classattrs = new StringBuilder();
        StringBuilder styleattrs = new StringBuilder();
        java.util.List<String> ignore = new java.util.ArrayList<String>();
        utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
        for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
        { 
          AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
        }
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString("Manage Articles", out, threadLocalPageCached.isRawoutput());
      }
      catch(NullPointerException npe)
      { 
        utils.Warning.warn("null reference prevented rendering of template element");
      }
      catch(IndexOutOfBoundsException ine)
      { 
        utils.Warning.warn("index out of bounds prevented rendering of template element");
      }
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "h2" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "table");
      { 
        StringBuilder classattrs = new StringBuilder();
        StringBuilder styleattrs = new StringBuilder();
        java.util.List<String> ignore = new java.util.ArrayList<String>();
        utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
        for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
        { 
          AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
        }
        utils.TemplateCall.appendWithPadding(classattrs, "table table-hover");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "tr");
      { 
        StringBuilder classattrs = new StringBuilder();
        StringBuilder styleattrs = new StringBuilder();
        java.util.List<String> ignore = new java.util.ArrayList<String>();
        utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
        for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
        { 
          AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
        }
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "th");
      { 
        StringBuilder classattrs = new StringBuilder();
        StringBuilder styleattrs = new StringBuilder();
        java.util.List<String> ignore = new java.util.ArrayList<String>();
        utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
        for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
        { 
          AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
        }
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString("#", out, threadLocalPageCached.isRawoutput());
      }
      catch(NullPointerException npe)
      { 
        utils.Warning.warn("null reference prevented rendering of template element");
      }
      catch(IndexOutOfBoundsException ine)
      { 
        utils.Warning.warn("index out of bounds prevented rendering of template element");
      }
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "th" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "th");
      { 
        StringBuilder classattrs = new StringBuilder();
        StringBuilder styleattrs = new StringBuilder();
        java.util.List<String> ignore = new java.util.ArrayList<String>();
        utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
        for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
        { 
          AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
        }
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString("Title", out, threadLocalPageCached.isRawoutput());
      }
      catch(NullPointerException npe)
      { 
        utils.Warning.warn("null reference prevented rendering of template element");
      }
      catch(IndexOutOfBoundsException ine)
      { 
        utils.Warning.warn("index out of bounds prevented rendering of template element");
      }
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "th" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "th");
      { 
        StringBuilder classattrs = new StringBuilder();
        StringBuilder styleattrs = new StringBuilder();
        java.util.List<String> ignore = new java.util.ArrayList<String>();
        utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
        for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
        { 
          AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
        }
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString("Author", out, threadLocalPageCached.isRawoutput());
      }
      catch(NullPointerException npe)
      { 
        utils.Warning.warn("null reference prevented rendering of template element");
      }
      catch(IndexOutOfBoundsException ine)
      { 
        utils.Warning.warn("index out of bounds prevented rendering of template element");
      }
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "th" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "th");
      { 
        StringBuilder classattrs = new StringBuilder();
        StringBuilder styleattrs = new StringBuilder();
        java.util.List<String> ignore = new java.util.ArrayList<String>();
        utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
        for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
        { 
          AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
        }
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString("Added Time", out, threadLocalPageCached.isRawoutput());
      }
      catch(NullPointerException npe)
      { 
        utils.Warning.warn("null reference prevented rendering of template element");
      }
      catch(IndexOutOfBoundsException ine)
      { 
        utils.Warning.warn("index out of bounds prevented rendering of template element");
      }
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "th" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "th");
      { 
        StringBuilder classattrs = new StringBuilder();
        StringBuilder styleattrs = new StringBuilder();
        java.util.List<String> ignore = new java.util.ArrayList<String>();
        utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
        for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
        { 
          AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
        }
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString("Modified Time", out, threadLocalPageCached.isRawoutput());
      }
      catch(NullPointerException npe)
      { 
        utils.Warning.warn("null reference prevented rendering of template element");
      }
      catch(IndexOutOfBoundsException ine)
      { 
        utils.Warning.warn("index out of bounds prevented rendering of template element");
      }
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "th" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "th");
      { 
        StringBuilder classattrs = new StringBuilder();
        StringBuilder styleattrs = new StringBuilder();
        java.util.List<String> ignore = new java.util.ArrayList<String>();
        utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
        for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
        { 
          AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
        }
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString("", out, threadLocalPageCached.isRawoutput());
      }
      catch(NullPointerException npe)
      { 
        utils.Warning.warn("null reference prevented rendering of template element");
      }
      catch(IndexOutOfBoundsException ine)
      { 
        utils.Warning.warn("index out of bounds prevented rendering of template element");
      }
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "th" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "tr" + ">");
    }
    java.util.List<webdsl.generated.domain.MyArticle> list1 = utils.HibernateUtil.getCurrentSession().createCriteria(webdsl.generated.domain.MyArticle.class).list();
    prefetchFor0(list1, true);
    inForLoop = true;
    forLoopCounter++;
    java.util.Collections.sort(list1, new java.util.Comparator<webdsl.generated.domain.MyArticle>()
                                      { 
                                        public int compare(webdsl.generated.domain.MyArticle o1, webdsl.generated.domain.MyArticle o2)
                                        { 
                                          return o1.getCount().compareTo(o2.getCount());
                                        }
                                      });
    prefetchFor0(list1, false);
    int separatorindex0 = 0;
    Object[] array0 = list1.toArray();
    for(int i0 = 0; i0 < array0.length; i0++)
    { 
      webdsl.generated.domain.MyArticle u_ = (webdsl.generated.domain.MyArticle)array0[i0];
      fallbackcounter += 1;
      if(org.webdsl.WebDSLEntity.class.isInstance(u_))
      { 
        org.webdsl.WebDSLEntity temp0 = (org.webdsl.WebDSLEntity)(Object)u_;
        forelementcounter = temp0.getVersion() == 0 ? Integer.toString(fallbackcounter) : utils.UUIDUserType.persistUUIDString(temp0.getId());
      }
      else
        forelementcounter = Integer.toString(fallbackcounter);
      threadLocalPageCached.enterTemplateContext(forelementcounter);
      if(RENDER_PHASE == phase)
      { 
        out.print("<" + "tr");
        { 
          StringBuilder classattrs = new StringBuilder();
          StringBuilder styleattrs = new StringBuilder();
          java.util.List<String> ignore = new java.util.ArrayList<String>();
          utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
          for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
          { 
            AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
          }
          utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
        }
        out.print(">");
      }
      if(RENDER_PHASE == phase)
      { 
        out.print("<" + "td");
        { 
          StringBuilder classattrs = new StringBuilder();
          StringBuilder styleattrs = new StringBuilder();
          java.util.List<String> ignore = new java.util.ArrayList<String>();
          utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
          for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
          { 
            AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
          }
          utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
        }
        out.print(">");
      }
      try
      { 
        handleTemplateCall(phase, inForLoop, forelementcounter, "tcall13", "outputInt", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{u_.getCount()}, "outputInt"), new Environment(env).putWithcall("elements#outputInt", new utils.TemplateCall("elementsempty", null, null, null)), "outputInt", TemplateCall.EmptyAttrs);
      }
      catch(RuntimeException ex)
      { 
        printTemplateCallException(ex, "outputInt(u.count) at ../myadminall.app:130/8");
      }
      if(RENDER_PHASE == phase)
      { 
        out.print("</" + "td" + ">");
      }
      if(RENDER_PHASE == phase)
      { 
        out.print("<" + "td");
        { 
          StringBuilder classattrs = new StringBuilder();
          StringBuilder styleattrs = new StringBuilder();
          java.util.List<String> ignore = new java.util.ArrayList<String>();
          utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
          for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
          { 
            AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
          }
          utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
        }
        out.print(">");
      }
      try
      { 
        handleTemplateCall(phase, inForLoop, forelementcounter, "tcall15", "outputString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{u_.getTitle()}, "outputString"), new Environment(env).putWithcall("elements#outputString", new utils.TemplateCall("elementsempty", null, null, null)), "outputString", TemplateCall.EmptyAttrs);
      }
      catch(RuntimeException ex)
      { 
        printTemplateCallException(ex, "outputString(u.Title) at ../myadminall.app:131/8");
      }
      if(RENDER_PHASE == phase)
      { 
        out.print("</" + "td" + ">");
      }
      if(RENDER_PHASE == phase)
      { 
        out.print("<" + "td");
        { 
          StringBuilder classattrs = new StringBuilder();
          StringBuilder styleattrs = new StringBuilder();
          java.util.List<String> ignore = new java.util.ArrayList<String>();
          utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
          for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
          { 
            AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
          }
          utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
        }
        out.print(">");
      }
      try
      { 
        handleTemplateCall(phase, inForLoop, forelementcounter, "tcall17", "outputString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{u_.getAuthor()}, "outputString"), new Environment(env).putWithcall("elements#outputString", new utils.TemplateCall("elementsempty", null, null, null)), "outputString", TemplateCall.EmptyAttrs);
      }
      catch(RuntimeException ex)
      { 
        printTemplateCallException(ex, "outputString(u.Author) at ../myadminall.app:132/8");
      }
      if(RENDER_PHASE == phase)
      { 
        out.print("</" + "td" + ">");
      }
      if(RENDER_PHASE == phase)
      { 
        out.print("<" + "td");
        { 
          StringBuilder classattrs = new StringBuilder();
          StringBuilder styleattrs = new StringBuilder();
          java.util.List<String> ignore = new java.util.ArrayList<String>();
          utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
          for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
          { 
            AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
          }
          utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
        }
        out.print(">");
      }
      try
      { 
        handleTemplateCall(phase, inForLoop, forelementcounter, "tcall19", "outputDateTime", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new RefArg_outputDateTime_1_table_contentpc0(u_)}, "outputDateTime"), new Environment(env).putWithcall("elements#outputDateTime", new utils.TemplateCall("elementsempty", null, null, null)), "outputDateTime", TemplateCall.EmptyAttrs);
      }
      catch(RuntimeException ex)
      { 
        printTemplateCallException(ex, "outputDateTime(u.created) at ../myadminall.app:133/8");
      }
      if(RENDER_PHASE == phase)
      { 
        out.print("</" + "td" + ">");
      }
      if(RENDER_PHASE == phase)
      { 
        out.print("<" + "td");
        { 
          StringBuilder classattrs = new StringBuilder();
          StringBuilder styleattrs = new StringBuilder();
          java.util.List<String> ignore = new java.util.ArrayList<String>();
          utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
          for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
          { 
            AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
          }
          utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
        }
        out.print(">");
      }
      try
      { 
        handleTemplateCall(phase, inForLoop, forelementcounter, "tcall21", "outputDateTime", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new RefArg_outputDateTime_1_table_contentpc1(u_)}, "outputDateTime"), new Environment(env).putWithcall("elements#outputDateTime", new utils.TemplateCall("elementsempty", null, null, null)), "outputDateTime", TemplateCall.EmptyAttrs);
      }
      catch(RuntimeException ex)
      { 
        printTemplateCallException(ex, "outputDateTime(u.modified) at ../myadminall.app:134/8");
      }
      if(RENDER_PHASE == phase)
      { 
        out.print("</" + "td" + ">");
      }
      if(RENDER_PHASE == phase)
      { 
        out.print("<" + "td");
        { 
          StringBuilder classattrs = new StringBuilder();
          StringBuilder styleattrs = new StringBuilder();
          java.util.List<String> ignore = new java.util.ArrayList<String>();
          utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
          for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
          { 
            AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
          }
          utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
        }
        out.print(">");
      }
      if(threadLocalPageCached.isInForm())
      { 
        org.webdsl.logging.Logger.error("Invalid nested <form> tag detected in DOM at URL: " + threadLocalPageCached.getRequest().getRequestURL() + "\n Enclosing form found in " + threadLocalPageCached.getEnclosingForm() + "\n Nested form found in " + getTemplateSignature());
      }
      threadLocalPageCached.enterForm(getTemplateSignature());
      ident = (inForLoop ? forelementcounter : "") + ("form0" + getUniqueId());
      threadLocalPageCached.setFormIdent(ident);
      if(threadLocalPageCached.getParammap().get(ident) != null)
      { 
        threadLocalPageCached.setInSubmittedForm(true);
      }
      java.io.StringWriter sw1 = null;
      java.io.StringWriter sw0 = null;
      if(RENDER_PHASE == phase)
      { 
        threadLocalPageCached.formRequiresMultipartEnc = false;
        if(threadLocalPageCached.inSubmittedForm() && threadLocalPageCached.isValidationFormRerender())
        { 
          sw1 = new java.io.StringWriter();
          out = new java.io.PrintWriter(sw1);
          ThreadLocalOut.push(out);
        }
        out.print("<form name=\"" + ident + "\" id=\"" + ident + "\" action=\"" + utils.HTMLFilter.filter(threadLocalPageCached.getPageUrlWithParams() + threadLocalPageCached.getExtraQueryAruments("?")) + "\" accept-charset=\"UTF-8\" method=\"POST\"");
        { 
          StringBuilder classattrs = new StringBuilder();
          StringBuilder styleattrs = new StringBuilder();
          java.util.List<String> ignore = new java.util.ArrayList<String>();
          utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
          for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
          { 
            AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
          }
          AttributeCollectionLookup.getAttributeCollection("form", classattrs, styleattrs, ignore, out);
          utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
        }
        sw0 = new java.io.StringWriter();
        out = new java.io.PrintWriter(sw0);
        ThreadLocalOut.push(out);
        out.print(">");
        out.print("<input type=\"hidden\" name=\"" + ident + "\" value=\"1\" />");
        out.print(threadLocalPageCached.getHiddenParams());
      }
      try
      { 
        handleTemplateCall(phase, inForLoop, forelementcounter, "tcall23", "wrapsubmitString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"table_contentAdmin_Int_ia0_" + webdsl.generated.functions.getPage_.getPage_().getTemplateContext().getTemplateContextString()}, "wrapsubmitString"), new Environment(env).putWithcall("s", new utils.TemplateCall("table_contentAdmin_Int_s_ad0String_MyArticle_Int_Admin", getElementsContext(), new Object[]{u_, len_, admin_}, attrs)), "wrapsubmitString", TemplateCall.EmptyAttrs);
      }
      catch(RuntimeException ex)
      { 
        printTemplateCallException(ex, "wrapsubmitString(\"table_contentAdmin_Int_ia0\" +\ngetPage().getTemplateContext().getTemplateContextString()) at unknown context");
      }
      try
      { 
        handleTemplateCall(phase, inForLoop, forelementcounter, "tcall26", "wrapsubmitString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"table_contentAdmin_Int_ia1_" + webdsl.generated.functions.getPage_.getPage_().getTemplateContext().getTemplateContextString()}, "wrapsubmitString"), new Environment(env).putWithcall("s", new utils.TemplateCall("table_contentAdmin_Int_s_ad1String_MyArticle_Int_Admin", getElementsContext(), new Object[]{u_, len_, admin_}, attrs)), "wrapsubmitString", TemplateCall.EmptyAttrs);
      }
      catch(RuntimeException ex)
      { 
        printTemplateCallException(ex, "wrapsubmitString(\"table_contentAdmin_Int_ia1\" +\ngetPage().getTemplateContext().getTemplateContextString()) at unknown context");
      }
      try
      { 
        handleTemplateCall(phase, inForLoop, forelementcounter, "tcall29", "wrapsubmitString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"table_contentAdmin_Int_ia2_" + webdsl.generated.functions.getPage_.getPage_().getTemplateContext().getTemplateContextString()}, "wrapsubmitString"), new Environment(env).putWithcall("s", new utils.TemplateCall("table_contentAdmin_Int_s_ad2String_MyArticle_Int_Admin", getElementsContext(), new Object[]{u_, len_, admin_}, attrs)), "wrapsubmitString", TemplateCall.EmptyAttrs);
      }
      catch(RuntimeException ex)
      { 
        printTemplateCallException(ex, "wrapsubmitString(\"table_contentAdmin_Int_ia2\" +\ngetPage().getTemplateContext().getTemplateContextString()) at unknown context");
      }
      if(RENDER_PHASE == phase)
      { 
        out.print("</form>");
        ThreadLocalOut.popChecked(out);
        out = ThreadLocalOut.peek();
        if(threadLocalPageCached.formRequiresMultipartEnc)
        { 
          out.write(" enctype=\"multipart/form-data\"");
        }
        out.write(sw0.toString());
        if(threadLocalPageCached.inSubmittedForm() && threadLocalPageCached.isValidationFormRerender())
        { 
          ThreadLocalOut.pop();
          if(threadLocalPageCached.submittedFormContent == null)
          { 
            threadLocalPageCached.submittedFormContent = sw1.toString();
          }
          else
          { 
            out = ThreadLocalOut.peek();
            out.write(threadLocalPageCached.submittedFormContent);
          }
        }
        threadLocalPageCached.formRequiresMultipartEnc = false;
      }
      threadLocalPageCached.setInSubmittedForm(false);
      threadLocalPageCached.setFormIdent("");
      threadLocalPageCached.leaveForm();
      if(RENDER_PHASE == phase)
      { 
        out.print("</" + "td" + ">");
      }
      if(RENDER_PHASE == phase)
      { 
        out.print("</" + "tr" + ">");
      }
      threadLocalPageCached.leaveTemplateContext();
    }
    forLoopCounter--;
    if(forLoopCounter == 0)
    { 
      inForLoop = false;
      forelementcounter = "0";
      fallbackcounter = 0;
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "table" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "p");
      { 
        StringBuilder classattrs = new StringBuilder();
        StringBuilder styleattrs = new StringBuilder();
        java.util.List<String> ignore = new java.util.ArrayList<String>();
        utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
        for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
        { 
          AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
        }
        utils.TemplateCall.appendWithPadding(classattrs, "adminFoot");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "a");
      { 
        StringBuilder classattrs = new StringBuilder();
        StringBuilder styleattrs = new StringBuilder();
        java.util.List<String> ignore = new java.util.ArrayList<String>();
        utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
        for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
        { 
          AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
        }
        utils.TemplateCall.appendWithPadding(classattrs, "btn btn-lg btn-outline");
        out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("href", "#"));
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString("Total ", out, threadLocalPageCached.isRawoutput());
      }
      catch(NullPointerException npe)
      { 
        utils.Warning.warn("null reference prevented rendering of template element");
      }
      catch(IndexOutOfBoundsException ine)
      { 
        utils.Warning.warn("index out of bounds prevented rendering of template element");
      }
    }
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall32", "outputInt", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{webdsl.generated.functions.findtotal_.findtotal_()}, "outputInt"), new Environment(env).putWithcall("elements#outputInt", new utils.TemplateCall("elementsempty", null, null, null)), "outputInt", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "outputInt(findtotal()) at ../myadminall.app:146/56");
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString(" articles", out, threadLocalPageCached.isRawoutput());
      }
      catch(NullPointerException npe)
      { 
        utils.Warning.warn("null reference prevented rendering of template element");
      }
      catch(IndexOutOfBoundsException ine)
      { 
        utils.Warning.warn("index out of bounds prevented rendering of template element");
      }
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "a" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "p" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "div" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "div" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "div" + ">");
    }
  }

  protected void initActions()
  { 
    PrintWriter out = ThreadLocalOut.peek();
    if(webdsl.generated.functions.genpagepredicate_table_content0Admin_Int_.genpagepredicate_table_content0Admin_Int_(admin_, len_))
    { }
    else
    { 
      ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
    }
  }
}