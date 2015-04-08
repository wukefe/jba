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

public @SuppressWarnings("all") class login_s_ad0String_Bool_String_String_Template extends TemplateServlet 
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
    staticEnv.putTemplate(keyOverwrite == null ? "login_s_ad0String_Bool_String_String" : keyOverwrite, login_s_ad0String_Bool_String_String_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    login_signinAction20_ = (String)args[0];
    stayLoggedIn_ = (utils.RefArg)args[1];
    credPassword_ = (utils.RefArg)args[2];
    credUsername_ = (utils.RefArg)args[3];
  }

  public String getUniqueName()
  { 
    return "login_s_ad0String_Bool_String_String";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + ("ref" + ("ref" + "ref"));
  }

  public String getTemplateSignature()
  { 
    return "template login_s_ad0(login_signinAction20 : String, stayLoggedIn : Ref<Bool>, credPassword : Ref<String>, credUsername : Ref<String>)";
  }

  public String getElementsContext()
  { 
    if(calledName == null)
    { 
      return "s";
    }
    else
    { 
      return calledName;
    }
  }

  private String login_signinAction20_ = "";

  public void setLogin_signinAction20_(String login_signinAction20_)
  { 
    this.login_signinAction20_ = login_signinAction20_;
  }

  public String getLogin_signinAction20_()
  { 
    return login_signinAction20_;
  }

  private utils.RefArg stayLoggedIn_ = null;

  public void setStayLoggedIn_(utils.RefArg stayLoggedIn_)
  { 
    this.stayLoggedIn_ = stayLoggedIn_;
  }

  public utils.RefArg getStayLoggedIn_()
  { 
    return stayLoggedIn_;
  }

  private utils.RefArg credPassword_ = null;

  public void setCredPassword_(utils.RefArg credPassword_)
  { 
    this.credPassword_ = credPassword_;
  }

  public utils.RefArg getCredPassword_()
  { 
    return credPassword_;
  }

  private utils.RefArg credUsername_ = null;

  public void setCredUsername_(utils.RefArg credUsername_)
  { 
    this.credUsername_ = credUsername_;
  }

  public utils.RefArg getCredUsername_()
  { 
    return credUsername_;
  }

  protected void handlePhase(int phase)
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    PrintWriter out = ThreadLocalOut.peek();
    switch(phase)
    { 
      case DATABIND_PHASE:
        ident = login_signinAction20_;
        if(threadLocalPageCached.getParammap().get(ident) != null)
        { 
          threadLocalPageCached.actionToBeExecutedHasDisabledValidation = login_signinAction0.isValidationDisabled();
        }
        break;

      case ACTION_PHASE:
        ident = login_signinAction20_;
        if(threadLocalPageCached.getParammap().get(ident) != null)
        { 
          if(isAjaxSubmitRequired(false))
          { 
            threadLocalPageCached.enableAjaxActionExecuted();
          }
          new login_signinAction0().run(threadLocalPageCached, getEnv(), getElementsContext(), (Boolean)stayLoggedIn_.get(), (String)credPassword_.get(), (String)credUsername_.get(), ident);
        }
        break;

      case RENDER_PHASE:
        if(isAjaxSubmitRequired(false))
        { 
          out.print("<button onclick='javascript:serverInvoke(\"" + threadLocalPageCached.getAbsoluteLocation() + "/" + threadLocalPageCached.getActionTarget() + threadLocalPageCached.getExtraQueryAruments("?") + "\",\"" + login_signinAction20_ + "\", [" + threadLocalPageCached.getHiddenPostParamsJson() + "],\"" + threadLocalPageCached.getFormIdent() + "\", this, true); return false;'");
          { 
            StringBuilder classattrs = new StringBuilder();
            StringBuilder styleattrs = new StringBuilder();
            java.util.List<String> ignore = new java.util.ArrayList<String>();
            utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
            for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
            { 
              AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
            }
            AttributeCollectionLookup.getAttributeCollection("submit", classattrs, styleattrs, ignore, out);
            utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
          }
          out.print(">");
          try
          { 
            handleTemplateCall(phase, inForLoop, forelementcounter, "tcall0", "outputString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Login"}, "outputString"), new Environment(env).putWithcall("elements#outputString", new utils.TemplateCall("elementsempty", null, null, null)), "outputString", TemplateCall.EmptyAttrs);
          }
          catch(RuntimeException ex)
          { 
            printTemplateCallException(ex, "outputString(\"Login\") at unknown context");
          }
          out.print("</button>");
        }
        else
        { 
          out.print("<button name=\"" + login_signinAction20_ + "\"");
          { 
            StringBuilder classattrs = new StringBuilder();
            StringBuilder styleattrs = new StringBuilder();
            java.util.List<String> ignore = new java.util.ArrayList<String>();
            utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
            for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
            { 
              AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
            }
            AttributeCollectionLookup.getAttributeCollection("submit", classattrs, styleattrs, ignore, out);
            utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
          }
          out.print(">");
          try
          { 
            handleTemplateCall(phase, inForLoop, forelementcounter, "tcall0", "outputString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Login"}, "outputString"), new Environment(env).putWithcall("elements#outputString", new utils.TemplateCall("elementsempty", null, null, null)), "outputString", TemplateCall.EmptyAttrs);
          }
          catch(RuntimeException ex)
          { 
            printTemplateCallException(ex, "outputString(\"Login\") at unknown context");
          }
          out.print("</button>");
        }
        break;
    }
  }
}