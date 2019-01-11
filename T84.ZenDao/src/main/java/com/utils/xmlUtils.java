package com.utils;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.uiframwork.Locator;
import com.uiframwork.Locator.ByType;

public class xmlUtils {
       public static HashedMap<String,Locator> readElementInfo(String filePath) throws DocumentException{

    		Map<String,Locator>elementinfos=new HashedMap<String,Locator>();
    		SAXReader saxReader=new SAXReader();
    		Document document=saxReader.read(new File(filePath));
    				
    		Element root=document.getRootElement();
    		List<Element>chlidlist=root.elements("locator");
    			for(Element e:chlidlist){
    				String name=e.attributeValue("name").toString();
    				String value=e.attributeValue("value").toString();
    				int timeout=Integer.parseInt(e.attributeValue("timeout"));
    				String type=e.attributeValue("type").toString();
    				Locator locator=new Locator(name, value, timeout, getType(type));
    			   String keyName=e.getText();
    			   elementinfos.put(keyName, locator);
    			}	
    			return	(HashedMap<String,Locator>) elementinfos;
       }
       
       public static ByType getType(String value){
			ByType type=null;
			switch (value){
			case "css":
				type=ByType.cssSelector;
			case "id":
				type=ByType.id;
			case "linkText":
				type=ByType.linkText;
			case "name":
				type=ByType.name;
			case "className":
				type=ByType.className;
			case "xpath":
				type=ByType.xpath;
			case "partialLinkText":
				type=ByType.partialLinkText;
			case "tagName":
				type=ByType.tagName;
			}
			return type;
		}
}
