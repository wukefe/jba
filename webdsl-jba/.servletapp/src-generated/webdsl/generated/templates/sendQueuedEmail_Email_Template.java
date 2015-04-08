package webdsl.generated.templates;

import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.apache.commons.lang3.ArrayUtils;
import utils.*;
import org.webdsl.lang.Environment;
import webdsl.generated.domain.*;
import webdsl.generated.actions.*;

@SuppressWarnings("unused") public class sendQueuedEmail_Email_Template extends EmailServlet 
{ 
  public String getTemplateClassName()
  { 
    return "sendQueuedEmail_Email_Template";
  }

  protected void storeArguments(Object[] args)
  { 
    q_ = (webdsl.generated.domain.QueuedEmail)args[0];
  }

  public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv)
  { }

  public static void loadRefArgClasses(Map<String, Class<?>> refargclasses)
  { }

  public static void loadEmailAndTemplateMap(org.webdsl.lang.Environment staticEnv, Map<String, Class<?>> emails)
  { 
    emails.put("sendQueuedEmail", sendQueuedEmail_Email_Template.class);
    loadLiftedTemplateMap(staticEnv);
  }

  boolean validated = true;

  protected java.util.Map<String, Object> getTemplatecalls()
  { 
    org.webdsl.logging.Logger.error("Internal error: getTemplatecalls() should not be called in email render context");
    return null;
  }

  protected boolean onlyPerformingRenderPhase()
  { 
    return true;
  }

  PrintWriter out;

  private org.hibernate.Session hibSession;

  private HttpServletRequest request;

  private HttpServletResponse response;

  private boolean initialized = false;

  public Map<String, String> attrs = null;

  public java.util.Deque<String> templateContext = new java.util.ArrayDeque<String>();

  public String getTemplateContextString()
  { 
    return "email";
  }

  public String getElementsContext()
  { 
    return "sendQueuedEmail";
  }

  HttpSession session;

  public void render(Object[] args, Environment env)
  { 
    threadLocalPageCached = ThreadLocalPage.get();
    if(!initialized)
    { 
      initialized = true;
      this.request = threadLocalPageCached.getRequest();
      this.response = threadLocalPageCached.getResponse();
      this.hibSession = HibernateUtil.getCurrentSession();
      this.env = env;
      storeArguments(args);
      initialize();
      initActions();
    }
    this.out = new java.io.PrintWriter(body);
    ThreadLocalOut.push(this.out);
    ThreadLocalEmailContext.set(this);
    renderInternal();
    ThreadLocalEmailContext.set(null);
    ThreadLocalOut.popChecked(this.out);
  }

  private webdsl.generated.domain.SecurityContext securityContextCache = null;

  protected webdsl.generated.domain.SecurityContext getCachedSessionSecurityContext()
  { 
    if(securityContextCache == null)
    { 
      securityContextCache = (webdsl.generated.domain.SecurityContext)env.getSessionVariable("securityContext");
    }
    return securityContextCache;
  }

  private webdsl.generated.domain.QueuedEmail q_ = null;

  public void setQ_(webdsl.generated.domain.QueuedEmail q_)
  { 
    this.q_ = q_;
  }

  public webdsl.generated.domain.QueuedEmail getQ_()
  { 
    return q_;
  }

  protected void handlePhase(int phase)
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    PrintWriter out = ThreadLocalOut.peek();
    if(RENDER_PHASE == phase)
    { 
      this.receivers = q_.getTo();
    }
    if(RENDER_PHASE == phase)
    { 
      this.sender = q_.getFrom();
    }
    if(RENDER_PHASE == phase)
    { 
      this.subject = q_.getSubject();
    }
    if(RENDER_PHASE == phase)
    { 
      this.cc = q_.getCc();
    }
    if(RENDER_PHASE == phase)
    { 
      this.bcc = q_.getBcc();
    }
    if(RENDER_PHASE == phase)
    { 
      this.replyTo = q_.getReplyTo();
    }
    if(RENDER_PHASE == phase)
    { 
      this.unsubscribeAddress = q_.getUnsubscribeAddress();
    }
    if(RENDER_PHASE == phase)
    { 
      try
      { 
        utils.RenderUtils.printPageString(q_.getBody(), out, true);
      }
      catch(NullPointerException npe)
      { 
        utils.Warning.warn("null reference prevented rendering of template element");
      }
      catch(IndexOutOfBoundsException ine)
      { 
        utils.Warning.warn("index out of bounds prevented rendering of template element");
      }
    }
  }
}