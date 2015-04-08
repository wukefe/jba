package utils;

import webdsl.generated.templates.*;
import java.util.ArrayList;
import java.util.List;

public class Statistics  
{ 
  public static void logStatistics()
  { 
    List<PageStats> results = new ArrayList<PageStats>();
    results.add(new PageStats().setPage("table_content").setReadOnly(Table_contentPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(Table_contentPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(Table_contentPage.renderWithUpdates.getAndSet(0)).setActionFailed(Table_contentPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(Table_contentPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(Table_contentPage.actionSuccessWithUpdates.getAndSet(0)));
    results.add(new PageStats().setPage("root").setReadOnly(RootPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(RootPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(RootPage.renderWithUpdates.getAndSet(0)).setActionFailed(RootPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(RootPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(RootPage.actionSuccessWithUpdates.getAndSet(0)));
    results.add(new PageStats().setPage("page_view").setReadOnly(Page_viewPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(Page_viewPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(Page_viewPage.renderWithUpdates.getAndSet(0)).setActionFailed(Page_viewPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(Page_viewPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(Page_viewPage.actionSuccessWithUpdates.getAndSet(0)));
    results.add(new PageStats().setPage("page_login").setReadOnly(Page_loginPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(Page_loginPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(Page_loginPage.renderWithUpdates.getAndSet(0)).setActionFailed(Page_loginPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(Page_loginPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(Page_loginPage.actionSuccessWithUpdates.getAndSet(0)));
    results.add(new PageStats().setPage("page_admin_welcome").setReadOnly(Page_admin_welcomePage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(Page_admin_welcomePage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(Page_admin_welcomePage.renderWithUpdates.getAndSet(0)).setActionFailed(Page_admin_welcomePage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(Page_admin_welcomePage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(Page_admin_welcomePage.actionSuccessWithUpdates.getAndSet(0)));
    results.add(new PageStats().setPage("page_admin_index").setReadOnly(Page_admin_indexPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(Page_admin_indexPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(Page_admin_indexPage.renderWithUpdates.getAndSet(0)).setActionFailed(Page_admin_indexPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(Page_admin_indexPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(Page_admin_indexPage.actionSuccessWithUpdates.getAndSet(0)));
    results.add(new PageStats().setPage("page_admin_edit").setReadOnly(Page_admin_editPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(Page_admin_editPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(Page_admin_editPage.renderWithUpdates.getAndSet(0)).setActionFailed(Page_admin_editPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(Page_admin_editPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(Page_admin_editPage.actionSuccessWithUpdates.getAndSet(0)));
    results.add(new PageStats().setPage("page_about").setReadOnly(Page_aboutPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(Page_aboutPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(Page_aboutPage.renderWithUpdates.getAndSet(0)).setActionFailed(Page_aboutPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(Page_aboutPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(Page_aboutPage.actionSuccessWithUpdates.getAndSet(0)));
    results.add(new PageStats().setPage("pagenotfound").setReadOnly(PagenotfoundPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(PagenotfoundPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(PagenotfoundPage.renderWithUpdates.getAndSet(0)).setActionFailed(PagenotfoundPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(PagenotfoundPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(PagenotfoundPage.actionSuccessWithUpdates.getAndSet(0)));
    results.add(new PageStats().setPage("accessDenied").setReadOnly(AccessDeniedPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(AccessDeniedPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(AccessDeniedPage.renderWithUpdates.getAndSet(0)).setActionFailed(AccessDeniedPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(AccessDeniedPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(AccessDeniedPage.actionSuccessWithUpdates.getAndSet(0)));
    results.add(new PageStats().setPage("noMessages").setReadOnly(NoMessagesPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(NoMessagesPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(NoMessagesPage.renderWithUpdates.getAndSet(0)).setActionFailed(NoMessagesPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(NoMessagesPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(NoMessagesPage.actionSuccessWithUpdates.getAndSet(0)));
    results.add(new PageStats().setPage("showMessagesList_String_").setReadOnly(ShowMessagesList_String_Page.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(ShowMessagesList_String_Page.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(ShowMessagesList_String_Page.renderWithUpdates.getAndSet(0)).setActionFailed(ShowMessagesList_String_Page.actionFailed.getAndSet(0)).setActionSuccessReadOnly(ShowMessagesList_String_Page.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(ShowMessagesList_String_Page.actionSuccessWithUpdates.getAndSet(0)));
    utils.PageStats.printList(results);
  }
}