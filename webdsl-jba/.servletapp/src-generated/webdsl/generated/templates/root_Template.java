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

public @SuppressWarnings("all") class root_Template extends TemplateServlet 
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
    staticEnv.putTemplate(keyOverwrite == null ? "root" : keyOverwrite, root_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  public String getUniqueName()
  { 
    return "root";
  }

  public String getStateEncodingOfArgument()
  { 
    return "";
  }

  public String getTemplateSignature()
  { 
    return "page root()";
  }

  public String getElementsContext()
  { 
    if(calledName == null)
    { 
      return "root";
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
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall9", "main", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{}, "main"), new Environment(env).putWithcall("elements#main", new utils.TemplateCall("elementsempty", null, null, null)), "main", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "main() at ../web-dsl-simple.app:25/3");
    }
  }

  protected void initActions()
  { 
    PrintWriter out = ThreadLocalOut.peek();
  }
}