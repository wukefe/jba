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

public @SuppressWarnings("all") class login_ta1Bool_String_String_Template extends TemplateServlet 
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
    staticEnv.putTemplate(keyOverwrite == null ? "login_ta1Bool_String_String" : keyOverwrite, login_ta1Bool_String_String_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    stayLoggedIn_ = (utils.RefArg)args[0];
    credPassword_ = (utils.RefArg)args[1];
    credUsername_ = (utils.RefArg)args[2];
  }

  public String getUniqueName()
  { 
    return "login_ta1Bool_String_String";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + ("ref" + ("ref" + "ref"));
  }

  public String getTemplateSignature()
  { 
    return "template login_ta1(stayLoggedIn : Ref<Bool>, credPassword : Ref<String>, credUsername : Ref<String>)";
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
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall4", "inputString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{credPassword_}, "inputString"), new Environment(env).putWithcall("elements#inputString", new utils.TemplateCall("elementsempty", null, null, null)), "inputString", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "inputString(credPassword) at unknown context");
    }
  }
}