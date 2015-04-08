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

@SuppressWarnings({"unused", "unchecked"}) public class GlobalInit  
{ 
  private static org.hibernate.Session hibSession;

  static boolean applicationContextPropertyExists(String name, List<ApplicationContextProperty> res)
  { 
    for(ApplicationContextProperty a : res)
    { 
      if(a.getName().equals(name))
        return true;
    }
    return false;
  }

  static java.io.PrintWriter out;

  private static Environment env;

  public static boolean initChecked = false;

  public static void forceLoad()
  { 
    initChecked = false;
    load();
  }

  public static void load()
  { 
    if(!initChecked)
    { 
      hibSession = utils.HibernateUtil.getCurrentSession();
      java.io.PrintWriter out = new java.io.PrintWriter(System.out);
      ThreadLocalOut.push(out);
      AbstractPageServlet ps = ThreadLocalPage.get();
      boolean pageServletIsNotSet = ThreadLocalPage.get() == null;
      if(pageServletIsNotSet)
      { 
        ps = new GlobalsPageServlet();
        ThreadLocalPage.set(ps);
      }
      env = ps.envGlobalAndSession;
      org.hibernate.Query q = utils.HibernateUtil.getCurrentSession().createQuery("from ApplicationContextProperty where name = '__global__init__'");
      List<ApplicationContextProperty> res = q.list();
      if(res.isEmpty())
      { 
        initialize();
        initActions();
        ApplicationContextProperty flag = new ApplicationContextProperty();
        flag.setName("__global__init__");
        utils.HibernateUtil.getCurrentSession().save(flag);
      }
      utils.HibernateUtil.getCurrentSession().flush();
      ThreadLocalOut.popChecked(out);
      out = null;
      hibSession = null;
      if(pageServletIsNotSet)
      { 
        ThreadLocalPage.set(null);
      }
      initChecked = true;
    }
  }

  public static void _initAction_0()
  { 
    webdsl.generated.domain.Admin admin_ = (webdsl.generated.domain.Admin)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.Admin)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.Admin)org.webdsl.tools.Utils.cast(webdsl.generated.domain.Admin._static_createEmpty_().Admin$this_(), webdsl.generated.domain.Admin.class)).setPassword("Admin"), webdsl.generated.domain.Admin.class)).setUsername("Admin"), webdsl.generated.domain.Admin.class);
    admin_.save("Admin");
  }

  public static void initActions()
  { 
    _initAction_0();
  }

  protected static void initialize()
  { }
}