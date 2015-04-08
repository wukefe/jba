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

public @SuppressWarnings("all") class page_admin_welcomeAdmin_s_ad0String_Admin_Template extends TemplateServlet 
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
        java.util.ArrayList<webdsl.generated.domain.Admin> elems17 = new java.util.ArrayList<webdsl.generated.domain.Admin>();
        for(org.webdsl.WebDSLEntity ent : elems)
        { 
          if(ent.instanceOf("Admin"))
          { 
            elems17.add((webdsl.generated.domain.Admin)ent);
          }
        }
      }
    }
  }

  public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    page_admin_welcomeAdmin_s_ad0String_Admin_s_ad0String_Admin_String_Template.loadTemplateMap(staticEnv);
  }

  public static void loadRefArgClasses(Map<String, Class<?>> refargclasses)
  { 
    page_admin_welcomeAdmin_s_ad0String_Admin_s_ad0String_Admin_String_Template.loadRefArgClasses(refargclasses);
  }

  public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    loadTemplateMap(null, staticEnv);
    return staticEnv;
  }

  public static Environment loadTemplateMap(String keyOverwrite, org.webdsl.lang.Environment staticEnv)
  { 
    staticEnv.putTemplate(keyOverwrite == null ? "page_admin_welcomeAdmin_s_ad0String_Admin" : keyOverwrite, page_admin_welcomeAdmin_s_ad0String_Admin_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    page_admin_welcomeAdmin_signout10_ = (String)args[0];
    admin_ = (webdsl.generated.domain.Admin)args[1];
  }

  public String getUniqueName()
  { 
    return "page_admin_welcomeAdmin_s_ad0String_Admin";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + (admin_ != null ? admin_.getVersion() == 0 ? "_" : admin_.getId().toString() : "null");
  }

  public String getTemplateSignature()
  { 
    return "template page_admin_welcomeAdmin_s_ad0(page_admin_welcomeAdmin_signout10 : String, admin : Admin)";
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

  private String page_admin_welcomeAdmin_signout10_ = "";

  public void setPage_admin_welcomeAdmin_signout10_(String page_admin_welcomeAdmin_signout10_)
  { 
    this.page_admin_welcomeAdmin_signout10_ = page_admin_welcomeAdmin_signout10_;
  }

  public String getPage_admin_welcomeAdmin_signout10_()
  { 
    return page_admin_welcomeAdmin_signout10_;
  }

  private webdsl.generated.domain.Admin admin_ = null;

  public void setAdmin_(webdsl.generated.domain.Admin admin_)
  { 
    this.admin_ = admin_;
  }

  public webdsl.generated.domain.Admin getAdmin_()
  { 
    return admin_;
  }

  protected void handlePhase(int phase)
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    PrintWriter out = ThreadLocalOut.peek();
    if(webdsl.generated.functions.genpagepredicate_page_admin_welcome0Admin_.genpagepredicate_page_admin_welcome0Admin_(admin_))
    { 
      if(webdsl.generated.functions.genactionpredicate_page_admin_welcome__0Admin_.genactionpredicate_page_admin_welcome__0Admin_(admin_))
      { 
        try
        { 
          handleTemplateCall(phase, inForLoop, forelementcounter, "tcall15", "wrapsubmitString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"page_admin_welcomeAdmin_signout2" + webdsl.generated.functions.getPage_.getPage_().getTemplateContext().getTemplateContextString()}, "wrapsubmitString"), new Environment(env).putWithcall("s", new utils.TemplateCall("page_admin_welcomeAdmin_s_ad0String_Admin_s_ad0String_Admin_String", getElementsContext(), new Object[]{admin_, page_admin_welcomeAdmin_signout10_}, attrs)), "wrapsubmitString", TemplateCall.EmptyAttrs);
        }
        catch(RuntimeException ex)
        { 
          printTemplateCallException(ex, "wrapsubmitString(\"page_admin_welcomeAdmin_signout2\" +\ngetPage().getTemplateContext().getTemplateContextString()) at unknown context");
        }
      }
    }
  }
}