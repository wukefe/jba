package webdsl.generated.templates;

import java.util.Map;
import java.util.HashMap;

public class AttributeCollectionLookup  
{ 
  public static Map<String, utils.AbstractAttributeCollection> attributeCollections = new HashMap<String, utils.AbstractAttributeCollection>();

  static
  { 
    utils.AbstractAttributeCollection submitlinkInstance = new AttributeCollectionsubmitlink();
    submitlinkInstance.init();
    attributeCollections.put("submitlink", submitlinkInstance);
    utils.AbstractAttributeCollection submitInstance = new AttributeCollectionsubmit();
    submitInstance.init();
    attributeCollections.put("submit", submitInstance);
    utils.AbstractAttributeCollection radioInstance = new AttributeCollectionradio();
    radioInstance.init();
    attributeCollections.put("radio", radioInstance);
    utils.AbstractAttributeCollection outputimageInstance = new AttributeCollectionoutputimage();
    outputimageInstance.init();
    attributeCollections.put("outputimage", outputimageInstance);
    utils.AbstractAttributeCollection navigatebuttonInstance = new AttributeCollectionnavigatebutton();
    navigatebuttonInstance.init();
    attributeCollections.put("navigatebutton", navigatebuttonInstance);
    utils.AbstractAttributeCollection navigateInstance = new AttributeCollectionnavigate();
    navigateInstance.init();
    attributeCollections.put("navigate", navigateInstance);
    utils.AbstractAttributeCollection inputWikiTextInstance = new AttributeCollectioninputWikiText();
    inputWikiTextInstance.init();
    attributeCollections.put("inputWikiText", inputWikiTextInstance);
    utils.AbstractAttributeCollection inputURLInstance = new AttributeCollectioninputURL();
    inputURLInstance.init();
    attributeCollections.put("inputURL", inputURLInstance);
    utils.AbstractAttributeCollection inputTextInstance = new AttributeCollectioninputText();
    inputTextInstance.init();
    attributeCollections.put("inputText", inputTextInstance);
    utils.AbstractAttributeCollection inputStringInstance = new AttributeCollectioninputString();
    inputStringInstance.init();
    attributeCollections.put("inputString", inputStringInstance);
    utils.AbstractAttributeCollection inputSetCheckboxElementsInstance = new AttributeCollectioninputSetCheckboxElements();
    inputSetCheckboxElementsInstance.init();
    attributeCollections.put("inputSetCheckboxElements", inputSetCheckboxElementsInstance);
    utils.AbstractAttributeCollection inputSetCheckboxInstance = new AttributeCollectioninputSetCheckbox();
    inputSetCheckboxInstance.init();
    attributeCollections.put("inputSetCheckbox", inputSetCheckboxInstance);
    utils.AbstractAttributeCollection inputSelectMultipleInstance = new AttributeCollectioninputSelectMultiple();
    inputSelectMultipleInstance.init();
    attributeCollections.put("inputSelectMultiple", inputSelectMultipleInstance);
    utils.AbstractAttributeCollection inputSelectInstance = new AttributeCollectioninputSelect();
    inputSelectInstance.init();
    attributeCollections.put("inputSelect", inputSelectInstance);
    utils.AbstractAttributeCollection inputSecretInstance = new AttributeCollectioninputSecret();
    inputSecretInstance.init();
    attributeCollections.put("inputSecret", inputSecretInstance);
    utils.AbstractAttributeCollection inputSDFInstance = new AttributeCollectioninputSDF();
    inputSDFInstance.init();
    attributeCollections.put("inputSDF", inputSDFInstance);
    utils.AbstractAttributeCollection inputMultiFileInstance = new AttributeCollectioninputMultiFile();
    inputMultiFileInstance.init();
    attributeCollections.put("inputMultiFile", inputMultiFileInstance);
    utils.AbstractAttributeCollection inputLongInstance = new AttributeCollectioninputLong();
    inputLongInstance.init();
    attributeCollections.put("inputLong", inputLongInstance);
    utils.AbstractAttributeCollection inputIntInstance = new AttributeCollectioninputInt();
    inputIntInstance.init();
    attributeCollections.put("inputInt", inputIntInstance);
    utils.AbstractAttributeCollection inputFloatInstance = new AttributeCollectioninputFloat();
    inputFloatInstance.init();
    attributeCollections.put("inputFloat", inputFloatInstance);
    utils.AbstractAttributeCollection inputFileInstance = new AttributeCollectioninputFile();
    inputFileInstance.init();
    attributeCollections.put("inputFile", inputFileInstance);
    utils.AbstractAttributeCollection inputEmailInstance = new AttributeCollectioninputEmail();
    inputEmailInstance.init();
    attributeCollections.put("inputEmail", inputEmailInstance);
    utils.AbstractAttributeCollection inputDateInstance = new AttributeCollectioninputDate();
    inputDateInstance.init();
    attributeCollections.put("inputDate", inputDateInstance);
    utils.AbstractAttributeCollection inputBoolInstance = new AttributeCollectioninputBool();
    inputBoolInstance.init();
    attributeCollections.put("inputBool", inputBoolInstance);
    utils.AbstractAttributeCollection imageInstance = new AttributeCollectionimage();
    imageInstance.init();
    attributeCollections.put("image", imageInstance);
    utils.AbstractAttributeCollection formInstance = new AttributeCollectionform();
    formInstance.init();
    attributeCollections.put("form", formInstance);
    utils.AbstractAttributeCollection downloadlinkInstance = new AttributeCollectiondownloadlink();
    downloadlinkInstance.init();
    attributeCollections.put("downloadlink", downloadlinkInstance);
    utils.AbstractAttributeCollection captchaInstance = new AttributeCollectioncaptcha();
    captchaInstance.init();
    attributeCollections.put("captcha", captchaInstance);
  }

  public static utils.AbstractAttributeCollection getAttributeCollection(String name)
  { 
    return attributeCollections.get(name);
  }

  public static void getAttributeCollection(String name, StringBuilder classAttr, StringBuilder styleAttr, java.util.List<String> ignore, java.io.PrintWriter out)
  { 
    utils.AbstractAttributeCollection attrcol = getAttributeCollection(name);
    if(!ignore.contains("class"))
    { 
      utils.TemplateCall.appendWithPadding(classAttr, attrcol.getClassAttribute());
    }
    if(!ignore.contains("style"))
    { 
      utils.TemplateCall.appendWithPadding(styleAttr, attrcol.getStyleAttribute());
    }
    out.print(attrcol.getAttributes());
  }
}