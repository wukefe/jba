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

public @SuppressWarnings("all") class logout_s_ad0String_Template extends TemplateServlet 
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
    staticEnv.putTemplate(keyOverwrite == null ? "logout_s_ad0String" : keyOverwrite, logout_s_ad0String_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    logout_signoffAction10_ = (String)args[0];
  }

  public String getUniqueName()
  { 
    return "logout_s_ad0String";
  }

  public String getStateEncodingOfArgument()
  { 
    return "";
  }

  public String getTemplateSignature()
  { 
    return "template logout_s_ad0(logout_signoffAction10 : String)";
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

  private String logout_signoffAction10_ = "";

  public void setLogout_signoffAction10_(String logout_signoffAction10_)
  { 
    this.logout_signoffAction10_ = logout_signoffAction10_;
  }

  public String getLogout_signoffAction10_()
  { 
    return logout_signoffAction10_;
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
        ident = logout_signoffAction10_;
        if(threadLocalPageCached.getParammap().get(ident) != null)
        { 
          threadLocalPageCached.actionToBeExecutedHasDisabledValidation = logout_signoffAction0.isValidationDisabled();
        }
        break;

      case ACTION_PHASE:
        ident = logout_signoffAction10_;
        if(threadLocalPageCached.getParammap().get(ident) != null)
        { 
          if(isAjaxSubmitRequired(false))
          { 
            threadLocalPageCached.enableAjaxActionExecuted();
          }
          new logout_signoffAction0().run(threadLocalPageCached, getEnv(), getElementsContext(), ident);
        }
        break;

      case RENDER_PHASE:
        out.print("<button style=\"position: absolute; left: -9999px; width: 1px; height: 1px;\" ");
        if(isAjaxSubmitRequired(false))
        { 
          out.print("onclick='javascript:serverInvoke(\"" + threadLocalPageCached.getAbsoluteLocation() + "/" + threadLocalPageCached.getActionTarget() + threadLocalPageCached.getExtraQueryAruments("?") + "\",\"" + logout_signoffAction10_ + "\", [" + threadLocalPageCached.getHiddenPostParamsJson() + "],\"" + threadLocalPageCached.getFormIdent() + "\", this, true); return false;'></button>");
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
              utils.RenderUtils.printPageString("Logout", out, threadLocalPageCached.isRawoutput());
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
          out.print("onclick='javascript:serverInvoke(\"" + utils.HTMLFilter.filter(threadLocalPageCached.getPageUrlWithParams()) + "?__action__link__=1" + threadLocalPageCached.getExtraQueryAruments("&") + "\",\"" + logout_signoffAction10_ + "\", [" + threadLocalPageCached.getHiddenPostParamsJson() + "],\"" + threadLocalPageCached.getFormIdent() + "\", this, true); return false;'></button>");
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
              utils.RenderUtils.printPageString("Logout", out, threadLocalPageCached.isRawoutput());
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