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

public @SuppressWarnings("all") class table_content_s_ad5String_MyArticle_Template extends TemplateServlet 
{ 
  public void prefetchFor(int i, java.util.Collection<? extends org.webdsl.WebDSLEntity> elems)
  { 
    if(utils.QueryOptimization.isOptimizationEnabled())
    { 
      if(i == 2)
      { 
        java.util.ArrayList<webdsl.generated.domain.MyArticle> elems1 = new java.util.ArrayList<webdsl.generated.domain.MyArticle>();
        for(org.webdsl.WebDSLEntity ent : elems)
        { 
          if(ent.instanceOf("MyArticle"))
          { 
            elems1.add((webdsl.generated.domain.MyArticle)ent);
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
    staticEnv.putTemplate(keyOverwrite == null ? "table_content_s_ad5String_MyArticle" : keyOverwrite, table_content_s_ad5String_MyArticle_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    table_content_ia50_ = (String)args[0];
    u_ = (webdsl.generated.domain.MyArticle)args[1];
  }

  public String getUniqueName()
  { 
    return "table_content_s_ad5String_MyArticle";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + (u_ != null ? u_.getVersion() == 0 ? "_" : u_.getId().toString() : "null");
  }

  public String getTemplateSignature()
  { 
    return "template table_content_s_ad5(table_content_ia50 : String, u : MyArticle)";
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

  private String table_content_ia50_ = "";

  public void setTable_content_ia50_(String table_content_ia50_)
  { 
    this.table_content_ia50_ = table_content_ia50_;
  }

  public String getTable_content_ia50_()
  { 
    return table_content_ia50_;
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
        ident = table_content_ia50_;
        if(threadLocalPageCached.getParammap().get(ident) != null)
        { 
          threadLocalPageCached.actionToBeExecutedHasDisabledValidation = table_content_ia5.isValidationDisabled();
        }
        break;

      case ACTION_PHASE:
        ident = table_content_ia50_;
        if(threadLocalPageCached.getParammap().get(ident) != null)
        { 
          if(isAjaxSubmitRequired(false))
          { 
            threadLocalPageCached.enableAjaxActionExecuted();
          }
          new table_content_ia5().run(threadLocalPageCached, getEnv(), getElementsContext(), ident);
        }
        break;

      case RENDER_PHASE:
        if(isAjaxSubmitRequired(false))
        { 
          out.print("<button onclick='javascript:serverInvoke(\"" + threadLocalPageCached.getAbsoluteLocation() + "/" + threadLocalPageCached.getActionTarget() + threadLocalPageCached.getExtraQueryAruments("?") + "\",\"" + table_content_ia50_ + "\", [" + threadLocalPageCached.getHiddenPostParamsJson() + "],\"" + threadLocalPageCached.getFormIdent() + "\", this, true); return false;'");
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
            utils.TemplateCall.appendWithPadding(classattrs, "btn btn-xs btn-primary");
            utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
          }
          out.print(">");
          if(RENDER_PHASE == phase)
          { 
            try
            { 
              utils.RenderUtils.printPageString("Edit", out, threadLocalPageCached.isRawoutput());
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
          out.print("<button name=\"" + table_content_ia50_ + "\"");
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
            utils.TemplateCall.appendWithPadding(classattrs, "btn btn-xs btn-primary");
            utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
          }
          out.print(">");
          if(RENDER_PHASE == phase)
          { 
            try
            { 
              utils.RenderUtils.printPageString("Edit", out, threadLocalPageCached.isRawoutput());
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