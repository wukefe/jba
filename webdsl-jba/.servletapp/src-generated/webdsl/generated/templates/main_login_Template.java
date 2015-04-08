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

public @SuppressWarnings("all") class main_login_Template extends TemplateServlet 
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
    main_login_s_ad0String_Secret_String_Template.loadTemplateMap(main_login_ta1Secret_String_Template.loadTemplateMap(main_login_ta0Secret_String_Template.loadTemplateMap(staticEnv)));
  }

  public static void loadRefArgClasses(Map<String, Class<?>> refargclasses)
  { 
    main_login_ta0Secret_String_Template.loadRefArgClasses(refargclasses);
    main_login_ta1Secret_String_Template.loadRefArgClasses(refargclasses);
    main_login_s_ad0String_Secret_String_Template.loadRefArgClasses(refargclasses);
  }

  public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    loadTemplateMap(null, staticEnv);
    return staticEnv;
  }

  public static Environment loadTemplateMap(String keyOverwrite, org.webdsl.lang.Environment staticEnv)
  { 
    staticEnv.putTemplate(keyOverwrite == null ? "main_login" : keyOverwrite, main_login_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  public String getUniqueName()
  { 
    return "main_login";
  }

  public String getStateEncodingOfArgument()
  { 
    return "";
  }

  public String getTemplateSignature()
  { 
    return "template main_login()";
  }

  public String getElementsContext()
  { 
    if(calledName == null)
    { 
      return "main_login";
    }
    else
    { 
      return calledName;
    }
  }

  private String name_;

  public String getName_()
  { 
    return name_;
  }

  public void setName_(String name_)
  { 
    this.name_ = name_;
  }

  private String pass_;

  public String getPass_()
  { 
    return pass_;
  }

  public void setPass_(String pass_)
  { 
    this.pass_ = pass_;
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
      threadLocalPageCached.addStylesheetInclude("mycss/signin.css");
    }
    if(threadLocalPageCached.isInForm())
    { 
      org.webdsl.logging.Logger.error("Invalid nested <form> tag detected in DOM at URL: " + threadLocalPageCached.getRequest().getRequestURL() + "\n Enclosing form found in " + threadLocalPageCached.getEnclosingForm() + "\n Nested form found in " + getTemplateSignature());
    }
    threadLocalPageCached.enterForm(getTemplateSignature());
    ident = (inForLoop ? forelementcounter : "") + ("form4" + getUniqueId());
    threadLocalPageCached.setFormIdent(ident);
    if(threadLocalPageCached.getParammap().get(ident) != null)
    { 
      threadLocalPageCached.setInSubmittedForm(true);
    }
    java.io.StringWriter sw12 = null;
    java.io.StringWriter sw11 = null;
    if(RENDER_PHASE == phase)
    { 
      threadLocalPageCached.formRequiresMultipartEnc = false;
      if(threadLocalPageCached.inSubmittedForm() && threadLocalPageCached.isValidationFormRerender())
      { 
        sw12 = new java.io.StringWriter();
        out = new java.io.PrintWriter(sw12);
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
      sw11 = new java.io.StringWriter();
      out = new java.io.PrintWriter(sw11);
      ThreadLocalOut.push(out);
      out.print(">");
      out.print("<input type=\"hidden\" name=\"" + ident + "\" value=\"1\" />");
      out.print(threadLocalPageCached.getHiddenParams());
    }
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall82", "labelString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Username:"}, "labelString"), new Environment(env).putWithcall("elements#labelString", new utils.TemplateCall("main_login_ta0Secret_String", getElementsContext(), new Object[]{new RefArg_main_login_Template0(main_login_Template.this), new RefArg_main_login_Template1(main_login_Template.this)}, attrs)), "labelString", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "labelString(\"Username:\") at ../mywebdsl.app:117/4");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "br");
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
      out.print("/>");
    }
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall84", "labelString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Password:"}, "labelString"), new Environment(env).putWithcall("elements#labelString", new utils.TemplateCall("main_login_ta1Secret_String", getElementsContext(), new Object[]{new RefArg_main_login_Template0(main_login_Template.this), new RefArg_main_login_Template1(main_login_Template.this)}, attrs)), "labelString", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "labelString(\"Password:\") at ../mywebdsl.app:119/4");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "br");
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
      out.print("/>");
    }
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall86", "wrapsubmitString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"main_login_ia0_" + webdsl.generated.functions.getPage_.getPage_().getTemplateContext().getTemplateContextString()}, "wrapsubmitString"), new Environment(env).putWithcall("s", new utils.TemplateCall("main_login_s_ad0String_Secret_String", getElementsContext(), new Object[]{new RefArg_main_login_Template0(main_login_Template.this), new RefArg_main_login_Template1(main_login_Template.this)}, attrs)), "wrapsubmitString", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "wrapsubmitString(\"main_login_ia0\" + getPage().getTemplateContext().getTemplateContextString()) at unknown context");
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
      out.write(sw11.toString());
      if(threadLocalPageCached.inSubmittedForm() && threadLocalPageCached.isValidationFormRerender())
      { 
        ThreadLocalOut.pop();
        if(threadLocalPageCached.submittedFormContent == null)
        { 
          threadLocalPageCached.submittedFormContent = sw12.toString();
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

  protected void initializeLocalVars()
  { 
    name_ = "";
    pass_ = "";
  }
}