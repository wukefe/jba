package utils;

import java.io.*;
import java.util.HashMap;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import utils.*;
import webdsl.generated.templates.*;
import webdsl.generated.domain.*;
import org.webdsl.lang.Environment;

@SuppressWarnings({"unused", "unchecked"}) public class GlobalVariables  
{ 
  private static org.hibernate.Session hibSession;

  private static Environment env;

  private static java.io.PrintWriter out = null;

  static boolean applicationContextPropertyExists(String name, List<ApplicationContextProperty> res)
  { 
    for(ApplicationContextProperty a : res)
    { 
      if(a.getName().equals(name))
        return true;
    }
    return false;
  }

  public static boolean globalvarsChecked = false;

  public static void forceLoad()
  { 
    globalvarsChecked = false;
    load();
  }

  public static void load()
  { 
    if(!globalvarsChecked)
    { 
      out = new java.io.PrintWriter(System.out);
      ThreadLocalOut.push(out);
      org.hibernate.Session hibSession = utils.HibernateUtil.getCurrentSession();
      AbstractPageServlet ps = ThreadLocalPage.get();
      boolean pageServletIsNotSet = ThreadLocalPage.get() == null;
      if(pageServletIsNotSet)
      { 
        ps = new GlobalsPageServlet();
        ThreadLocalPage.set(ps);
      }
      env = ps.envGlobalAndSession;
      org.hibernate.Query q = utils.HibernateUtil.getCurrentSession().createQuery("from ApplicationContextProperty");
      List<ApplicationContextProperty> res = q.list();
      org.hibernate.Query q2 = utils.HibernateUtil.getCurrentSession().createQuery("from ApplicationContextProperty");
      List<ApplicationContextProperty> results = q2.list();
      for(ApplicationContextProperty a : results)
      { }
      hibSession = null;
      if(pageServletIsNotSet)
      { 
        ThreadLocalPage.set(null);
      }
      ThreadLocalOut.popChecked(out);
      out = null;
      globalvarsChecked = true;
    }
  }

  public static boolean initGlobalVars(Environment env, org.hibernate.Session hibSession)
  { 
    return true;
  }
}