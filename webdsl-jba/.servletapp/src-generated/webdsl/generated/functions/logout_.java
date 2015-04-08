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

@SuppressWarnings("all") public class logout_  implements org.webdsl.lang.IFunction
{ 
  public static void logout_()
  { 
    ((SecurityContext)ThreadLocalPage.getEnv().getSessionVariable("securityContext")).setPrincipal(null);
  }

  public Object apply(Object[] args)
  { 
    logout_.logout_();
    return null;
  }
}