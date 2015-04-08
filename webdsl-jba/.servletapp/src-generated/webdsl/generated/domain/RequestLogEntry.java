package webdsl.generated.domain;

import java.util.*;
import javax.persistence.*;
import webdsl.generated.domain.*;
import java.io.Serializable;
import utils.*;
import java.io.PrintWriter;
import org.webdsl.lang.Environment;

public @javax.persistence.Entity @javax.persistence.Table(name = "_RequestLogEntry") @org.hibernate.annotations.FilterDefs({}) @org.hibernate.annotations.Persister(impl = utils.SingleTableEntityPersister.class) @javax.persistence.DiscriminatorColumn(name = "DISCRIMINATOR", discriminatorType = javax.persistence.DiscriminatorType.STRING, length = 255) @SuppressWarnings("all") class RequestLogEntry  implements org.webdsl.WebDSLEntity, org.hibernate.bytecode.javassist.FieldHandled, org.webdsl.search.NoDynamicSearchFields
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

  public static RequestLogEntry _static_createEmpty_()
  { 
    RequestLogEntry ent = new RequestLogEntry();
    ent.setId(java.util.UUID.randomUUID());
    return ent;
  }

  public RequestLogEntry () 
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
        thepage.invalidateAllPageCache("RequestLogEntry");
      }
      if(thepage != null && thepage.isReadOnly)
      { 
        org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in " + "RequestLogEntry");
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
    return o != null && o instanceof org.webdsl.WebDSLEntity && ((org.webdsl.WebDSLEntity)o).instanceOf("RequestLogEntry") && org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy ? RequestLogEntry.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()) : RequestLogEntry.class.cast(o)).getId(), getId());
  }

  public RequestLogEntry save(String webdslTypeName)
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

  public RequestLogEntry delete()
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
    return getId().compareTo(((RequestLogEntry)o).getId());
  }

  public boolean isInstance(Class<?> c)
  { 
    return c.isInstance(this);
  }

  public boolean instanceOf(String s)
  { 
    return s.equals("RequestLogEntry") || s.equals("Object") || s.equals("Entity");
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

  public RequestLogEntry setCreated(java.util.Date newitem)
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

  public RequestLogEntry setModified(java.util.Date newitem)
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

  @ManyToOne(fetch = javax.persistence.FetchType.LAZY) @JoinColumn(name = "\"RequestLogEntry_principal\"") @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST, org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.MERGE}) @org.hibernate.annotations.AccessType(value = "field") protected webdsl.generated.domain.Admin _principal = null;

  public webdsl.generated.domain.Admin getPrincipal()
  { 
    return _principal;
  }

  public boolean isPrincipalUninitialized()
  { 
    return _principal instanceof org.hibernate.proxy.HibernateProxy && ((org.hibernate.proxy.HibernateProxy)_principal).getHibernateLazyInitializer().isUninitialized();
  }

  public RequestLogEntry setPrincipal(webdsl.generated.domain.Admin newitem)
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

  @javax.persistence.Column(name = "\"_name\"", length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _name = "";

  public String getName()
  { 
    return _name;
  }

  public boolean isNameUninitialized()
  { 
    return false;
  }

  public RequestLogEntry setName(String newitem)
  { 
    if(!nameBeingSet)
    { 
      nameBeingSet = true;
      setChanged();
      this.setNameString_(newitem);
      String olditem = _name;
      _name = newitem;
      nameBeingSet = false;
    }
    return this;
  }

  public void setNameNoEventsOrValidation(String newitem)
  { 
    setChanged();
    String olditem = _name;
    _name = newitem;
  }

  @Transient boolean nameBeingSet = false;

  @javax.persistence.Column(name = "\"_requestedURL\"", length = 1000000) @org.hibernate.annotations.AccessType(value = "field") protected String _requestedURL = "";

  public String getRequestedURL()
  { 
    return _requestedURL;
  }

  public boolean isRequestedURLUninitialized()
  { 
    return false;
  }

  public RequestLogEntry setRequestedURL(String newitem)
  { 
    if(!requestedURLBeingSet)
    { 
      requestedURLBeingSet = true;
      setChanged();
      this.setRequestedURLText_(newitem);
      String olditem = _requestedURL;
      _requestedURL = newitem;
      requestedURLBeingSet = false;
    }
    return this;
  }

  public void setRequestedURLNoEventsOrValidation(String newitem)
  { 
    setChanged();
    String olditem = _requestedURL;
    _requestedURL = newitem;
  }

  @Transient boolean requestedURLBeingSet = false;

  @Temporal(TemporalType.TIMESTAMP) @javax.persistence.Column(name = "\"_start\"") @org.hibernate.annotations.AccessType(value = "field") protected java.util.Date _start = null;

  public java.util.Date getStart()
  { 
    return _start;
  }

  public boolean isStartUninitialized()
  { 
    return false;
  }

  public RequestLogEntry setStart(java.util.Date newitem)
  { 
    if(!startBeingSet)
    { 
      startBeingSet = true;
      setChanged();
      this.setStartDateTime_(newitem);
      java.util.Date olditem = _start;
      _start = newitem;
      startBeingSet = false;
    }
    return this;
  }

  public void setStartNoEventsOrValidation(java.util.Date newitem)
  { 
    setChanged();
    java.util.Date olditem = _start;
    _start = newitem;
  }

  @Transient boolean startBeingSet = false;

  @Temporal(TemporalType.TIMESTAMP) @javax.persistence.Column(name = "\"_end\"") @org.hibernate.annotations.AccessType(value = "field") protected java.util.Date _end = null;

  public java.util.Date getEnd()
  { 
    return _end;
  }

  public boolean isEndUninitialized()
  { 
    return false;
  }

  public RequestLogEntry setEnd(java.util.Date newitem)
  { 
    if(!endBeingSet)
    { 
      endBeingSet = true;
      setChanged();
      this.setEndDateTime_(newitem);
      java.util.Date olditem = _end;
      _end = newitem;
      endBeingSet = false;
    }
    return this;
  }

  public void setEndNoEventsOrValidation(java.util.Date newitem)
  { 
    setChanged();
    java.util.Date olditem = _end;
    _end = newitem;
  }

  @Transient boolean endBeingSet = false;

  @javax.persistence.Column(name = "\"_clientIP\"", length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _clientIP = "";

  public String getClientIP()
  { 
    return _clientIP;
  }

  public boolean isClientIPUninitialized()
  { 
    return false;
  }

  public RequestLogEntry setClientIP(String newitem)
  { 
    if(!clientIPBeingSet)
    { 
      clientIPBeingSet = true;
      setChanged();
      this.setClientIPString_(newitem);
      String olditem = _clientIP;
      _clientIP = newitem;
      clientIPBeingSet = false;
    }
    return this;
  }

  public void setClientIPNoEventsOrValidation(String newitem)
  { 
    setChanged();
    String olditem = _clientIP;
    _clientIP = newitem;
  }

  @Transient boolean clientIPBeingSet = false;

  @javax.persistence.Column(name = "\"_clientPort\"") @org.hibernate.annotations.AccessType(value = "field") protected Integer _clientPort = 0;

  public Integer getClientPort()
  { 
    return _clientPort;
  }

  public boolean isClientPortUninitialized()
  { 
    return false;
  }

  public RequestLogEntry setClientPort(Integer newitem)
  { 
    if(!clientPortBeingSet)
    { 
      clientPortBeingSet = true;
      setChanged();
      this.setClientPortInt_(newitem);
      Integer olditem = _clientPort;
      _clientPort = newitem;
      clientPortBeingSet = false;
    }
    return this;
  }

  public void setClientPortNoEventsOrValidation(Integer newitem)
  { 
    setChanged();
    Integer olditem = _clientPort;
    _clientPort = newitem;
  }

  @Transient boolean clientPortBeingSet = false;

  @javax.persistence.Column(name = "\"_method\"", length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _method = "";

  public String getMethod()
  { 
    return _method;
  }

  public boolean isMethodUninitialized()
  { 
    return false;
  }

  public RequestLogEntry setMethod(String newitem)
  { 
    if(!methodBeingSet)
    { 
      methodBeingSet = true;
      setChanged();
      this.setMethodString_(newitem);
      String olditem = _method;
      _method = newitem;
      methodBeingSet = false;
    }
    return this;
  }

  public void setMethodNoEventsOrValidation(String newitem)
  { 
    setChanged();
    String olditem = _method;
    _method = newitem;
  }

  @Transient boolean methodBeingSet = false;

  @javax.persistence.Column(name = "\"_referer\"", length = 1000000) @org.hibernate.annotations.AccessType(value = "field") protected String _referer = "";

  public String getReferer()
  { 
    return _referer;
  }

  public boolean isRefererUninitialized()
  { 
    return false;
  }

  public RequestLogEntry setReferer(String newitem)
  { 
    if(!refererBeingSet)
    { 
      refererBeingSet = true;
      setChanged();
      this.setRefererText_(newitem);
      String olditem = _referer;
      _referer = newitem;
      refererBeingSet = false;
    }
    return this;
  }

  public void setRefererNoEventsOrValidation(String newitem)
  { 
    setChanged();
    String olditem = _referer;
    _referer = newitem;
  }

  @Transient boolean refererBeingSet = false;

  @javax.persistence.Column(name = "\"_userAgent\"", length = 1000000) @org.hibernate.annotations.AccessType(value = "field") protected String _userAgent = "";

  public String getUserAgent()
  { 
    return _userAgent;
  }

  public boolean isUserAgentUninitialized()
  { 
    return false;
  }

  public RequestLogEntry setUserAgent(String newitem)
  { 
    if(!userAgentBeingSet)
    { 
      userAgentBeingSet = true;
      setChanged();
      this.setUserAgentText_(newitem);
      String olditem = _userAgent;
      _userAgent = newitem;
      userAgentBeingSet = false;
    }
    return this;
  }

  public void setUserAgentNoEventsOrValidation(String newitem)
  { 
    setChanged();
    String olditem = _userAgent;
    _userAgent = newitem;
  }

  @Transient boolean userAgentBeingSet = false;

  public String get_WebDslEntityType()
  { 
    return "RequestLogEntry";
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

  public void validateUserAgent_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_)
  { 
    if(!org.webdsl.tools.Utils.equal(this.getUserAgent(), null) && (!(org.webdsl.tools.Utils.equal(this.getUserAgent().length(), null) || org.webdsl.tools.Utils.equal(1000000, null)) && this.getUserAgent().length() > 1000000))
    { 
      v_.addToExceptions((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_(), webdsl.generated.domain.ValidationException.class)).setMessage("Value exceeds maximum length (" + 1000000 + ")"), webdsl.generated.domain.ValidationException.class));
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateUserAgent_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validateUserAgent_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public void validateReferer_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_)
  { 
    if(!org.webdsl.tools.Utils.equal(this.getReferer(), null) && (!(org.webdsl.tools.Utils.equal(this.getReferer().length(), null) || org.webdsl.tools.Utils.equal(1000000, null)) && this.getReferer().length() > 1000000))
    { 
      v_.addToExceptions((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_(), webdsl.generated.domain.ValidationException.class)).setMessage("Value exceeds maximum length (" + 1000000 + ")"), webdsl.generated.domain.ValidationException.class));
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateReferer_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validateReferer_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public void validateMethod_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_)
  { 
    if(!org.webdsl.tools.Utils.equal(this.getMethod(), null) && (!(org.webdsl.tools.Utils.equal(this.getMethod().length(), null) || org.webdsl.tools.Utils.equal(255, null)) && this.getMethod().length() > 255))
    { 
      v_.addToExceptions((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_(), webdsl.generated.domain.ValidationException.class)).setMessage("Value exceeds maximum length (" + 255 + ")"), webdsl.generated.domain.ValidationException.class));
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateMethod_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validateMethod_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public void validateClientPort_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_)
  { }

  public webdsl.generated.domain.ValidationExceptionMultiple validateClientPort_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validateClientPort_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public void validateClientIP_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_)
  { 
    if(!org.webdsl.tools.Utils.equal(this.getClientIP(), null) && (!(org.webdsl.tools.Utils.equal(this.getClientIP().length(), null) || org.webdsl.tools.Utils.equal(255, null)) && this.getClientIP().length() > 255))
    { 
      v_.addToExceptions((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_(), webdsl.generated.domain.ValidationException.class)).setMessage("Value exceeds maximum length (" + 255 + ")"), webdsl.generated.domain.ValidationException.class));
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateClientIP_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validateClientIP_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public void validateEnd_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_)
  { }

  public webdsl.generated.domain.ValidationExceptionMultiple validateEnd_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validateEnd_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public void validateStart_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_)
  { }

  public webdsl.generated.domain.ValidationExceptionMultiple validateStart_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validateStart_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public void validateRequestedURL_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_)
  { 
    if(!org.webdsl.tools.Utils.equal(this.getRequestedURL(), null) && (!(org.webdsl.tools.Utils.equal(this.getRequestedURL().length(), null) || org.webdsl.tools.Utils.equal(1000000, null)) && this.getRequestedURL().length() > 1000000))
    { 
      v_.addToExceptions((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_(), webdsl.generated.domain.ValidationException.class)).setMessage("Value exceeds maximum length (" + 1000000 + ")"), webdsl.generated.domain.ValidationException.class));
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateRequestedURL_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validateRequestedURL_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public void validateName_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_)
  { 
    if(!org.webdsl.tools.Utils.equal(this.getName(), null) && (!(org.webdsl.tools.Utils.equal(this.getName().length(), null) || org.webdsl.tools.Utils.equal(255, null)) && this.getName().length() > 255))
    { 
      v_.addToExceptions((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_(), webdsl.generated.domain.ValidationException.class)).setMessage("Value exceeds maximum length (" + 255 + ")"), webdsl.generated.domain.ValidationException.class));
    }
    else
    { }
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateName_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validateName_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public webdsl.generated.domain.ValidationExceptionMultiple validateSave_()
  { 
    webdsl.generated.domain.ValidationExceptionMultiple v_ = webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
    this.validateClientIP_internalValidationExceptionMultiple_(v_);
    this.validateClientPort_internalValidationExceptionMultiple_(v_);
    this.validateEnd_internalValidationExceptionMultiple_(v_);
    this.validateMethod_internalValidationExceptionMultiple_(v_);
    this.validateName_internalValidationExceptionMultiple_(v_);
    this.validatePrincipal_internalValidationExceptionMultiple_(v_);
    this.validateReferer_internalValidationExceptionMultiple_(v_);
    this.validateRequestedURL_internalValidationExceptionMultiple_(v_);
    this.validateStart_internalValidationExceptionMultiple_(v_);
    this.validateUserAgent_internalValidationExceptionMultiple_(v_);
    return v_;
  }

  public static java.util.List<org.webdsl.WebDSLEntity> $static$all_()
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("from RequestLogEntry").list();
  }

  public java.util.List<org.webdsl.WebDSLEntity> all_()
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("from RequestLogEntry").list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByName_(String prop_)
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from RequestLogEntry as g where g._name = :param6").setParameter("param6", prop_).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByNameLike_(String prop_)
  { 
    String s_ = "%" + prop_ + "%";
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from RequestLogEntry as g where g._name like :param7").setParameter("param7", s_).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByRequestedURL_(String prop_)
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from RequestLogEntry as g where g._requestedURL = :param8").setParameter("param8", prop_).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByRequestedURLLike_(String prop_)
  { 
    String s_ = "%" + prop_ + "%";
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from RequestLogEntry as g where g._requestedURL like :param9").setParameter("param9", s_).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByClientIP_(String prop_)
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from RequestLogEntry as g where g._clientIP = :param10").setParameter("param10", prop_).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByClientIPLike_(String prop_)
  { 
    String s_ = "%" + prop_ + "%";
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from RequestLogEntry as g where g._clientIP like :param11").setParameter("param11", s_).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByMethod_(String prop_)
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from RequestLogEntry as g where g._method = :param12").setParameter("param12", prop_).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByMethodLike_(String prop_)
  { 
    String s_ = "%" + prop_ + "%";
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from RequestLogEntry as g where g._method like :param13").setParameter("param13", s_).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByReferer_(String prop_)
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from RequestLogEntry as g where g._referer = :param14").setParameter("param14", prop_).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByRefererLike_(String prop_)
  { 
    String s_ = "%" + prop_ + "%";
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from RequestLogEntry as g where g._referer like :param15").setParameter("param15", s_).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByUserAgent_(String prop_)
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from RequestLogEntry as g where g._userAgent = :param16").setParameter("param16", prop_).list();
  }

  public static java.util.List<webdsl.generated.domain.RequestLogEntry> _static_findByUserAgentLike_(String prop_)
  { 
    String s_ = "%" + prop_ + "%";
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from RequestLogEntry as g where g._userAgent like :param17").setParameter("param17", s_).list();
  }

  public static webdsl.generated.domain.RequestLogEntry _static_load_(java.util.UUID prop_)
  { 
    return (webdsl.generated.domain.RequestLogEntry)org.webdsl.tools.Utils.cast(utils.PageParamLoad.loadEntity(utils.HibernateUtil.getCurrentSession(), "webdsl.generated.domain" + "." + "RequestLogEntry", prop_), webdsl.generated.domain.RequestLogEntry.class);
  }

  public void setCreatedDateTime_(java.util.Date value_)
  { }

  public void setModifiedDateTime_(java.util.Date value_)
  { }

  public void setNameString_(String value_)
  { }

  public void setRequestedURLText_(String value_)
  { }

  public void setStartDateTime_(java.util.Date value_)
  { }

  public void setEndDateTime_(java.util.Date value_)
  { }

  public void setClientIPString_(String value_)
  { }

  public void setClientPortInt_(Integer value_)
  { }

  public void setMethodString_(String value_)
  { }

  public void setRefererText_(String value_)
  { }

  public void setUserAgentText_(String value_)
  { }

  public webdsl.generated.domain.RequestLogEntry RequestLogEntry$this_()
  { 
    this.RequestLogEntry_();
    return this;
  }

  public void RequestLogEntry_()
  { }

  public void setPrincipalAdmin_(webdsl.generated.domain.Admin value_)
  { }
}