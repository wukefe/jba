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

public @SuppressWarnings("all") class table_contentAdmin_s_ad8String_MyArticle_Admin_Template extends TemplateServlet 
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
        java.util.ArrayList<webdsl.generated.domain.MyArticle> elems0 = new java.util.ArrayList<webdsl.generated.domain.MyArticle>();
        for(org.webdsl.WebDSLEntity ent : elems)
        { 
          if(ent.instanceOf("MyArticle"))
          { 
            elems0.add((webdsl.generated.domain.MyArticle)ent);
          }
        }
      }
      if(i == 3)
      { 
        java.util.ArrayList<webdsl.generated.domain.Admin> elems1 = new java.util.ArrayList<webdsl.generated.domain.Admin>();
        for(org.webdsl.WebDSLEntity ent : elems)
        { 
          if(ent.instanceOf("Admin"))
          { 
            elems1.add((webdsl.generated.domain.Admin)ent);
          }
        }
      }
    }
  }

  public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    table_contentAdmin_s_ad8String_MyArticle_Admin_s_ad0String_Admin_MyArticle_String_Template.loadTemplateMap(staticEnv);
  }

  public static void loadRefArgClasses(Map<String, Class<?>> refargclasses)
  { 
    table_contentAdmin_s_ad8String_MyArticle_Admin_s_ad0String_Admin_MyArticle_String_Template.loadRefArgClasses(refargclasses);
  }

  public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    loadTemplateMap(null, staticEnv);
    return staticEnv;
  }

  public static Environment loadTemplateMap(String keyOverwrite, org.webdsl.lang.Environment staticEnv)
  { 
    staticEnv.putTemplate(keyOverwrite == null ? "table_contentAdmin_s_ad8String_MyArticle_Admin" : keyOverwrite, table_contentAdmin_s_ad8String_MyArticle_Admin_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    table_contentAdmin_ia80_ = (String)args[0];
    u_ = (webdsl.generated.domain.MyArticle)args[1];
    admin_ = (webdsl.generated.domain.Admin)args[2];
  }

  public String getUniqueName()
  { 
    return "table_contentAdmin_s_ad8String_MyArticle_Admin";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + ((u_ != null ? u_.getVersion() == 0 ? "_" : u_.getId().toString() : "null") + (admin_ != null ? admin_.getVersion() == 0 ? "_" : admin_.getId().toString() : "null"));
  }

  public String getTemplateSignature()
  { 
    return "template table_contentAdmin_s_ad8(table_contentAdmin_ia80 : String, u : MyArticle, admin : Admin)";
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

  private String table_contentAdmin_ia80_ = "";

  public void setTable_contentAdmin_ia80_(String table_contentAdmin_ia80_)
  { 
    this.table_contentAdmin_ia80_ = table_contentAdmin_ia80_;
  }

  public String getTable_contentAdmin_ia80_()
  { 
    return table_contentAdmin_ia80_;
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
    if(webdsl.generated.functions.genpagepredicate_table_content0Admin_.genpagepredicate_table_content0Admin_(admin_))
    { 
      if(webdsl.generated.functions.genactionpredicate_table_content__0Admin_.genactionpredicate_table_content__0Admin_(admin_))
      { 
        try
        { 
          handleTemplateCall(phase, inForLoop, forelementcounter, "tcall0", "wrapsubmitString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"table_contentAdmin_ia8_" + webdsl.generated.functions.getPage_.getPage_().getTemplateContext().getTemplateContextString()}, "wrapsubmitString"), new Environment(env).putWithcall("s", new utils.TemplateCall("table_contentAdmin_s_ad8String_MyArticle_Admin_s_ad0String_Admin_MyArticle_String", getElementsContext(), new Object[]{admin_, u_, table_contentAdmin_ia80_}, attrs)), "wrapsubmitString", TemplateCall.EmptyAttrs);
        }
        catch(RuntimeException ex)
        { 
          printTemplateCallException(ex, "wrapsubmitString(\"table_contentAdmin_ia8\" +\ngetPage().getTemplateContext().getTemplateContextString()) at unknown context");
        }
      }
    }
  }
}