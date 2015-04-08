package webdsl.generated.templates;

import utils.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.apache.commons.lang3.ArrayUtils;
import java.util.concurrent.atomic.AtomicInteger;
import org.webdsl.lang.Environment;
import utils.TemplateCall;
import webdsl.generated.domain.*;

public @SuppressWarnings("all") class Page_admin_editPage extends PageServlet 
{ 
  public String getPageName()
  { 
    return "page_admin_edit";
  }

  public String getHiddenParams()
  { 
    java.lang.StringBuilder hiddens = new java.lang.StringBuilder(512);
    hiddenParams(hiddens);
    return hiddens.toString();
  }

  public String getUrlQueryParams()
  { 
    java.lang.StringBuilder params = new java.lang.StringBuilder(512);
    urlQueryParams(params);
    return params.toString();
  }

  public String getHiddenPostParamsJson()
  { 
    java.lang.StringBuilder hiddens = new java.lang.StringBuilder(512);
    hiddenPostParamsJson(hiddens);
    return hiddens.toString();
  }

  protected void initVarsAndArgs()
  { 
    GlobalVariables.initGlobalVars(envGlobalAndSession, utils.HibernateUtil.getCurrentSession());
    initialize();
    conversion();
    loadArguments();
    Object[] args = {admin_, count_};
    this.args = args;
  }

  protected void initTemplateClass()
  { 
    templateservlet = new page_admin_edit_Template();
  }

  protected void redirectHttpHttps()
  { }

  protected void addPrincipalToRequestLog(org.webdsl.WebDSLEntity rle)
  { 
    ((webdsl.generated.domain.RequestLogEntry)rle).setPrincipalNoEventsOrValidation(((webdsl.generated.domain.SecurityContext)envGlobalAndSession.getSessionVariable("securityContext")).getPrincipal());
  }

  protected org.webdsl.WebDSLEntity getRequestLogEntry()
  { 
    return ((utils.DispatchServletHelper)ThreadLocalServlet.get()).getRequestLogEntry();
  }

  protected void addLogSqlToSessionMessages()
  { 
    if(this.isLogSqlEnabled())
    { 
      if(logSqlCheckAccess())
      { 
        ((webdsl.generated.domain.SessionManager)ThreadLocalServlet.get().getSessionManager()).setLogsqlMessageNoEventsOrValidation(utils.HibernateLog.printHibernateLog(this, "action"));
      }
      else
      { 
        ((webdsl.generated.domain.SessionManager)ThreadLocalServlet.get().getSessionManager()).setLogsqlMessageNoEventsOrValidation("Access to SQL logs was denied.");
      }
    }
  }

  protected void initializeBasics(AbstractPageServlet ps, Object[] args)
  { 
    initTemplateClass();
    this.envGlobalAndSession = ps.envGlobalAndSession;
    this.request = ps.getRequest();
    this.response = ps.getResponse();
    this.parammap = ps.getParammap();
    this.parammapvalues = ps.getParammapvalues();
    this.fileUploads = ps.getFileUploads();
    Session hibSession = utils.HibernateUtil.getCurrentSession();
    ThreadLocalServlet.get().loadSessionManager(utils.HibernateUtil.getCurrentSession());
    admin_ = (webdsl.generated.domain.Admin)args[0];
    count_ = (Integer)args[1];
    initialize();
  }

  protected String[] getUsedSessionEntityJoins()
  { 
    return null;
  }

  protected void renderDebugJsVar(java.io.PrintWriter sout)
  { 
    sout.println("<script type=\"text/javascript\">var show_webdsl_debug=false;</script>");
  }

  protected boolean isTemplate()
  { 
    return false;
  }

  public String getUniqueName()
  { 
    return "page_admin_edit";
  }

  protected void increaseStatReadOnly()
  { 
    renderReadOnly.incrementAndGet();
  }

  protected void increaseStatReadOnlyFromCache()
  { 
    renderReadOnlyFromCache.incrementAndGet();
  }

  protected void increaseStatUpdate()
  { 
    renderWithUpdates.incrementAndGet();
  }

  protected void increaseStatActionFail()
  { 
    actionFailed.incrementAndGet();
  }

  protected void increaseStatActionReadOnly()
  { 
    actionSuccessReadOnly.incrementAndGet();
  }

  protected void increaseStatActionUpdate()
  { 
    actionSuccessWithUpdates.incrementAndGet();
  }

  public static AtomicInteger renderReadOnly = new AtomicInteger();

  public static AtomicInteger renderReadOnlyFromCache = new AtomicInteger();

  public static AtomicInteger renderWithUpdates = new AtomicInteger();

  public static AtomicInteger actionFailed = new AtomicInteger();

  public static AtomicInteger actionSuccessReadOnly = new AtomicInteger();

  public static AtomicInteger actionSuccessWithUpdates = new AtomicInteger();

  private String admin__id;

  public void setAdmin__id(String v)
  { 
    this.admin__id = v;
  }

  public String getAdmin__id()
  { 
    return this.admin__id;
  }

  private webdsl.generated.domain.Admin admin_;

  public void setAdmin_(webdsl.generated.domain.Admin admin_)
  { 
    this.admin_ = admin_;
  }

  public webdsl.generated.domain.Admin getAdmin_()
  { 
    return admin_;
  }

  private Integer count_;

  public void setCount_(Integer count_)
  { 
    this.count_ = count_;
  }

  public Integer getCount_()
  { 
    return count_;
  }

  protected void initialize()
  { 
    webdsl.generated.domain.SessionManager sesm$securityContext = (webdsl.generated.domain.SessionManager)ThreadLocalServlet.get().getSessionManager();
    if(sesm$securityContext.getSecurityContext() == null)
    { 
      webdsl.generated.domain.SecurityContext ent = webdsl.generated.domain.SecurityContext._static_createEmpty_();
      ent.SecurityContext_();
      sesm$securityContext.setSecurityContextNoEventsOrValidation(ent);
      utils.HibernateUtil.getCurrentSession().save(sesm$securityContext.getSecurityContext());
    }
    envGlobalAndSession.putSessionVariable("securityContext", sesm$securityContext.getSecurityContext());
  }

  protected void storeSessionEntities()
  { }

  public void hiddenPostParamsJson(java.lang.StringBuilder combinedparams)
  { 
    combinedparams.append("{name:\"").append("admin").append("\", value:\"").append(org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(admin_.getNaturalId().toString())).append("\"},");
    combinedparams.append("{name:\"").append("count").append("\", value:\"").append(HTMLFilter.filterEcmaWithinHTML(count_.toString())).append("\"},");
  }

  public void urlQueryParams(java.lang.StringBuilder combinedparams)
  { 
    combinedparams.append("admin").append("=").append(utils.HTMLFilter.filter(admin_.getNaturalId().toString())).append("&");
    combinedparams.append("count").append("=").append(utils.HTMLFilter.filter(utils.URLFilter.filter(count_.toString()))).append("&");
  }

  public void hiddenParams(java.lang.StringBuilder combinedparams)
  { 
    combinedparams.append("<input type=\"hidden\" name=\"").append("admin").append("\" value=\"").append(utils.HTMLFilter.filter(admin_.getNaturalId().toString())).append("\" />");
    combinedparams.append("<input type=\"hidden\" name=\"").append("count").append("\" value=\"").append(utils.HTMLFilter.filter(count_.toString())).append("\" />");
  }

  protected void loadArguments()
  { 
    if(admin__id != null)
    { 
      admin_ = (webdsl.generated.domain.Admin)utils.HibernateUtil.getCurrentSession().load(webdsl.generated.domain.Admin.class, java.util.UUID.fromString(admin__id));
    }
    if(count_ == null)
    { 
      count_ = 0;
    }
  }

  protected void conversion()
  { 
    if(parammap.get("admin") != null)
    { 
      admin__id = parammap.get("admin");
    }
    if(parammap.get("count") != null)
    { 
      try
      { 
        count_ = Integer.valueOf(parammap.get("count"));
      }
      catch(NumberFormatException nfe)
      { 
        org.webdsl.logging.Logger.error(nfe.getMessage());
      }
    }
  }
}