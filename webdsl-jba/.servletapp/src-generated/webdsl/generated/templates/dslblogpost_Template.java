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

public @SuppressWarnings("all") class dslblogpost_Template extends TemplateServlet 
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

  public void prefetchFor0(java.util.List<webdsl.generated.domain.MyArticle> list, boolean early)
  { 
    if(early)
    { }
    else
    { }
  }

  public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    dslblogpost_s_ad0String_MyArticle_Template.loadTemplateMap(staticEnv);
  }

  public static void loadRefArgClasses(Map<String, Class<?>> refargclasses)
  { 
    refargclasses.put("RefArg_outputDateTime_1_dslblogpostpc0", RefArg_outputDateTime_1_dslblogpostpc0.class);
    dslblogpost_s_ad0String_MyArticle_Template.loadRefArgClasses(refargclasses);
  }

  public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    loadTemplateMap(null, staticEnv);
    return staticEnv;
  }

  public static Environment loadTemplateMap(String keyOverwrite, org.webdsl.lang.Environment staticEnv)
  { 
    staticEnv.putTemplate(keyOverwrite == null ? "dslblogpost" : keyOverwrite, dslblogpost_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  public String getUniqueName()
  { 
    return "dslblogpost";
  }

  public String getStateEncodingOfArgument()
  { 
    return "";
  }

  public String getTemplateSignature()
  { 
    return "template dslblogpost()";
  }

  public String getElementsContext()
  { 
    if(calledName == null)
    { 
      return "dslblogpost";
    }
    else
    { 
      return calledName;
    }
  }

  protected void handlePhase(int phase)
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    PrintWriter out = ThreadLocalOut.peek();
    java.util.List<webdsl.generated.domain.MyArticle> list1 = utils.HibernateUtil.getCurrentSession().createCriteria(webdsl.generated.domain.MyArticle.class).list();
    prefetchFor0(list1, true);
    inForLoop = true;
    forLoopCounter++;
    java.util.Collections.sort(list1, new java.util.Comparator<webdsl.generated.domain.MyArticle>()
                                      { 
                                        public int compare(webdsl.generated.domain.MyArticle o1, webdsl.generated.domain.MyArticle o2)
                                        { 
                                          return o2.getCount().compareTo(o1.getCount());
                                        }
                                      });
    prefetchFor0(list1, false);
    int separatorindex0 = 0;
    Object[] array0 = list1.toArray();
    for(int i0 = 0; i0 < array0.length; i0++)
    { 
      webdsl.generated.domain.MyArticle u_ = (webdsl.generated.domain.MyArticle)array0[i0];
      fallbackcounter += 1;
      if(org.webdsl.WebDSLEntity.class.isInstance(u_))
      { 
        org.webdsl.WebDSLEntity temp0 = (org.webdsl.WebDSLEntity)(Object)u_;
        forelementcounter = temp0.getVersion() == 0 ? Integer.toString(fallbackcounter) : utils.UUIDUserType.persistUUIDString(temp0.getId());
      }
      else
        forelementcounter = Integer.toString(fallbackcounter);
      threadLocalPageCached.enterTemplateContext(forelementcounter);
      if(RENDER_PHASE == phase)
      { 
        out.print("<" + "div");
        { 
          StringBuilder classattrs = new StringBuilder();
          StringBuilder styleattrs = new StringBuilder();
          java.util.List<String> ignore = new java.util.ArrayList<String>();
          utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
          for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
          { 
            AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
          }
          utils.TemplateCall.appendWithPadding(classattrs, "blog-post");
          utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
        }
        out.print(">");
      }
      if(threadLocalPageCached.isInForm())
      { 
        org.webdsl.logging.Logger.error("Invalid nested <form> tag detected in DOM at URL: " + threadLocalPageCached.getRequest().getRequestURL() + "\n Enclosing form found in " + threadLocalPageCached.getEnclosingForm() + "\n Nested form found in " + getTemplateSignature());
      }
      threadLocalPageCached.enterForm(getTemplateSignature());
      ident = (inForLoop ? forelementcounter : "") + ("form0" + getUniqueId());
      threadLocalPageCached.setFormIdent(ident);
      if(threadLocalPageCached.getParammap().get(ident) != null)
      { 
        threadLocalPageCached.setInSubmittedForm(true);
      }
      java.io.StringWriter sw1 = null;
      java.io.StringWriter sw0 = null;
      if(RENDER_PHASE == phase)
      { 
        threadLocalPageCached.formRequiresMultipartEnc = false;
        if(threadLocalPageCached.inSubmittedForm() && threadLocalPageCached.isValidationFormRerender())
        { 
          sw1 = new java.io.StringWriter();
          out = new java.io.PrintWriter(sw1);
          ThreadLocalOut.push(out);
        }
        out.print("<form name=\"" + ident + "\" id=\"" + ident + "\" action=\"" + utils.HTMLFilter.filter(threadLocalPageCached.getPageUrlWithParams() + threadLocalPageCached.getExtraQueryAruments("?")) + "\" accept-charset=\"UTF-8\" method=\"POST\"");
        { 
          StringBuilder classattrs = new StringBuilder();
          StringBuilder styleattrs = new StringBuilder();
          java.util.List<String> ignore = new java.util.ArrayList<String>();
          utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
          for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
          { 
            AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
          }
          AttributeCollectionLookup.getAttributeCollection("form", classattrs, styleattrs, ignore, out);
          utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
        }
        sw0 = new java.io.StringWriter();
        out = new java.io.PrintWriter(sw0);
        ThreadLocalOut.push(out);
        out.print(">");
        out.print("<input type=\"hidden\" name=\"" + ident + "\" value=\"1\" />");
        out.print(threadLocalPageCached.getHiddenParams());
      }
      try
      { 
        handleTemplateCall(phase, inForLoop, forelementcounter, "tcall0", "wrapsubmitString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"dslblogpost_ia0_" + webdsl.generated.functions.getPage_.getPage_().getTemplateContext().getTemplateContextString()}, "wrapsubmitString"), new Environment(env).putWithcall("s", new utils.TemplateCall("dslblogpost_s_ad0String_MyArticle", getElementsContext(), new Object[]{u_}, attrs)), "wrapsubmitString", TemplateCall.EmptyAttrs);
      }
      catch(RuntimeException ex)
      { 
        printTemplateCallException(ex, "wrapsubmitString(\"dslblogpost_ia0\" + getPage().getTemplateContext().getTemplateContextString()) at unknown context");
      }
      if(RENDER_PHASE == phase)
      { 
        out.print("</form>");
        ThreadLocalOut.popChecked(out);
        out = ThreadLocalOut.peek();
        if(threadLocalPageCached.formRequiresMultipartEnc)
        { 
          out.write(" enctype=\"multipart/form-data\"");
        }
        out.write(sw0.toString());
        if(threadLocalPageCached.inSubmittedForm() && threadLocalPageCached.isValidationFormRerender())
        { 
          ThreadLocalOut.pop();
          if(threadLocalPageCached.submittedFormContent == null)
          { 
            threadLocalPageCached.submittedFormContent = sw1.toString();
          }
          else
          { 
            out = ThreadLocalOut.peek();
            out.write(threadLocalPageCached.submittedFormContent);
          }
        }
        threadLocalPageCached.formRequiresMultipartEnc = false;
      }
      threadLocalPageCached.setInSubmittedForm(false);
      threadLocalPageCached.setFormIdent("");
      threadLocalPageCached.leaveForm();
      if(RENDER_PHASE == phase)
      { 
        out.print("<" + "p");
        { 
          StringBuilder classattrs = new StringBuilder();
          StringBuilder styleattrs = new StringBuilder();
          java.util.List<String> ignore = new java.util.ArrayList<String>();
          utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
          for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
          { 
            AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
          }
          utils.TemplateCall.appendWithPadding(classattrs, "blog-post-meta");
          utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
        }
        out.print(">");
      }
      try
      { 
        handleTemplateCall(phase, inForLoop, forelementcounter, "tcall3", "outputDateTime", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new RefArg_outputDateTime_1_dslblogpostpc0(u_)}, "outputDateTime"), new Environment(env).putWithcall("elements#outputDateTime", new utils.TemplateCall("elementsempty", null, null, null)), "outputDateTime", TemplateCall.EmptyAttrs);
      }
      catch(RuntimeException ex)
      { 
        printTemplateCallException(ex, "outputDateTime(u.created) at ../mywebdsl.app:52/31");
      }
      if(RENDER_PHASE == phase)
      { 
        try
        { 
          utils.RenderUtils.printPageString(" by ", out, threadLocalPageCached.isRawoutput());
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
      if(RENDER_PHASE == phase)
      { 
        out.print("<" + "a");
        { 
          StringBuilder classattrs = new StringBuilder();
          StringBuilder styleattrs = new StringBuilder();
          java.util.List<String> ignore = new java.util.ArrayList<String>();
          utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
          for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
          { 
            AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
          }
          utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
        }
        out.print(">");
      }
      try
      { 
        handleTemplateCall(phase, inForLoop, forelementcounter, "tcall5", "outputString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{u_.getAuthor()}, "outputString"), new Environment(env).putWithcall("elements#outputString", new utils.TemplateCall("elementsempty", null, null, null)), "outputString", TemplateCall.EmptyAttrs);
      }
      catch(RuntimeException ex)
      { 
        printTemplateCallException(ex, "outputString(u.Author) at ../mywebdsl.app:52/59");
      }
      if(RENDER_PHASE == phase)
      { 
        out.print("</" + "a" + ">");
      }
      if(RENDER_PHASE == phase)
      { 
        out.print("</" + "p" + ">");
      }
      if(RENDER_PHASE == phase)
      { 
        out.print("</" + "div" + ">");
      }
      threadLocalPageCached.leaveTemplateContext();
    }
    forLoopCounter--;
    if(forLoopCounter == 0)
    { 
      inForLoop = false;
      forelementcounter = "0";
      fallbackcounter = 0;
    }
  }
}