package webdsl.generated.actions;

import webdsl.generated.domain.*;
import webdsl.generated.templates.*;
import utils.*;
import java.io.*;
import java.util.*;
import org.webdsl.lang.Environment;

public class table_contentAdmin_ia1 extends TemplateAction 
{ 
  public static boolean isValidationDisabled()
  { 
    return false;
  }

  public void run(final AbstractPageServlet threadLocalPageCached, final Environment env, final String elementsContext, final webdsl.generated.domain.MyArticle u__arg, final webdsl.generated.domain.Admin admin__arg, final webdsl.generated.domain.Admin admin_arg, final String actionident)
  { 
    handleAction(threadLocalPageCached, env, elementsContext, actionident, new TemplateActionBody()
                                                                           { 
                                                                             public void run()
                                                                             { 
                                                                               webdsl.generated.domain.MyArticle u__ = null;
                                                                               u__ = u__arg;
                                                                               webdsl.generated.domain.Admin admin__ = null;
                                                                               admin__ = admin__arg;
                                                                               webdsl.generated.domain.Admin admin_ = null;
                                                                               admin_ = admin_arg;
                                                                               if(webdsl.generated.functions.genactionpredicate_table_content__0Admin_.genactionpredicate_table_content__0Admin_(admin_))
                                                                               { 
                                                                                 ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("page_admin_index", utils.CollectionType.addAll(new java.util.ArrayList<String>(2), utils.URLFilter.filter(admin__.getNaturalId()), utils.URLFilter.filter(u__.getCount())), "Admin", "Int"));
                                                                               }
                                                                               else
                                                                               { 
                                                                                 ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
                                                                               }
                                                                             }
                                                                           });
  }
}