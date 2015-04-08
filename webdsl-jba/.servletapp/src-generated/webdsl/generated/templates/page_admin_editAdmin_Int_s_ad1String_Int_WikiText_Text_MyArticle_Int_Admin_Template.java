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

public @SuppressWarnings("all") class page_admin_editAdmin_Int_s_ad1String_Int_WikiText_Text_MyArticle_Int_Admin_Template extends TemplateServlet 
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
      if(i == 7)
      { 
        java.util.ArrayList<webdsl.generated.domain.Admin> elems0 = new java.util.ArrayList<webdsl.generated.domain.Admin>();
        for(org.webdsl.WebDSLEntity ent : elems)
        { 
          if(ent.instanceOf("Admin"))
          { 
            elems0.add((webdsl.generated.domain.Admin)ent);
          }
        }
      }
    }
  }

  public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    page_admin_editAdmin_Int_s_ad1String_Int_WikiText_Text_MyArticle_Int_Admin_s_ad0String_Admin_Int_MyArticle_Text_WikiText_Int_String_Template.loadTemplateMap(staticEnv);
  }

  public static void loadRefArgClasses(Map<String, Class<?>> refargclasses)
  { 
    page_admin_editAdmin_Int_s_ad1String_Int_WikiText_Text_MyArticle_Int_Admin_s_ad0String_Admin_Int_MyArticle_Text_WikiText_Int_String_Template.loadRefArgClasses(refargclasses);
  }

  public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    loadTemplateMap(null, staticEnv);
    return staticEnv;
  }

  public static Environment loadTemplateMap(String keyOverwrite, org.webdsl.lang.Environment staticEnv)
  { 
    staticEnv.putTemplate(keyOverwrite == null ? "page_admin_editAdmin_Int_s_ad1String_Int_WikiText_Text_MyArticle_Int_Admin" : keyOverwrite, page_admin_editAdmin_Int_s_ad1String_Int_WikiText_Text_MyArticle_Int_Admin_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    page_admin_editAdmin_Int_clearContent10_ = (String)args[0];
    z_ = (utils.RefArg)args[1];
    y_ = (utils.RefArg)args[2];
    x_ = (utils.RefArg)args[3];
    u_ = (utils.RefArg)args[4];
    count_ = (Integer)args[5];
    admin_ = (webdsl.generated.domain.Admin)args[6];
  }

  public String getUniqueName()
  { 
    return "page_admin_editAdmin_Int_s_ad1String_Int_WikiText_Text_MyArticle_Int_Admin";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + ("ref" + ("ref" + ("ref" + ("ref" + (admin_ != null ? admin_.getVersion() == 0 ? "_" : admin_.getId().toString() : "null")))));
  }

  public String getTemplateSignature()
  { 
    return "template page_admin_editAdmin_Int_s_ad1(page_admin_editAdmin_Int_clearContent10 : String, z : Ref<Int>, y : Ref<WikiText>, x : Ref<Text>, u : Ref<MyArticle>, count : Int, admin : Admin)";
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

  private String page_admin_editAdmin_Int_clearContent10_ = "";

  public void setPage_admin_editAdmin_Int_clearContent10_(String page_admin_editAdmin_Int_clearContent10_)
  { 
    this.page_admin_editAdmin_Int_clearContent10_ = page_admin_editAdmin_Int_clearContent10_;
  }

  public String getPage_admin_editAdmin_Int_clearContent10_()
  { 
    return page_admin_editAdmin_Int_clearContent10_;
  }

  private utils.RefArg z_ = null;

  public void setZ_(utils.RefArg z_)
  { 
    this.z_ = z_;
  }

  public utils.RefArg getZ_()
  { 
    return z_;
  }

  private utils.RefArg y_ = null;

  public void setY_(utils.RefArg y_)
  { 
    this.y_ = y_;
  }

  public utils.RefArg getY_()
  { 
    return y_;
  }

  private utils.RefArg x_ = null;

  public void setX_(utils.RefArg x_)
  { 
    this.x_ = x_;
  }

  public utils.RefArg getX_()
  { 
    return x_;
  }

  private utils.RefArg u_ = null;

  public void setU_(utils.RefArg u_)
  { 
    this.u_ = u_;
  }

  public utils.RefArg getU_()
  { 
    return u_;
  }

  private Integer count_ = 0;

  public void setCount_(Integer count_)
  { 
    this.count_ = count_;
  }

  public Integer getCount_()
  { 
    return count_;
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
    if(webdsl.generated.functions.genpagepredicate_page_admin_edit0Admin_Int_.genpagepredicate_page_admin_edit0Admin_Int_(admin_, count_))
    { 
      if(webdsl.generated.functions.genactionpredicate_page_admin_edit__0Admin_Int_.genactionpredicate_page_admin_edit__0Admin_Int_(admin_, count_))
      { 
        try
        { 
          handleTemplateCall(phase, inForLoop, forelementcounter, "tcall0", "wrapsubmitString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"page_admin_editAdmin_Int_clearContent2" + webdsl.generated.functions.getPage_.getPage_().getTemplateContext().getTemplateContextString()}, "wrapsubmitString"), new Environment(env).putWithcall("s", new utils.TemplateCall("page_admin_editAdmin_Int_s_ad1String_Int_WikiText_Text_MyArticle_Int_Admin_s_ad0String_Admin_Int_MyArticle_Text_WikiText_Int_String", getElementsContext(), new Object[]{admin_, count_, u_, x_, y_, z_, page_admin_editAdmin_Int_clearContent10_}, attrs)), "wrapsubmitString", TemplateCall.EmptyAttrs);
        }
        catch(RuntimeException ex)
        { 
          printTemplateCallException(ex, "wrapsubmitString(\"page_admin_editAdmin_Int_clearContent2\" +\ngetPage().getTemplateContext().getTemplateContextString()) at unknown context");
        }
      }
    }
  }
}