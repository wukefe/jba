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

@SuppressWarnings("all") public class genactionpredicate_page_admin_edit__0Admin_Int_  implements org.webdsl.lang.IFunction
{ 
  public static Boolean genactionpredicate_page_admin_edit__0Admin_Int_(webdsl.generated.domain.Admin genuniquevar4_, Integer genuniquevar5_)
  { 
    return org.webdsl.tools.Utils.equal(genuniquevar4_, ((SecurityContext)ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
  }

  public Object apply(Object[] args)
  { 
    return genactionpredicate_page_admin_edit__0Admin_Int_.genactionpredicate_page_admin_edit__0Admin_Int_((webdsl.generated.domain.Admin)args[0], (Integer)args[1]);
  }
}