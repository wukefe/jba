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

public @SuppressWarnings("all") class page_left_barAdmin_Int_s_ad0String_MyArticle_Int_Admin_Template extends TemplateServlet 
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
      if(i == 4)
      { 
        java.util.ArrayList<webdsl.generated.domain.Admin> elems6 = new java.util.ArrayList<webdsl.generated.domain.Admin>();
        for(org.webdsl.WebDSLEntity ent : elems)
        { 
          if(ent.instanceOf("Admin"))
          { 
            elems6.add((webdsl.generated.domain.Admin)ent);
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
    staticEnv.putTemplate(keyOverwrite == null ? "page_left_barAdmin_Int_s_ad0String_MyArticle_Int_Admin" : keyOverwrite, page_left_barAdmin_Int_s_ad0String_MyArticle_Int_Admin_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    page_left_barAdmin_Int_signout10_ = (String)args[0];
    temp_ = (utils.RefArg)args[1];
    len_ = (Integer)args[2];
    admin_ = (webdsl.generated.domain.Admin)args[3];
  }

  public String getUniqueName()
  { 
    return "page_left_barAdmin_Int_s_ad0String_MyArticle_Int_Admin";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + ("ref" + (admin_ != null ? admin_.getVersion() == 0 ? "_" : admin_.getId().toString() : "null"));
  }

  public String getTemplateSignature()
  { 
    return "template page_left_barAdmin_Int_s_ad0(page_left_barAdmin_Int_signout10 : String, temp : Ref<MyArticle>, len : Int, admin : Admin)";
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

  private String page_left_barAdmin_Int_signout10_ = "";

  public void setPage_left_barAdmin_Int_signout10_(String page_left_barAdmin_Int_signout10_)
  { 
    this.page_left_barAdmin_Int_signout10_ = page_left_barAdmin_Int_signout10_;
  }

  public String getPage_left_barAdmin_Int_signout10_()
  { 
    return page_left_barAdmin_Int_signout10_;
  }

  private utils.RefArg temp_ = null;

  public void setTemp_(utils.RefArg temp_)
  { 
    this.temp_ = temp_;
  }

  public utils.RefArg getTemp_()
  { 
    return temp_;
  }

  private Integer len_ = 0;

  public void setLen_(Integer len_)
  { 
    this.len_ = len_;
  }

  public Integer getLen_()
  { 
    return len_;
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
    switch(phase)
    { 
      case DATABIND_PHASE:
        ident = page_left_barAdmin_Int_signout10_;
        if(threadLocalPageCached.getParammap().get(ident) != null)
        { 
          threadLocalPageCached.actionToBeExecutedHasDisabledValidation = page_left_barAdmin_Int_signout0.isValidationDisabled();
        }
        break;

      case ACTION_PHASE:
        ident = page_left_barAdmin_Int_signout10_;
        if(threadLocalPageCached.getParammap().get(ident) != null)
        { 
          if(isAjaxSubmitRequired(false))
          { 
            threadLocalPageCached.enableAjaxActionExecuted();
          }
          new page_left_barAdmin_Int_signout0().run(threadLocalPageCached, getEnv(), getElementsContext(), ident);
        }
        break;

      case RENDER_PHASE:
        out.print("<button style=\"position: absolute; left: -9999px; width: 1px; height: 1px;\" ");
        if(isAjaxSubmitRequired(false))
        { 
          out.print("onclick='javascript:serverInvoke(\"" + threadLocalPageCached.getAbsoluteLocation() + "/" + threadLocalPageCached.getActionTarget() + threadLocalPageCached.getExtraQueryAruments("?") + "\",\"" + page_left_barAdmin_Int_signout10_ + "\", [" + threadLocalPageCached.getHiddenPostParamsJson() + "],\"" + threadLocalPageCached.getFormIdent() + "\", this, true); return false;'></button>");
          out.print("<a href=\"javascript:void(0)\" onclick=\"javascript:this.previousSibling.click()\"");
          { 
            StringBuilder classattrs = new StringBuilder();
            StringBuilder styleattrs = new StringBuilder();
            java.util.List<String> ignore = new java.util.ArrayList<String>();
            utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
            for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
            { 
              AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
            }
            AttributeCollectionLookup.getAttributeCollection("submitlink", classattrs, styleattrs, ignore, out);
            utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
          }
          out.print(">");
          if(RENDER_PHASE == phase)
          { 
            try
            { 
              utils.RenderUtils.printPageString("Log Out", out, threadLocalPageCached.isRawoutput());
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
          out.print("</a>");
        }
        else
        { 
          out.print("onclick='javascript:serverInvoke(\"" + utils.HTMLFilter.filter(threadLocalPageCached.getPageUrlWithParams()) + "?__action__link__=1" + threadLocalPageCached.getExtraQueryAruments("&") + "\",\"" + page_left_barAdmin_Int_signout10_ + "\", [" + threadLocalPageCached.getHiddenPostParamsJson() + "],\"" + threadLocalPageCached.getFormIdent() + "\", this, true); return false;'></button>");
          out.print("<a href=\"javascript:void(0)\" onclick=\"javascript:this.previousSibling.click()\"");
          { 
            StringBuilder classattrs = new StringBuilder();
            StringBuilder styleattrs = new StringBuilder();
            java.util.List<String> ignore = new java.util.ArrayList<String>();
            utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
            for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
            { 
              AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
            }
            AttributeCollectionLookup.getAttributeCollection("submitlink", classattrs, styleattrs, ignore, out);
            utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
          }
          out.print(">");
          if(RENDER_PHASE == phase)
          { 
            try
            { 
              utils.RenderUtils.printPageString("Log Out", out, threadLocalPageCached.isRawoutput());
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
          out.print("</a>");
        }
        break;
    }
  }
}