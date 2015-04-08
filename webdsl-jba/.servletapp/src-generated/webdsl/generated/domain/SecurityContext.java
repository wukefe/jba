package webdsl.generated.domain;

import java.util.*;
import javax.persistence.*;
import webdsl.generated.domain.*;
import java.io.Serializable;
import utils.*;
import java.io.PrintWriter;
import org.webdsl.lang.Environment;

public @Entity @javax.persistence.Table(name = "_SecurityContext") @SuppressWarnings("all") class SecurityContext  implements org.webdsl.WebDSLEntity, org.hibernate.bytecode.javassist.FieldHandled
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

  public static SecurityContext _static_createEmpty_()
  { 
    SecurityContext ent = new SecurityContext();
    ent.setId(java.util.UUID.randomUUID());
    return ent;
  }

  public SecurityContext () 
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

  @Version @Column(name = "version_opt_lock") protected Integer _version = 1;

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
      if(thepage != null && !thepage.invalidateUserSpecificPageCache && !thepage.invalidateAllPageCache)
      { 
        ((webdsl.generated.domain.SessionManager)ThreadLocalServlet.get().getSessionManager()).setSessionHasChangesNoEventsOrValidation(true);
        thepage.invalidateUserSpecificPageCache("SecurityContext");
      }
      if(thepage != null && thepage.isReadOnly)
      { 
        org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in " + "SecurityContext");
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
    return o != null && o instanceof org.webdsl.WebDSLEntity && ((org.webdsl.WebDSLEntity)o).instanceOf("SecurityContext") && org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy ? SecurityContext.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()) : SecurityContext.class.cast(o)).getId(), getId());
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
    return getId().compareTo(((SecurityContext)o).getId());
  }

  public boolean isInstance(Class<?> c)
  { 
    return c.isInstance(this);
  }

  public boolean instanceOf(String s)
  { 
    return s.equals("SecurityContext") || s.equals("Object") || s.equals("Entity");
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

  public SecurityContext setCreated(java.util.Date newitem)
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

  public SecurityContext setModified(java.util.Date newitem)
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

  @ManyToOne(fetch = javax.persistence.FetchType.LAZY) @JoinColumn(name = "\"SecurityContext_principal\"") @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST, org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.MERGE}) @org.hibernate.annotations.AccessType(value = "field") protected webdsl.generated.domain.Admin _principal = null;

  public webdsl.generated.domain.Admin getPrincipal()
  { 
    return _principal;
  }

  public boolean isPrincipalUninitialized()
  { 
    return _principal instanceof org.hibernate.proxy.HibernateProxy && ((org.hibernate.proxy.HibernateProxy)_principal).getHibernateLazyInitializer().isUninitialized();
  }

  public SecurityContext setPrincipal(webdsl.generated.domain.Admin newitem)
  { 
    if(!principalBeingSet)
    { 
      principalBeingSet = true;
      setChanged();
      this.setPrincipalAdmin_(newitem);
      webdsl.generated.domain.Admin olditem = _principal;
      _principal = newitem;
      principalBeingSet = false;
    }
    return this;
  }

  public void setPrincipalNoEventsOrValidation(webdsl.generated.domain.Admin newitem)
  { 
    setChanged();
    webdsl.generated.domain.Admin olditem = _principal;
    _principal = newitem;
  }

  @Transient boolean principalBeingSet = false;

  public Boolean getLoggedIn()
  { 
    return !org.webdsl.tools.Utils.equal(this.getPrincipal(), null);
  }

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

  @Transient protected java.util.UUID principalIdent = null;

  public java.util.UUID getPrincipalIdent()
  { 
    return principalIdent;
  }

  public void setPrincipalIdent(java.util.UUID newitem)
  { 
    principalIdent = newitem;
  }

  public String get_WebDslEntityType()
  { 
    return "SecurityContext";
  }

  public java.util.List<webdsl.generated.domain.Admin> allowedPrincipal_()
  { 
    return (java.util.List<webdsl.generated.domain.Admin>)(java.util.List<?>)webdsl.generated.domain.Admin.$static$all_();
  }

  public void validatePrincipal_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_)
  { }

  public webdsl.generated.domain.ValidationExceptionMultiple validatePrincipal_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validatePrincipal_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateSave_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    return v_;
  }

  public static java.util.List<org.webdsl.WebDSLEntity> $static$all_()
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("from SecurityContext").list();
  }

  public java.util.List<org.webdsl.WebDSLEntity> all_()
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("from SecurityContext").list();
  }

  public void setCreatedDateTime_(java.util.Date value_)
  { }

  public void setModifiedDateTime_(java.util.Date value_)
  { }

  public void setPrincipalAdmin_(webdsl.generated.domain.Admin value_)
  { }

  public webdsl.generated.domain.SecurityContext SecurityContext$this_()
  { 
    this.SecurityContext_();
    return this;
  }

  public void SecurityContext_()
  { }
}