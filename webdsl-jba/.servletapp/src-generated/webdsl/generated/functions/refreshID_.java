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

@SuppressWarnings("all") public class refreshID_  implements org.webdsl.lang.IFunction
{ 
  public static void refreshID_()
  { 
    Integer cnt_ = 1;
    java.util.List<webdsl.generated.domain.MyArticle> list1 = utils.HibernateUtil.getCurrentSession().createCriteria(webdsl.generated.domain.MyArticle.class).list();
    java.util.Collections.sort(list1, new java.util.Comparator<webdsl.generated.domain.MyArticle>()
                                      { 
                                        public int compare(webdsl.generated.domain.MyArticle o1, webdsl.generated.domain.MyArticle o2)
                                        { 
                                          return o1.getCount().compareTo(o2.getCount());
                                        }
                                      });
    Object[] array0 = list1.toArray();
    for(int i0 = 0; i0 < array0.length; i0++)
    { 
      webdsl.generated.domain.MyArticle u_ = (webdsl.generated.domain.MyArticle)array0[i0];
      u_.setCount(cnt_);
      cnt_ = cnt_ + 1;
    }
  }

  public Object apply(Object[] args)
  { 
    refreshID_.refreshID_();
    return null;
  }
}