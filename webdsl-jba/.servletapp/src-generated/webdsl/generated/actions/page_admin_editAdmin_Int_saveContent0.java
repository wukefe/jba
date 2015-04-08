package webdsl.generated.actions;

import webdsl.generated.domain.*;
import webdsl.generated.templates.*;
import utils.*;
import java.io.*;
import java.util.*;
import org.webdsl.lang.Environment;

public class page_admin_editAdmin_Int_saveContent0 extends TemplateAction 
{ 
  public static boolean isValidationDisabled()
  { 
    return false;
  }

  public void run(final AbstractPageServlet threadLocalPageCached, final Environment env, final String elementsContext, final String y_arg, final String x_arg, final Integer count_arg, final webdsl.generated.domain.Admin admin_arg, final String actionident)
  { 
    handleAction(threadLocalPageCached, env, elementsContext, actionident, new TemplateActionBody()
                                                                           { 
                                                                             public void run()
                                                                             { 
                                                                               String y_ = null;
                                                                               y_ = y_arg;
                                                                               String x_ = null;
                                                                               x_ = x_arg;
                                                                               Integer count_ = null;
                                                                               count_ = count_arg;
                                                                               webdsl.generated.domain.Admin admin_ = null;
                                                                               admin_ = admin_arg;
                                                                               if(webdsl.generated.functions.genactionpredicate_page_admin_edit__0Admin_Int_.genactionpredicate_page_admin_edit__0Admin_Int_(admin_, count_))
                                                                               { 
                                                                                 java.util.List<webdsl.generated.domain.MyArticle> list2 = utils.HibernateUtil.getCurrentSession().createCriteria(webdsl.generated.domain.MyArticle.class).list();
                                                                                 Object[] array1 = list2.toArray();
                                                                                 for(int i1 = 0; i1 < array1.length; i1++)
                                                                                 { 
                                                                                   webdsl.generated.domain.MyArticle article_ = (webdsl.generated.domain.MyArticle)array1[i1];
                                                                                   if(org.webdsl.tools.Utils.equal(count_, article_.getCount()))
                                                                                   { 
                                                                                     article_.setTitle(x_);
                                                                                     article_.setContent(y_);
                                                                                     java.util.List<webdsl.generated.domain.MyArticle> ArticleList_ = utils.HibernateUtil.getCurrentSession().createQuery("from MyArticle").list();
                                                                                     Integer len_ = ArticleList_.size();
                                                                                     ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("table_content", utils.CollectionType.addAll(new java.util.ArrayList<String>(2), utils.URLFilter.filter(admin_.getNaturalId()), utils.URLFilter.filter(len_)), "Admin", "Int"));
                                                                                   }
                                                                                   else
                                                                                   { }
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