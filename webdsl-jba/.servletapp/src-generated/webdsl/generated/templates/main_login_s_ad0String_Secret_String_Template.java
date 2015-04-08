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

public @SuppressWarnings("all") class main_login_s_ad0String_Secret_String_Template extends TemplateServlet 
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
    staticEnv.putTemplate(keyOverwrite == null ? "main_login_s_ad0String_Secret_String" : keyOverwrite, main_login_s_ad0String_Secret_String_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    main_login_ia00_ = (String)args[0];
    pass_ = (utils.RefArg)args[1];
    name_ = (utils.RefArg)args[2];
  }

  public String getUniqueName()
  { 
    return "main_login_s_ad0String_Secret_String";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + ("ref" + "ref");
  }

  public String getTemplateSignature()
  { 
    return "template main_login_s_ad0(main_login_ia00 : String, pass : Ref<Secret>, name : Ref<String>)";
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

  private String main_login_ia00_ = "";

  public void setMain_login_ia00_(String main_login_ia00_)
  { 
    this.main_login_ia00_ = main_login_ia00_;
  }

  public String getMain_login_ia00_()
  { 
    return main_login_ia00_;
  }

  private utils.RefArg pass_ = null;

  public void setPass_(utils.RefArg pass_)
  { 
    this.pass_ = pass_;
  }

  public utils.RefArg getPass_()
  { 
    return pass_;
  }

  private utils.RefArg name_ = null;

  public void setName_(utils.RefArg name_)
  { 
    this.name_ = name_;
  }

  public utils.RefArg getName_()
  { 
    return name_;
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
        ident = main_login_ia00_;
        if(threadLocalPageCached.getParammap().get(ident) != null)
        { 
          threadLocalPageCached.actionToBeExecutedHasDisabledValidation = main_login_ia0.isValidationDisabled();
        }
        break;

      case ACTION_PHASE:
        ident = main_login_ia00_;
        if(threadLocalPageCached.getParammap().get(ident) != null)
        { 
          if(isAjaxSubmitRequired(false))
          { 
            threadLocalPageCached.enableAjaxActionExecuted();
          }
          new main_login_ia0().run(threadLocalPageCached, getEnv(), getElementsContext(), (String)pass_.get(), (String)name_.get(), ident);
        }
        break;

      case RENDER_PHASE:
        out.print("<button style=\"position: absolute; left: -9999px; width: 1px; height: 1px;\" ");
        if(isAjaxSubmitRequired(false))
        { 
          out.print("onclick='javascript:serverInvoke(\"" + threadLocalPageCached.getAbsoluteLocation() + "/" + threadLocalPageCached.getActionTarget() + threadLocalPageCached.getExtraQueryAruments("?") + "\",\"" + main_login_ia00_ + "\", [" + threadLocalPageCached.getHiddenPostParamsJson() + "],\"" + threadLocalPageCached.getFormIdent() + "\", this, true); return false;'></button>");
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
              utils.RenderUtils.printPageString("Login file", out, threadLocalPageCached.isRawoutput());
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
          out.print("onclick='javascript:serverInvoke(\"" + utils.HTMLFilter.filter(threadLocalPageCached.getPageUrlWithParams()) + "?__action__link__=1" + threadLocalPageCached.getExtraQueryAruments("&") + "\",\"" + main_login_ia00_ + "\", [" + threadLocalPageCached.getHiddenPostParamsJson() + "],\"" + threadLocalPageCached.getFormIdent() + "\", this, true); return false;'></button>");
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
              utils.RenderUtils.printPageString("Login file", out, threadLocalPageCached.isRawoutput());
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