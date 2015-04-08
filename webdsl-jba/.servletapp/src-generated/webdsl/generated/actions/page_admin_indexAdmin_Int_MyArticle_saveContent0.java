package webdsl.generated.actions;

import webdsl.generated.domain.*;
import webdsl.generated.templates.*;
import utils.*;
import java.io.*;
import java.util.*;
import org.webdsl.lang.Environment;

public class page_admin_indexAdmin_Int_MyArticle_saveContent0 extends TemplateAction 
{ 
  public static boolean isValidationDisabled()
  { 
    return false;
  }

  public void run(final AbstractPageServlet threadLocalPageCached, final Environment env, final String elementsContext, final String ucontent_arg, final String utitle_arg, final webdsl.generated.domain.MyArticle art_arg, final Integer op_arg, final webdsl.generated.domain.Admin admin_arg, final String actionident)
  { 
    handleAction(threadLocalPageCached, env, elementsContext, actionident, new TemplateActionBody()
                                                                           { 
                                                                             public void run()
                                                                             { 
                                                                               String ucontent_ = null;
                                                                               ucontent_ = ucontent_arg;
                                                                               String utitle_ = null;
                                                                               utitle_ = utitle_arg;
                                                                               webdsl.generated.domain.MyArticle art_ = null;
                                                                               art_ = art_arg;
                                                                               Integer op_ = null;
                                                                               op_ = op_arg;
                                                                               webdsl.generated.domain.Admin admin_ = null;
                                                                               admin_ = admin_arg;
                                                                               if(webdsl.generated.functions.genactionpredicate_page_admin_index__0Admin_Int_MyArticle_.genactionpredicate_page_admin_index__0Admin_Int_MyArticle_(admin_, op_, art_))
                                                                               { 
                                                                                 if(org.webdsl.tools.Utils.equal(op_, 0))
                                                                                 { 
                                                                                   webdsl.generated.domain.MyArticle u0_ = ((webdsl.generated.domain.MyArticle)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.MyArticle)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.MyArticle)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.MyArticle)org.webdsl.tools.Utils.cast(webdsl.generated.domain.MyArticle._static_createEmpty_().MyArticle$this_(), webdsl.generated.domain.MyArticle.class)).setAuthor(admin_.getUsername()), webdsl.generated.domain.MyArticle.class)).setContent(ucontent_), webdsl.generated.domain.MyArticle.class)).setTitle(utitle_), webdsl.generated.domain.MyArticle.class)).save("MyArticle");
                                                                                   ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("table_content", utils.CollectionType.addAll(new java.util.ArrayList<String>(1), utils.URLFilter.filter(admin_.getNaturalId())), "Admin"));
                                                                                 }
                                                                                 else
                                                                                 { 
                                                                                   art_.setTitle(utitle_);
                                                                                   art_.setContent(ucontent_);
                                                                                   art_.setAuthor(admin_.getUsername());
                                                                                 }
                                                                               }
                                                                               else
                                                                               { 
                                                                                 ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
                                                                               }
                                                                             }
                                                                           });
  }
}