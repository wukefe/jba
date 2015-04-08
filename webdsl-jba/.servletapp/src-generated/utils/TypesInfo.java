package utils;

import java.util.*;

public class TypesInfo  
{ 
  private static List<String> stringCompatibleTypes = Arrays.asList("Email", "Patch", "Secret", "String", "Text", "URL", "WikiText");

  public static List<String> getStringCompatibleTypes()
  { 
    return stringCompatibleTypes;
  }
}