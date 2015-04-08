package webdsl.generated.domain;

import java.util.*;
import javax.persistence.*;
import webdsl.generated.domain.*;
import java.io.Serializable;
import utils.*;
import java.io.PrintWriter;
import org.webdsl.lang.Environment;

public @javax.persistence.Entity @javax.persistence.Table(name = "_MyArticle") @org.hibernate.annotations.FilterDefs({}) @org.hibernate.annotations.Persister(impl = utils.SingleTableEntityPersister.class) @javax.persistence.DiscriminatorColumn(name = "DISCRIMINATOR", discriminatorType = javax.persistence.DiscriminatorType.STRING, length = 255) @SuppressWarnings("all") class MyArticle  implements org.webdsl.WebDSLEntity, org.hibernate.bytecode.javassist.FieldHandled, org.webdsl.search.NoDynamicSearchFields
{ 
  public void validateDelete()
  { 
    java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
    if(exceptions.size() > 0)
    { 
      throw new utils.MultipleValidationExceptions(exceptions);
    }
  }

  public void validateSave()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple mex = this.validateSave_();
    java.util.List<webdsl.generated.domain.ValidationException> ex = mex.getExceptions();
    java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
    for(webdsl.generated.domain.ValidationException v : ex)
    { 
      exceptions.add(new utils.ValidationException(null, v.getMessage()));
    }
    if(exceptions.size() > 0)
    { 
      throw new utils.MultipleValidationExceptions(exceptions);
    }
  }

  public static MyArticle _static_createEmpty_()
  { 
    MyArticle ent = new MyArticle();
    ent.setId(java.util.UUID.randomUUID());
    return ent;
  }

  public MyArticle () 
  { }

  transient protected org.hibernate.bytecode.javassist.FieldHandler fieldHandler;

  transient protected java.util.Set<String> uninitializedLazyProperties = null;

  public org.hibernate.bytecode.javassist.FieldHandler getFieldHandler()
  { 
    return fieldHandler;
  }

  public boolean removeUninitializedLazyProperty(String name)
  { 
    return uninitializedLazyProperties != null && uninitializedLazyProperties.remove(name);
  }

  public void setFieldHandler(org.hibernate.bytecode.javassist.FieldHandler fieldHandler)
  { 
    this.fieldHandler = fieldHandler;
    java.util.Set fieldHandlerUninit = ((org.hibernate.intercept.javassist.FieldInterceptorImpl)fieldHandler).getUninitializedFields();
    if(fieldHandlerUninit != null)
    { 
      this.uninitializedLazyProperties = new java.util.HashSet<String>(fieldHandlerUninit);
    }
  }

  @javax.persistence.Id @org.hibernate.annotations.Type(type = "utils.UUIDUserType") @org.hibernate.search.annotations.DocumentId @org.hibernate.search.annotations.FieldBridge(impl = UUIDFieldBridge.class) @javax.persistence.Column(name = "id", length = 32) protected java.util.UUID _id = null;

  public java.util.UUID getId()
  { 
    return _id;
  }

  public org.webdsl.WebDSLEntity setId(java.util.UUID idarg)
  { 
    this._id = idarg;
    return this;
  }

  public String getNaturalId()
  { 
    return _id.toString();
  }

  @Version @Column(name = "version_opt_lock") protected Integer _version = 0;

  public Integer getVersion()
  { 
    return _version;
  }

  public org.webdsl.WebDSLEntity setVersion(Integer v)
  { 
    this._version = v;
    setChanged();
    return this;
  }

  @Transient boolean versionWasIncreased = false;

  public void increaseVersion()
  { 
    if(!versionWasIncreased)
    { 
      _version++;
      versionWasIncreased = true;
      setChanged();
    }
  }

  @Transient protected boolean isChanged = false;

  public boolean isChanged()
  { 
    return isChanged;
  }

  public void setChanged()
  { 
    if(!isChanged)
    { 
      isChanged = true;
      if(fieldHandler != null)
      { 
        ((org.hibernate.intercept.FieldInterceptor)fieldHandler).dirty();
      }
    }
    AbstractPageServlet thepage = ThreadLocalPage.get();
    if(_version > 0)
    { 
      if(thepage != null)
      { 
        thepage.readOnlyRequestStats = false;
      }
      if(thepage != null && !thepage.invalidateAllPageCache)
      { 
        thepage.invalidateAllPageCache("MyArticle");
      }
      if(thepage != null && thepage.isReadOnly)
      { 
        org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in " + "MyArticle");
        utils.Warning.printSmallStackTrace(5);
      }
      else
      { 
        utils.HibernateUtil.getCurrentSession().setFlushMode(org.hibernate.FlushMode.AUTO);
      }
    }
  }

  @Transient protected boolean isRequestVar = false;

  public boolean isRequestVar()
  { 
    return isRequestVar;
  }

  public void setRequestVar()
  { 
    isRequestVar = true;
  }

  public boolean equals(Object o)
  { 
    return o != null && o instanceof org.webdsl.WebDSLEntity && ((org.webdsl.WebDSLEntity)o).instanceOf("MyArticle") && org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy ? MyArticle.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()) : MyArticle.class.cast(o)).getId(), getId());
  }

  public MyArticle save(String webdslTypeName)
  { 
    setVersion(1);
    if(ThreadLocalPage.isReadOnly())
    { 
      org.webdsl.logging.Logger.error("page or ajax template is forced to be read-only, but an entity of type '" + webdslTypeName + "' is saved");
      utils.Warning.printSmallStackTrace(5);
    }
    utils.HibernateUtil.getCurrentSession().save(this);
    return this;
  }

  public MyArticle delete()
  { 
    validateDelete();
    setChanged();
    utils.HibernateUtil.getCurrentSession().delete(this);
    return this;
  }

  public int hashCode()
  { 
    if(getId() == null)
      return super.hashCode();
    else
      return getId().hashCode();
  }

  public int compareTo(org.webdsl.WebDSLEntity o)
  { 
    return getId().compareTo(((MyArticle)o).getId());
  }

  public boolean isInstance(Class<?> c)
  { 
    return c.isInstance(this);
  }

  public boolean instanceOf(String s)
  { 
    return s.equals("MyArticle") || s.equals("Object") || s.equals("Entity");
  }

  @Temporal(TemporalType.TIMESTAMP) @javax.persistence.Column(name = "\"_created\"") @org.hibernate.annotations.AccessType(value = "field") protected java.util.Date _created = null;

  public java.util.Date getCreated()
  { 
    return _created;
  }

  public boolean isCreatedUninitialized()
  { 
    return false;
  }

  public MyArticle setCreated(java.util.Date newitem)
  { 
    if(!createdBeingSet)
    { 
      createdBeingSet = true;
      setChanged();
      this.setCreatedDateTime_(newitem);
      java.util.Date olditem = _created;
      _created = newitem;
      createdBeingSet = false;
    }
    return this;
  }

  public void setCreatedNoEventsOrValidation(java.util.Date newitem)
  { 
    setChanged();
    java.util.Date olditem = _created;
    _created = newitem;
  }

  @Transient boolean createdBeingSet = false;

  @Temporal(TemporalType.TIMESTAMP) @javax.persistence.Column(name = "\"_modified\"") @org.hibernate.annotations.AccessType(value = "field") protected java.util.Date _modified = null;

  public java.util.Date getModified()
  { 
    return _modified;
  }

  public boolean isModifiedUninitialized()
  { 
    return false;
  }

  public MyArticle setModified(java.util.Date newitem)
  { 
    if(!modifiedBeingSet)
    { 
      modifiedBeingSet = true;
      setChanged();
      this.setModifiedDateTime_(newitem);
      java.util.Date olditem = _modified;
      _modified = newitem;
      modifiedBeingSet = false;
    }
    return this;
  }

  public void setModifiedNoEventsOrValidation(java.util.Date newitem)
  { 
    setChanged();
    java.util.Date olditem = _modified;
    _modified = newitem;
  }

  @Transient boolean modifiedBeingSet = false;

  @javax.persistence.Column(name = "\"_Title\"", length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _Title = "";

  public String getTitle()
  { 
    return _Title;
  }

  public boolean isTitleUninitialized()
  { 
    return false;
  }

  public MyArticle setTitle(String newitem)
  { 
    if(!TitleBeingSet)
    { 
      TitleBeingSet = true;
      setChanged();
      this.setTitleString_(newitem);
      String olditem = _Title;
      _Title = newitem;
      TitleBeingSet = false;
    }
    return this;
  }

  public void setTitleNoEventsOrValidation(String newitem)
  { 
    setChanged();
    String olditem = _Title;
    _Title = newitem;
  }

  @Transient boolean TitleBeingSet = false;

  @javax.persistence.Column(name = "\"_Content\"", length = 1000000) @org.hibernate.annotations.AccessType(value = "field") protected String _Content = "";

  public String getContent()
  { 
    return _Content;
  }

  public boolean isContentUninitialized()
  { 
    return false;
  }

  public MyArticle setContent(String newitem)
  { 
    if(!ContentBeingSet)
    { 
      ContentBeingSet = true;
      setChanged();
      this.setContentWikiText_(newitem);
      String olditem = _Content;
      _Content = newitem;
      ContentBeingSet = false;
    }
    return this;
  }

  public void setContentNoEventsOrValidation(String newitem)
  { 
    setChanged();
    String olditem = _Content;
    _Content = newitem;
  }

  @Transient boolean ContentBeingSet = false;

  @javax.persistence.Column(name = "\"_Author\"", length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _Author = "";

  public String getAuthor()
  { 
    return _Author;
  }

  public boolean isAuthorUninitialized()
  { 
    return false;
  }

  public MyArticle setAuthor(String newitem)
  { 
    if(!AuthorBeingSet)
    { 
      AuthorBeingSet = true;
      setChanged();
      this.setAuthorString_(newitem);
      String olditem = _Author;
      _Author = newitem;
      AuthorBeingSet = false;
    }
    return this;
  }

  public void setAuthorNoEventsOrValidation(String newitem)
  { 
    setChanged();
    String olditem = _Author;
    _Author = newitem;
  }

  @Transient boolean AuthorBeingSet = false;

  @javax.persistence.Column(name = "\"_CreateTime\"", length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _CreateTime = "";

  public String getCreateTime()
  { 
    return _CreateTime;
  }

  public boolean isCreateTimeUninitialized()
  { 
    return false;
  }

  public MyArticle setCreateTime(String newitem)
  { 
    if(!CreateTimeBeingSet)
    { 
      CreateTimeBeingSet = true;
      setChanged();
      this.setCreateTimeString_(newitem);
      String olditem = _CreateTime;
      _CreateTime = newitem;
      CreateTimeBeingSet = false;
    }
    return this;
  }

  public void setCreateTimeNoEventsOrValidation(String newitem)
  { 
    setChanged();
    String olditem = _CreateTime;
    _CreateTime = newitem;
  }

  @Transient boolean CreateTimeBeingSet = false;

  @javax.persistence.Column(name = "\"_count\"") @org.hibernate.annotations.AccessType(value = "field") protected Integer _count = 0;

  public Integer getCount()
  { 
    return _count;
  }

  public boolean isCountUninitialized()
  { 
    return false;
  }

  public MyArticle setCount(Integer newitem)
  { 
    if(!countBeingSet)
    { 
      countBeingSet = true;
      setChanged();
      this.setCountInt_(newitem);
      Integer olditem = _count;
      _count = newitem;
      countBeingSet = false;
    }
    return this;
  }

  public void setCountNoEventsOrValidation(Integer newitem)
  { 
    setChanged();
    Integer olditem = _count;
    _count = newitem;
  }

  @Transient boolean countBeingSet = false;

  public String getName()
  { 
    if(getId() != null)
    { 
      return getId().toString();
    }
    else
    { 
      return "";
    }
  }

  public String get_WebDslEntityType()
  { 
    return "MyArticle";
  }

  public void validateCount_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_)
  { }

  public webdsl.generated.domain.ValidationExceptionMultiple validateCount_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validateCount_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public void validateCreateTime_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_)
  { 
    if(!org.webdsl.tools.Utils.equal(this.getCreateTime(), null) && (!(org.webdsl.tools.Utils.equal(this.getCreateTime().length(), null) || org.webdsl.tools.Utils.equal(255, null)) && this.getCreateTime().length() > 255))
    { 
      v_.addToExceptions((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_(), webdsl.generated.domain.ValidationException.class)).setMessage("Value exceeds maximum length (" + 255 + ")"), webdsl.generated.domain.ValidationException.class));
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateCreateTime_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validateCreateTime_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public void validateAuthor_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_)
  { 
    if(!org.webdsl.tools.Utils.equal(this.getAuthor(), null) && (!(org.webdsl.tools.Utils.equal(this.getAuthor().length(), null) || org.webdsl.tools.Utils.equal(255, null)) && this.getAuthor().length() > 255))
    { 
      v_.addToExceptions((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_(), webdsl.generated.domain.ValidationException.class)).setMessage("Value exceeds maximum length (" + 255 + ")"), webdsl.generated.domain.ValidationException.class));
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateAuthor_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validateAuthor_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public void validateContent_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_)
  { 
    if(!org.webdsl.tools.Utils.equal(this.getContent(), null) && (!(org.webdsl.tools.Utils.equal(this.getContent().length(), null) || org.webdsl.tools.Utils.equal(1000000, null)) && this.getContent().length() > 1000000))
    { 
      v_.addToExceptions((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_(), webdsl.generated.domain.ValidationException.class)).setMessage("Value exceeds maximum length (" + 1000000 + ")"), webdsl.generated.domain.ValidationException.class));
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateContent_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validateContent_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public void validateTitle_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_)
  { 
    if(!org.webdsl.tools.Utils.equal(this.getTitle(), null) && (!(org.webdsl.tools.Utils.equal(this.getTitle().length(), null) || org.webdsl.tools.Utils.equal(255, null)) && this.getTitle().length() > 255))
    { 
      v_.addToExceptions((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_(), webdsl.generated.domain.ValidationException.class)).setMessage("Value exceeds maximum length (" + 255 + ")"), webdsl.generated.domain.ValidationException.class));
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateTitle_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validateTitle_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateSave_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validateAuthor_internalValidationExceptionMultiple_(v_);
    this.validateContent_internalValidationExceptionMultiple_(v_);
    this.validateCount_internalValidationExceptionMultiple_(v_);
    this.validateCreateTime_internalValidationExceptionMultiple_(v_);
    this.validateTitle_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public static java.util.List<org.webdsl.WebDSLEntity> $static$all_()
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("from MyArticle").list();
  }

  public java.util.List<org.webdsl.WebDSLEntity> all_()
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("from MyArticle").list();
  }

  public static java.util.List<webdsl.generated.domain.MyArticle> _static_findByTitle_(String prop_)
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from MyArticle as g where g._Title = :param0").setParameter("param0", prop_).list();
  }

  public static java.util.List<webdsl.generated.domain.MyArticle> _static_findByTitleLike_(String prop_)
  { 
    String s_ = "%" + prop_ + "%";
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from MyArticle as g where g._Title like :param1").setParameter("param1", s_).list();
  }

  public static java.util.List<webdsl.generated.domain.MyArticle> _static_findByContent_(String prop_)
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from MyArticle as g where g._Content = :param2").setParameter("param2", prop_).list();
  }

  public static java.util.List<webdsl.generated.domain.MyArticle> _static_findByContentLike_(String prop_)
  { 
    String s_ = "%" + prop_ + "%";
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from MyArticle as g where g._Content like :param3").setParameter("param3", s_).list();
  }

  public static java.util.List<webdsl.generated.domain.MyArticle> _static_findByAuthor_(String prop_)
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from MyArticle as g where g._Author = :param4").setParameter("param4", prop_).list();
  }

  public static java.util.List<webdsl.generated.domain.MyArticle> _static_findByAuthorLike_(String prop_)
  { 
    String s_ = "%" + prop_ + "%";
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from MyArticle as g where g._Author like :param5").setParameter("param5", s_).list();
  }

  public static java.util.List<webdsl.generated.domain.MyArticle> _static_findByCreateTime_(String prop_)
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from MyArticle as g where g._CreateTime = :param6").setParameter("param6", prop_).list();
  }

  public static java.util.List<webdsl.generated.domain.MyArticle> _static_findByCreateTimeLike_(String prop_)
  { 
    String s_ = "%" + prop_ + "%";
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from MyArticle as g where g._CreateTime like :param7").setParameter("param7", s_).list();
  }

  public static webdsl.generated.domain.MyArticle _static_load_(java.util.UUID prop_)
  { 
    return (webdsl.generated.domain.MyArticle)org.webdsl.tools.Utils.cast(utils.PageParamLoad.loadEntity(utils.HibernateUtil.getCurrentSession(), "webdsl.generated.domain" + "." + "MyArticle", prop_), webdsl.generated.domain.MyArticle.class);
  }

  public void setCreatedDateTime_(java.util.Date value_)
  { }

  public void setModifiedDateTime_(java.util.Date value_)
  { }

  public void setTitleString_(String value_)
  { }

  public void setContentWikiText_(String value_)
  { }

  public void setAuthorString_(String value_)
  { }

  public void setCreateTimeString_(String value_)
  { }

  public void setCountInt_(Integer value_)
  { }

  public webdsl.generated.domain.MyArticle MyArticle$this_()
  { 
    this.MyArticle_();
    return this;
  }

  public void MyArticle_()
  { }
}