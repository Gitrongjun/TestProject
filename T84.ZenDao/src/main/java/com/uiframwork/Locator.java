package com.uiframwork;

public class Locator {
	public enum ByType{
		xpath,id,linkText,name,className,cssSelector,partialLinkText,tagName
	}
      private String elementName;
      private String locatorInfo;//元素定位信息
      private int timeout;//超时
      private ByType byType;
      
      public Locator(String name,String element,int waitSec,ByType byType){
    	  this.elementName=name;
    	  this.locatorInfo=element;
    	  this.timeout=waitSec;
    	  this.byType=byType; 
      }

	public String getElementName() {
		return elementName;
	}

	public String getLocatorInfo() {
		return locatorInfo;
	}

	public int getTimeout() {
		return timeout;
	}

	public ByType getByType() {
		return byType;
	}
      
      
}
