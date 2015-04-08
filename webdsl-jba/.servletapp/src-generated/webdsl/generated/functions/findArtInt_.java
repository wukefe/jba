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

@SuppressWarnings("all") public class findArtInt_  implements org.webdsl.lang.IFunction
{ 
  public static webdsl.generated.domain.MyArticle findArtInt_(Integer indx_)
  { 
    java.util.List<webdsl.generated.domain.MyArticle> ArticleList_ = utils.HibernateUtil.getCurrentSession().createQuery("from MyArticle").list();
    if(!(org.webdsl.tools.Utils.equal(indx_, null) || org.webdsl.tools.Utils.equal(0, null)) && indx_ < 0)
    { 
      return (webdsl.generated.domain.MyArticle)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.MyArticle)org.webdsl.tools.Utils.cast(webdsl.generated.domain.MyArticle._static_createEmpty_().MyArticle$this_(), webdsl.generated.domain.MyArticle.class)).setCount(-1), webdsl.generated.domain.MyArticle.class);
    }
    else
    { }
    return (webdsl.generated.domain.MyArticle)ArticleList_.get(indx_);
  }

  public Object apply(Object[] args)
  { 
    return findArtInt_.findArtInt_((Integer)args[0]);
  }
}