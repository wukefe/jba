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

@SuppressWarnings("all") public class genpagepredicate_page_admin_index0Admin_  implements org.webdsl.lang.IFunction
{ 
  public static Boolean genpagepredicate_page_admin_index0Admin_(webdsl.generated.domain.Admin admin_)
  { 
    return org.webdsl.tools.Utils.equal(admin_, ((SecurityContext)ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
  }

  public Object apply(Object[] args)
  { 
    return genpagepredicate_page_admin_index0Admin_.genpagepredicate_page_admin_index0Admin_((webdsl.generated.domain.Admin)args[0]);
  }
}