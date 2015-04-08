package webdsl.generated.actions;

import webdsl.generated.domain.*;
import webdsl.generated.templates.*;
import utils.*;
import java.io.*;
import java.util.*;
import org.webdsl.lang.Environment;

public class table_content_ia6 extends TemplateAction 
{ 
  public static boolean isValidationDisabled()
  { 
    return false;
  }

  public void run(final AbstractPageServlet threadLocalPageCached, final Environment env, final String elementsContext, final webdsl.generated.domain.MyArticle u__arg, final String actionident)
  { 
    handleAction(threadLocalPageCached, env, elementsContext, actionident, new TemplateActionBody()
                                                                           { 
                                                                             public void run()
                                                                             { 
                                                                               webdsl.generated.domain.MyArticle u__ = null;
                                                                               u__ = u__arg;
                                                                               if(webdsl.generated.functions.genactioncombined_table_content_ia60MyArticle_.genactioncombined_table_content_ia60MyArticle_(u__))
                                                                               { 
                                                                                 ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("page_view", utils.CollectionType.addAll(new java.util.ArrayList<String>(1), utils.URLFilter.filter(u__.getNaturalId())), "MyArticle"));
                                                                               }
                                                                               else
                                                                               { 
                                                                                 ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
                                                                               }
                                                                             }
                                                                           });
  }
}