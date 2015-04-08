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

@SuppressWarnings("all") public class authenticateString_String_  implements org.webdsl.lang.IFunction
{ 
  public static Boolean authenticateString_String_(String credUsername_, String credPassword_)
  { 
    java.util.List<webdsl.generated.domain.Admin> tmpentitylist_ = webdsl.generated.domain.Admin._static_findByUsername_(credUsername_);
    if(!(org.webdsl.tools.Utils.equal(tmpentitylist_.size(), null) || org.webdsl.tools.Utils.equal(0, null)) && tmpentitylist_.size() > 0)
    { 
      java.util.Collection<? extends webdsl.generated.domain.Admin> exp0 = tmpentitylist_;
      java.util.ArrayList<webdsl.generated.domain.Admin> lst0 = new java.util.ArrayList<webdsl.generated.domain.Admin>(exp0);
      Object[] array0 = lst0.toArray();
      for(int i0 = 0; i0 < array0.length; i0++)
      { 
        webdsl.generated.domain.Admin tmpentity_ = (webdsl.generated.domain.Admin)array0[i0];
        Boolean allow_ = true;
        if(!org.webdsl.tools.Utils.equal(tmpentity_.getPassword(), credPassword_))
        { 
          allow_ = false;
        }
        else
        { }
        if(allow_)
        { 
          ((SecurityContext)ThreadLocalPage.getEnv().getSessionVariable("securityContext")).setPrincipal(tmpentity_);
          return true;
        }
        else
        { }
      }
    }
    else
    { }
    ((SecurityContext)ThreadLocalPage.getEnv().getSessionVariable("securityContext")).setPrincipal(null);
    return false;
  }

  public Object apply(Object[] args)
  { 
    return authenticateString_String_.authenticateString_String_((String)args[0], (String)args[1]);
  }
}