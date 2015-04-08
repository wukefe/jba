package webdsl.generated.templates;

import webdsl.generated.domain.*;

@SuppressWarnings("all") public class RefArg_page_left_barAdmin_Int_Template0  implements utils.RefArg
{ 
  public page_left_barAdmin_Int_Template template;

  public RefArg_page_left_barAdmin_Int_Template0 (page_left_barAdmin_Int_Template templ) 
  { 
    this.template = templ;
  }

  public Object set(Object obj)
  { 
    template.setTemp_((webdsl.generated.domain.MyArticle)org.webdsl.tools.Utils.cast(obj, webdsl.generated.domain.MyArticle.class));
    return this;
  }

  public Object get()
  { 
    return template.getTemp_();
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
    return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.MyArticle.$static$all_();
  }
}