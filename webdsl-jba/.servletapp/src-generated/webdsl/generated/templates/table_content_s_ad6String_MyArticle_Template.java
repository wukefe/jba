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

public @SuppressWarnings("all") class table_content_s_ad6String_MyArticle_Template extends TemplateServlet 
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
      if(i == 2)
      { 
        java.util.ArrayList<webdsl.generated.domain.MyArticle> elems8 = new java.util.ArrayList<webdsl.generated.domain.MyArticle>();
        for(org.webdsl.WebDSLEntity ent : elems)
        { 
          if(ent.instanceOf("MyArticle"))
          { 
            elems8.add((webdsl.generated.domain.MyArticle)ent);
          }
        }
      }
    }
  }

  public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    table_content_s_ad6String_MyArticle_s_ad0String_MyArticle_String_Template.loadTemplateMap(staticEnv);
  }

  public static void loadRefArgClasses(Map<String, Class<?>> refargclasses)
  { 
    table_content_s_ad6String_MyArticle_s_ad0String_MyArticle_String_Template.loadRefArgClasses(refargclasses);
  }

  public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    loadTemplateMap(null, staticEnv);
    return staticEnv;
  }

  public static Environment loadTemplateMap(String keyOverwrite, org.webdsl.lang.Environment staticEnv)
  { 
    staticEnv.putTemplate(keyOverwrite == null ? "table_content_s_ad6String_MyArticle" : keyOverwrite, table_content_s_ad6String_MyArticle_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    table_content_ia60_ = (String)args[0];
    u_ = (webdsl.generated.domain.MyArticle)args[1];
  }

  public String getUniqueName()
  { 
    return "table_content_s_ad6String_MyArticle";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + (u_ != null ? u_.getVersion() == 0 ? "_" : u_.getId().toString() : "null");
  }

  public String getTemplateSignature()
  { 
    return "template table_content_s_ad6(table_content_ia60 : String, u : MyArticle)";
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

  private String table_content_ia60_ = "";

  public void setTable_content_ia60_(String table_content_ia60_)
  { 
    this.table_content_ia60_ = table_content_ia60_;
  }

  public String getTable_content_ia60_()
  { 
    return table_content_ia60_;
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
    if(webdsl.generated.functions.genactioncombined_table_content_ia60MyArticle_.genactioncombined_table_content_ia60MyArticle_(u_))
    { 
      try
      { 
        handleTemplateCall(phase, inForLoop, forelementcounter, "tcall6", "wrapsubmitString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"table_content_ia6_" + webdsl.generated.functions.getPage_.getPage_().getTemplateContext().getTemplateContextString()}, "wrapsubmitString"), new Environment(env).putWithcall("s", new utils.TemplateCall("table_content_s_ad6String_MyArticle_s_ad0String_MyArticle_String", getElementsContext(), new Object[]{u_, table_content_ia60_}, attrs)), "wrapsubmitString", TemplateCall.EmptyAttrs);
      }
      catch(RuntimeException ex)
      { 
        printTemplateCallException(ex, "wrapsubmitString(\"table_content_ia6\" + getPage().getTemplateContext().getTemplateContextString()) at unknown context");
      }
    }
  }
}