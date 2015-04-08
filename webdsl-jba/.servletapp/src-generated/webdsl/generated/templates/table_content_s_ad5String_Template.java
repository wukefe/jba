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
import org.webdsl.tools.Utils;
import org.webdsl.lang.Environment;
import org.webdsl.WebDSLEntity;
import webdsl.generated.domain.*;
import webdsl.generated.actions.*;

public @SuppressWarnings("all") class table_content_s_ad5String_Template extends TemplateServlet 
{ 
  private webdsl.generated.domain.SecurityContext securityContextCache = null;

  protected webdsl.generated.domain.SecurityContext getCachedSessionSecurityContext()
  { 
    if(securityContextCache == null)
    { 
      securityContextCache = (webdsl.generated.domain.SecurityContext)env.getSessionVariable("securityContext");
    }
    return securityContextCache;
  }

  public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    table_content_s_ad5String_s_ad0String_String_Template.loadTemplateMap(staticEnv);
  }

  public static void loadRefArgClasses(Map<String, Class<?>> refargclasses)
  { 
    table_content_s_ad5String_s_ad0String_String_Template.loadRefArgClasses(refargclasses);
  }

  public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv)
  { 
    loadTemplateMap(null, staticEnv);
    return staticEnv;
  }

  public static Environment loadTemplateMap(String keyOverwrite, org.webdsl.lang.Environment staticEnv)
  { 
    staticEnv.putTemplate(keyOverwrite == null ? "table_content_s_ad5String" : keyOverwrite, table_content_s_ad5String_Template.class);
    loadLiftedTemplateMap(staticEnv);
    return staticEnv;
  }

  protected void storeArguments(Object[] args)
  { 
    table_content_ia50_ = (String)args[0];
  }

  public String getUniqueName()
  { 
    return "table_content_s_ad5String";
  }

  public String getStateEncodingOfArgument()
  { 
    return "";
  }

  public String getTemplateSignature()
  { 
    return "template table_content_s_ad5(table_content_ia50 : String)";
  }

  public String getElementsContext()
  { 
    if(calledName == null)
    { 
      return "s";
    }
    else
    { 
      return calledName;
    }
  }

  private String table_content_ia50_ = "";

  public void setTable_content_ia50_(String table_content_ia50_)
  { 
    this.table_content_ia50_ = table_content_ia50_;
  }

  public String getTable_content_ia50_()
  { 
    return table_content_ia50_;
  }

  protected void handlePhase(int phase)
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    PrintWriter out = ThreadLocalOut.peek();
    if(webdsl.generated.functions.genactioncombined_table_content_ia50_.genactioncombined_table_content_ia50_())
    { 
      try
      { 
        handleTemplateCall(phase, inForLoop, forelementcounter, "tcall9", "wrapsubmitString", env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"table_content_ia5_" + webdsl.generated.functions.getPage_.getPage_().getTemplateContext().getTemplateContextString()}, "wrapsubmitString"), new Environment(env).putWithcall("s", new utils.TemplateCall("table_content_s_ad5String_s_ad0String_String", getElementsContext(), new Object[]{table_content_ia50_}, attrs)), "wrapsubmitString", TemplateCall.EmptyAttrs);
      }
      catch(RuntimeException ex)
      { 
        printTemplateCallException(ex, "wrapsubmitString(\"table_content_ia5\" + getPage().getTemplateContext().getTemplateContextString()) at unknown context");
      }
    }
  }
}