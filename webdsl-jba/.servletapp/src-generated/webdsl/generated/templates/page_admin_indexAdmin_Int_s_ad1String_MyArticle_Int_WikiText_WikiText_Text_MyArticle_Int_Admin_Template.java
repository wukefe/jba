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

public @SuppressWarnings("all") class page_admin_indexAdmin_Int_s_ad1String_MyArticle_Int_WikiText_WikiText_Text_MyArticle_Int_Admin_Template extends TemplateServlet 
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
      if(i == 9)
      { 
        java.util.ArrayList<webdsl.generated.domain.Admin> elems2 = new java.util.ArrayList<webdsl.generated.domain.Admin>();
        for(org.webdsl.WebDSLEntity ent : elems)
        { 
          if(ent.instanceOf("Admin"))
          { 
            elems2.add((webdsl.generated.domain.Admin)ent);
          }
        }
      }
    }
  }

  public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    page_admin_indexAdmin_Int_s_ad1String_MyArticle_Int_WikiText_WikiText_Text_MyArticle_Int_A34String_Admin_Int_MyArticle_Text_WikiText_WikiText_Int_MyArticle_String_Template.loadTemplateMap(staticEnv);
  }

  public static void loadRefArgClasses(Map<String, Class<?>> refargclasses)
  { 
    page_admin_indexAdmin_Int_s_ad1String_MyArticle_Int_WikiText_WikiText_Text_MyArticle_Int_A34String_Admin_Int_MyArticle_Text_WikiText_WikiText_Int_MyArticle_String_Template.loadRefArgClasses(refargclasses);
  }

  public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    loadTemplateMap(null, staticEnv);
    return staticEnv;
  }

  public static Environment loadTemplateMap(String keyOverwrite, org.webdsl.lang.Environment staticEnv)
  { 
    staticEnv.putTemplate(keyOverwrite == null ? "page_admin_indexAdmin_Int_s_ad1String_MyArticle_Int_WikiText_WikiText_Text_MyArticle_Int_Admin" : keyOverwrite, page_admin_indexAdmin_Int_s_ad1String_MyArticle_Int_WikiText_WikiText_Text_MyArticle_Int_Admin_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    page_admin_indexAdmin_Int_clearContent10_ = (String)args[0];
    art_ = (utils.RefArg)args[1];
    id_ = (utils.RefArg)args[2];
    ucontent_ = (utils.RefArg)args[3];
    utitle_ = (utils.RefArg)args[4];
    x_ = (utils.RefArg)args[5];
    u_ = (utils.RefArg)args[6];
    indx_ = (Integer)args[7];
    admin_ = (webdsl.generated.domain.Admin)args[8];
  }

  public String getUniqueName()
  { 
    return "page_admin_indexAdmin_Int_s_ad1String_MyArticle_Int_WikiText_WikiText_Text_MyArticle_Int_Admin";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + ("ref" + ("ref" + ("ref" + ("ref" + ("ref" + ("ref" + (admin_ != null ? admin_.getVersion() == 0 ? "_" : admin_.getId().toString() : "null")))))));
  }

  public String getTemplateSignature()
  { 
    return "template page_admin_indexAdmin_Int_s_ad1(page_admin_indexAdmin_Int_clearContent10 : String, art : Ref<MyArticle>, id : Ref<Int>, ucontent : Ref<WikiText>, utitle : Ref<WikiText>, x : Ref<Text>, u : Ref<MyArticle>, indx : Int, admin : Admin)";
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

  private String page_admin_indexAdmin_Int_clearContent10_ = "";

  public void setPage_admin_indexAdmin_Int_clearContent10_(String page_admin_indexAdmin_Int_clearContent10_)
  { 
    this.page_admin_indexAdmin_Int_clearContent10_ = page_admin_indexAdmin_Int_clearContent10_;
  }

  public String getPage_admin_indexAdmin_Int_clearContent10_()
  { 
    return page_admin_indexAdmin_Int_clearContent10_;
  }

  private utils.RefArg art_ = null;

  public void setArt_(utils.RefArg art_)
  { 
    this.art_ = art_;
  }

  public utils.RefArg getArt_()
  { 
    return art_;
  }

  private utils.RefArg id_ = null;

  public void setId_(utils.RefArg id_)
  { 
    this.id_ = id_;
  }

  public utils.RefArg getId_()
  { 
    return id_;
  }

  private utils.RefArg ucontent_ = null;

  public void setUcontent_(utils.RefArg ucontent_)
  { 
    this.ucontent_ = ucontent_;
  }

  public utils.RefArg getUcontent_()
  { 
    return ucontent_;
  }

  private utils.RefArg utitle_ = null;

  public void setUtitle_(utils.RefArg utitle_)
  { 
    this.utitle_ = utitle_;
  }

  public utils.RefArg getUtitle_()
  { 
    return utitle_;
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

  private Integer indx_ = 0;

  public void setIndx_(Integer indx_)
  { 
    this.indx_ = indx_;
  }

  public Integer getIndx_()
  { 
    return indx_;
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
    if(webdsl.generated.functions.genpagepredicate_page_admin_index0Admin_Int_.genpagepredicate_page_admin_index0Admin_Int_(admin_, indx_))
    { 
      if(webdsl.generated.functions.genactionpredicate_page_admin_index__0Admin_Int_.genactionpredicate_page_admin_index__0Admin_Int_(admin_, indx_))
      { 
        try
        { 
          handleTemplateCall(phase, inForLoop, forelementcounter, "tcall6", "wrapsubmitString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"page_admin_indexAdmin_Int_clearContent2" + webdsl.generated.functions.getPage_.getPage_().getTemplateContext().getTemplateContextString()}, "wrapsubmitString"), new Environment(env).putWithcall("s", new utils.TemplateCall("page_admin_indexAdmin_Int_s_ad1String_MyArticle_Int_WikiText_WikiText_Text_MyArticle_Int_A34String_Admin_Int_MyArticle_Text_WikiText_WikiText_Int_MyArticle_String", getElementsContext(), new Object[]{admin_, indx_, u_, x_, utitle_, ucontent_, id_, art_, page_admin_indexAdmin_Int_clearContent10_}, attrs)), "wrapsubmitString", TemplateCall.EmptyAttrs);
        }
        catch(RuntimeException ex)
        { 
          printTemplateCallException(ex, "wrapsubmitString(\"page_admin_indexAdmin_Int_clearContent2\" +\ngetPage().getTemplateContext().getTemplateContextString()) at unknown context");
        }
      }
    }
  }
}