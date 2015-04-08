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

@SuppressWarnings("all") public class loggedIn_  implements org.webdsl.lang.IFunction
{ 
  public static Boolean loggedIn_()
  { 
    return !org.webdsl.tools.Utils.equal(((SecurityContext)ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal(), null);
  }

  public Object apply(Object[] args)
  { 
    return loggedIn_.loggedIn_();
  }
}