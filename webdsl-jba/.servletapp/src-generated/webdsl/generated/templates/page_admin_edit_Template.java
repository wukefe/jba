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

public @SuppressWarnings("all") class page_admin_edit_Template extends TemplateServlet 
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
      if(i == 1)
      { 
        java.util.ArrayList<webdsl.generated.domain.Admin> elems5 = new java.util.ArrayList<webdsl.generated.domain.Admin>();
        for(org.webdsl.WebDSLEntity ent : elems)
        { 
          if(ent.instanceOf("Admin"))
          { 
            elems5.add((webdsl.generated.domain.Admin)ent);
          }
        }
      }
    }
  }

  public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    page_admin_editAdmin_Int_s_ad1String_Int_WikiText_Text_MyArticle_Int_Admin_Template.loadTemplateMap(page_admin_editAdmin_Int_s_ad0String_Int_WikiText_Text_MyArticle_Int_Admin_Template.loadTemplateMap(staticEnv));
  }

  public static void loadRefArgClasses(Map<String, Class<?>> refargclasses)
  { 
    page_admin_editAdmin_Int_s_ad0String_Int_WikiText_Text_MyArticle_Int_Admin_Template.loadRefArgClasses(refargclasses);
    page_admin_editAdmin_Int_s_ad1String_Int_WikiText_Text_MyArticle_Int_Admin_Template.loadRefArgClasses(refargclasses);
  }

  public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    loadTemplateMap(null, staticEnv);
    return staticEnv;
  }

  public static Environment loadTemplateMap(String keyOverwrite, org.webdsl.lang.Environment staticEnv)
  { 
    staticEnv.putTemplate(keyOverwrite == null ? "page_admin_edit" : keyOverwrite, page_admin_edit_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    admin_ = (webdsl.generated.domain.Admin)args[0];
    count_ = (Integer)args[1];
  }

  public String getUniqueName()
  { 
    return "page_admin_edit";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + (admin_ != null ? admin_.getVersion() == 0 ? "_" : admin_.getId().toString() : "null");
  }

  public String getTemplateSignature()
  { 
    return "page page_admin_edit(admin : Admin, count : Int)";
  }

  public String getElementsContext()
  { 
    if(calledName == null)
    { 
      return "page_admin_edit";
    }
    else
    { 
      return calledName;
    }
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

  private Integer count_ = 0;

  public void setCount_(Integer count_)
  { 
    this.count_ = count_;
  }

  public Integer getCount_()
  { 
    return count_;
  }

  private webdsl.generated.domain.MyArticle u_;

  public webdsl.generated.domain.MyArticle getU_()
  { 
    return u_;
  }

  public void setU_(webdsl.generated.domain.MyArticle u_)
  { 
    this.u_ = u_;
  }

  private String x_;

  public String getX_()
  { 
    return x_;
  }

  public void setX_(String x_)
  { 
    this.x_ = x_;
  }

  private String y_;

  public String getY_()
  { 
    return y_;
  }

  public void setY_(String y_)
  { 
    this.y_ = y_;
  }

  private Integer z_;

  public Integer getZ_()
  { 
    return z_;
  }

  public void setZ_(Integer z_)
  { 
    this.z_ = z_;
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
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall28", "dslinit", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{}, "dslinit"), new Environment(env).putWithcall("elements#dslinit", new utils.TemplateCall("elementsempty", null, null, null)), "dslinit", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "dslinit() at ../myadminall.app:241/3");
    }
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
        utils.TemplateCall.appendWithPadding(classattrs, "row");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall30", "page_left_barAdmin_Int", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{admin_, z_}, "page_left_barAdmin_Int"), new Environment(env).putWithcall("elements#page_left_barAdmin_Int", new utils.TemplateCall("elementsempty", null, null, null)), "page_left_barAdmin_Int", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "page_left_barAdmin_Int(admin, z) at ../myadminall.app:264/3");
    }
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
        utils.TemplateCall.appendWithPadding(classattrs, "col-sm-8");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
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
        utils.TemplateCall.appendWithPadding(classattrs, "center");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(threadLocalPageCached.isInForm())
    { 
      org.webdsl.logging.Logger.error("Invalid nested <form> tag detected in DOM at URL: " + threadLocalPageCached.getRequest().getRequestURL() + "\n Enclosing form found in " + threadLocalPageCached.getEnclosingForm() + "\n Nested form found in " + getTemplateSignature());
    }
    threadLocalPageCached.enterForm(getTemplateSignature());
    ident = (inForLoop ? forelementcounter : "") + ("form1" + getUniqueId());
    threadLocalPageCached.setFormIdent(ident);
    if(threadLocalPageCached.getParammap().get(ident) != null)
    { 
      threadLocalPageCached.setInSubmittedForm(true);
    }
    java.io.StringWriter sw3 = null;
    java.io.StringWriter sw2 = null;
    if(RENDER_PHASE == phase)
    { 
      threadLocalPageCached.formRequiresMultipartEnc = false;
      if(threadLocalPageCached.inSubmittedForm() && threadLocalPageCached.isValidationFormRerender())
      { 
        sw3 = new java.io.StringWriter();
        out = new java.io.PrintWriter(sw3);
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
      sw2 = new java.io.StringWriter();
      out = new java.io.PrintWriter(sw2);
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
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString("Writing...", out, threadLocalPageCached.isRawoutput());
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
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
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
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString("Title: ", out, threadLocalPageCached.isRawoutput());
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
      utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout, "rows", "1");
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall32", "inputText", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new RefArg_page_admin_edit_Template0(page_admin_edit_Template.this)}, "inputText"), new Environment(env).putWithcall("elements#inputText", new utils.TemplateCall("elementsempty", null, null, null)), "inputText", attrsmapout);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "inputText(x) at ../myadminall.app:273/6");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "p" + ">");
    }
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall34", "labelString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Content"}, "labelString"), new Environment(env).putWithcall("elements#labelString", new utils.TemplateCall("elementsempty", null, null, null)), "labelString", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "labelString(\"Content\") at ../myadminall.app:275/5");
    }
    try
    { 
      if(DATABIND_PHASE == phase)
      { }
      if(ACTION_PHASE == phase)
      { }
      Map<String, String> attrsmapout = new HashMap<String, String>();
      utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout, "class", "form-control");
      utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout, "rows", "15");
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall36", "inputWikiText", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new RefArg_page_admin_edit_Template1(page_admin_edit_Template.this)}, "inputWikiText"), new Environment(env).putWithcall("elements#inputWikiText", new utils.TemplateCall("elementsempty", null, null, null)), "inputWikiText", attrsmapout);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "inputWikiText(y) at ../myadminall.app:276/5");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("<" + "br");
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
      out.print("/>");
    }
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
        utils.TemplateCall.appendWithPadding(classattrs, "buttonLeft");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall38", "wrapsubmitString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"page_admin_editAdmin_Int_saveContent1" + webdsl.generated.functions.getPage_.getPage_().getTemplateContext().getTemplateContextString()}, "wrapsubmitString"), new Environment(env).putWithcall("s", new utils.TemplateCall("page_admin_editAdmin_Int_s_ad0String_Int_WikiText_Text_MyArticle_Int_Admin", getElementsContext(), new Object[]{new RefArg_page_admin_edit_Template2(page_admin_edit_Template.this), new RefArg_page_admin_edit_Template1(page_admin_edit_Template.this), new RefArg_page_admin_edit_Template0(page_admin_edit_Template.this), new RefArg_page_admin_edit_Template3(page_admin_edit_Template.this), count_, admin_}, attrs)), "wrapsubmitString", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "wrapsubmitString(\"page_admin_editAdmin_Int_saveContent1\" +\ngetPage().getTemplateContext().getTemplateContextString()) at unknown context");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "div" + ">");
    }
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
        utils.TemplateCall.appendWithPadding(classattrs, "buttonRight");
        utils.TemplateCall.printClassStyleAttributes(classattrs, styleattrs, out);
      }
      out.print(">");
    }
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall41", "wrapsubmitString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"page_admin_editAdmin_Int_clearContent1" + webdsl.generated.functions.getPage_.getPage_().getTemplateContext().getTemplateContextString()}, "wrapsubmitString"), new Environment(env).putWithcall("s", new utils.TemplateCall("page_admin_editAdmin_Int_s_ad1String_Int_WikiText_Text_MyArticle_Int_Admin", getElementsContext(), new Object[]{new RefArg_page_admin_edit_Template2(page_admin_edit_Template.this), new RefArg_page_admin_edit_Template1(page_admin_edit_Template.this), new RefArg_page_admin_edit_Template0(page_admin_edit_Template.this), new RefArg_page_admin_edit_Template3(page_admin_edit_Template.this), count_, admin_}, attrs)), "wrapsubmitString", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "wrapsubmitString(\"page_admin_editAdmin_Int_clearContent1\" +\ngetPage().getTemplateContext().getTemplateContextString()) at unknown context");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "div" + ">");
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
      out.write(sw2.toString());
      if(threadLocalPageCached.inSubmittedForm() && threadLocalPageCached.isValidationFormRerender())
      { 
        ThreadLocalOut.pop();
        if(threadLocalPageCached.submittedFormContent == null)
        { 
          threadLocalPageCached.submittedFormContent = sw3.toString();
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
      out.print("</" + "div" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "div" + ">");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "div" + ">");
    }
  }

  protected void initActions()
  { 
    PrintWriter out = ThreadLocalOut.peek();
    if(webdsl.generated.functions.genpagepredicate_page_admin_edit0Admin_Int_.genpagepredicate_page_admin_edit0Admin_Int_(admin_, count_))
    { }
    else
    { 
      ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
    }
  }

  protected void initializeLocalVars()
  { 
    u_ = null;
    x_ = "";
    y_ = "";
    z_ = 0;
  }
}