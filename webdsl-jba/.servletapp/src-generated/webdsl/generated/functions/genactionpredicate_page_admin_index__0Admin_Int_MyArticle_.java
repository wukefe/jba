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

@SuppressWarnings("all") public class genactionpredicate_page_admin_index__0Admin_Int_MyArticle_  implements org.webdsl.lang.IFunction
{ 
  public static Boolean genactionpredicate_page_admin_index__0Admin_Int_MyArticle_(webdsl.generated.domain.Admin genuniquevar1_, Integer genuniquevar2_, webdsl.generated.domain.MyArticle genuniquevar3_)
  { 
    return org.webdsl.tools.Utils.equal(genuniquevar1_, ((SecurityContext)ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
  }

  public Object apply(Object[] args)
  { 
    return genactionpredicate_page_admin_index__0Admin_Int_MyArticle_.genactionpredicate_page_admin_index__0Admin_Int_MyArticle_((webdsl.generated.domain.Admin)args[0], (Integer)args[1], (webdsl.generated.domain.MyArticle)args[2]);
  }
}