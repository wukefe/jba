package webdsl.generated.actions;

import webdsl.generated.domain.*;
import webdsl.generated.templates.*;
import utils.*;
import java.io.*;
import java.util.*;
import org.webdsl.lang.Environment;

public class page_admin_index_saveContent0 extends TemplateAction 
{ 
  public static boolean isValidationDisabled()
  { 
    return false;
  }

  public void run(final AbstractPageServlet threadLocalPageCached, final Environment env, final String elementsContext, final String y_arg, final String actionident)
  { 
    handleAction(threadLocalPageCached, env, elementsContext, actionident, new TemplateActionBody()
                                                                           { 
                                                                             public void run()
                                                                             { 
                                                                               String y_ = null;
                                                                               y_ = y_arg;
                                                                               webdsl.generated.domain.MyArticle u0_ = ((webdsl.generated.domain.MyArticle)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.MyArticle)org.webdsl.tools.Utils.cast(webdsl.generated.domain.MyArticle._static_createEmpty_().MyArticle$this_(), webdsl.generated.domain.MyArticle.class)).setContent(y_), webdsl.generated.domain.MyArticle.class)).save("MyArticle");
                                                                               ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("table_content"));
                                                                             }
                                                                           });
  }
}