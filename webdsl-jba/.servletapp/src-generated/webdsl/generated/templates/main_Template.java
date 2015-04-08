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

public @SuppressWarnings("all") class main_Template extends TemplateServlet 
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
    staticEnv.putTemplate(keyOverwrite == null ? "main" : keyOverwrite, main_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  public String getUniqueName()
  { 
    return "main";
  }

  public String getStateEncodingOfArgument()
  { 
    return "";
  }

  public String getTemplateSignature()
  { 
    return "template main()";
  }

  public String getElementsContext()
  { 
    if(calledName == null)
    { 
      return "main";
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
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall132", "dslinit", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{}, "dslinit"), new Environment(env).putWithcall("elements#dslinit", new utils.TemplateCall("elementsempty", null, null, null)), "dslinit", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "dslinit() at ../mywebdsl.app:11/3");
    }
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall134", "dslheader", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{}, "dslheader"), new Environment(env).putWithcall("elements#dslheader", new utils.TemplateCall("elementsempty", null, null, null)), "dslheader", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "dslheader() at ../mywebdsl.app:12/3");
    }
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall136", "dslcontainer", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{}, "dslcontainer"), new Environment(env).putWithcall("elements#dslcontainer", new utils.TemplateCall("elementsempty", null, null, null)), "dslcontainer", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "dslcontainer() at ../mywebdsl.app:13/3");
    }
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall138", "dslfooter", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{}, "dslfooter"), new Environment(env).putWithcall("elements#dslfooter", new utils.TemplateCall("elementsempty", null, null, null)), "dslfooter", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "dslfooter() at ../mywebdsl.app:14/3");
    }
  }
}