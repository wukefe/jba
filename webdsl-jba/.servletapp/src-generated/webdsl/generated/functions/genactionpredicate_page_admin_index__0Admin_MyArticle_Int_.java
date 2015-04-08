package webdsl.generated.functions;

import java.io.*;
import java.util.HashMap;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import utils.*;
import webdsl.generated.templates.*;
import webdsl.generated.domain.*;
import java.io.PrintWriter;
import org.webdsl.lang.Environment;

@SuppressWarnings("all") public class genactionpredicate_page_admin_index__0Admin_MyArticle_Int_  implements org.webdsl.lang.IFunction
{ 
  public static Boolean genactionpredicate_page_admin_index__0Admin_MyArticle_Int_(webdsl.generated.domain.Admin genuniquevar0_, webdsl.generated.domain.MyArticle genuniquevar1_, Integer genuniquevar2_)
  { 
    return org.webdsl.tools.Utils.equal(genuniquevar0_, ((SecurityContext)ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
  }

  public Object apply(Object[] args)
  { 
    return genactionpredicate_page_admin_index__0Admin_MyArticle_Int_.genactionpredicate_page_admin_index__0Admin_MyArticle_Int_((webdsl.generated.domain.Admin)args[0], (webdsl.generated.domain.MyArticle)args[1], (Integer)args[2]);
  }
}