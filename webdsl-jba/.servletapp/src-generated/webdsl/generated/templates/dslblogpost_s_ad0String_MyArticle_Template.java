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

public @SuppressWarnings("all") class dslblogpost_s_ad0String_MyArticle_Template extends TemplateServlet 
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
        java.util.ArrayList<webdsl.generated.domain.MyArticle> elems2 = new java.util.ArrayList<webdsl.generated.domain.MyArticle>();
        for(org.webdsl.WebDSLEntity ent : elems)
        { 
          if(ent.instanceOf("MyArticle"))
          { 
            elems2.add((webdsl.generated.domain.MyArticle)ent);
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
    staticEnv.putTemplate(keyOverwrite == null ? "dslblogpost_s_ad0String_MyArticle" : keyOverwrite, dslblogpost_s_ad0String_MyArticle_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    dslblogpost_ia00_ = (String)args[0];
    u_ = (webdsl.generated.domain.MyArticle)args[1];
  }

  public String getUniqueName()
  { 
    return "dslblogpost_s_ad0String_MyArticle";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + (u_ != null ? u_.getVersion() == 0 ? "_" : u_.getId().toString() : "null");
  }

  public String getTemplateSignature()
  { 
    return "template dslblogpost_s_ad0(dslblogpost_ia00 : String, u : MyArticle)";
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

  private String dslblogpost_ia00_ = "";

  public void setDslblogpost_ia00_(String dslblogpost_ia00_)
  { 
    this.dslblogpost_ia00_ = dslblogpost_ia00_;
  }

  public String getDslblogpost_ia00_()
  { 
    return dslblogpost_ia00_;
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
    switch(phase)
    { 
      case DATABIND_PHASE:
        ident = dslblogpost_ia00_;
        if(threadLocalPageCached.getParammap().get(ident) != null)
        { 
          threadLocalPageCached.actionToBeExecutedHasDisabledValidation = dslblogpost_ia0.isValidationDisabled();
        }
        break;

      case ACTION_PHASE:
        ident = dslblogpost_ia00_;
        if(threadLocalPageCached.getParammap().get(ident) != null)
        { 
          if(isAjaxSubmitRequired(false))
          { 
            threadLocalPageCached.enableAjaxActionExecuted();
          }
          new dslblogpost_ia0().run(threadLocalPageCached, getEnv(), getElementsContext(), u_, ident);
        }
        break;

      case RENDER_PHASE:
        out.print("<button style=\"position: absolute; left: -9999px; width: 1px; height: 1px;\" ");
        if(isAjaxSubmitRequired(false))
        { 
          out.print("onclick='javascript:serverInvoke(\"" + threadLocalPageCached.getAbsoluteLocation() + "/" + threadLocalPageCached.getActionTarget() + threadLocalPageCached.getExtraQueryAruments("?") + "\",\"" + dslblogpost_ia00_ + "\", [" + threadLocalPageCached.getHiddenPostParamsJson() + "],\"" + threadLocalPageCached.getFormIdent() + "\", this, true); return false;'></button>");
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
            utils.TemplateCall.appendWithPadding(classattrs, "blog-post-title");
            out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("target", "_blank"));
            utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
          }
          out.print(">");
          try
          { 
            handleTemplateCall(phase, inForLoop, forelementcounter, "tcall0", "outputString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{u_.getTitle()}, "outputString"), new Environment(env).putWithcall("elements#outputString", new utils.TemplateCall("elementsempty", null, null, null)), "outputString", TemplateCall.EmptyAttrs);
          }
          catch(RuntimeException ex)
          { 
            printTemplateCallException(ex, "outputString(u.Title) at ../mywebdsl.app:51/94");
          }
          out.print("</a>");
        }
        else
        { 
          out.print("onclick='javascript:serverInvoke(\"" + utils.HTMLFilter.filter(threadLocalPageCached.getPageUrlWithParams()) + "?__action__link__=1" + threadLocalPageCached.getExtraQueryAruments("&") + "\",\"" + dslblogpost_ia00_ + "\", [" + threadLocalPageCached.getHiddenPostParamsJson() + "],\"" + threadLocalPageCached.getFormIdent() + "\", this, true); return false;'></button>");
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
            utils.TemplateCall.appendWithPadding(classattrs, "blog-post-title");
            out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("target", "_blank"));
            utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
          }
          out.print(">");
          try
          { 
            handleTemplateCall(phase, inForLoop, forelementcounter, "tcall0", "outputString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{u_.getTitle()}, "outputString"), new Environment(env).putWithcall("elements#outputString", new utils.TemplateCall("elementsempty", null, null, null)), "outputString", TemplateCall.EmptyAttrs);
          }
          catch(RuntimeException ex)
          { 
            printTemplateCallException(ex, "outputString(u.Title) at ../mywebdsl.app:51/94");
          }
          out.print("</a>");
        }
        break;
    }
  }
}