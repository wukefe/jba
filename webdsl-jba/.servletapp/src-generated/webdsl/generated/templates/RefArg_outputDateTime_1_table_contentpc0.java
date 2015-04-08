package webdsl.generated.templates;

import webdsl.generated.domain.*;
import utils.*;

@SuppressWarnings("all") public class RefArg_outputDateTime_1_table_contentpc0  implements utils.RefArg
{ 
  public webdsl.generated.domain.MyArticle u_;

  public RefArg_outputDateTime_1_table_contentpc0 () 
  { }

  public RefArg_outputDateTime_1_table_contentpc0 (Object u_) 
  { 
    this.u_ = (webdsl.generated.domain.MyArticle)u_;
  }

  public webdsl.generated.domain.MyArticle set(Object obj)
  { 
    u_.setCreated((java.util.Date)org.webdsl.tools.Utils.cast(obj, java.util.Date.class));
    return u_;
  }

  public Object get()
  { 
    return (java.util.Date)u_.getCreated();
  }

  public void load(String uuid)
  { 
    if(uuid.contains(":"))
    { 
      u_ = (webdsl.generated.domain.MyArticle)utils.PageParamLoad.loadEntityFromParam(utils.HibernateUtil.getCurrentSession(), "webdsl.generated.domain", uuid);
    }
    else
    { 
      try
      { 
        Class<?> cl = org.hibernate.util.ReflectHelper.classForName("webdsl.generated.domain.MyArticle");
        u_ = (webdsl.generated.domain.MyArticle)utils.HibernateUtil.getCurrentSession().load(cl, java.util.UUID.fromString(uuid));
      }
      catch(ClassNotFoundException cnfe)
      { 
        throw new RuntimeException(cnfe);
      }
    }
  }

  public String getUrlString()
  { 
    return u_.getId() + "!" + "RefArg_outputDateTime_1_table_contentpc0";
  }

  public String get_WebDslEntityType()
  { 
    if(get() == null)
    { 
      return "DateTime";
    }
    else
    { 
      return ((org.webdsl.WebDSLEntity)get()).get_WebDslEntityType();
    }
  }

  public org.webdsl.WebDSLEntity getEntity()
  { 
    return u_;
  }

  public void validate(String location, java.util.List<utils.ValidationException> exceptions)
  { }

  public java.util.List<String> getValidationErrors()
  { 
    java.util.List<String> result = new java.util.ArrayList<String>();
    return result;
  }

  public org.webdsl.lang.ReflectionProperty getReflectionProperty()
  { 
    return utils.ThreadLocalServlet.get().getReflectionEntityByName("MyArticle").getPropertyByName("created");
  }

  public java.util.List<Object> getAllowed()
  { 
    return getReflectionProperty().getAllowed(u_);
  }
}