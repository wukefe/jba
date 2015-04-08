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

public @SuppressWarnings("all") class page_admin_indexAdmin_MyArticle_Int_s_ad0String_Int_WikiText_WikiText_Text_MyArticle_Int_MyArticle_Admin_Template extends TemplateServlet 
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
      if(i == 8)
      { 
        java.util.ArrayList<webdsl.generated.domain.MyArticle> elems6 = new java.util.ArrayList<webdsl.generated.domain.MyArticle>();
        for(org.webdsl.WebDSLEntity ent : elems)
        { 
          if(ent.instanceOf("MyArticle"))
          { 
            elems6.add((webdsl.generated.domain.MyArticle)ent);
          }
        }
      }
      if(i == 9)
      { 
        java.util.ArrayList<webdsl.generated.domain.Admin> elems7 = new java.util.ArrayList<webdsl.generated.domain.Admin>();
        for(org.webdsl.WebDSLEntity ent : elems)
        { 
          if(ent.instanceOf("Admin"))
          { 
            elems7.add((webdsl.generated.domain.Admin)ent);
          }
        }
      }
    }
  }

  public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    page_admin_indexAdmin_MyArticle_Int_s_ad0String_Int_WikiText_WikiText_Text_MyArticle_Int_M34String_Admin_MyArticle_Int_MyArticle_Text_WikiText_WikiText_Int_String_Template.loadTemplateMap(staticEnv);
  }

  public static void loadRefArgClasses(Map<String, Class<?>> refargclasses)
  { 
    page_admin_indexAdmin_MyArticle_Int_s_ad0String_Int_WikiText_WikiText_Text_MyArticle_Int_M34String_Admin_MyArticle_Int_MyArticle_Text_WikiText_WikiText_Int_String_Template.loadRefArgClasses(refargclasses);
  }

  public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    loadTemplateMap(null, staticEnv);
    return staticEnv;
  }

  public static Environment loadTemplateMap(String keyOverwrite, org.webdsl.lang.Environment staticEnv)
  { 
    staticEnv.putTemplate(keyOverwrite == null ? "page_admin_indexAdmin_MyArticle_Int_s_ad0String_Int_WikiText_WikiText_Text_MyArticle_Int_MyArticle_Admin" : keyOverwrite, page_admin_indexAdmin_MyArticle_Int_s_ad0String_Int_WikiText_WikiText_Text_MyArticle_Int_MyArticle_Admin_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    page_admin_indexAdmin_MyArticle_Int_saveContent10_ = (String)args[0];
    id_ = (utils.RefArg)args[1];
    ucontent_ = (utils.RefArg)args[2];
    utitle_ = (utils.RefArg)args[3];
    x_ = (utils.RefArg)args[4];
    u_ = (utils.RefArg)args[5];
    op_ = (Integer)args[6];
    art_ = (webdsl.generated.domain.MyArticle)args[7];
    admin_ = (webdsl.generated.domain.Admin)args[8];
  }

  public String getUniqueName()
  { 
    return "page_admin_indexAdmin_MyArticle_Int_s_ad0String_Int_WikiText_WikiText_Text_MyArticle_Int_MyArticle_Admin";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + ("ref" + ("ref" + ("ref" + ("ref" + ("ref" + ((art_ != null ? art_.getVersion() == 0 ? "_" : art_.getId().toString() : "null") + (admin_ != null ? admin_.getVersion() == 0 ? "_" : admin_.getId().toString() : "null")))))));
  }

  public String getTemplateSignature()
  { 
    return "template page_admin_indexAdmin_MyArticle_Int_s_ad0(page_admin_indexAdmin_MyArticle_Int_saveContent10 : String, id : Ref<Int>, ucontent : Ref<WikiText>, utitle : Ref<WikiText>, x : Ref<Text>, u : Ref<MyArticle>, op : Int, art : MyArticle, admin : Admin)";
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

  private String page_admin_indexAdmin_MyArticle_Int_saveContent10_ = "";

  public void setPage_admin_indexAdmin_MyArticle_Int_saveContent10_(String page_admin_indexAdmin_MyArticle_Int_saveContent10_)
  { 
    this.page_admin_indexAdmin_MyArticle_Int_saveContent10_ = page_admin_indexAdmin_MyArticle_Int_saveContent10_;
  }

  public String getPage_admin_indexAdmin_MyArticle_Int_saveContent10_()
  { 
    return page_admin_indexAdmin_MyArticle_Int_saveContent10_;
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

  private Integer op_ = 0;

  public void setOp_(Integer op_)
  { 
    this.op_ = op_;
  }

  public Integer getOp_()
  { 
    return op_;
  }

  private webdsl.generated.domain.MyArticle art_ = null;

  public void setArt_(webdsl.generated.domain.MyArticle art_)
  { 
    this.art_ = art_;
  }

  public webdsl.generated.domain.MyArticle getArt_()
  { 
    return art_;
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
    if(webdsl.generated.functions.genpagepredicate_page_admin_index0Admin_MyArticle_Int_.genpagepredicate_page_admin_index0Admin_MyArticle_Int_(admin_, art_, op_))
    { 
      if(webdsl.generated.functions.genactionpredicate_page_admin_index__0Admin_MyArticle_Int_.genactionpredicate_page_admin_index__0Admin_MyArticle_Int_(admin_, art_, op_))
      { 
        try
        { 
          handleTemplateCall(phase, inForLoop, forelementcounter, "tcall3", "wrapsubmitString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"page_admin_indexAdmin_MyArticle_Int_saveContent2" + webdsl.generated.functions.getPage_.getPage_().getTemplateContext().getTemplateContextString()}, "wrapsubmitString"), new Environment(env).putWithcall("s", new utils.TemplateCall("page_admin_indexAdmin_MyArticle_Int_s_ad0String_Int_WikiText_WikiText_Text_MyArticle_Int_M34String_Admin_MyArticle_Int_MyArticle_Text_WikiText_WikiText_Int_String", getElementsContext(), new Object[]{admin_, art_, op_, u_, x_, utitle_, ucontent_, id_, page_admin_indexAdmin_MyArticle_Int_saveContent10_}, attrs)), "wrapsubmitString", TemplateCall.EmptyAttrs);
        }
        catch(RuntimeException ex)
        { 
          printTemplateCallException(ex, "wrapsubmitString(\"page_admin_indexAdmin_MyArticle_Int_saveContent2\" +\ngetPage().getTemplateContext().getTemplateContextString()) at unknown context");
        }
      }
    }
  }
}