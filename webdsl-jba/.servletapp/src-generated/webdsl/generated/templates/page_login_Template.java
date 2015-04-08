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

public @SuppressWarnings("all") class page_login_Template extends TemplateServlet 
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
  { 
    page_login_s_ad0String_Secret_String_Template.loadTemplateMap(staticEnv);
  }

  public static void loadRefArgClasses(Map<String, Class<?>> refargclasses)
  { 
    page_login_s_ad0String_Secret_String_Template.loadRefArgClasses(refargclasses);
  }

  public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    loadTemplateMap(null, staticEnv);
    return staticEnv;
  }

  public static Environment loadTemplateMap(String keyOverwrite, org.webdsl.lang.Environment staticEnv)
  { 
    staticEnv.putTemplate(keyOverwrite == null ? "page_login" : keyOverwrite, page_login_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  public String getUniqueName()
  { 
    return "page_login";
  }

  public String getStateEncodingOfArgument()
  { 
    return "";
  }

  public String getTemplateSignature()
  { 
    return "page page_login()";
  }

  public String getElementsContext()
  { 
    if(calledName == null)
    { 
      return "page_login";
    }
    else
    { 
      return calledName;
    }
  }

  private String uname_;

  public String getUname_()
  { 
    return uname_;
  }

  public void setUname_(String uname_)
  { 
    this.uname_ = uname_;
  }

  private String upass_;

  public String getUpass_()
  { 
    return upass_;
  }

  public void setUpass_(String upass_)
  { 
    this.upass_ = upass_;
  }

  protected void handlePhase(int phase)
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    PrintWriter out = ThreadLocalOut.peek();
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall25", "dslinit", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{}, "dslinit"), new Environment(env).putWithcall("elements#dslinit", new utils.TemplateCall("elementsempty", null, null, null)), "dslinit", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "dslinit() at ../web-dsl-simple.app:40/3");
    }
    if(RENDER_PHASE == phase)
    { 
      threadLocalPageCached.addStylesheetInclude("mycss/signin.css");
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
        utils.TemplateCall.appendWithPadding(classattrs, "form-signin");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      sw0 = new java.io.StringWriter();
      out = new java.io.PrintWriter(sw0);
      ThreadLocalOut.push(out);
      out.print(">");
      out.print("<input type=\"hidden\" name=\"" + ident + "\" value=\"1\" />");
      out.print(threadLocalPageCached.getHiddenParams());
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "h2");
      { 
        StringBuilder classattrs = new StringBuilder();
        StringBuilder styleattrs = new StringBuilder();
        java.util.List<String> ignore = new java.util.ArrayList<String>();
        utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
        for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
        { 
          AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
        }
        utils.TemplateCall.appendWithPadding(classattrs, "form-signin-heading");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString("Please sign in", out, threadLocalPageCached.isRawoutput());
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
      out.print("</" + "h2" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "label");
      { 
        StringBuilder classattrs = new StringBuilder();
        StringBuilder styleattrs = new StringBuilder();
        java.util.List<String> ignore = new java.util.ArrayList<String>();
        utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
        for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
        { 
          AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
        }
        out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("for", "inputUser"));
        utils.TemplateCall.appendWithPadding(classattrs, "sr-only");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString("Administrator name", out, threadLocalPageCached.isRawoutput());
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
      out.print("</" + "label" + ">");
    }
    try
    { 
      if(DATABIND_PHASE == phase)
      { }
      if(ACTION_PHASE == phase)
      { }
      Map<String, String> attrsmapout = new HashMap<String, String>();
      utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout, "type", "text");
      utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout, "id", "inputUser");
      utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout, "class", "form-control");
      utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout, "placeholder", "Administrator name");
      utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout, "style", "width:100%;");
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall27", "inputString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new RefArg_page_login_Template0(page_login_Template.this)}, "inputString"), new Environment(env).putWithcall("elements#inputString", new utils.TemplateCall("elementsempty", null, null, null)), "inputString", attrsmapout);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "inputString(uname) at ../web-dsl-simple.app:49/4");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "label");
      { 
        StringBuilder classattrs = new StringBuilder();
        StringBuilder styleattrs = new StringBuilder();
        java.util.List<String> ignore = new java.util.ArrayList<String>();
        utils.TemplateCall.getDynamicIgnoredAttributes(attrs, ignore);
        for(String attrcolname : utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs))
        { 
          AttributeCollectionLookup.getAttributeCollection(attrcolname, classattrs, styleattrs, ignore, out);
        }
        out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("for", "inputPassword"));
        utils.TemplateCall.appendWithPadding(classattrs, "sr-only");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString("Password", out, threadLocalPageCached.isRawoutput());
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
      out.print("</" + "label" + ">");
    }
    try
    { 
      if(DATABIND_PHASE == phase)
      { }
      if(ACTION_PHASE == phase)
      { }
      Map<String, String> attrsmapout = new HashMap<String, String>();
      utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout, "class", "form-control");
      utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout, "id", "inputPassword");
      utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout, "placeholder", "Password");
      utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout, "type", "password");
      utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout, "style", "width:100%;");
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall29", "inputSecret", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new RefArg_page_login_Template1(page_login_Template.this)}, "inputSecret"), new Environment(env).putWithcall("elements#inputSecret", new utils.TemplateCall("elementsempty", null, null, null)), "inputSecret", attrsmapout);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "inputSecret(upass) at ../web-dsl-simple.app:54/4");
    }
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall31", "wrapsubmitString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"page_login_saveForm1" + webdsl.generated.functions.getPage_.getPage_().getTemplateContext().getTemplateContextString()}, "wrapsubmitString"), new Environment(env).putWithcall("s", new utils.TemplateCall("page_login_s_ad0String_Secret_String", getElementsContext(), new Object[]{new RefArg_page_login_Template1(page_login_Template.this), new RefArg_page_login_Template0(page_login_Template.this)}, attrs)), "wrapsubmitString", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "wrapsubmitString(\"page_login_saveForm1\" +\ngetPage().getTemplateContext().getTemplateContextString()) at unknown context");
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
  }

  protected void initActions()
  { 
    PrintWriter out = ThreadLocalOut.peek();
  }

  protected void initializeLocalVars()
  { 
    uname_ = "";
    upass_ = "";
  }
}