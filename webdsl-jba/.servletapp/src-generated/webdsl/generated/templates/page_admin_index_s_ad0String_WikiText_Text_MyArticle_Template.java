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

public @SuppressWarnings("all") class page_admin_index_s_ad0String_WikiText_Text_MyArticle_Template extends TemplateServlet 
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
    staticEnv.putTemplate(keyOverwrite == null ? "page_admin_index_s_ad0String_WikiText_Text_MyArticle" : keyOverwrite, page_admin_index_s_ad0String_WikiText_Text_MyArticle_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    page_admin_index_saveContent10_ = (String)args[0];
    y_ = (utils.RefArg)args[1];
    x_ = (utils.RefArg)args[2];
    u_ = (utils.RefArg)args[3];
  }

  public String getUniqueName()
  { 
    return "page_admin_index_s_ad0String_WikiText_Text_MyArticle";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + ("ref" + ("ref" + "ref"));
  }

  public String getTemplateSignature()
  { 
    return "template page_admin_index_s_ad0(page_admin_index_saveContent10 : String, y : Ref<WikiText>, x : Ref<Text>, u : Ref<MyArticle>)";
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

  private String page_admin_index_saveContent10_ = "";

  public void setPage_admin_index_saveContent10_(String page_admin_index_saveContent10_)
  { 
    this.page_admin_index_saveContent10_ = page_admin_index_saveContent10_;
  }

  public String getPage_admin_index_saveContent10_()
  { 
    return page_admin_index_saveContent10_;
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
        ident = page_admin_index_saveContent10_;
        if(threadLocalPageCached.getParammap().get(ident) != null)
        { 
          threadLocalPageCached.actionToBeExecutedHasDisabledValidation = page_admin_index_saveContent0.isValidationDisabled();
        }
        break;

      case ACTION_PHASE:
        ident = page_admin_index_saveContent10_;
        if(threadLocalPageCached.getParammap().get(ident) != null)
        { 
          if(isAjaxSubmitRequired(false))
          { 
            threadLocalPageCached.enableAjaxActionExecuted();
          }
          new page_admin_index_saveContent0().run(threadLocalPageCached, getEnv(), getElementsContext(), (String)y_.get(), ident);
        }
        break;

      case RENDER_PHASE:
        if(isAjaxSubmitRequired(false))
        { 
          out.print("<button onclick='javascript:serverInvoke(\"" + threadLocalPageCached.getAbsoluteLocation() + "/" + threadLocalPageCached.getActionTarget() + threadLocalPageCached.getExtraQueryAruments("?") + "\",\"" + page_admin_index_saveContent10_ + "\", [" + threadLocalPageCached.getHiddenPostParamsJson() + "],\"" + threadLocalPageCached.getFormIdent() + "\", this, true); return false;'");
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
          out.print("<button name=\"" + page_admin_index_saveContent10_ + "\"");
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