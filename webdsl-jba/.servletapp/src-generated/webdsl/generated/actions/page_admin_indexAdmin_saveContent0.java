package webdsl.generated.actions;

import webdsl.generated.domain.*;
import webdsl.generated.templates.*;
import utils.*;
import java.io.*;
import java.util.*;
import org.webdsl.lang.Environment;

public class page_admin_indexAdmin_saveContent0 extends TemplateAction 
{ 
  public static boolean isValidationDisabled()
  { 
    return false;
  }

  public void run(final AbstractPageServlet threadLocalPageCached, final Environment env, final String elementsContext, final String ucontent_arg, final String utitle_arg, final webdsl.generated.domain.Admin admin_arg, final String actionident)
  { 
    handleAction(threadLocalPageCached, env, elementsContext, actionident, new TemplateActionBody()
                                                                           { 
                                                                             public void run()
                                                                             { 
                                                                               String ucontent_ = null;
                                                                               ucontent_ = ucontent_arg;
                                                                               String utitle_ = null;
                                                                               utitle_ = utitle_arg;
                                                                               webdsl.generated.domain.Admin admin_ = null;
                                                                               admin_ = admin_arg;
                                                                               if(webdsl.generated.functions.genactionpredicate_page_admin_index__0Admin_.genactionpredicate_page_admin_index__0Admin_(admin_))
                                                                               { 
                                                                                 webdsl.generated.domain.MyArticle u0_ = ((webdsl.generated.domain.MyArticle)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.MyArticle)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.MyArticle)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.MyArticle)org.webdsl.tools.Utils.cast(webdsl.generated.domain.MyArticle._static_createEmpty_().MyArticle$this_(), webdsl.generated.domain.MyArticle.class)).setAuthor(admin_.getUsername()), webdsl.generated.domain.MyArticle.class)).setContent(ucontent_), webdsl.generated.domain.MyArticle.class)).setTitle(utitle_), webdsl.generated.domain.MyArticle.class)).save("MyArticle");
                                                                                 ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("table_content", utils.CollectionType.addAll(new java.util.ArrayList<String>(1), utils.URLFilter.filter(admin_.getNaturalId())), "Admin"));
                                                                               }
                                                                               else
                                                                               { 
                                                                                 ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
                                                                               }
                                                                             }
                                                                           });
  }
}