package utils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;
import utils.*;
import webdsl.generated.templates.*;
import org.webdsl.lang.Environment;
import org.webdsl.WebDSLEntity;
import webdsl.generated.domain.RequestLogEntry;
import webdsl.generated.domain.SessionManager;

@SuppressWarnings({"unused", "unchecked", "rawtypes"}) public class DispatchServletHelper extends AbstractDispatchServletHelper 
{ 
  static
  { 
    utils.EntityReflectionHelper.init();
  }

  webdsl.generated.domain.SessionManager sessionManager = null;

  public webdsl.generated.domain.SessionManager getSessionManager()
  { 
    return sessionManager;
  }

  public boolean sessionHasChanges()
  { 
    return getSessionManager().getSessionHasChanges() != null && getSessionManager().getSessionHasChanges();
  }

  public void loadSessionManager(org.hibernate.Session hses)
  { 
    loadSessionManager(hses, null);
  }

  public void loadSessionManager(org.hibernate.Session hses, String[] joins)
  { 
    String basicCookieInfo = "WEBDSLSESSIONID=" + utils.UUIDUserType.persistUUIDString(sessionId) + "; HttpOnly; path=/";
    String setCookie = "SET-COOKIE";
    sessionManager = (SessionManager)hses.get(SessionManager.class, sessionId);
    if(sessionManager == null)
    { 
      sessionManager = new SessionManager();
      sessionManager.setId(sessionId);
      sessionManager.setLastUseNoEventsOrValidation(new java.util.Date());
      sessionManager.setVersion(1);
      sessionManager.setChanged();
      hses.save(sessionManager);
      response.setHeader(setCookie, basicCookieInfo);
    }
    if(sessionManager.getStayLoggedIn() != null && sessionManager.getStayLoggedIn())
    { 
      Date expdate = utils.DateType.addMinutes(new Date(), 10000);
      DateFormat df = new SimpleDateFormat("dd MMM yyyy kk:mm:ss z");
      df.setTimeZone(TimeZone.getTimeZone("GMT"));
      response.setHeader(setCookie, basicCookieInfo + "; expires=" + df.format(expdate));
    }
    webdsl.generated.functions.internalUpdateSessionManagerTimeout_.internalUpdateSessionManagerTimeout_();
  }

  public void storeOutgoingMessagesInHttpSession()
  { 
    if(sessionManager.getMessages().size() > 0)
    { 
      sessionManager.removeAllFromMessages();
    }
    if(outgoingSuccessMessages.size() > 0)
    { 
      for(String s : outgoingSuccessMessages)
      { 
        webdsl.generated.domain.SessionMessage m = webdsl.generated.domain.SessionMessage._static_createEmpty_();
        m.setVersion(1);
        m.setTextNoEventsOrValidation(s);
        sessionManager.getMessages().add(m);
      }
    }
  }

  public void retrieveIncomingMessagesFromHttpSession()
  { 
    for(webdsl.generated.domain.SessionMessage m : sessionManager.getMessages())
    { 
      incomingSuccessMessages.add(m.getText());
    }
  }

  RequestLogEntry requestLogEntry = null;

  public RequestLogEntry getRequestLogEntry()
  { 
    return requestLogEntry;
  }

  static
  { 
    try
    { 
      java.util.Properties props = new java.util.Properties();
      props.load(DispatchServletHelper.class.getResourceAsStream("/tomcat.properties"));
      httpsPort = Integer.parseInt(props.getProperty("webdsl.tomcat.https.port"));
      httpPort = Integer.parseInt(props.getProperty("webdsl.tomcat.http.port"));
    }
    catch(Exception ex)
    { 
      org.webdsl.logging.Logger.error("Could not read tomcat.properties file, custom http(s) port settings are ignored in the currently deployed application.");
    }
  }

  DispatchServlet servlet;

  public DispatchServletHelper (DispatchServlet servlet, boolean isPost, String contextPath) 
  { 
    this.servlet = servlet;
    this.isPostRequest = isPost;
    this.contextPath = contextPath;
  }

  DispatchServlet getServlet()
  { 
    return servlet;
  }

  static
  { 
    { 
      String[] s = {"admin", "len"};
      Boolean[] b = {false, false};
      pages.put("table_content", new utils.PageDispatch(Table_contentPage.class, s, b, false));
    }
    { 
      String[] s = {};
      Boolean[] b = {};
      pages.put("root", new utils.PageDispatch(RootPage.class, s, b, false));
    }
    { 
      String[] s = {"u"};
      Boolean[] b = {false};
      pages.put("page_view", new utils.PageDispatch(Page_viewPage.class, s, b, false));
    }
    { 
      String[] s = {};
      Boolean[] b = {};
      pages.put("page_login", new utils.PageDispatch(Page_loginPage.class, s, b, false));
    }
    { 
      String[] s = {"admin"};
      Boolean[] b = {false};
      pages.put("page_admin_welcome", new utils.PageDispatch(Page_admin_welcomePage.class, s, b, false));
    }
    { 
      String[] s = {"admin", "indx"};
      Boolean[] b = {false, false};
      pages.put("page_admin_index", new utils.PageDispatch(Page_admin_indexPage.class, s, b, false));
    }
    { 
      String[] s = {"admin", "count"};
      Boolean[] b = {false, false};
      pages.put("page_admin_edit", new utils.PageDispatch(Page_admin_editPage.class, s, b, false));
    }
    { 
      String[] s = {};
      Boolean[] b = {};
      pages.put("page_about", new utils.PageDispatch(Page_aboutPage.class, s, b, false));
    }
    { 
      String[] s = {};
      Boolean[] b = {};
      pages.put("pagenotfound", new utils.PageDispatch(PagenotfoundPage.class, s, b, false));
    }
    { 
      String[] s = {};
      Boolean[] b = {};
      pages.put("accessDenied", new utils.PageDispatch(AccessDeniedPage.class, s, b, false));
    }
    { 
      String[] s = {"list"};
      Boolean[] b = {false};
      pages.put("showMessagesList_String_", new utils.PageDispatch(ShowMessagesList_String_Page.class, s, b, true));
    }
    { 
      String[] s = {};
      Boolean[] b = {};
      pages.put("noMessages", new utils.PageDispatch(NoMessagesPage.class, s, b, true));
    }
  }

  public void storeRequestLogEntry(org.hibernate.Session hibSession)
  { 
    hibSession.saveOrUpdate(requestLogEntry);
  }

  public void setEndTimeAndStoreRequestLog(org.hibernate.Session hibSession)
  { 
    if(utils.BuildProperties.isRequestLoggingEnabled())
    { 
      requestLogEntry.setEndNoEventsOrValidation(new java.util.Date());
      storeRequestLogEntry(hibSession);
    }
  }

  public void doServe(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  { 
    requestLogEntry = RequestLogEntry._static_createEmpty_();
    requestLogEntry.setStartNoEventsOrValidation(new java.util.Date());
    if(request.getCookies() != null)
    { 
      for(Cookie c : request.getCookies())
      { 
        if("WEBDSLSESSIONID".equals(c.getName()))
        { 
          try
          { 
            sessionId = utils.UUIDUserType.retrieveUUID(c.getValue());
          }
          catch(Exception ex)
          { 
            org.webdsl.logging.Logger.error("Could not create UUID from String, new session will be created");
          }
        }
      }
    }
    if(sessionId == null)
    { 
      sessionId = java.util.UUID.randomUUID();
    }
    this.request = request;
    this.response = response;
    response.setCharacterEncoding("UTF-8");
    ThreadLocalServlet.set(this);
    boolean showerrorpage = false;
    boolean showvalidationerror = false;
    MultipleValidationExceptions validationExceptions = null;
    try
    { 
      String url = request.getRequestURL().toString();
      this.baseUrl = url.substring(0, url.length() - request.getRequestURI().length()) + request.getContextPath() + "/";
      String[] req = url.split("/");
      int count;
      boolean first = false;
      if(ThreadLocalServlet.getContextPath().length() > 1)
      { 
        for(count = 0; count < req.length; count++)
        { 
          if(req[count].equals("web-dsl-simple"))
          { 
            count++;
            break;
          }
        }
      }
      else
      { 
        count = 3;
      }
      String[] argnames;
      String[] args;
      urlComponents = new ArrayList<String>();
      if(count > req.length - 1)
      { 
        requested = "root";
        args = new String[0];
        urlComponents.add("root");
      }
      else
      { 
        requested = req[count];
        args = java.util.Arrays.copyOfRange(req, count + 1, req.length);
        urlComponents.add(requested);
        urlComponents.addAll(java.util.Arrays.asList(args));
      }
      List<String> customRoutingList = Routing.processRequest(urlComponents);
      if(customRoutingList != null)
      { 
        requested = customRoutingList.get(0);
        customRoutingList.remove(0);
        args = new String[customRoutingList.size()];
        customRoutingList.toArray(args);
      }
      fileUploads = new HashMap<String, List<utils.File>>();
      parammap = new HashMap<String, String>();
      parammapvalues = new HashMap<String, List<String>>();
      utils.PageDispatch pd = pages.get(requested);
      if(pd == null)
      { 
        requested = "pagenotfound";
        pd = pages.get(requested);
        pc = pd.getPageClass();
      }
      else
      { 
        pc = pd.getPageClass();
      }
      argnames = pages.get(requested).getArgs();
      int count2 = 0;
      for(count2 = 0; count2 < args.length; count2++)
      { 
        if(count2 >= argnames.length)
        { }
        else
        { 
          String decoded = utils.URLFilter.unfilter(args[count2]);
          parammap.put(argnames[count2], decoded);
          addToValues(argnames[count2], decoded, parammapvalues);
        }
      }
      for(java.util.Enumeration en = request.getParameterNames(); en.hasMoreElements(); )
      { 
        String parameterName = (String)en.nextElement();
        parammap.put(parameterName, paramDecode(request, request.getParameter(parameterName)));
        for(String paramval : request.getParameterValues(parameterName))
        { 
          addToValues(parameterName, paramDecode(request, paramval), parammapvalues);
        }
      }
      if(count2 < argnames.length)
      { 
        if(!isPostRequest && parammap.get("action-call-with-get-request-type") == null)
        { 
          if(unspecifiedArgumentsContainEntityTypes(argnames, count2))
          { 
            throw new utils.TooFewArgumentsException();
          }
        }
      }
      boolean isMultipart = org.apache.commons.fileupload.servlet.ServletFileUpload.isMultipartContent(request);
      if(isMultipart)
      { 
        org.apache.commons.fileupload.FileItemFactory factory = new org.apache.commons.fileupload.disk.DiskFileItemFactory();
        org.apache.commons.fileupload.servlet.ServletFileUpload upload = new org.apache.commons.fileupload.servlet.ServletFileUpload(factory);
        try
        { 
          java.util.List<org.apache.commons.fileupload.FileItem> items = (java.util.List<org.apache.commons.fileupload.FileItem>)upload.parseRequest(request);
          java.util.Iterator<org.apache.commons.fileupload.FileItem> iter = items.iterator();
          while(iter.hasNext())
          { 
            org.apache.commons.fileupload.FileItem item = (org.apache.commons.fileupload.FileItem)iter.next();
            if(item.isFormField())
            { 
              String name = item.getFieldName();
              String value = item.getString();
              parammap.put(name, paramDecode(request, value));
              addToValues(name, paramDecode(request, value), parammapvalues);
            }
            else
            { 
              String fieldName = item.getFieldName();
              String fileName = item.getName();
              String contentType = item.getContentType();
              boolean isInMemory = item.isInMemory();
              long sizeInBytes = item.getSize();
              utils.File temp = new utils.File();
              temp.setFileName(fileName);
              temp.setContentType(contentType);
              temp.setContentStream(item.getInputStream());
              List<utils.File> files = fileUploads.get(fieldName);
              if(files == null)
              { 
                files = new ArrayList<utils.File>();
                fileUploads.put(fieldName, files);
              }
              files.add(temp);
            }
          }
        }
        catch(org.apache.commons.fileupload.FileUploadException ex)
        { 
          org.webdsl.logging.Logger.error("exception occured in file upload handling DispatchServlet");
          org.webdsl.logging.Logger.error("EXCEPTION", ex);
        }
      }
      if(utils.BuildProperties.isRequestLoggingEnabled())
      { 
        requestLogEntry.setRequestedURLNoEventsOrValidation(request.getRequestURL().toString());
        requestLogEntry.setNameNoEventsOrValidation(requested);
        requestLogEntry.setClientIPNoEventsOrValidation(request.getRemoteAddr());
        requestLogEntry.setClientPortNoEventsOrValidation(request.getRemotePort());
        if(this.isPostRequest)
        { 
          requestLogEntry.setMethodNoEventsOrValidation("POST");
        }
        else
        { 
          requestLogEntry.setMethodNoEventsOrValidation("GET");
        }
        requestLogEntry.setUserAgentNoEventsOrValidation(request.getHeader("User-Agent"));
        requestLogEntry.setRefererNoEventsOrValidation(request.getHeader("Referer"));
      }
      showerrorpage = !handlePage();
    }
    catch(utils.TooFewArgumentsException ex)
    { 
      showerrorpage = true;
    }
    catch(utils.AjaxWithGetRequestException ex)
    { 
      showerrorpage = true;
    }
    catch(utils.MultipleValidationExceptions ex)
    { 
      showvalidationerror = true;
      validationExceptions = ex;
    }
    catch(Exception ex)
    { 
      org.webdsl.logging.Logger.error("Exception in dispatch servlet: " + ex.getMessage());
      org.webdsl.logging.Logger.error("EXCEPTION", ex);
      showerrorpage = true;
    }
    if(showerrorpage)
    { 
      if(parammap.get("__ajax_runtime_request__") == null)
      { 
        pc = pages.get("pagenotfound").getPageClass();
        disablePageCache = true;
        if(!handlePage())
        { 
          response.setStatus(404);
          response.getWriter().write("<h3>404 Not Found</h3>");
        }
      }
    }
    else
      if(showvalidationerror)
      { 
        if(parammap.get("__ajax_runtime_request__") == null)
        { 
          response.setStatus(500);
          response.getWriter().write(utils.ValidationErrorPopupCreator.getErrorPopup(validationExceptions));
        }
      }
    cleanupThreadLocals();
  }

  private boolean disablePageCache = false;

  private boolean handlePage()
  { 
    if(pc != null)
    { 
      try
      { 
        PageServlet pageservlet = (PageServlet)pc.newInstance();
        if(disablePageCache)
        { 
          pageservlet.isPageCacheDisabled = true;
        }
        pageservlet.serve(request, response, parammap, parammapvalues, fileUploads);
        if(parammap.get("show_build_id") != null)
        { 
          try
          { 
            response.getWriter().write("build-id:" + "3e0d1f12-41b6-4669-8a56-283c5f76e32f");
          }
          catch(IOException ioe)
          { 
            org.webdsl.logging.Logger.error("EXCEPTION", ioe);
          }
        }
      }
      catch(IllegalAccessException iae)
      { 
        org.webdsl.logging.Logger.error("Problem in dispatch servlet page lookup: " + iae.getMessage());
        org.webdsl.logging.Logger.error("EXCEPTION", iae);
        return false;
      }
      catch(InstantiationException ie)
      { 
        org.webdsl.logging.Logger.error("Problem in dispatch servlet page lookup: " + ie.getMessage());
        org.webdsl.logging.Logger.error("EXCEPTION", ie);
        return false;
      }
      catch(MultipleValidationExceptions mve)
      { 
        throw mve;
      }
      catch(RuntimeException re)
      { 
        return false;
      }
    }
    else
    { 
      return false;
    }
    return true;
  }
}