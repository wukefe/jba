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

@SuppressWarnings("all") public class authenticaString_String_Admin_  implements org.webdsl.lang.IFunction
{ 
  public static Boolean authenticaString_String_Admin_(String name_, String pass_, webdsl.generated.domain.Admin u_)
  { 
    if(org.webdsl.tools.Utils.equal(name_, u_.getUsername()) && org.webdsl.tools.Utils.equal(u_.getPassword(), pass_))
    { 
      ((SecurityContext)ThreadLocalPage.getEnv().getSessionVariable("securityContext")).setPrincipal(u_);
      return true;
    }
    else
    { 
      return false;
    }
  }

  public Object apply(Object[] args)
  { 
    return authenticaString_String_Admin_.authenticaString_String_Admin_((String)args[0], (String)args[1], (webdsl.generated.domain.Admin)args[2]);
  }
}