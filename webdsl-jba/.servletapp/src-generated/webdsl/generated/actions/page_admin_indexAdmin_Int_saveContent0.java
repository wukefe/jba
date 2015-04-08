package webdsl.generated.actions;

import webdsl.generated.domain.*;
import webdsl.generated.templates.*;
import utils.*;
import java.io.*;
import java.util.*;
import org.webdsl.lang.Environment;

public class page_admin_indexAdmin_Int_saveContent0 extends TemplateAction 
{ 
  public static boolean isValidationDisabled()
  { 
    return false;
  }

  public void run(final AbstractPageServlet threadLocalPageCached, final Environment env, final String elementsContext, final webdsl.generated.domain.MyArticle art_arg, final Integer indx_arg, final webdsl.generated.domain.Admin admin_arg, final String actionident)
  { 
    handleAction(threadLocalPageCached, env, elementsContext, actionident, new TemplateActionBody()
                                                                           { 
                                                                             public void run()
                                                                             { 
                                                                               webdsl.generated.domain.MyArticle art_ = null;
                                                                               art_ = art_arg;
                                                                               Integer indx_ = null;
                                                                               indx_ = indx_arg;
                                                                               webdsl.generated.domain.Admin admin_ = null;
                                                                               admin_ = admin_arg;
                                                                               if(webdsl.generated.functions.genactionpredicate_page_admin_index__0Admin_Int_.genactionpredicate_page_admin_index__0Admin_Int_(admin_, indx_))
                                                                               { 
                                                                                 java.util.List<webdsl.generated.domain.MyArticle> ArticleList_ = utils.HibernateUtil.getCurrentSession().createQuery("from MyArticle").list();
                                                                                 Integer ucount_ = ArticleList_.size() + 1;
                                                                                 if(!(org.webdsl.tools.Utils.equal(art_.getCount(), null) || org.webdsl.tools.Utils.equal(0, null)) && art_.getCount() < 0)
                                                                                 { 
                                                                                   art_.setCount(ucount_);
                                                                                   art_.save("MyArticle");
                                                                                 }
                                                                                 else
                                                                                 { }
                                                                                 ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("table_content", utils.CollectionType.addAll(new java.util.ArrayList<String>(2), utils.URLFilter.filter(admin_.getNaturalId()), utils.URLFilter.filter(ucount_)), "Admin", "Int"));
                                                                               }
                                                                               else
                                                                               { 
                                                                                 ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
                                                                               }
                                                                             }
                                                                           });
  }
}