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

@SuppressWarnings("all") public class findtotal_  implements org.webdsl.lang.IFunction
{ 
  public static Integer findtotal_()
  { 
    java.util.List<webdsl.generated.domain.MyArticle> ArticleList_ = utils.HibernateUtil.getCurrentSession().createQuery("from MyArticle").list();
    return ArticleList_.size();
  }

  public Object apply(Object[] args)
  { 
    return findtotal_.findtotal_();
  }
}