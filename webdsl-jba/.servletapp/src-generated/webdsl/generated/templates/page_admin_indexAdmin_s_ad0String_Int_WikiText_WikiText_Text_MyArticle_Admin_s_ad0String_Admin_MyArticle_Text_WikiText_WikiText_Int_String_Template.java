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

public @SuppressWarnings("all") class page_admin_indexAdmin_s_ad0String_Int_WikiText_WikiText_Text_MyArticle_Admin_s_ad0String_Admin_MyArticle_Text_WikiText_WikiText_Int_String_Template extends TemplateServlet 
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
    staticEnv.putTemplate(keyOverwrite == null ? "page_admin_indexAdmin_s_ad0String_Int_WikiText_WikiText_Text_MyArticle_Admin_s_ad0String_Admin_MyArticle_Text_WikiText_WikiText_Int_String" : keyOverwrite, page_admin_indexAdmin_s_ad0String_Int_WikiText_WikiText_Text_MyArticle_Admin_s_ad0String_Admin_MyArticle_Text_WikiText_WikiText_Int_String_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    page_admin_indexAdmin_saveContent23_ = (String)args[0];
    admin_ = (webdsl.generated.domain.Admin)args[1];
    u_ = (utils.RefArg)args[2];
    x_ = (utils.RefArg)args[3];
    utitle_ = (utils.RefArg)args[4];
    ucontent_ = (utils.RefArg)args[5];
    id_ = (utils.RefArg)args[6];
    page_admin_indexAdmin_saveContent10_ = (String)args[7];
  }

  public String getUniqueName()
  { 
    return "page_admin_indexAdmin_s_ad0String_Int_WikiText_WikiText_Text_MyArticle_Admin_s_ad0String_Admin_MyArticle_Text_WikiText_WikiText_Int_String";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + ((admin_ != null ? admin_.getVersion() == 0 ? "_" : admin_.getId().toString() : "null") + ("ref" + ("ref" + ("ref" + ("ref" + "ref")))));
  }

  public String getTemplateSignature()
  { 
    return "template page_admin_indexAdmin_s_ad0String_Int_WikiText_WikiText_Text_MyArticle_Admin_s_ad0(page_admin_indexAdmin_saveContent23 : String, admin : Admin, u : Ref<MyArticle>, x : Ref<Text>, utitle : Ref<WikiText>, ucontent : Ref<WikiText>, id : Ref<Int>, page_admin_indexAdmin_saveContent10 : String)";
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

  private String page_admin_indexAdmin_saveContent23_ = "";

  public void setPage_admin_indexAdmin_saveContent23_(String page_admin_indexAdmin_saveContent23_)
  { 
    this.page_admin_indexAdmin_saveContent23_ = page_admin_indexAdmin_saveContent23_;
  }

  public String getPage_admin_indexAdmin_saveContent23_()
  { 
    return page_admin_indexAdmin_saveContent23_;
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

  private utils.RefArg u_ = null;

  public void setU_(utils.RefArg u_)
  { 
    this.u_ = u_;
  }

  public utils.RefArg getU_()
  { 
    return u_;
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

  private utils.RefArg utitle_ = null;

  public void setUtitle_(utils.RefArg utitle_)
  { 
    this.utitle_ = utitle_;
  }

  public utils.RefArg getUtitle_()
  { 
    return utitle_;
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

  private utils.RefArg id_ = null;

  public void setId_(utils.RefArg id_)
  { 
    this.id_ = id_;
  }

  public utils.RefArg getId_()
  { 
    return id_;
  }

  private String page_admin_indexAdmin_saveContent10_ = "";

  public void setPage_admin_indexAdmin_saveContent10_(String page_admin_indexAdmin_saveContent10_)
  { 
    this.page_admin_indexAdmin_saveContent10_ = page_admin_indexAdmin_saveContent10_;
  }

  public String getPage_admin_indexAdmin_saveContent10_()
  { 
    return page_admin_indexAdmin_saveContent10_;
  }

  protected void handlePhase(int phase)
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    PrintWriter out = ThreadLocalOut.peek();
    switch(phase)
    { 
      case DATABIND_PHASE:
        ident = page_admin_indexAdmin_saveContent23_;
        if(threadLocalPageCached.getParammap().get(ident) != null)
        { 
          threadLocalPageCached.actionToBeExecutedHasDisabledValidation = page_admin_indexAdmin_saveContent0.isValidationDisabled();
        }
        break;

      case ACTION_PHASE:
        ident = page_admin_indexAdmin_saveContent23_;
        if(threadLocalPageCached.getParammap().get(ident) != null)
        { 
          if(isAjaxSubmitRequired(false))
          { 
            threadLocalPageCached.enableAjaxActionExecuted();
          }
          new page_admin_indexAdmin_saveContent0().run(threadLocalPageCached, getEnv(), getElementsContext(), (String)ucontent_.get(), (String)utitle_.get(), admin_, ident);
        }
        break;

      case RENDER_PHASE:
        if(isAjaxSubmitRequired(false))
        { 
          out.print("<button onclick='javascript:serverInvoke(\"" + threadLocalPageCached.getAbsoluteLocation() + "/" + threadLocalPageCached.getActionTarget() + threadLocalPageCached.getExtraQueryAruments("?") + "\",\"" + page_admin_indexAdmin_saveContent23_ + "\", [" + threadLocalPageCached.getHiddenPostParamsJson() + "],\"" + threadLocalPageCached.getFormIdent() + "\", this, true); return false;'");
          { 
            StringBuilder classattrs = new StringBuilder();
            StringBuilder styleattrs = new StringBuilder();
            java.util.List<String> ignore = new java.util.ArrayList<String>();
            utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
            for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
            { 
              AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
            }
            AttributeCollectionLookup.getAttributeCollection("submit", classattrs, styleattrs, ignore, out);
            utils.TemplateCall.appendWithPadding(classattrs, "btn btn-sm btn-primary btn-block");
            utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
          }
          out.print(">");
          if(RENDER_PHASE == phase)
          { 
            try
            { 
              utils.RenderUtils.printPageString("Save", out, threadLocalPageCached.isRawoutput());
            }
            catch(NullPointerException npe)
            { 
              utils.Warning.warn("null reference prevented rendering of template element");
            }
            catch(IndexOutOfBoundsException ine)
            { 
              utils.Warning.warn("index out of bounds prevented rendering of template element");
            }
          }
          out.print("</button>");
        }
        else
        { 
          out.print("<button name=\"" + page_admin_indexAdmin_saveContent23_ + "\"");
          { 
            StringBuilder classattrs = new StringBuilder();
            StringBuilder styleattrs = new StringBuilder();
            java.util.List<String> ignore = new java.util.ArrayList<String>();
            utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
            for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
            { 
              AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
            }
            AttributeCollectionLookup.getAttributeCollection("submit", classattrs, styleattrs, ignore, out);
            utils.TemplateCall.appendWithPadding(classattrs, "btn btn-sm btn-primary btn-block");
            utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
          }
          out.print(">");
          if(RENDER_PHASE == phase)
          { 
            try
            { 
              utils.RenderUtils.printPageString("Save", out, threadLocalPageCached.isRawoutput());
            }
            catch(NullPointerException npe)
            { 
              utils.Warning.warn("null reference prevented rendering of template element");
            }
            catch(IndexOutOfBoundsException ine)
            { 
              utils.Warning.warn("index out of bounds prevented rendering of template element");
            }
          }
          out.print("</button>");
        }
        break;
    }
  }
}