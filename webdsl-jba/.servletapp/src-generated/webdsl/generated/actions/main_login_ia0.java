package webdsl.generated.actions;

import webdsl.generated.domain.*;
import webdsl.generated.templates.*;
import utils.*;
import java.io.*;
import java.util.*;
import org.webdsl.lang.Environment;

public class main_login_ia0 extends TemplateAction 
{ 
  public static boolean isValidationDisabled()
  { 
    return false;
  }

  public void run(final AbstractPageServlet threadLocalPageCached, final Environment env, final String elementsContext, final String pass__arg, final String name__arg, final String actionident)
  { 
    handleAction(threadLocalPageCached, env, elementsContext, actionident, new TemplateActionBody()
                                                                           { 
                                                                             public void run()
                                                                             { 
                                                                               String pass__ = null;
                                                                               pass__ = pass__arg;
                                                                               String name__ = null;
                                                                               name__ = name__arg;
                                                                               if(!(!(org.webdsl.tools.Utils.equal(name__.length(), null) || org.webdsl.tools.Utils.equal(0, null)) && name__.length() > 0))
                                                                               { 
                                                                                 throw new utils.ValidationException(null, "Username required");
                                                                               }
                                                                               if(!(!(org.webdsl.tools.Utils.equal(pass__.length(), null) || org.webdsl.tools.Utils.equal(0, null)) && pass__.length() > 0))
                                                                               { 
                                                                                 throw new utils.ValidationException(null, "Password required");
                                                                               }
                                                                               ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl(""));
                                                                             }
                                                                           });
  }
}