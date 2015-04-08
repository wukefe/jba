package utils;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.webdsl.lang.Environment;

import utils.TemplateServlet;

import java.io.*;

//dummy pageservlet instance for global init and global variables
//some expressions require this to be available, eg. property setters with extension events
@SuppressWarnings("unused")
public class GlobalsPageServlet extends PageServlet
{
    public GlobalsPageServlet(){
    	hibernateSession = utils.HibernateUtil.getCurrentSession();    	
    }
    public void serve(HttpServletRequest request, HttpServletResponse response, Map<String, String> parammap, Map<String, List<String>> parammapvalues, Map<String, List<utils.File>> fileUploads){}
    protected void renderDebugJsVar(java.io.PrintWriter sout){}
    protected boolean logSqlCheckAccess(){return false;}
    protected void initTemplateClass(){}
    protected void redirectHttpHttps(){}
    protected boolean isActionSubmit(){return false;}
    protected String[] getUsedSessionEntityJoins(){ return null; }
    protected void storeSessionEntities(){}
    protected org.webdsl.WebDSLEntity getRequestLogEntry(){return null;}
    protected void addPrincipalToRequestLog(org.webdsl.WebDSLEntity rle){}
    protected void addLogSqlToSessionMessages(){}
    public String getPageName(){return "";}
    public String getHiddenParams(){return "";}
    public String getUrlQueryParams(){return "";}
    public String getHiddenPostParamsJson(){return "";}
    protected void initialize(){}
    protected void conversion(){}
    protected void loadArguments(){}
    protected void initVarsAndArgs(){}
    public void initializeBasics(AbstractPageServlet ps, Object[] args){}
    public void serveAsAjaxResponse(AbstractPageServlet ps, Object[] ajaxarguments, TemplateCall templateArg){}
    public String getUniqueName(){ return "#### GlobalsPageServlet #### Should not call getUniqueName here."; }
    protected void increaseStatReadOnly() { }
    protected void increaseStatReadOnlyFromCache() { }
    protected void increaseStatUpdate() { }
    protected void increaseStatActionFail() { }
    protected void increaseStatActionReadOnly() { }
    protected void increaseStatActionUpdate() { }
    private java.util.Map<String, String> dummyParammap;
    public java.util.Map<String, String> getParammap() {
    	if(dummyParammap == null){
    		dummyParammap = new java.util.HashMap<String, String>(0);
    	}
    	return dummyParammap;
    }
    public String getPageUrlWithParams(){ return "GlobalsPageServlet: url requested without page request context"; } 
}
