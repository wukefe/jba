package webdsl.generated.domain;

import java.util.*;
import javax.persistence.*;
import webdsl.generated.domain.*;
import java.io.Serializable;
import utils.*;
import java.io.PrintWriter;
import org.webdsl.lang.Environment;

public @javax.persistence.Entity @javax.persistence.Table(name = "_SessionMessage") @org.hibernate.annotations.FilterDefs({}) @org.hibernate.annotations.Persister(impl = utils.SingleTableEntityPersister.class) @javax.persistence.DiscriminatorColumn(name = "DISCRIMINATOR", discriminatorType = javax.persistence.DiscriminatorType.STRING, length = 255) @SuppressWarnings("all") class SessionMessage  implements org.webdsl.WebDSLEntity, org.hibernate.bytecode.javassist.FieldHandled, org.webdsl.search.NoDynamicSearchFields
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

  public static SessionMessage _static_createEmpty_()
  { 
    SessionMessage ent = new SessionMessage();
    ent.setId(java.util.UUID.randomUUID());
    return ent;
  }

  public SessionMessage () 
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
      if(thepage != null && thepage.isReadOnly)
      { 
        org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in " + "SessionMessage");
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
    return o != null && o instanceof org.webdsl.WebDSLEntity && ((org.webdsl.WebDSLEntity)o).instanceOf("SessionMessage") && org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy ? SessionMessage.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()) : SessionMessage.class.cast(o)).getId(), getId());
  }

  public SessionMessage save(String webdslTypeName)
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

  public SessionMessage delete()
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
    return getId().compareTo(((SessionMessage)o).getId());
  }

  public boolean isInstance(Class<?> c)
  { 
    return c.isInstance(this);
  }

  public boolean instanceOf(String s)
  { 
    return s.equals("SessionMessage") || s.equals("Object") || s.equals("Entity");
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

  public SessionMessage setCreated(java.util.Date newitem)
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

  public SessionMessage setModified(java.util.Date newitem)
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

  @javax.persistence.Column(name = "\"_text\"", length = 1000000) @org.hibernate.annotations.AccessType(value = "field") protected String _text = "";

  public String getText()
  { 
    return _text;
  }

  public boolean isTextUninitialized()
  { 
    return false;
  }

  public SessionMessage setText(String newitem)
  { 
    if(!textBeingSet)
    { 
      textBeingSet = true;
      setChanged();
      this.setTextText_(newitem);
      String olditem = _text;
      _text = newitem;
      textBeingSet = false;
    }
    return this;
  }

  public void setTextNoEventsOrValidation(String newitem)
  { 
    setChanged();
    String olditem = _text;
    _text = newitem;
  }

  @Transient boolean textBeingSet = false;

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
    return "SessionMessage";
  }

  public void validateText_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_)
  { 
    if(!org.webdsl.tools.Utils.equal(this.getText(), null) && (!(org.webdsl.tools.Utils.equal(this.getText().length(), null) || org.webdsl.tools.Utils.equal(1000000, null)) && this.getText().length() > 1000000))
    { 
      v_.addToExceptions((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_(), webdsl.generated.domain.ValidationException.class)).setMessage("Value exceeds maximum length (" + 1000000 + ")"), webdsl.generated.domain.ValidationException.class));
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateText_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validateText_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateSave_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validateText_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public static java.util.List<org.webdsl.WebDSLEntity> $static$all_()
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("from SessionMessage").list();
  }

  public java.util.List<org.webdsl.WebDSLEntity> all_()
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("from SessionMessage").list();
  }

  public void setCreatedDateTime_(java.util.Date value_)
  { }

  public void setModifiedDateTime_(java.util.Date value_)
  { }

  public void setTextText_(String value_)
  { }

  public webdsl.generated.domain.SessionMessage SessionMessage$this_()
  { 
    this.SessionMessage_();
    return this;
  }

  public void SessionMessage_()
  { }

  public static java.util.List<webdsl.generated.domain.SessionMessage> _static_findByText_(String prop_)
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from SessionMessage as g where g._text = :param2").setParameter("param2", prop_).list();
  }

  public static java.util.List<webdsl.generated.domain.SessionMessage> _static_findByTextLike_(String prop_)
  { 
    String s_ = "%" + prop_ + "%";
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from SessionMessage as g where g._text like :param3").setParameter("param3", s_).list();
  }

  public static webdsl.generated.domain.SessionMessage _static_load_(java.util.UUID prop_)
  { 
    return (webdsl.generated.domain.SessionMessage)org.webdsl.tools.Utils.cast(utils.PageParamLoad.loadEntity(utils.HibernateUtil.getCurrentSession(), "webdsl.generated.domain" + "." + "SessionMessage", prop_), webdsl.generated.domain.SessionMessage.class);
  }
}