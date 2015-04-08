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

public @SuppressWarnings("all") class logout_Template extends TemplateServlet 
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
  { 
    logout_s_ad0String_Template.loadTemplateMap(staticEnv);
  }

  public static void loadRefArgClasses(Map<String, Class<?>> refargclasses)
  { 
    logout_s_ad0String_Template.loadRefArgClasses(refargclasses);
  }

  public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    loadTemplateMap(null, staticEnv);
    return staticEnv;
  }

  public static Environment loadTemplateMap(String keyOverwrite, org.webdsl.lang.Environment staticEnv)
  { 
    staticEnv.putTemplate(keyOverwrite == null ? "logout" : keyOverwrite, logout_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  public String getUniqueName()
  { 
    return "logout";
  }

  public String getStateEncodingOfArgument()
  { 
    return "";
  }

  public String getTemplateSignature()
  { 
    return "template logout()";
  }

  public String getElementsContext()
  { 
    if(calledName == null)
    { 
      return "logout";
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
    if(!org.webdsl.tools.Utils.equal(getCachedSessionSecurityContext().getPrincipal(), null))
    { 
      if(RENDER_PHASE == phase)
      { 
        try
        { 
          utils.RenderUtils.printPageString("Logged in as: ", out, threadLocalPageCached.isRawoutput());
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
        handleTemplateCall(phase, inForLoop, forelementcounter, "tcall49", "outputString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{getCachedSessionSecurityContext().getPrincipal().getName()}, "outputString"), new Environment(env).putWithcall("elements#outputString", new utils.TemplateCall("elementsempty", null, null, null)), "outputString", TemplateCall.EmptyAttrs);
      }
      catch(RuntimeException ex)
      { 
        printTemplateCallException(ex, "outputString(session.securityContext.principal.name) at unknown context");
      }
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
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall51", "wrapsubmitString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"logout_signoffAction1" + webdsl.generated.functions.getPage_.getPage_().getTemplateContext().getTemplateContextString()}, "wrapsubmitString"), new Environment(env).putWithcall("s", new utils.TemplateCall("logout_s_ad0String", getElementsContext(), new Object[]{}, attrs)), "wrapsubmitString", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "wrapsubmitString(\"logout_signoffAction1\" +\ngetPage().getTemplateContext().getTemplateContextString()) at unknown context");
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
  }
}