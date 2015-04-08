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

@SuppressWarnings("all") public class genactionpredicate_page_admin_welcome__0Admin_  implements org.webdsl.lang.IFunction
{ 
  public static Boolean genactionpredicate_page_admin_welcome__0Admin_(webdsl.generated.domain.Admin genuniquevar1_)
  { 
    return org.webdsl.tools.Utils.equal(genuniquevar1_, ((SecurityContext)ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
  }

  public Object apply(Object[] args)
  { 
    return genactionpredicate_page_admin_welcome__0Admin_.genactionpredicate_page_admin_welcome__0Admin_((webdsl.generated.domain.Admin)args[0]);
  }
}