package webdsl.generated.actions;

import webdsl.generated.domain.*;
import webdsl.generated.templates.*;
import utils.*;
import java.io.*;
import java.util.*;
import org.webdsl.lang.Environment;

public class page_admin_indexAdmin_Int_MyArticle_clearContent0 extends TemplateAction 
{ 
  public static boolean isValidationDisabled()
  { 
    return false;
  }

  public void run(final AbstractPageServlet threadLocalPageCached, final Environment env, final String elementsContext, final String ucontent_arg, final String utitle_arg, final webdsl.generated.domain.MyArticle art_arg, final Integer op_arg, final webdsl.generated.domain.Admin admin_arg, final String actionident)
  { 
    handleAction(threadLocalPageCached, env, elementsContext, actionident, new TemplateActionBody()
                                                                           { 
                                                                             public void run()
                                                                             { 
                                                                               String ucontent_ = null;
                                                                               ucontent_ = ucontent_arg;
                                                                               String utitle_ = null;
                                                                               utitle_ = utitle_arg;
                                                                               webdsl.generated.domain.MyArticle art_ = null;
                                                                               art_ = art_arg;
                                                                               Integer op_ = null;
                                                                               op_ = op_arg;
                                                                               webdsl.generated.domain.Admin admin_ = null;
                                                                               admin_ = admin_arg;
                                                                               if(webdsl.generated.functions.genactionpredicate_page_admin_index__0Admin_Int_MyArticle_.genactionpredicate_page_admin_index__0Admin_Int_MyArticle_(admin_, op_, art_))
                                                                               { 
                                                                                 utitle_ = "";
                                                                                 ucontent_ = "";
                                                                               }
                                                                               else
                                                                               { 
                                                                                 ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
                                                                               }
                                                                             }
                                                                           });
  }
}