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

public @SuppressWarnings("all") class login_Template extends TemplateServlet 
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
    login_s_ad0String_Bool_String_String_Template.loadTemplateMap(login_ta2Bool_String_String_Template.loadTemplateMap(login_ta1Bool_String_String_Template.loadTemplateMap(login_ta0Bool_String_String_Template.loadTemplateMap(staticEnv))));
  }

  public static void loadRefArgClasses(Map<String, Class<?>> refargclasses)
  { 
    login_ta0Bool_String_String_Template.loadRefArgClasses(refargclasses);
    login_ta1Bool_String_String_Template.loadRefArgClasses(refargclasses);
    login_ta2Bool_String_String_Template.loadRefArgClasses(refargclasses);
    login_s_ad0String_Bool_String_String_Template.loadRefArgClasses(refargclasses);
  }

  public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    loadTemplateMap(null, staticEnv);
    return staticEnv;
  }

  public static Environment loadTemplateMap(String keyOverwrite, org.webdsl.lang.Environment staticEnv)
  { 
    staticEnv.putTemplate(keyOverwrite == null ? "login" : keyOverwrite, login_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  public String getUniqueName()
  { 
    return "login";
  }

  public String getStateEncodingOfArgument()
  { 
    return "";
  }

  public String getTemplateSignature()
  { 
    return "template login()";
  }

  public String getElementsContext()
  { 
    if(calledName == null)
    { 
      return "login";
    }
    else
    { 
      return calledName;
    }
  }

  private String credUsername_;

  public String getCredUsername_()
  { 
    return credUsername_;
  }

  public void setCredUsername_(String credUsername_)
  { 
    this.credUsername_ = credUsername_;
  }

  private String credPassword_;

  public String getCredPassword_()
  { 
    return credPassword_;
  }

  public void setCredPassword_(String credPassword_)
  { 
    this.credPassword_ = credPassword_;
  }

  private Boolean stayLoggedIn_;

  public Boolean getStayLoggedIn_()
  { 
    return stayLoggedIn_;
  }

  public void setStayLoggedIn_(Boolean stayLoggedIn_)
  { 
    this.stayLoggedIn_ = stayLoggedIn_;
  }

  protected void handlePhase(int phase)
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    PrintWriter out = ThreadLocalOut.peek();
    if(threadLocalPageCached.isInForm())
    { 
      org.webdsl.logging.Logger.error("Invalid nested <form> tag detected in DOM at URL: " + threadLocalPageCached.getRequest().getRequestURL() + "\n Enclosing form found in " + threadLocalPageCached.getEnclosingForm() + "\n Nested form found in " + getTemplateSignature());
    }
    threadLocalPageCached.enterForm(getTemplateSignature());
    ident = (inForLoop ? forelementcounter : "") + ("form1" + getUniqueId());
    threadLocalPageCached.setFormIdent(ident);
    if(threadLocalPageCached.getParammap().get(ident) != null)
    { 
      threadLocalPageCached.setInSubmittedForm(true);
    }
    java.io.StringWriter sw3 = null;
    java.io.StringWriter sw2 = null;
    if(RENDER_PHASE == phase)
    { 
      threadLocalPageCached.formRequiresMultipartEnc = false;
      if(threadLocalPageCached.inSubmittedForm() && threadLocalPageCached.isValidationFormRerender())
      { 
        sw3 = new java.io.StringWriter();
        out = new java.io.PrintWriter(sw3);
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
      sw2 = new java.io.StringWriter();
      out = new java.io.PrintWriter(sw2);
      ThreadLocalOut.push(out);
      out.print(">");
      out.print("<input type=\"hidden\" name=\"" + ident + "\" value=\"1\" />");
      out.print(threadLocalPageCached.getHiddenParams());
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "fieldset");
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
      out.print("<" + "legend");
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
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall54", "outputString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Login"}, "outputString"), new Environment(env).putWithcall("elements#outputString", new utils.TemplateCall("elementsempty", null, null, null)), "outputString", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "outputString(\"Login\") at unknown context");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "legend" + ">");
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
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall56", "labelcolumnsString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Username: "}, "labelcolumnsString"), new Environment(env).putWithcall("elements#labelcolumnsString", new utils.TemplateCall("login_ta0Bool_String_String", getElementsContext(), new Object[]{new RefArg_login_Template0(login_Template.this), new RefArg_login_Template1(login_Template.this), new RefArg_login_Template2(login_Template.this)}, attrs)), "labelcolumnsString", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "labelcolumnsString(\"Username: \") at unknown context");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "tr" + ">");
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
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall58", "labelcolumnsString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Password: "}, "labelcolumnsString"), new Environment(env).putWithcall("elements#labelcolumnsString", new utils.TemplateCall("login_ta1Bool_String_String", getElementsContext(), new Object[]{new RefArg_login_Template0(login_Template.this), new RefArg_login_Template1(login_Template.this), new RefArg_login_Template2(login_Template.this)}, attrs)), "labelcolumnsString", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "labelcolumnsString(\"Password: \") at unknown context");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "tr" + ">");
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
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall60", "labelcolumnsString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Stay logged in:"}, "labelcolumnsString"), new Environment(env).putWithcall("elements#labelcolumnsString", new utils.TemplateCall("login_ta2Bool_String_String", getElementsContext(), new Object[]{new RefArg_login_Template0(login_Template.this), new RefArg_login_Template1(login_Template.this), new RefArg_login_Template2(login_Template.this)}, attrs)), "labelcolumnsString", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "labelcolumnsString(\"Stay logged in:\") at unknown context");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "tr" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "table" + ">");
    }
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall62", "wrapsubmitString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"login_signinAction2" + webdsl.generated.functions.getPage_.getPage_().getTemplateContext().getTemplateContextString()}, "wrapsubmitString"), new Environment(env).putWithcall("s", new utils.TemplateCall("login_s_ad0String_Bool_String_String", getElementsContext(), new Object[]{new RefArg_login_Template0(login_Template.this), new RefArg_login_Template1(login_Template.this), new RefArg_login_Template2(login_Template.this)}, attrs)), "wrapsubmitString", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "wrapsubmitString(\"login_signinAction2\" +\ngetPage().getTemplateContext().getTemplateContextString()) at unknown context");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "fieldset" + ">");
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
      out.write(sw2.toString());
      if(threadLocalPageCached.inSubmittedForm() && threadLocalPageCached.isValidationFormRerender())
      { 
        ThreadLocalOut.pop();
        if(threadLocalPageCached.submittedFormContent == null)
        { 
          threadLocalPageCached.submittedFormContent = sw3.toString();
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
    credUsername_ = "";
    credPassword_ = "";
    stayLoggedIn_ = false;
  }
}