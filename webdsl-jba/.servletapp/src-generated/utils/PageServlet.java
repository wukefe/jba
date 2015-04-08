package utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import webdsl.generated.templates.*;
import webdsl.generated.domain.*;
import org.webdsl.WebDSLEntity;
import org.webdsl.lang.Environment;
import org.hibernate.Session;

public abstract @SuppressWarnings("unused") class PageServlet extends AbstractPageServlet 
{ 
  protected void renderIncomingSuccessMessages()
  { 
    if(!ThreadLocalServlet.get().getIncomingSuccessMessages().isEmpty())
    { 
      String ident = "";
      String forelementcounter = "0";
      int fallbackcounter = 0;
      boolean inForLoop = false;
      int forLoopCounter = 0;
      PrintWriter out = ThreadLocalOut.peek();
      Class<?> ts = envGlobalAndSession.getTemplate("messages");
      try
      { 
        ((TemplateServlet)ts.newInstance()).render(null, new Object[0], envGlobalAndSession, null);
      }
      catch(Exception ie)
      { 
        org.webdsl.logging.Logger.error(ie);
      }
    }
  }

  protected void renderLogSqlMessage()
  { 
    String logsql = ((webdsl.generated.domain.SessionManager)ThreadLocalServlet.get().getSessionManager()).getLogsqlMessage();
    if(logsql != null && !logsql.equals(""))
    { 
      ((webdsl.generated.domain.SessionManager)ThreadLocalServlet.get().getSessionManager()).setLogsqlMessageNoEventsOrValidation(null);
      java.io.PrintWriter out = ThreadLocalOut.peek();
      out.print("<div class=\"logsql\">");
      out.print(logsql);
      out.print("</div><hr/>");
    }
  }

  static
  { 
    try
    { 
      authentication_Template.loadTemplateMap(staticEnv);
      authentication_Template.loadRefArgClasses(refargclasses);
      block_Template.loadTemplateMap(staticEnv);
      block_Template.loadRefArgClasses(refargclasses);
      blockString_Template.loadTemplateMap(staticEnv);
      blockString_Template.loadRefArgClasses(refargclasses);
      break_Template.loadTemplateMap(staticEnv);
      break_Template.loadRefArgClasses(refargclasses);
      c_Template.loadTemplateMap(staticEnv);
      c_Template.loadRefArgClasses(refargclasses);
      column_Template.loadTemplateMap(staticEnv);
      column_Template.loadRefArgClasses(refargclasses);
      container_Template.loadTemplateMap(staticEnv);
      container_Template.loadRefArgClasses(refargclasses);
      dateinputgenericDate_String_String_String_Template.loadTemplateMap(staticEnv);
      dateinputgenericDate_String_String_String_Template.loadRefArgClasses(refargclasses);
      dateoutputgenericDate_String_Template.loadTemplateMap(staticEnv);
      dateoutputgenericDate_String_Template.loadRefArgClasses(refargclasses);
      datepickerinputDate_String_String_String_String_Template.loadTemplateMap(staticEnv);
      datepickerinputDate_String_String_String_String_Template.loadRefArgClasses(refargclasses);
      description_Template.loadTemplateMap(staticEnv);
      description_Template.loadRefArgClasses(refargclasses);
      div_Template.loadTemplateMap(staticEnv);
      div_Template.loadRefArgClasses(refargclasses);
      downloadInline_Template.loadTemplateMap(staticEnv);
      downloadInline_Template.loadRefArgClasses(refargclasses);
      dslblogpost_Template.loadTemplateMap(staticEnv);
      dslblogpost_Template.loadRefArgClasses(refargclasses);
      dslcontainer_Template.loadTemplateMap(staticEnv);
      dslcontainer_Template.loadRefArgClasses(refargclasses);
      dslfooter_Template.loadTemplateMap(staticEnv);
      dslfooter_Template.loadRefArgClasses(refargclasses);
      dslheader_Template.loadTemplateMap(staticEnv);
      dslheader_Template.loadRefArgClasses(refargclasses);
      dslinit_Template.loadTemplateMap(staticEnv);
      dslinit_Template.loadRefArgClasses(refargclasses);
      dslsidebar_Template.loadTemplateMap(staticEnv);
      dslsidebar_Template.loadRefArgClasses(refargclasses);
      elementsempty_Template.loadTemplateMap(staticEnv);
      elementsempty_Template.loadRefArgClasses(refargclasses);
      errorTemplateActionList_String__Template.loadTemplateMap(staticEnv);
      errorTemplateActionList_String__Template.loadRefArgClasses(refargclasses);
      errorTemplateFormList_String__Template.loadTemplateMap(staticEnv);
      errorTemplateFormList_String__Template.loadRefArgClasses(refargclasses);
      errorTemplateInputList_String__Template.loadTemplateMap(staticEnv);
      errorTemplateInputList_String__Template.loadRefArgClasses(refargclasses);
      fieldsetString_Template.loadTemplateMap(staticEnv);
      fieldsetString_Template.loadRefArgClasses(refargclasses);
      group_Template.loadTemplateMap(staticEnv);
      group_Template.loadRefArgClasses(refargclasses);
      groupitem_Template.loadTemplateMap(staticEnv);
      groupitem_Template.loadRefArgClasses(refargclasses);
      groupString_Template.loadTemplateMap(staticEnv);
      groupString_Template.loadRefArgClasses(refargclasses);
      highlightedSummarySearcher_String_String_Template.loadTemplateMap(staticEnv);
      highlightedSummarySearcher_String_String_Template.loadRefArgClasses(refargclasses);
      highlightedSummarySearcher_String_WikiText_Template.loadTemplateMap(staticEnv);
      highlightedSummarySearcher_String_WikiText_Template.loadRefArgClasses(refargclasses);
      highlightSearcher_String_Template.loadTemplateMap(staticEnv);
      highlightSearcher_String_Template.loadRefArgClasses(refargclasses);
      inputajaxBool_Template.loadTemplateMap(staticEnv);
      inputajaxBool_Template.loadRefArgClasses(refargclasses);
      inputajaxEmail_Template.loadTemplateMap(staticEnv);
      inputajaxEmail_Template.loadRefArgClasses(refargclasses);
      inputajaxEntity_Template.loadTemplateMap(staticEnv);
      inputajaxEntity_Template.loadRefArgClasses(refargclasses);
      inputajaxEntity_List_Entity__Template.loadTemplateMap(staticEnv);
      inputajaxEntity_List_Entity__Template.loadRefArgClasses(refargclasses);
      inputajaxFloat_Template.loadTemplateMap(staticEnv);
      inputajaxFloat_Template.loadRefArgClasses(refargclasses);
      inputajaxInt_Template.loadTemplateMap(staticEnv);
      inputajaxInt_Template.loadRefArgClasses(refargclasses);
      inputajaxList_Entity__Template.loadTemplateMap(staticEnv);
      inputajaxList_Entity__Template.loadRefArgClasses(refargclasses);
      inputajaxList_Entity__List_Entity__Template.loadTemplateMap(staticEnv);
      inputajaxList_Entity__List_Entity__Template.loadRefArgClasses(refargclasses);
      inputajaxLong_Template.loadTemplateMap(staticEnv);
      inputajaxLong_Template.loadRefArgClasses(refargclasses);
      inputajaxSecret_Template.loadTemplateMap(staticEnv);
      inputajaxSecret_Template.loadRefArgClasses(refargclasses);
      inputajaxSet_Entity__Template.loadTemplateMap(staticEnv);
      inputajaxSet_Entity__Template.loadRefArgClasses(refargclasses);
      inputajaxSet_Entity__List_Entity__Template.loadTemplateMap(staticEnv);
      inputajaxSet_Entity__List_Entity__Template.loadRefArgClasses(refargclasses);
      inputajaxString_Template.loadTemplateMap(staticEnv);
      inputajaxString_Template.loadRefArgClasses(refargclasses);
      inputajaxText_Template.loadTemplateMap(staticEnv);
      inputajaxText_Template.loadRefArgClasses(refargclasses);
      inputajaxURL_Template.loadTemplateMap(staticEnv);
      inputajaxURL_Template.loadRefArgClasses(refargclasses);
      inputajaxWikiText_Template.loadTemplateMap(staticEnv);
      inputajaxWikiText_Template.loadRefArgClasses(refargclasses);
      inputBool_Template.loadTemplateMap(staticEnv);
      inputBool_Template.loadRefArgClasses(refargclasses);
      inputBoolInternalBool_String_Template.loadTemplateMap(staticEnv);
      inputBoolInternalBool_String_Template.loadRefArgClasses(refargclasses);
      inputCheckboxSetInternalHelperSet_Entity__Set_Entity__Entity_String_Template.loadTemplateMap(staticEnv);
      inputCheckboxSetInternalHelperSet_Entity__Set_Entity__Entity_String_Template.loadRefArgClasses(refargclasses);
      inputCheckboxSetInternalSet_Entity__List_Entity__String_Template.loadTemplateMap(staticEnv);
      inputCheckboxSetInternalSet_Entity__List_Entity__String_Template.loadRefArgClasses(refargclasses);
      inputDate_Template.loadTemplateMap(staticEnv);
      inputDate_Template.loadRefArgClasses(refargclasses);
      inputDateTime_Template.loadTemplateMap(staticEnv);
      inputDateTime_Template.loadRefArgClasses(refargclasses);
      inputDateTime_DateTime_DateTime_Template.loadTemplateMap(staticEnv);
      inputDateTime_DateTime_DateTime_Template.loadRefArgClasses(refargclasses);
      inputDate_DateTime_DateTime_Template.loadTemplateMap(staticEnv);
      inputDate_DateTime_DateTime_Template.loadRefArgClasses(refargclasses);
      inputDate_Int_Int_Template.loadTemplateMap(staticEnv);
      inputDate_Int_Int_Template.loadRefArgClasses(refargclasses);
      inputEmail_Template.loadTemplateMap(staticEnv);
      inputEmail_Template.loadRefArgClasses(refargclasses);
      inputEmailInternalEmail_String_Template.loadTemplateMap(staticEnv);
      inputEmailInternalEmail_String_Template.loadRefArgClasses(refargclasses);
      inputEntity_Template.loadTemplateMap(staticEnv);
      inputEntity_Template.loadRefArgClasses(refargclasses);
      inputEntityInternalEntity_List_Entity__String_Template.loadTemplateMap(staticEnv);
      inputEntityInternalEntity_List_Entity__String_Template.loadRefArgClasses(refargclasses);
      inputEntity_List_Entity__Template.loadTemplateMap(staticEnv);
      inputEntity_List_Entity__Template.loadRefArgClasses(refargclasses);
      inputFile_Template.loadTemplateMap(staticEnv);
      inputFile_Template.loadRefArgClasses(refargclasses);
      inputFileInternalFile_String_Template.loadTemplateMap(staticEnv);
      inputFileInternalFile_String_Template.loadRefArgClasses(refargclasses);
      inputFloat_Template.loadTemplateMap(staticEnv);
      inputFloat_Template.loadRefArgClasses(refargclasses);
      inputFloatInternalFloat_String_Template.loadTemplateMap(staticEnv);
      inputFloatInternalFloat_String_Template.loadRefArgClasses(refargclasses);
      inputImage_Template.loadTemplateMap(staticEnv);
      inputImage_Template.loadRefArgClasses(refargclasses);
      inputInt_Template.loadTemplateMap(staticEnv);
      inputInt_Template.loadRefArgClasses(refargclasses);
      inputIntInternalInt_String_Template.loadTemplateMap(staticEnv);
      inputIntInternalInt_String_Template.loadRefArgClasses(refargclasses);
      inputListInternalList_Entity__List_Entity__String_Template.loadTemplateMap(staticEnv);
      inputListInternalList_Entity__List_Entity__String_Template.loadRefArgClasses(refargclasses);
      inputList_Entity__Template.loadTemplateMap(staticEnv);
      inputList_Entity__Template.loadRefArgClasses(refargclasses);
      inputList_Entity__List_Entity__Template.loadTemplateMap(staticEnv);
      inputList_Entity__List_Entity__Template.loadRefArgClasses(refargclasses);
      inputList_File__Template.loadTemplateMap(staticEnv);
      inputList_File__Template.loadRefArgClasses(refargclasses);
      inputLong_Template.loadTemplateMap(staticEnv);
      inputLong_Template.loadRefArgClasses(refargclasses);
      inputLongInternalLong_String_Template.loadTemplateMap(staticEnv);
      inputLongInternalLong_String_Template.loadRefArgClasses(refargclasses);
      inputMultiFileInternalList_File__String_Template.loadTemplateMap(staticEnv);
      inputMultiFileInternalList_File__String_Template.loadRefArgClasses(refargclasses);
      inputSDFajaxText_String_Template.loadTemplateMap(staticEnv);
      inputSDFajaxText_String_Template.loadRefArgClasses(refargclasses);
      inputSDFText_String_Template.loadTemplateMap(staticEnv);
      inputSDFText_String_Template.loadRefArgClasses(refargclasses);
      inputSearchString_Template.loadTemplateMap(staticEnv);
      inputSearchString_Template.loadRefArgClasses(refargclasses);
      inputSecret_Template.loadTemplateMap(staticEnv);
      inputSecret_Template.loadRefArgClasses(refargclasses);
      inputSecretInternalSecret_String_Template.loadTemplateMap(staticEnv);
      inputSecretInternalSecret_String_Template.loadRefArgClasses(refargclasses);
      inputSelectMultipleInternalSet_Entity__List_Entity__String_Template.loadTemplateMap(staticEnv);
      inputSelectMultipleInternalSet_Entity__List_Entity__String_Template.loadRefArgClasses(refargclasses);
      inputSet_Entity__Template.loadTemplateMap(staticEnv);
      inputSet_Entity__Template.loadRefArgClasses(refargclasses);
      inputSet_Entity__List_Entity__Template.loadTemplateMap(staticEnv);
      inputSet_Entity__List_Entity__Template.loadRefArgClasses(refargclasses);
      inputString_Template.loadTemplateMap(staticEnv);
      inputString_Template.loadRefArgClasses(refargclasses);
      inputStringInternalString_String_Template.loadTemplateMap(staticEnv);
      inputStringInternalString_String_Template.loadRefArgClasses(refargclasses);
      inputText_Template.loadTemplateMap(staticEnv);
      inputText_Template.loadRefArgClasses(refargclasses);
      inputTextInternalText_String_Template.loadTemplateMap(staticEnv);
      inputTextInternalText_String_Template.loadRefArgClasses(refargclasses);
      inputTime_Template.loadTemplateMap(staticEnv);
      inputTime_Template.loadRefArgClasses(refargclasses);
      inputURL_Template.loadTemplateMap(staticEnv);
      inputURL_Template.loadRefArgClasses(refargclasses);
      inputURLInternalURL_String_Template.loadTemplateMap(staticEnv);
      inputURLInternalURL_String_Template.loadRefArgClasses(refargclasses);
      inputWikiText_Template.loadTemplateMap(staticEnv);
      inputWikiText_Template.loadRefArgClasses(refargclasses);
      inputWikiTextInternalWikiText_String_Template.loadTemplateMap(staticEnv);
      inputWikiTextInternalWikiText_String_Template.loadRefArgClasses(refargclasses);
      internalElementsWrapper_Template.loadTemplateMap(staticEnv);
      internalElementsWrapper_Template.loadRefArgClasses(refargclasses);
      labelcolumnsString_Template.loadTemplateMap(staticEnv);
      labelcolumnsString_Template.loadRefArgClasses(refargclasses);
      labelInternalString_String_TemplateContext_Template.loadTemplateMap(staticEnv);
      labelInternalString_String_TemplateContext_Template.loadRefArgClasses(refargclasses);
      labelInternalString_String_TemplateContext_Template.loadTemplateMap(staticEnv);
      labelInternalString_String_TemplateContext_Template.loadRefArgClasses(refargclasses);
      labelString_Template.loadTemplateMap(staticEnv);
      labelString_Template.loadRefArgClasses(refargclasses);
      list_Template.loadTemplateMap(staticEnv);
      list_Template.loadRefArgClasses(refargclasses);
      listitem_Template.loadTemplateMap(staticEnv);
      listitem_Template.loadRefArgClasses(refargclasses);
      login_Template.loadTemplateMap(staticEnv);
      login_Template.loadRefArgClasses(refargclasses);
      logout_Template.loadTemplateMap(staticEnv);
      logout_Template.loadRefArgClasses(refargclasses);
      main_Template.loadTemplateMap(staticEnv);
      main_Template.loadRefArgClasses(refargclasses);
      main_login_Template.loadTemplateMap(staticEnv);
      main_login_Template.loadRefArgClasses(refargclasses);
      menu_Template.loadTemplateMap(staticEnv);
      menu_Template.loadRefArgClasses(refargclasses);
      menubar_Template.loadTemplateMap(staticEnv);
      menubar_Template.loadRefArgClasses(refargclasses);
      menuheader_Template.loadTemplateMap(staticEnv);
      menuheader_Template.loadRefArgClasses(refargclasses);
      menuitem_Template.loadTemplateMap(staticEnv);
      menuitem_Template.loadRefArgClasses(refargclasses);
      menuitems_Template.loadTemplateMap(staticEnv);
      menuitems_Template.loadRefArgClasses(refargclasses);
      menuspacer_Template.loadTemplateMap(staticEnv);
      menuspacer_Template.loadRefArgClasses(refargclasses);
      messages_Template.loadTemplateMap(staticEnv);
      messages_Template.loadRefArgClasses(refargclasses);
      mimetypeString_Template.loadTemplateMap(staticEnv);
      mimetypeString_Template.loadRefArgClasses(refargclasses);
      my_view_bodyMyArticle_Template.loadTemplateMap(staticEnv);
      my_view_bodyMyArticle_Template.loadRefArgClasses(refargclasses);
      noMessages_Template.loadTemplateMap(staticEnv);
      noMessages_Template.loadRefArgClasses(refargclasses);
      outputATerm_Template.loadTemplateMap(staticEnv);
      outputATerm_Template.loadRefArgClasses(refargclasses);
      outputBool_Template.loadTemplateMap(staticEnv);
      outputBool_Template.loadRefArgClasses(refargclasses);
      outputDate_Template.loadTemplateMap(staticEnv);
      outputDate_Template.loadRefArgClasses(refargclasses);
      outputDateTime_Template.loadTemplateMap(staticEnv);
      outputDateTime_Template.loadRefArgClasses(refargclasses);
      outputEmail_Template.loadTemplateMap(staticEnv);
      outputEmail_Template.loadRefArgClasses(refargclasses);
      outputFloat_Template.loadTemplateMap(staticEnv);
      outputFloat_Template.loadRefArgClasses(refargclasses);
      outputInt_Template.loadTemplateMap(staticEnv);
      outputInt_Template.loadRefArgClasses(refargclasses);
      outputLabelEntity_Template.loadTemplateMap(staticEnv);
      outputLabelEntity_Template.loadRefArgClasses(refargclasses);
      outputLong_Template.loadTemplateMap(staticEnv);
      outputLong_Template.loadRefArgClasses(refargclasses);
      outputPlaceholder_Template.loadTemplateMap(staticEnv);
      outputPlaceholder_Template.loadRefArgClasses(refargclasses);
      outputSecret_Template.loadTemplateMap(staticEnv);
      outputSecret_Template.loadRefArgClasses(refargclasses);
      outputString_Template.loadTemplateMap(staticEnv);
      outputString_Template.loadRefArgClasses(refargclasses);
      outputText_Template.loadTemplateMap(staticEnv);
      outputText_Template.loadRefArgClasses(refargclasses);
      outputTime_Template.loadTemplateMap(staticEnv);
      outputTime_Template.loadRefArgClasses(refargclasses);
      outputURL_Template.loadTemplateMap(staticEnv);
      outputURL_Template.loadRefArgClasses(refargclasses);
      outputWikiText_Template.loadTemplateMap(staticEnv);
      outputWikiText_Template.loadRefArgClasses(refargclasses);
      page_left_barAdmin_Int_Template.loadTemplateMap(staticEnv);
      page_left_barAdmin_Int_Template.loadRefArgClasses(refargclasses);
      par_Template.loadTemplateMap(staticEnv);
      par_Template.loadRefArgClasses(refargclasses);
      pre_Template.loadTemplateMap(staticEnv);
      pre_Template.loadRefArgClasses(refargclasses);
      r_Template.loadTemplateMap(staticEnv);
      r_Template.loadRefArgClasses(refargclasses);
      radioajaxEntity_Template.loadTemplateMap(staticEnv);
      radioajaxEntity_Template.loadRefArgClasses(refargclasses);
      radioajaxEntity_List_Entity__Template.loadTemplateMap(staticEnv);
      radioajaxEntity_List_Entity__Template.loadRefArgClasses(refargclasses);
      radioEntity_Template.loadTemplateMap(staticEnv);
      radioEntity_Template.loadRefArgClasses(refargclasses);
      radioEntity_List_Entity__Template.loadTemplateMap(staticEnv);
      radioEntity_List_Entity__Template.loadRefArgClasses(refargclasses);
      radioInternalEntity_List_Entity__String_Template.loadTemplateMap(staticEnv);
      radioInternalEntity_List_Entity__String_Template.loadRefArgClasses(refargclasses);
      rawoutputWikiText_Template.loadTemplateMap(staticEnv);
      rawoutputWikiText_Template.loadRefArgClasses(refargclasses);
      row_Template.loadTemplateMap(staticEnv);
      row_Template.loadRefArgClasses(refargclasses);
      selectajaxEntity_Template.loadTemplateMap(staticEnv);
      selectajaxEntity_Template.loadRefArgClasses(refargclasses);
      selectajaxEntity_List_Entity__Template.loadTemplateMap(staticEnv);
      selectajaxEntity_List_Entity__Template.loadRefArgClasses(refargclasses);
      selectajaxSet_Entity__Template.loadTemplateMap(staticEnv);
      selectajaxSet_Entity__Template.loadRefArgClasses(refargclasses);
      selectajaxSet_Entity__List_Entity__Template.loadTemplateMap(staticEnv);
      selectajaxSet_Entity__List_Entity__Template.loadRefArgClasses(refargclasses);
      selectcheckboxajaxSet_Entity__Template.loadTemplateMap(staticEnv);
      selectcheckboxajaxSet_Entity__Template.loadRefArgClasses(refargclasses);
      selectcheckboxajaxSet_Entity__List_Entity__Template.loadTemplateMap(staticEnv);
      selectcheckboxajaxSet_Entity__List_Entity__Template.loadRefArgClasses(refargclasses);
      selectcheckboxSet_Entity__Template.loadTemplateMap(staticEnv);
      selectcheckboxSet_Entity__Template.loadRefArgClasses(refargclasses);
      selectcheckboxSet_Entity__List_Entity__Template.loadTemplateMap(staticEnv);
      selectcheckboxSet_Entity__List_Entity__Template.loadRefArgClasses(refargclasses);
      selectEntity_Template.loadTemplateMap(staticEnv);
      selectEntity_Template.loadRefArgClasses(refargclasses);
      selectEntity_List_Entity__Template.loadTemplateMap(staticEnv);
      selectEntity_List_Entity__Template.loadRefArgClasses(refargclasses);
      selectSet_Entity__Template.loadTemplateMap(staticEnv);
      selectSet_Entity__Template.loadRefArgClasses(refargclasses);
      selectSet_Entity__List_Entity__Template.loadTemplateMap(staticEnv);
      selectSet_Entity__List_Entity__Template.loadRefArgClasses(refargclasses);
      showMessagesList_String__Template.loadTemplateMap(staticEnv);
      showMessagesList_String__Template.loadRefArgClasses(refargclasses);
      showSearchStats_Template.loadTemplateMap(staticEnv);
      showSearchStats_Template.loadRefArgClasses(refargclasses);
      spacer_Template.loadTemplateMap(staticEnv);
      spacer_Template.loadRefArgClasses(refargclasses);
      span_Template.loadTemplateMap(staticEnv);
      span_Template.loadRefArgClasses(refargclasses);
      t_Template.loadTemplateMap(staticEnv);
      t_Template.loadRefArgClasses(refargclasses);
      table_Template.loadTemplateMap(staticEnv);
      table_Template.loadRefArgClasses(refargclasses);
      templateSuccessList_String__Template.loadTemplateMap(staticEnv);
      templateSuccessList_String__Template.loadRefArgClasses(refargclasses);
      th_Template.loadTemplateMap(staticEnv);
      th_Template.loadRefArgClasses(refargclasses);
      validateBool_String_Template.loadTemplateMap(staticEnv);
      validateBool_String_Template.loadRefArgClasses(refargclasses);
      wrapsubmitString_Template.loadTemplateMap(staticEnv);
      wrapsubmitString_Template.loadRefArgClasses(refargclasses);
      accessDenied_Template.loadTemplateMap(staticEnv);
      accessDenied_Template.loadRefArgClasses(refargclasses);
      pagenotfound_Template.loadTemplateMap(staticEnv);
      pagenotfound_Template.loadRefArgClasses(refargclasses);
      page_about_Template.loadTemplateMap(staticEnv);
      page_about_Template.loadRefArgClasses(refargclasses);
      page_admin_edit_Template.loadTemplateMap(staticEnv);
      page_admin_edit_Template.loadRefArgClasses(refargclasses);
      page_admin_index_Template.loadTemplateMap(staticEnv);
      page_admin_index_Template.loadRefArgClasses(refargclasses);
      page_admin_welcome_Template.loadTemplateMap(staticEnv);
      page_admin_welcome_Template.loadRefArgClasses(refargclasses);
      page_login_Template.loadTemplateMap(staticEnv);
      page_login_Template.loadRefArgClasses(refargclasses);
      page_view_Template.loadTemplateMap(staticEnv);
      page_view_Template.loadRefArgClasses(refargclasses);
      root_Template.loadTemplateMap(staticEnv);
      root_Template.loadRefArgClasses(refargclasses);
      table_content_Template.loadTemplateMap(staticEnv);
      table_content_Template.loadRefArgClasses(refargclasses);
    }
    catch(Exception se)
    { 
      org.webdsl.logging.Logger.error("Exception occured while instantiating base page class template and page definitions.", se);
    }
  }

  static
  { 
    try
    { 
      sendQueuedEmail_Email_Template.loadEmailAndTemplateMap(staticEnv, emails);
      sendQueuedEmail_Email_Template.loadRefArgClasses(refargclasses);
    }
    catch(Exception se)
    { 
      org.webdsl.logging.Logger.error("Exception occured while instantiating base page class email definitions.", se);
    }
  }

  protected boolean isActionSubmit()
  { 
    return ThreadLocalServlet.get().isPostRequest || parammap.get("action-call-with-get-request-type") != null;
  }

  public String getAbsoluteLocation()
  { 
    if(request == null)
    { 
      String url = BuildProperties.getAppUrlForRenderWithoutRequest();
      if(url == null)
      { 
        org.webdsl.logging.Logger.warn("Property 'appurlforrenderwithoutrequest' is not set in application.ini. This property is used to construct links that are rendered outside a page request. Using 'http://localhost' for now.");
        url = "http://localhost";
      }
      return url;
    }
    String contextPath = ThreadLocalServlet.getContextPath();
    Matcher m = baseURLPattern.matcher(request.getRequestURL().toString());
    m.find();
    if(contextPath.equals(""))
    { 
      return m.group(0);
    }
    else
    { 
      return m.group(0) + contextPath;
    }
  }

  public webdsl.generated.domain.QueuedEmail renderEmailAndCreateQueuedEmail(String name, Object[] emailargs, Environment emailenv)
  { 
    EmailServlet s = this.renderEmail(name, emailargs, emailenv);
    webdsl.generated.domain.QueuedEmail queuedemail = webdsl.generated.domain.QueuedEmail._static_createEmpty_();
    queuedemail.setVersion(1);
    queuedemail.setBodyNoEventsOrValidation(s.body.toString());
    queuedemail.setBccNoEventsOrValidation(s.bcc);
    queuedemail.setCcNoEventsOrValidation(s.cc);
    queuedemail.setFromNoEventsOrValidation(s.sender);
    queuedemail.setReplyToNoEventsOrValidation(s.replyTo);
    queuedemail.setSubjectNoEventsOrValidation(s.subject);
    queuedemail.setToNoEventsOrValidation(s.receivers);
    queuedemail.setUnsubscribeAddressNoEventsOrValidation(s.unsubscribeAddress);
    return queuedemail;
  }

  protected boolean logSqlCheckAccess()
  { 
    return false;
  }

  public void initRequestVars(PrintWriter out)
  { }
}