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

public @SuppressWarnings("all") class dslcontainer_Template extends TemplateServlet 
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
    staticEnv.putTemplate(keyOverwrite == null ? "dslcontainer" : keyOverwrite, dslcontainer_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  public String getUniqueName()
  { 
    return "dslcontainer";
  }

  public String getStateEncodingOfArgument()
  { 
    return "";
  }

  public String getTemplateSignature()
  { 
    return "template dslcontainer()";
  }

  public String getElementsContext()
  { 
    if(calledName == null)
    { 
      return "dslcontainer";
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
        utils.TemplateCall.appendWithPadding(classattrs, "container");
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
        utils.TemplateCall.appendWithPadding(classattrs, "blog-header");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "h1");
      { 
        StringBuilder classattrs = new StringBuilder();
        StringBuilder styleattrs = new StringBuilder();
        java.util.List<String> ignore = new java.util.ArrayList<String>();
        utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
        for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
        { 
          AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
        }
        utils.TemplateCall.appendWithPadding(classattrs, "blog-title");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString("JBA - A Jekyll like Blog Application", out, threadLocalPageCached.isRawoutput());
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
      out.print("</" + "h1" + ">");
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
        utils.TemplateCall.appendWithPadding(classattrs, "lead blog-description");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString("CISC 836 course project - By Hanfeng Chen and Yu Zhao", out, threadLocalPageCached.isRawoutput());
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
      out.print("</" + "p" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "div" + ">");
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
        utils.TemplateCall.appendWithPadding(classattrs, "col-sm-8 blog-main");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall78", "dslblogpost", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{}, "dslblogpost"), new Environment(env).putWithcall("elements#dslblogpost", new utils.TemplateCall("elementsempty", null, null, null)), "dslblogpost", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "dslblogpost() at ../mywebdsl.app:70/11");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "div" + ">");
    }
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall80", "dslsidebar", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{}, "dslsidebar"), new Environment(env).putWithcall("elements#dslsidebar", new utils.TemplateCall("elementsempty", null, null, null)), "dslsidebar", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "dslsidebar() at ../mywebdsl.app:72/10");
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
}