package webdsl.generated.actions;

import webdsl.generated.domain.*;
import webdsl.generated.templates.*;
import utils.*;
import java.io.*;
import java.util.*;
import org.webdsl.lang.Environment;

public class page_left_barAdmin_Int_signout0 extends TemplateAction 
{ 
  public static boolean isValidationDisabled()
  { 
    return false;
  }

  public void run(final AbstractPageServlet threadLocalPageCached, final Environment env, final String elementsContext, final String actionident)
  { 
    handleAction(threadLocalPageCached, env, elementsContext, actionident, new TemplateActionBody()
                                                                           { 
                                                                             public void run()
                                                                             { 
                                                                               ((SecurityContext)ThreadLocalPage.getEnv().getSessionVariable("securityContext")).setPrincipal(null);
                                                                               ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("page_login"));
                                                                             }
                                                                           });
  }
}