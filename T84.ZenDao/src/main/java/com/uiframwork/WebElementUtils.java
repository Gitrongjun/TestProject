package com.uiframwork;

import java.util.HashMap;

import org.apache.commons.collections4.map.HashedMap;
import org.dom4j.DocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.uiframwork.Locator.ByType;
import com.utils.xmlUtils;


public class WebElementUtils extends DriverUtils {
    
	protected HashedMap<String, Locator> locatorMap;
	protected String path;
	public WebElementUtils(WebDriver dr) throws DocumentException{
   	 super(dr);
   	 path=System.getProperty("user.dir")+"/webelementdata/"
   			 +this.getClass().getSimpleName()+".xml";
   	locatorMap=xmlUtils.readElementInfo(path);
   	 
    }
	public WebElement getElement(Locator locator){
		WebElement el=null;
		ByType type=locator.getByType();
		switch(type){
		case id:
			el=driver.findElement(By.id(locator.getLocatorInfo()));
		case name:
			el=driver.findElement(By.name(locator.getLocatorInfo()));
		case xpath:
			el=driver.findElement(By.xpath(locator.getLocatorInfo()));
		case cssSelector:
			el=driver.findElement(By.cssSelector(locator.getLocatorInfo()));
		case linkText:
			el=driver.findElement(By.cssSelector(locator.getLocatorInfo()));
		case partialLinkText:
			el=driver.findElement(By.cssSelector(locator.getLocatorInfo()));
		case className:
			el=driver.findElement(By.cssSelector(locator.getLocatorInfo()));
		case tagName:
			el=driver.findElement(By.cssSelector(locator.getLocatorInfo()));
			
		}
		return el;
	}
	public WebElement findElement( final Locator locator){
		WebDriverWait wait = new WebDriverWait(driver, locator.getTimeout());
		WebElement el= wait.until(new ExpectedCondition<WebElement>() {
		
			public WebElement apply(WebDriver d) {
			return  getElement(locator);
			}
			}); 
		return el;
	}
	
	public void click(Locator locator ){
		WebElement e=findElement(locator);
		e.click();
	}
	
	public void input(Locator locator,String content){
		WebElement e=findElement(locator);
		e.sendKeys(content);
	}
	
	public void submit(Locator locator ){
		WebElement e=findElement(locator);
		e.submit(); 
	}
	public void clear(Locator locator){	
		WebElement e=findElement(locator);
		e.clear();
	}
	
	public String getText(Locator locator){
		WebElement e=findElement(locator);
		return e.getText();
	}
	
	public String getAttribute(Locator locator ,String attribute){
		WebElement e=findElement(locator);
		return e.getAttribute(attribute);
	}
	public Locator getLocator(String locatorName){
	Locator locator=locatorMap.get(locatorName);
	return locator;
		
	}
}
