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

public @SuppressWarnings("all") class accessDenied_Template extends TemplateServlet 
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
    staticEnv.putTemplate(keyOverwrite == null ? "accessDenied" : keyOverwrite, accessDenied_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  public String getUniqueName()
  { 
    return "accessDenied";
  }

  public String getStateEncodingOfArgument()
  { 
    return "";
  }

  public String getTemplateSignature()
  { 
    return "page accessDenied()";
  }

  public String getElementsContext()
  { 
    if(calledName == null)
    { 
      return "accessDenied";
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
      java.io.StringWriter s0 = new java.io.StringWriter();
      out = new java.io.PrintWriter(s0);
      ThreadLocalOut.push(out);
      if(RENDER_PHASE == phase)
      { 
        try
        { 
          utils.RenderUtils.printPageString("Access Denied", out, threadLocalPageCached.isRawoutput());
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
      s0.flush();
      threadLocalPageCached.setPageTitle(s0.toString());
      ThreadLocalOut.popChecked(out);
      out = ThreadLocalOut.peek();
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString("Access Denied: ", out, threadLocalPageCached.isRawoutput());
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
      java.io.StringWriter sw25 = new java.io.StringWriter();
      out = new java.io.PrintWriter(sw25);
      ThreadLocalOut.push(out);
      boolean succeeded5 = false;
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
          utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
        }
        out.print(">");
        if(RENDER_PHASE == phase)
        { 
          try
          { 
            utils.RenderUtils.printPageString("return to home page", out, threadLocalPageCached.isRawoutput());
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
        succeeded5 = true;
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
      if(succeeded5)
      { 
        out.print(sw25.toString());
      }
    }
  }

  protected void initActions()
  { 
    PrintWriter out = ThreadLocalOut.peek();
  }
}