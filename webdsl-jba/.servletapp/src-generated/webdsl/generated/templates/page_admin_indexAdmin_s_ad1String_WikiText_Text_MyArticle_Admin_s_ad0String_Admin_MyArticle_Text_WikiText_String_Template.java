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

public @SuppressWarnings("all") class page_admin_indexAdmin_s_ad1String_WikiText_Text_MyArticle_Admin_s_ad0String_Admin_MyArticle_Text_WikiText_String_Template extends TemplateServlet 
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
    staticEnv.putTemplate(keyOverwrite == null ? "page_admin_indexAdmin_s_ad1String_WikiText_Text_MyArticle_Admin_s_ad0String_Admin_MyArticle_Text_WikiText_String" : keyOverwrite, page_admin_indexAdmin_s_ad1String_WikiText_Text_MyArticle_Admin_s_ad0String_Admin_MyArticle_Text_WikiText_String_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    page_admin_indexAdmin_clearContent23_ = (String)args[0];
    admin_ = (webdsl.generated.domain.Admin)args[1];
    u_ = (utils.RefArg)args[2];
    x_ = (utils.RefArg)args[3];
    y_ = (utils.RefArg)args[4];
    page_admin_indexAdmin_clearContent10_ = (String)args[5];
  }

  public String getUniqueName()
  { 
    return "page_admin_indexAdmin_s_ad1String_WikiText_Text_MyArticle_Admin_s_ad0String_Admin_MyArticle_Text_WikiText_String";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + ((admin_ != null ? admin_.getVersion() == 0 ? "_" : admin_.getId().toString() : "null") + ("ref" + ("ref" + "ref")));
  }

  public String getTemplateSignature()
  { 
    return "template page_admin_indexAdmin_s_ad1String_WikiText_Text_MyArticle_Admin_s_ad0(page_admin_indexAdmin_clearContent23 : String, admin : Admin, u : Ref<MyArticle>, x : Ref<Text>, y : Ref<WikiText>, page_admin_indexAdmin_clearContent10 : String)";
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

  private String page_admin_indexAdmin_clearContent23_ = "";

  public void setPage_admin_indexAdmin_clearContent23_(String page_admin_indexAdmin_clearContent23_)
  { 
    this.page_admin_indexAdmin_clearContent23_ = page_admin_indexAdmin_clearContent23_;
  }

  public String getPage_admin_indexAdmin_clearContent23_()
  { 
    return page_admin_indexAdmin_clearContent23_;
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

  private utils.RefArg y_ = null;

  public void setY_(utils.RefArg y_)
  { 
    this.y_ = y_;
  }

  public utils.RefArg getY_()
  { 
    return y_;
  }

  private String page_admin_indexAdmin_clearContent10_ = "";

  public void setPage_admin_indexAdmin_clearContent10_(String page_admin_indexAdmin_clearContent10_)
  { 
    this.page_admin_indexAdmin_clearContent10_ = page_admin_indexAdmin_clearContent10_;
  }

  public String getPage_admin_indexAdmin_clearContent10_()
  { 
    return page_admin_indexAdmin_clearContent10_;
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
        ident = page_admin_indexAdmin_clearContent23_;
        if(threadLocalPageCached.getParammap().get(ident) != null)
        { 
          threadLocalPageCached.actionToBeExecutedHasDisabledValidation = page_admin_indexAdmin_clearContent0.isValidationDisabled();
        }
        break;

      case ACTION_PHASE:
        ident = page_admin_indexAdmin_clearContent23_;
        if(threadLocalPageCached.getParammap().get(ident) != null)
        { 
          if(isAjaxSubmitRequired(false))
          { 
            threadLocalPageCached.enableAjaxActionExecuted();
          }
          new page_admin_indexAdmin_clearContent0().run(threadLocalPageCached, getEnv(), getElementsContext(), admin_, ident);
        }
        break;

      case RENDER_PHASE:
        if(isAjaxSubmitRequired(false))
        { 
          out.print("<button onclick='javascript:serverInvoke(\"" + threadLocalPageCached.getAbsoluteLocation() + "/" + threadLocalPageCached.getActionTarget() + threadLocalPageCached.getExtraQueryAruments("?") + "\",\"" + page_admin_indexAdmin_clearContent23_ + "\", [" + threadLocalPageCached.getHiddenPostParamsJson() + "],\"" + threadLocalPageCached.getFormIdent() + "\", this, true); return false;'");
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
            utils.TemplateCall.appendWithPadding(classattrs, "btn btn-sm btn-danger btn-block");
            utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
          }
          out.print(">");
          if(RENDER_PHASE == phase)
          { 
            try
            { 
              utils.RenderUtils.printPageString("Cancel", out, threadLocalPageCached.isRawoutput());
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
          out.print("<button name=\"" + page_admin_indexAdmin_clearContent23_ + "\"");
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
            utils.TemplateCall.appendWithPadding(classattrs, "btn btn-sm btn-danger btn-block");
            utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
          }
          out.print(">");
          if(RENDER_PHASE == phase)
          { 
            try
            { 
              utils.RenderUtils.printPageString("Cancel", out, threadLocalPageCached.isRawoutput());
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