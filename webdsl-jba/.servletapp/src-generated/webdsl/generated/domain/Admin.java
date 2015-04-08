package webdsl.generated.domain;

import java.util.*;
import javax.persistence.*;
import webdsl.generated.domain.*;
import java.io.Serializable;
import utils.*;
import java.io.PrintWriter;
import org.webdsl.lang.Environment;

public @javax.persistence.Entity @javax.persistence.Table(name = "_Admin") @org.hibernate.annotations.FilterDefs({}) @org.hibernate.annotations.Persister(impl = utils.SingleTableEntityPersister.class) @javax.persistence.DiscriminatorColumn(name = "DISCRIMINATOR", discriminatorType = javax.persistence.DiscriminatorType.STRING, length = 255) @SuppressWarnings("all") class Admin  implements org.webdsl.WebDSLEntity, org.hibernate.bytecode.javassist.FieldHandled, org.webdsl.search.NoDynamicSearchFields
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

  public static Admin _static_createEmpty_()
  { 
    Admin ent = new Admin();
    ent.setId(java.util.UUID.randomUUID());
    return ent;
  }

  public Admin () 
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
        thepage.invalidateAllPageCache("Admin");
      }
      if(thepage != null && thepage.isReadOnly)
      { 
        org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in " + "Admin");
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
    return o != null && o instanceof org.webdsl.WebDSLEntity && ((org.webdsl.WebDSLEntity)o).instanceOf("Admin") && org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy ? Admin.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()) : Admin.class.cast(o)).getId(), getId());
  }

  public Admin save(String webdslTypeName)
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

  public Admin delete()
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
    return getId().compareTo(((Admin)o).getId());
  }

  public boolean isInstance(Class<?> c)
  { 
    return c.isInstance(this);
  }

  public boolean instanceOf(String s)
  { 
    return s.equals("Admin") || s.equals("Object") || s.equals("Entity");
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

  public Admin setCreated(java.util.Date newitem)
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

  public Admin setModified(java.util.Date newitem)
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

  @javax.persistence.Column(name = "\"_Username\"", length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _Username = "";

  public String getUsername()
  { 
    return _Username;
  }

  public boolean isUsernameUninitialized()
  { 
    return false;
  }

  public Admin setUsername(String newitem)
  { 
    if(!UsernameBeingSet)
    { 
      UsernameBeingSet = true;
      setChanged();
      this.setUsernameString_(newitem);
      String olditem = _Username;
      _Username = newitem;
      UsernameBeingSet = false;
    }
    return this;
  }

  public void setUsernameNoEventsOrValidation(String newitem)
  { 
    setChanged();
    String olditem = _Username;
    _Username = newitem;
  }

  @Transient boolean UsernameBeingSet = false;

  @javax.persistence.Column(name = "\"_Password\"", length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _Password = "";

  public String getPassword()
  { 
    return _Password;
  }

  public boolean isPasswordUninitialized()
  { 
    return false;
  }

  public Admin setPassword(String newitem)
  { 
    if(!PasswordBeingSet)
    { 
      PasswordBeingSet = true;
      setChanged();
      this.setPasswordString_(newitem);
      String olditem = _Password;
      _Password = newitem;
      PasswordBeingSet = false;
    }
    return this;
  }

  public void setPasswordNoEventsOrValidation(String newitem)
  { 
    setChanged();
    String olditem = _Password;
    _Password = newitem;
  }

  @Transient boolean PasswordBeingSet = false;

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
    return "Admin";
  }

  public void validatePassword_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_)
  { 
    if(!org.webdsl.tools.Utils.equal(this.getPassword(), null) && (!(org.webdsl.tools.Utils.equal(this.getPassword().length(), null) || org.webdsl.tools.Utils.equal(255, null)) && this.getPassword().length() > 255))
    { 
      v_.addToExceptions((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_(), webdsl.generated.domain.ValidationException.class)).setMessage("Value exceeds maximum length (" + 255 + ")"), webdsl.generated.domain.ValidationException.class));
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validatePassword_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validatePassword_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public void validateUsername_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_)
  { 
    if(!org.webdsl.tools.Utils.equal(this.getUsername(), null) && (!(org.webdsl.tools.Utils.equal(this.getUsername().length(), null) || org.webdsl.tools.Utils.equal(255, null)) && this.getUsername().length() > 255))
    { 
      v_.addToExceptions((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_(), webdsl.generated.domain.ValidationException.class)).setMessage("Value exceeds maximum length (" + 255 + ")"), webdsl.generated.domain.ValidationException.class));
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateUsername_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validateUsername_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateSave_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validatePassword_internalValidationExceptionMultiple_(v_);
    this.validateUsername_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public static java.util.List<org.webdsl.WebDSLEntity> $static$all_()
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("from Admin").list();
  }

  public java.util.List<org.webdsl.WebDSLEntity> all_()
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("from Admin").list();
  }

  public static java.util.List<webdsl.generated.domain.Admin> _static_findByUsername_(String prop_)
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from Admin as g where g._Username = :param2").setParameter("param2", prop_).list();
  }

  public static java.util.List<webdsl.generated.domain.Admin> _static_findByUsernameLike_(String prop_)
  { 
    String s_ = "%" + prop_ + "%";
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from Admin as g where g._Username like :param3").setParameter("param3", s_).list();
  }

  public static java.util.List<webdsl.generated.domain.Admin> _static_findByPassword_(String prop_)
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from Admin as g where g._Password = :param4").setParameter("param4", prop_).list();
  }

  public static java.util.List<webdsl.generated.domain.Admin> _static_findByPasswordLike_(String prop_)
  { 
    String s_ = "%" + prop_ + "%";
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from Admin as g where g._Password like :param5").setParameter("param5", s_).list();
  }

  public static webdsl.generated.domain.Admin _static_load_(java.util.UUID prop_)
  { 
    return (webdsl.generated.domain.Admin)org.webdsl.tools.Utils.cast(utils.PageParamLoad.loadEntity(utils.HibernateUtil.getCurrentSession(), "webdsl.generated.domain" + "." + "Admin", prop_), webdsl.generated.domain.Admin.class);
  }

  public void setCreatedDateTime_(java.util.Date value_)
  { }

  public void setModifiedDateTime_(java.util.Date value_)
  { }

  public void setUsernameString_(String value_)
  { }

  public void setPasswordString_(String value_)
  { }

  public webdsl.generated.domain.Admin Admin$this_()
  { 
    this.Admin_();
    return this;
  }

  public void Admin_()
  { }
}