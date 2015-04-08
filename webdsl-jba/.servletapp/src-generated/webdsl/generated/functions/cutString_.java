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

@SuppressWarnings("all") public class cutString_  implements org.webdsl.lang.IFunction
{ 
  public static String cutString_(String s_)
  { 
    if(!(org.webdsl.tools.Utils.equal(s_.length(), null) || org.webdsl.tools.Utils.equal(20, null)) && s_.length() > 20)
    { 
      return s_;
    }
    else
    { }
    return s_;
  }

  public Object apply(Object[] args)
  { 
    return cutString_.cutString_((String)args[0]);
  }
}