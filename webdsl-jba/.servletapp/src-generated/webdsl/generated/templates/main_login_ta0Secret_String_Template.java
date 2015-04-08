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

public @SuppressWarnings("all") class main_login_ta0Secret_String_Template extends TemplateServlet 
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
    staticEnv.putTemplate(keyOverwrite == null ? "main_login_ta0Secret_String" : keyOverwrite, main_login_ta0Secret_String_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    pass_ = (utils.RefArg)args[0];
    name_ = (utils.RefArg)args[1];
  }

  public String getUniqueName()
  { 
    return "main_login_ta0Secret_String";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + ("ref" + "ref");
  }

  public String getTemplateSignature()
  { 
    return "template main_login_ta0(pass : Ref<Secret>, name : Ref<String>)";
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

  private utils.RefArg pass_ = null;

  public void setPass_(utils.RefArg pass_)
  { 
    this.pass_ = pass_;
  }

  public utils.RefArg getPass_()
  { 
    return pass_;
  }

  private utils.RefArg name_ = null;

  public void setName_(utils.RefArg name_)
  { 
    this.name_ = name_;
  }

  public utils.RefArg getName_()
  { 
    return name_;
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
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall2", "inputString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{name_}, "inputString"), new Environment(env).putWithcall("elements#inputString", new utils.TemplateCall("elementsempty", null, null, null)), "inputString", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "inputString(name) at ../mywebdsl.app:117/24");
    }
  }
}