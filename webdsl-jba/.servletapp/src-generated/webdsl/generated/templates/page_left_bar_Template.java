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

public @SuppressWarnings("all") class page_left_bar_Template extends TemplateServlet 
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

  public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv)
  { }

  public static void loadRefArgClasses(Map<String, Class<?>> refargclasses)
  { }

  public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    loadTemplateMap(null, staticEnv);
    return staticEnv;
  }

  public static Environment loadTemplateMap(String keyOverwrite, org.webdsl.lang.Environment staticEnv)
  { 
    staticEnv.putTemplate(keyOverwrite == null ? "page_left_bar" : keyOverwrite, page_left_bar_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  public String getUniqueName()
  { 
    return "page_left_bar";
  }

  public String getStateEncodingOfArgument()
  { 
    return "";
  }

  public String getTemplateSignature()
  { 
    return "template page_left_bar()";
  }

  public String getElementsContext()
  { 
    if(calledName == null)
    { 
      return "page_left_bar";
    }
    else
    { 
      return calledName;
    }
  }

  protected void handlePhase(int phase)
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    PrintWriter out = ThreadLocalOut.peek();
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
        utils.TemplateCall.appendWithPadding(classattrs, "col-sm-1 col-sm-offset-1 blog-sidebar");
        out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("align", "center"));
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "hr");
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
      out.print("</" + "hr" + ">");
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
        utils.TemplateCall.appendWithPadding(classattrs, "sidebar-module");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "h4");
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
        utils.RenderUtils.printPageString("Administrator", out, threadLocalPageCached.isRawoutput());
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
      out.print("</" + "h4" + ">");
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
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString("wukefe", out, threadLocalPageCached.isRawoutput());
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
      out.print("<" + "hr");
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
      out.print("</" + "hr" + ">");
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
        utils.TemplateCall.appendWithPadding(classattrs, "sidebar-module");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "h4");
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
        utils.RenderUtils.printPageString("Dashboard", out, threadLocalPageCached.isRawoutput());
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
      out.print("</" + "h4" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "ol");
      { 
        StringBuilder classattrs = new StringBuilder();
        StringBuilder styleattrs = new StringBuilder();
        java.util.List<String> ignore = new java.util.ArrayList<String>();
        utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
        for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
        { 
          AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
        }
        utils.TemplateCall.appendWithPadding(classattrs, "list-unstyled");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "li");
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
        out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("href", "#"));
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString("Publish Articles", out, threadLocalPageCached.isRawoutput());
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
      out.print("</" + "li" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "li");
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
        out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("href", "#"));
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
      out.print("</" + "a" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "li" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "ol" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "div" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "hr");
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
      out.print("</" + "hr" + ">");
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
        utils.TemplateCall.appendWithPadding(classattrs, "sidebar-module");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "h4");
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
        utils.RenderUtils.printPageString("Authors", out, threadLocalPageCached.isRawoutput());
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
      out.print("</" + "h4" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "ol");
      { 
        StringBuilder classattrs = new StringBuilder();
        StringBuilder styleattrs = new StringBuilder();
        java.util.List<String> ignore = new java.util.ArrayList<String>();
        utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
        for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
        { 
          AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
        }
        utils.TemplateCall.appendWithPadding(classattrs, "list-unstyled");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "li");
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
        out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("href", "#"));
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString("Yu Zhao", out, threadLocalPageCached.isRawoutput());
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
      out.print("</" + "li" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "li");
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
        out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("href", "#"));
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString("Hanfeng Chen", out, threadLocalPageCached.isRawoutput());
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
      out.print("</" + "li" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "ol" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "i");
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
        utils.RenderUtils.printPageString("Supervised by Prof. Dingel in CISC 836", out, threadLocalPageCached.isRawoutput());
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
      out.print("</" + "i" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "div" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "hr");
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
      out.print("</" + "hr" + ">");
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
        utils.TemplateCall.appendWithPadding(classattrs, "sidebar-module");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "h4");
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
        out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("href", "#"));
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString("Logout", out, threadLocalPageCached.isRawoutput());
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
      out.print("</" + "h4" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "div" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "hr");
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
      out.print("</" + "hr" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "div" + ">");
    }
  }
}