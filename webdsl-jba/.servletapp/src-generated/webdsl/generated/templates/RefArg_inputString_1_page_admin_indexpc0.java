package webdsl.generated.templates;

import webdsl.generated.domain.*;
import utils.*;

@SuppressWarnings("all") public class RefArg_inputString_1_page_admin_indexpc0  implements utils.RefArg
{ 
  public webdsl.generated.domain.MyArticle art_;

  public RefArg_inputString_1_page_admin_indexpc0 () 
  { }

  public RefArg_inputString_1_page_admin_indexpc0 (Object art_) 
  { 
    this.art_ = (webdsl.generated.domain.MyArticle)art_;
  }

  public webdsl.generated.domain.MyArticle set(Object obj)
  { 
    art_.setTitle((String)org.webdsl.tools.Utils.cast(obj, String.class));
    return art_;
  }

  public Object get()
  { 
    return (String)art_.getTitle();
  }

  public void load(String uuid)
  { 
    if(uuid.contains(":"))
    { 
      art_ = (webdsl.generated.domain.MyArticle)utils.PageParamLoad.loadEntityFromParam(utils.HibernateUtil.getCurrentSession(), "webdsl.generated.domain", uuid);
    }
    else
    { 
      try
      { 
        Class<?> cl = org.hibernate.util.ReflectHelper.classForName("webdsl.generated.domain.MyArticle");
        art_ = (webdsl.generated.domain.MyArticle)utils.HibernateUtil.getCurrentSession().load(cl, java.util.UUID.fromString(uuid));
      }
      catch(ClassNotFoundException cnfe)
      { 
        throw new RuntimeException(cnfe);
      }
    }
  }

  public String getUrlString()
  { 
    return art_.getId() + "!" + "RefArg_inputString_1_page_admin_indexpc0";
  }

  public String get_WebDslEntityType()
  { 
    if(get() == null)
    { 
      return "String";
    }
    else
    { 
      return ((org.webdsl.WebDSLEntity)get()).get_WebDslEntityType();
    }
  }

  public org.webdsl.WebDSLEntity getEntity()
  { 
    return art_;
  }

  public void validate(String location, java.util.List<utils.ValidationException> exceptions)
  { 
    webdsl.generated.domain.ValidationExceptionMultiple vem = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    art_.validateTitle_internalValidationExceptionMultiple_(vem);
    for(webdsl.generated.domain.ValidationException v : vem.getExceptions())
    { 
      exceptions.add(new utils.ValidationException(location, v.getMessage()));
    }
  }

  public java.util.List<String> getValidationErrors()
  { 
    java.util.List<String> result = new java.util.ArrayList<String>();
    webdsl.generated.domain.ValidationExceptionMultiple vem = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    art_.validateTitle_internalValidationExceptionMultiple_(vem);
    for(webdsl.generated.domain.ValidationException v : vem.getExceptions())
    { 
      result.add(v.getMessage());
    }
    return result;
  }

  public org.webdsl.lang.ReflectionProperty getReflectionProperty()
  { 
    return utils.ThreadLocalServlet.get().getReflectionEntityByName("MyArticle").getPropertyByName("Title");
  }

  public java.util.List<Object> getAllowed()
  { 
    return getReflectionProperty().getAllowed(art_);
  }
}