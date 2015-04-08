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

public @SuppressWarnings("all") class page_admin_index_Template extends TemplateServlet 
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
        java.util.ArrayList<webdsl.generated.domain.Admin> elems4 = new java.util.ArrayList<webdsl.generated.domain.Admin>();
        for(org.webdsl.WebDSLEntity ent : elems)
        { 
          if(ent.instanceOf("Admin"))
          { 
            elems4.add((webdsl.generated.domain.Admin)ent);
          }
        }
      }
    }
  }

  public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    page_admin_indexAdmin_Int_s_ad1String_MyArticle_Int_WikiText_WikiText_Text_MyArticle_Int_Admin_Template.loadTemplateMap(page_admin_indexAdmin_Int_s_ad0String_MyArticle_Int_WikiText_WikiText_Text_MyArticle_Int_Admin_Template.loadTemplateMap(staticEnv));
  }

  public static void loadRefArgClasses(Map<String, Class<?>> refargclasses)
  { 
    refargclasses.put("RefArg_inputString_1_page_admin_indexpc0", RefArg_inputString_1_page_admin_indexpc0.class);
    refargclasses.put("RefArg_inputWikiText_1_page_admin_indexpc1", RefArg_inputWikiText_1_page_admin_indexpc1.class);
    page_admin_indexAdmin_Int_s_ad0String_MyArticle_Int_WikiText_WikiText_Text_MyArticle_Int_Admin_Template.loadRefArgClasses(refargclasses);
    page_admin_indexAdmin_Int_s_ad1String_MyArticle_Int_WikiText_WikiText_Text_MyArticle_Int_Admin_Template.loadRefArgClasses(refargclasses);
  }

  public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    loadTemplateMap(null, staticEnv);
    return staticEnv;
  }

  public static Environment loadTemplateMap(String keyOverwrite, org.webdsl.lang.Environment staticEnv)
  { 
    staticEnv.putTemplate(keyOverwrite == null ? "page_admin_index" : keyOverwrite, page_admin_index_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    admin_ = (webdsl.generated.domain.Admin)args[0];
    indx_ = (Integer)args[1];
  }

  public String getUniqueName()
  { 
    return "page_admin_index";
  }

  public String getStateEncodingOfArgument()
  { 
    return "" + (admin_ != null ? admin_.getVersion() == 0 ? "_" : admin_.getId().toString() : "null");
  }

  public String getTemplateSignature()
  { 
    return "page page_admin_index(admin : Admin, indx : Int)";
  }

  public String getElementsContext()
  { 
    if(calledName == null)
    { 
      return "page_admin_index";
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

  private Integer indx_ = 0;

  public void setIndx_(Integer indx_)
  { 
    this.indx_ = indx_;
  }

  public Integer getIndx_()
  { 
    return indx_;
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

  private String utitle_;

  public String getUtitle_()
  { 
    return utitle_;
  }

  public void setUtitle_(String utitle_)
  { 
    this.utitle_ = utitle_;
  }

  private String ucontent_;

  public String getUcontent_()
  { 
    return ucontent_;
  }

  public void setUcontent_(String ucontent_)
  { 
    this.ucontent_ = ucontent_;
  }

  private Integer id_;

  public Integer getId_()
  { 
    return id_;
  }

  public void setId_(Integer id_)
  { 
    this.id_ = id_;
  }

  private webdsl.generated.domain.MyArticle art_;

  public webdsl.generated.domain.MyArticle getArt_()
  { 
    return art_;
  }

  public void setArt_(webdsl.generated.domain.MyArticle art_)
  { 
    this.art_ = art_;
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
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall12", "dslinit", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{}, "dslinit"), new Environment(env).putWithcall("elements#dslinit", new utils.TemplateCall("elementsempty", null, null, null)), "dslinit", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "dslinit() at ../myadminall.app:36/3");
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
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall14", "page_left_barAdmin_Int", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{admin_, webdsl.generated.functions.findtotal_.findtotal_()}, "page_left_barAdmin_Int"), new Environment(env).putWithcall("elements#page_left_barAdmin_Int", new utils.TemplateCall("elementsempty", null, null, null)), "page_left_barAdmin_Int", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "page_left_barAdmin_Int(admin, findtotal()) at ../myadminall.app:83/3");
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
      utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout, "style", "width:100%");
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall16", "inputString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new RefArg_inputString_1_page_admin_indexpc0(art_)}, "inputString"), new Environment(env).putWithcall("elements#inputString", new utils.TemplateCall("elementsempty", null, null, null)), "inputString", attrsmapout);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "inputString(art.Title) at ../myadminall.app:91/6");
    }
    if(RENDER_PHASE == phase)
    { 
      out.print("</" + "p" + ">");
    }
    try
    { 
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall18", "labelString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Content"}, "labelString"), new Environment(env).putWithcall("elements#labelString", new utils.TemplateCall("elementsempty", null, null, null)), "labelString", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "labelString(\"Content\") at ../myadminall.app:93/5");
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
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall20", "inputWikiText", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new RefArg_inputWikiText_1_page_admin_indexpc1(art_)}, "inputWikiText"), new Environment(env).putWithcall("elements#inputWikiText", new utils.TemplateCall("elementsempty", null, null, null)), "inputWikiText", attrsmapout);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "inputWikiText(art.Content) at ../myadminall.app:94/5");
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
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall22", "wrapsubmitString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"page_admin_indexAdmin_Int_saveContent1" + webdsl.generated.functions.getPage_.getPage_().getTemplateContext().getTemplateContextString()}, "wrapsubmitString"), new Environment(env).putWithcall("s", new utils.TemplateCall("page_admin_indexAdmin_Int_s_ad0String_MyArticle_Int_WikiText_WikiText_Text_MyArticle_Int_Admin", getElementsContext(), new Object[]{new RefArg_page_admin_index_Template0(page_admin_index_Template.this), new RefArg_page_admin_index_Template1(page_admin_index_Template.this), new RefArg_page_admin_index_Template2(page_admin_index_Template.this), new RefArg_page_admin_index_Template3(page_admin_index_Template.this), new RefArg_page_admin_index_Template4(page_admin_index_Template.this), new RefArg_page_admin_index_Template5(page_admin_index_Template.this), indx_, admin_}, attrs)), "wrapsubmitString", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "wrapsubmitString(\"page_admin_indexAdmin_Int_saveContent1\" +\ngetPage().getTemplateContext().getTemplateContextString()) at unknown context");
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
      handleTemplateCall(phase, inForLoop, forelementcounter, "tcall25", "wrapsubmitString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"page_admin_indexAdmin_Int_clearContent1" + webdsl.generated.functions.getPage_.getPage_().getTemplateContext().getTemplateContextString()}, "wrapsubmitString"), new Environment(env).putWithcall("s", new utils.TemplateCall("page_admin_indexAdmin_Int_s_ad1String_MyArticle_Int_WikiText_WikiText_Text_MyArticle_Int_Admin", getElementsContext(), new Object[]{new RefArg_page_admin_index_Template0(page_admin_index_Template.this), new RefArg_page_admin_index_Template1(page_admin_index_Template.this), new RefArg_page_admin_index_Template2(page_admin_index_Template.this), new RefArg_page_admin_index_Template3(page_admin_index_Template.this), new RefArg_page_admin_index_Template4(page_admin_index_Template.this), new RefArg_page_admin_index_Template5(page_admin_index_Template.this), indx_, admin_}, attrs)), "wrapsubmitString", TemplateCall.EmptyAttrs);
    }
    catch(RuntimeException ex)
    { 
      printTemplateCallException(ex, "wrapsubmitString(\"page_admin_indexAdmin_Int_clearContent1\" +\ngetPage().getTemplateContext().getTemplateContextString()) at unknown context");
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
    if(webdsl.generated.functions.genpagepredicate_page_admin_index0Admin_Int_.genpagepredicate_page_admin_index0Admin_Int_(admin_, indx_))
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
    utitle_ = "";
    ucontent_ = "";
    id_ = 1;
    art_ = webdsl.generated.functions.findArtInt_.findArtInt_(indx_);
  }
}