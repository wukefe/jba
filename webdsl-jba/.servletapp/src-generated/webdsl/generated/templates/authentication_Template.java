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

public @SuppressWarnings("all") class authentication_Template extends TemplateServlet 
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
    staticEnv.putTemplate(keyOverwrite == null ? "authentication" : keyOverwrite, authentication_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  public String getUniqueName()
  { 
    return "authentication";
  }

  public String getStateEncodingOfArgument()
  { 
    return "";
  }

  public String getTemplateSignature()
  { 
    return "template authentication()";
  }

  public String getElementsContext()
  { 
    if(calledName == null)
    { 
      return "authentication";
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
    if(webdsl.generated.functions.loggedIn_.loggedIn_())
    { 
      try
      { 
        handleTemplateCall(phase, inForLoop, forelementcounter, "tcall45", "logout", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{}, "logout"), new Environment(env).putWithcall("elements#logout", new utils.TemplateCall("elementsempty", null, null, null)), "logout", TemplateCall.EmptyAttrs);
      }
      catch(RuntimeException ex)
      { 
        printTemplateCallException(ex, "logout() at unknown context");
      }
    }
    else
    { 
      try
      { 
        handleTemplateCall(phase, inForLoop, forelementcounter, "tcall47", "login", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{}, "login"), new Environment(env).putWithcall("elements#login", new utils.TemplateCall("elementsempty", null, null, null)), "login", TemplateCall.EmptyAttrs);
      }
      catch(RuntimeException ex)
      { 
        printTemplateCallException(ex, "login() at unknown context");
      }
    }
  }
}