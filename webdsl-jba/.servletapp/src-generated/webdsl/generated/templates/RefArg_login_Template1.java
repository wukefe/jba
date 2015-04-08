package webdsl.generated.templates;

import webdsl.generated.domain.*;

@SuppressWarnings("all") public class RefArg_login_Template1  implements utils.RefArg
{ 
  public login_Template template;

  public RefArg_login_Template1 (login_Template templ) 
  { 
    this.template = templ;
  }

  public Object set(Object obj)
  { 
    template.setCredPassword_((String)org.webdsl.tools.Utils.cast(obj, String.class));
    return this;
  }

  public Object get()
  { 
    return template.getCredPassword_();
  }

  public void load(String uuid)
  { }

  public org.webdsl.WebDSLEntity getEntity()
  { 
    return null;
  }

  public String get_WebDslEntityType()
  { 
    return "not supported for this type of reference argument (refers to template variable)";
  }

  public String getUrlString()
  { 
    return "not supported for this type of reference argument (refers to template variable)";
  }

  public void validate(String location, java.util.List<utils.ValidationException> exceptions)
  { }

  public java.util.List<String> getValidationErrors()
  { 
    return new java.util.ArrayList<String>();
  }

  public org.webdsl.lang.ReflectionProperty getReflectionProperty()
  { 
    return null;
  }

  public java.util.List<Object> getAllowed()
  { 
    return null;
  }
}