package webdsl.generated.domain;

import webdsl.generated.search.dummy_webdsl_entitySearcher;
import java.util.*;
import javax.persistence.*;
import webdsl.generated.domain.*;
import java.io.Serializable;
import utils.*;
import java.io.PrintWriter;
import org.webdsl.lang.Environment;

public @javax.persistence.Entity @javax.persistence.Table(name = "_dummy_webdsl_entity") @org.hibernate.search.annotations.Indexed @org.hibernate.search.annotations.FullTextFilterDefs({@org.hibernate.search.annotations.FullTextFilterDef(name = "fieldConstraintFilter0", impl = org.webdsl.search.FieldConstraintFilter.class), @org.hibernate.search.annotations.FullTextFilterDef(name = "fieldConstraintFilter1", impl = org.webdsl.search.FieldConstraintFilter.class), @org.hibernate.search.annotations.FullTextFilterDef(name = "fieldConstraintFilter2", impl = org.webdsl.search.FieldConstraintFilter.class), @org.hibernate.search.annotations.FullTextFilterDef(name = "fieldConstraintFilter3", impl = org.webdsl.search.FieldConstraintFilter.class), @org.hibernate.search.annotations.FullTextFilterDef(name = "fieldConstraintFilter4", impl = org.webdsl.search.FieldConstraintFilter.class), @org.hibernate.search.annotations.FullTextFilterDef(name = "namespaceConstraintFilter", impl = org.webdsl.search.NamespaceConstraintFilter.class)}) @org.hibernate.search.annotations.AnalyzerDefs({@org.hibernate.search.annotations.AnalyzerDef(name = "default", charFilters = {}, tokenizer = @org.hibernate.search.annotations.TokenizerDef(factory = org.apache.solr.analysis.StandardTokenizerFactory.class, params = {}), filters = {@org.hibernate.search.annotations.TokenFilterDef(factory = org.apache.solr.analysis.StandardFilterFactory.class, params = {}), @org.hibernate.search.annotations.TokenFilterDef(factory = org.apache.solr.analysis.LowerCaseFilterFactory.class, params = {}), @org.hibernate.search.annotations.TokenFilterDef(factory = org.apache.solr.analysis.StopFilterFactory.class, params = {})})}) @org.hibernate.annotations.FilterDefs({}) @org.hibernate.annotations.Persister(impl = utils.SingleTableEntityPersister.class) @javax.persistence.DiscriminatorColumn(name = "DISCRIMINATOR", discriminatorType = javax.persistence.DiscriminatorType.STRING, length = 255) @SuppressWarnings("all") class dummy_webdsl_entity  implements org.webdsl.WebDSLEntity, org.hibernate.bytecode.javassist.FieldHandled, org.webdsl.search.NoDynamicSearchFields
{ 
  public static java.util.List<webdsl.generated.domain.dummy_webdsl_entity> _static_searchdummy_webdsl_entity_(String searchQuery)
  { 
    return _static_searchdummy_webdsl_entity_(searchQuery, 1000, 0);
  }

  public static java.util.List<webdsl.generated.domain.dummy_webdsl_entity> _static_searchdummy_webdsl_entity_(String searchQuery, int limit)
  { 
    return _static_searchdummy_webdsl_entity_(searchQuery, limit, 0);
  }

  public static java.util.List<webdsl.generated.domain.dummy_webdsl_entity> _static_searchdummy_webdsl_entity_(String searchQuery, int limit, int offset)
  { 
    return new dummy_webdsl_entitySearcher().query(searchQuery).setOffset(offset).setLimit(limit).results();
  }

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

  public static dummy_webdsl_entity _static_createEmpty_()
  { 
    dummy_webdsl_entity ent = new dummy_webdsl_entity();
    ent.setId(java.util.UUID.randomUUID());
    return ent;
  }

  public dummy_webdsl_entity () 
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
        thepage.invalidateAllPageCache("dummy_webdsl_entity");
      }
      if(thepage != null && thepage.isReadOnly)
      { 
        org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in " + "dummy_webdsl_entity");
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
    return o != null && o instanceof org.webdsl.WebDSLEntity && ((org.webdsl.WebDSLEntity)o).instanceOf("dummy_webdsl_entity") && org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy ? dummy_webdsl_entity.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()) : dummy_webdsl_entity.class.cast(o)).getId(), getId());
  }

  public dummy_webdsl_entity save(String webdslTypeName)
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

  public dummy_webdsl_entity delete()
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
    return getId().compareTo(((dummy_webdsl_entity)o).getId());
  }

  public boolean isInstance(Class<?> c)
  { 
    return c.isInstance(this);
  }

  public boolean instanceOf(String s)
  { 
    return s.equals("dummy_webdsl_entity") || s.equals("Object") || s.equals("Entity");
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

  public dummy_webdsl_entity setCreated(java.util.Date newitem)
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

  public dummy_webdsl_entity setModified(java.util.Date newitem)
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

  @javax.persistence.Column(name = "\"_text\"", length = 255) @org.hibernate.annotations.AccessType(value = "field") @org.hibernate.search.annotations.Fields({@org.hibernate.search.annotations.Field(analyzer = @org.hibernate.search.annotations.Analyzer(definition = "default"), name = "text")}) protected String _text = "";

  public String getText()
  { 
    return _text;
  }

  public boolean isTextUninitialized()
  { 
    return false;
  }

  public dummy_webdsl_entity setText(String newitem)
  { 
    if(!textBeingSet)
    { 
      textBeingSet = true;
      setChanged();
      this.setTextString_(newitem);
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
    return "dummy_webdsl_entity";
  }

  public void validateText_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_)
  { 
    if(!org.webdsl.tools.Utils.equal(this.getText(), null) && (!(org.webdsl.tools.Utils.equal(this.getText().length(), null) || org.webdsl.tools.Utils.equal(255, null)) && this.getText().length() > 255))
    { 
      v_.addToExceptions((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_(), webdsl.generated.domain.ValidationException.class)).setMessage("Value exceeds maximum length (" + 255 + ")"), webdsl.generated.domain.ValidationException.class));
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
    return utils.HibernateUtil.getCurrentSession().createQuery("from dummy_webdsl_entity").list();
  }

  public java.util.List<org.webdsl.WebDSLEntity> all_()
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("from dummy_webdsl_entity").list();
  }

  public void setCreatedDateTime_(java.util.Date value_)
  { }

  public void setModifiedDateTime_(java.util.Date value_)
  { }

  public void setTextString_(String value_)
  { }

  public webdsl.generated.domain.dummy_webdsl_entity dummy_webdsl_entity$this_()
  { 
    this.dummy_webdsl_entity_();
    return this;
  }

  public void dummy_webdsl_entity_()
  { }

  public static java.util.List<webdsl.generated.domain.dummy_webdsl_entity> _static_findByText_(String prop_)
  { 
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from dummy_webdsl_entity as g where g._text = :param0").setParameter("param0", prop_).list();
  }

  public static java.util.List<webdsl.generated.domain.dummy_webdsl_entity> _static_findByTextLike_(String prop_)
  { 
    String s_ = "%" + prop_ + "%";
    return utils.HibernateUtil.getCurrentSession().createQuery("select g from dummy_webdsl_entity as g where g._text like :param1").setParameter("param1", s_).list();
  }

  public static webdsl.generated.domain.dummy_webdsl_entity _static_load_(java.util.UUID prop_)
  { 
    return (webdsl.generated.domain.dummy_webdsl_entity)org.webdsl.tools.Utils.cast(utils.PageParamLoad.loadEntity(utils.HibernateUtil.getCurrentSession(), "webdsl.generated.domain" + "." + "dummy_webdsl_entity", prop_), webdsl.generated.domain.dummy_webdsl_entity.class);
  }
}