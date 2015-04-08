package webdsl.generated.domain;

@SuppressWarnings("unchecked") public class SessionManagerMessagesList extends utils.OwnedList<webdsl.generated.domain.SessionMessage> 
{ 
  public SessionManagerMessagesList () 
  { 
    super();
  }

  public SessionManagerMessagesList (int anticipatedSize) 
  { 
    super(anticipatedSize);
  }

  public SessionManagerMessagesList (java.util.List<webdsl.generated.domain.SessionMessage> list) 
  { 
    super(list);
  }

  public SessionManagerMessagesList (Object owner) 
  { 
    super(owner);
  }

  public SessionManagerMessagesList (Object owner, int anticipatedSize) 
  { 
    super(owner, anticipatedSize);
  }

  public SessionManagerMessagesList (Object owner, java.util.List<webdsl.generated.domain.SessionMessage> list) 
  { 
    super(owner, list);
  }

  @Override public boolean addAll(java.util.Collection<? extends webdsl.generated.domain.SessionMessage> col)
  { 
    if(!doEvents)
    { 
      return super.addAll(col);
    }
    else
      if(this.owner == null)
      { 
        return super.addAll(col);
      }
      else
        if(!beingSet && doEvents)
        { 
          java.util.Iterator<? extends webdsl.generated.domain.SessionMessage> it = col.iterator();
          while(it.hasNext())
          { 
            add(it.next());
          }
          return true;
        }
    return super.addAll(col);
  }

  @Override public void clear()
  { 
    if(!doEvents)
    { 
      super.clear();
    }
    else
      if(this.owner == null)
      { 
        super.clear();
      }
      else
        if(!beingSet && doEvents)
        { 
          while(!isEmpty())
          { 
            remove(iterator().next());
          }
        }
  }

  @Override public boolean add(webdsl.generated.domain.SessionMessage item)
  { 
    if(!doEvents)
    { 
      return super.add(item);
    }
    else
      if(this.owner == null)
      { 
        return super.add(item);
      }
      else
        if(item != null && !beingSet && doEvents)
        { 
          SessionManager owner = (SessionManager)this.owner;
          owner.setChanged();
          beingSet = true;
          webdsl.generated.domain.SessionMessage oldthing = webdsl.generated.domain.SessionMessage._static_createEmpty_();
          boolean result = super.add(item);
          owner.addToMessagesSessionMessage_(item);
          beingSet = false;
          return result;
        }
    return false;
  }

  @Override public webdsl.generated.domain.SessionMessage set(int index, webdsl.generated.domain.SessionMessage newitem)
  { 
    if(!doEvents)
    { 
      return super.set(index, newitem);
    }
    else
      if(this.owner == null)
      { 
        return super.set(index, newitem);
      }
      else
        if(newitem != null && !beingSet && doEvents && index >= 0 && index < size())
        { 
          beingSet = true;
          SessionManager owner = (SessionManager)this.owner;
          owner.setChanged();
          webdsl.generated.domain.SessionMessage olditem = get(index);
          super.set(index, newitem);
          webdsl.generated.domain.SessionMessage item = olditem;
          if(!contains(item))
          { 
            owner.removeFromMessagesSessionMessage_(item);
          }
          item = newitem;
          owner.addToMessagesSessionMessage_(item);
          beingSet = false;
          return olditem;
        }
    return null;
  }

  @Override public void add(int index, webdsl.generated.domain.SessionMessage item)
  { 
    if(!doEvents)
    { 
      super.add(index, item);
    }
    else
      if(this.owner == null)
      { 
        super.add(index, item);
      }
      else
        if(item != null && !beingSet)
        { 
          SessionManager owner = (SessionManager)this.owner;
          owner.setChanged();
          beingSet = true;
          webdsl.generated.domain.SessionMessage oldthing = webdsl.generated.domain.SessionMessage._static_createEmpty_();
          super.add(index, item);
          owner.addToMessagesSessionMessage_(item);
          beingSet = false;
        }
  }

  @Override public webdsl.generated.domain.SessionMessage remove(int index)
  { 
    if(!doEvents)
    { 
      return super.remove(index);
    }
    else
      if(this.owner == null)
      { 
        return super.remove(index);
      }
      else
        if(index >= 0 && index < size() && !beingSet && doEvents)
        { 
          beingSet = true;
          SessionManager owner = (SessionManager)this.owner;
          owner.setChanged();
          webdsl.generated.domain.SessionMessage item = super.remove(index);
          if(!contains(item))
          { 
            owner.removeFromMessagesSessionMessage_(item);
          }
          beingSet = false;
          return item;
        }
    return null;
  }

  @Override public boolean remove(Object obj)
  { 
    if(!doEvents)
    { 
      return super.remove(obj);
    }
    else
      if(this.owner == null)
      { 
        return super.remove(obj);
      }
      else
        if(obj != null && !beingSet && doEvents && obj instanceof webdsl.generated.domain.SessionMessage)
        { 
          webdsl.generated.domain.SessionMessage item = (webdsl.generated.domain.SessionMessage)obj;
          SessionManager owner = (SessionManager)this.owner;
          beingSet = true;
          owner.setChanged();
          boolean result = super.remove(item);
          if(!contains(item))
          { 
            owner.removeFromMessagesSessionMessage_(item);
          }
          beingSet = false;
          return result;
        }
    return false;
  }
}