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

public @SuppressWarnings("all") class dslheader_Template extends TemplateServlet 
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
    staticEnv.putTemplate(keyOverwrite == null ? "dslheader" : keyOverwrite, dslheader_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  public String getUniqueName()
  { 
    return "dslheader";
  }

  public String getStateEncodingOfArgument()
  { 
    return "";
  }

  public String getTemplateSignature()
  { 
    return "template dslheader()";
  }

  public String getElementsContext()
  { 
    if(calledName == null)
    { 
      return "dslheader";
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
        utils.TemplateCall.appendWithPadding(classattrs, "blog-masthead");
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
        utils.TemplateCall.appendWithPadding(classattrs, "container");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "nav");
      { 
        StringBuilder classattrs = new StringBuilder();
        StringBuilder styleattrs = new StringBuilder();
        java.util.List<String> ignore = new java.util.ArrayList<String>();
        utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
        for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
        { 
          AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
        }
        utils.TemplateCall.appendWithPadding(classattrs, "blog-nav");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      java.io.StringWriter sw19 = new java.io.StringWriter();
      out = new java.io.PrintWriter(sw19);
      ThreadLocalOut.push(out);
      boolean succeeded1 = false;
      try
      { 
        out.print("<a href=\"");
        out.print(utils.HTMLFilter.filter(utils.Navigate.constructUrl("")));
        out.print("\"");
        { 
          StringBuilder classattrs = new StringBuilder();
          StringBuilder styleattrs = new StringBuilder();
          java.util.List<String> ignore = new java.util.ArrayList<String>();
          utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
          for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
          { 
            AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
          }
          AttributeCollectionLookup.getAttributeCollection("navigate", classattrs, styleattrs, ignore, out);
          utils.TemplateCall.appendWithPadding(classattrs, "blog-nav-item active");
          utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
        }
        out.print(">");
        if(RENDER_PHASE == phase)
        { 
          try
          { 
            utils.RenderUtils.printPageString("Home", out, threadLocalPageCached.isRawoutput());
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
        out.print("</a>");
        succeeded1 = true;
      }
      catch(NullPointerException npe)
      { 
        utils.Warning.warn("null reference prevented rendering of template element");
      }
      catch(IndexOutOfBoundsException ine)
      { 
        utils.Warning.warn("index out of bounds prevented rendering of template element");
      }
      ThreadLocalOut.popChecked(out);
      out = ThreadLocalOut.peek();
      if(succeeded1)
      { 
        out.print(sw19.toString());
      }
    }
    if(RENDER_PHASE == phase)
    { 
      java.io.StringWriter sw20 = new java.io.StringWriter();
      out = new java.io.PrintWriter(sw20);
      ThreadLocalOut.push(out);
      boolean succeeded2 = false;
      try
      { 
        out.print("<a href=\"");
        out.print(utils.HTMLFilter.filter(utils.Navigate.constructUrl("page_about")));
        out.print("\"");
        { 
          StringBuilder classattrs = new StringBuilder();
          StringBuilder styleattrs = new StringBuilder();
          java.util.List<String> ignore = new java.util.ArrayList<String>();
          utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
          for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
          { 
            AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
          }
          AttributeCollectionLookup.getAttributeCollection("navigate", classattrs, styleattrs, ignore, out);
          utils.TemplateCall.appendWithPadding(classattrs, "blog-nav-item");
          utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
        }
        out.print(">");
        if(RENDER_PHASE == phase)
        { 
          try
          { 
            utils.RenderUtils.printPageString("About", out, threadLocalPageCached.isRawoutput());
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
        out.print("</a>");
        succeeded2 = true;
      }
      catch(NullPointerException npe)
      { 
        utils.Warning.warn("null reference prevented rendering of template element");
      }
      catch(IndexOutOfBoundsException ine)
      { 
        utils.Warning.warn("index out of bounds prevented rendering of template element");
      }
      ThreadLocalOut.popChecked(out);
      out = ThreadLocalOut.peek();
      if(succeeded2)
      { 
        out.print(sw20.toString());
      }
    }
    if(RENDER_PHASE == phase)
    { 
      java.io.StringWriter sw21 = new java.io.StringWriter();
      out = new java.io.PrintWriter(sw21);
      ThreadLocalOut.push(out);
      boolean succeeded3 = false;
      try
      { 
        out.print("<a href=\"");
        out.print(utils.HTMLFilter.filter(utils.Navigate.constructUrl("page_login")));
        out.print("\"");
        { 
          StringBuilder classattrs = new StringBuilder();
          StringBuilder styleattrs = new StringBuilder();
          java.util.List<String> ignore = new java.util.ArrayList<String>();
          utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
          for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
          { 
            AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
          }
          AttributeCollectionLookup.getAttributeCollection("navigate", classattrs, styleattrs, ignore, out);
          utils.TemplateCall.appendWithPadding(classattrs, "blog-nav-item");
          utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
        }
        out.print(">");
        if(RENDER_PHASE == phase)
        { 
          try
          { 
            utils.RenderUtils.printPageString("Login", out, threadLocalPageCached.isRawoutput());
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
        out.print("</a>");
        succeeded3 = true;
      }
      catch(NullPointerException npe)
      { 
        utils.Warning.warn("null reference prevented rendering of template element");
      }
      catch(IndexOutOfBoundsException ine)
      { 
        utils.Warning.warn("index out of bounds prevented rendering of template element");
      }
      ThreadLocalOut.popChecked(out);
      out = ThreadLocalOut.peek();
      if(succeeded3)
      { 
        out.print(sw21.toString());
      }
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "nav" + ">");
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