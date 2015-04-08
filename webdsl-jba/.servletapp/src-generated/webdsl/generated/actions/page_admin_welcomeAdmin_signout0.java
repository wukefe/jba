package webdsl.generated.actions;

import webdsl.generated.domain.*;
import webdsl.generated.templates.*;
import utils.*;
import java.io.*;
import java.util.*;
import org.webdsl.lang.Environment;

public class page_admin_welcomeAdmin_signout0 extends TemplateAction 
{ 
  public static boolean isValidationDisabled()
  { 
    return false;
  }

  public void run(final AbstractPageServlet threadLocalPageCached, final Environment env, final String elementsContext, final webdsl.generated.domain.Admin admin_arg, final String actionident)
  { 
    handleAction(threadLocalPageCached, env, elementsContext, actionident, new TemplateActionBody()
                                                                           { 
                                                                             public void run()
                                                                             { 
                                                                               webdsl.generated.domain.Admin admin_ = null;
                                                                               admin_ = admin_arg;
                                                                               if(webdsl.generated.functions.genactionpredicate_page_admin_welcome__0Admin_.genactionpredicate_page_admin_welcome__0Admin_(admin_))
                                                                               { 
                                                                                 org.webdsl.logging.Logger.info("Log in as ");
                                                                                 org.webdsl.logging.Logger.info("securityContext.principal.name");
                                                                                 ((SecurityContext)ThreadLocalPage.getEnv().getSessionVariable("securityContext")).setPrincipal(null);
                                                                                 ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("page_login"));
                                                                               }
                                                                               else
                                                                               { 
                                                                                 ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
                                                                               }
                                                                             }
                                                                           });
  }
}