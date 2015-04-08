package webdsl.generated.actions;

import webdsl.generated.domain.*;
import webdsl.generated.templates.*;
import utils.*;
import java.io.*;
import java.util.*;
import org.webdsl.lang.Environment;

public class page_login_saveForm0 extends TemplateAction 
{ 
  public static boolean isValidationDisabled()
  { 
    return false;
  }

  public void run(final AbstractPageServlet threadLocalPageCached, final Environment env, final String elementsContext, final String upass_arg, final String uname_arg, final String actionident)
  { 
    handleAction(threadLocalPageCached, env, elementsContext, actionident, new TemplateActionBody()
                                                                           { 
                                                                             public void run()
                                                                             { 
                                                                               String upass_ = null;
                                                                               upass_ = upass_arg;
                                                                               String uname_ = null;
                                                                               uname_ = uname_arg;
                                                                               org.webdsl.logging.Logger.info("----");
                                                                               org.webdsl.logging.Logger.info(uname_);
                                                                               org.webdsl.logging.Logger.info(upass_);
                                                                               java.util.List<webdsl.generated.domain.Admin> AdminList_ = utils.HibernateUtil.getCurrentSession().createQuery("from Admin").list();
                                                                               if(!webdsl.generated.functions.authenticaString_String_Admin_.authenticaString_String_Admin_(uname_, upass_, (webdsl.generated.domain.Admin)AdminList_.get(0)))
                                                                               { 
                                                                                 throw new utils.ValidationException(null, "Sorry, wrong password or admin name");
                                                                               }
                                                                               ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("page_admin_index", utils.CollectionType.addAll(new java.util.ArrayList<String>(2), utils.URLFilter.filter(((webdsl.generated.domain.Admin)AdminList_.get(0)).getNaturalId()), utils.URLFilter.filter(-1)), "Admin", "Int"));
                                                                             }
                                                                           });
  }
}