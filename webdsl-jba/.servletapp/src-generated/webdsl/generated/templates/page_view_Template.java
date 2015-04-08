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

public @SuppressWarnings("all") class page_view_Template extends TemplateServlet 
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

  public void prefetchFor(int i, java.util.Collection<? extends org.webdsl.WebDSLEntity> elems)
  { 
    if(utils.QueryOptimization.isOptimizationEnabled())
    { 
      if(i == 1)
      { 
        java.util.ArrayList<webdsl.generated.domain.MyArticle> elems16 = new java.util.ArrayList<webdsl.generated.domain.MyArticle>();
        for(org.webdsl.WebDSLEntity ent : elems)
        { 
          if(ent.instanceOf("MyArticle"))
          { 
            elems16.add((webdsl.generated.domain.MyArticle)ent);
          }
        }
      }
    }
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
    staticEnv.putTemplate(keyOverwrite == null ? "page_view" : keyOverwrite, page_view_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    u_ = (webdsl.generated.domain.MyArticle)args[0];
  }

  public String getUniqueName()
  { 
    return "page_view";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + (u_ != null ? u_.getVersion() == 0 ? "_" : u_.getId().toString() : "null");
  }

  public String getTemplateSignature()
  { 
    return "page page_view(u : MyArticle)";
  }

  public String getElementsContext()
  { 
    if(calledName == null)
    { 
      return "page_view";
    }
    else
    { 
      return calledName;
    }
  }

  private webdsl.generated.domain.MyArticle u_ = null;

  public void setU_(webdsl.generated.domain.MyArticle u_)
  { 
    this.u_ = u_;
  }

  public webdsl.generated.domain.MyArticle getU_()
  { 
    return u_;
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
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall19", "dslinit", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{}, "dslinit"), new Environment(env).putWithcall("elements#dslinit", new utils.TemplateCall("elementsempty", null, null, null)), "dslinit", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "dslinit() at ../web-dsl-simple.app:34/3");
    }
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall21", "dslheader", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{}, "dslheader"), new Environment(env).putWithcall("elements#dslheader", new utils.TemplateCall("elementsempty", null, null, null)), "dslheader", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "dslheader() at ../web-dsl-simple.app:35/3");
    }
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall23", "my_view_bodyMyArticle", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{u_}, "my_view_bodyMyArticle"), new Environment(env).putWithcall("elements#my_view_bodyMyArticle", new utils.TemplateCall("elementsempty", null, null, null)), "my_view_bodyMyArticle", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "my_view_bodyMyArticle(u) at ../web-dsl-simple.app:36/3");
    }
  }

  protected void initActions()
  { 
    PrintWriter out = ThreadLocalOut.peek();
  }
}