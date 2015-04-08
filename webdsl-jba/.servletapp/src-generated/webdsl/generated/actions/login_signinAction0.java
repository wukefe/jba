package webdsl.generated.actions;

import webdsl.generated.domain.*;
import webdsl.generated.templates.*;
import utils.*;
import java.io.*;
import java.util.*;
import org.webdsl.lang.Environment;

public class login_signinAction0 extends TemplateAction 
{ 
  public static boolean isValidationDisabled()
  { 
    return false;
  }

  public void run(final AbstractPageServlet threadLocalPageCached, final Environment env, final String elementsContext, final Boolean stayLoggedIn_arg, final String credPassword_arg, final String credUsername_arg, final String actionident)
  { 
    handleAction(threadLocalPageCached, env, elementsContext, actionident, new TemplateActionBody()
                                                                           { 
                                                                             public void run()
                                                                             { 
                                                                               Boolean stayLoggedIn_ = null;
                                                                               stayLoggedIn_ = stayLoggedIn_arg;
                                                                               String credPassword_ = null;
                                                                               credPassword_ = credPassword_arg;
                                                                               String credUsername_ = null;
                                                                               credUsername_ = credUsername_arg;
                                                                               ((webdsl.generated.domain.SessionManager)ThreadLocalServlet.get().getSessionManager()).setStayLoggedIn(stayLoggedIn_);
                                                                               if(!webdsl.generated.functions.authenticateString_String_.authenticateString_String_(credUsername_, credPassword_))
                                                                               { 
                                                                                 throw new utils.ValidationException(null, "The login credentials are not valid.");
                                                                               }
                                                                               ThreadLocalServlet.get().getOutgoingSuccessMessages().add("You are now logged in.");
                                                                               ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl(""));
                                                                             }
                                                                           });
  }
}