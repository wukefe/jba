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

@SuppressWarnings("all") public class genactionpredicate_table_content__0Admin_  implements org.webdsl.lang.IFunction
{ 
  public static Boolean genactionpredicate_table_content__0Admin_(webdsl.generated.domain.Admin genuniquevar2_)
  { 
    return org.webdsl.tools.Utils.equal(genuniquevar2_, ((SecurityContext)ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
  }

  public Object apply(Object[] args)
  { 
    return genactionpredicate_table_content__0Admin_.genactionpredicate_table_content__0Admin_((webdsl.generated.domain.Admin)args[0]);
  }
}