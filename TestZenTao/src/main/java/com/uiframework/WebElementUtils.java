/**
 * 
 */
package com.uiframework;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utils.xmlUtils;
import com.google.common.collect.HashBiMap;
import com.uiframework.Locator.ByType;

/**
 * @author jrj
 * @version 1.0.0
 * @since 
 * 创建时间：2018年5月15日 下午7:54:07
 * 功能描述：页面元素操作类
 * 邮箱地址：519028651@qq.com
 */

public class WebElementUtils extends DriverUtils{
	//声明hashmap存储实体类locator
	protected HashMap<String,Locator> locatorMap;
	//声明存储路径
	protected String path;
	//构造函数从xml中拿到元素值
	public WebElementUtils(WebDriver driver){
		//从父类拿到driver
		super(driver);
		//获取文件路径
		path =System.getProperty("user.dir")+"/WebElementData"
				+this.getClass().getSimpleName()+".xml";
		locatorMap=xmlUtils.readElementInfo(path);
	}
	public WebElement getElement(Locator locator){
		WebElement el = null;
		//获取枚举类型中的值并放入findElement中用el保存
		ByType type = locator.getBytype();
		switch(type){
		case id:
			el = driver.findElement(By.id(locator.getLocatorInfo()));
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
	public WebElement findElement(final Locator locator){
		//显示等待
		WebDriverWait wait = new WebDriverWait(driver, locator.getTimeout());
		WebElement el = wait.until(new ExpectedCondition<WebElement>() {

			public WebElement apply(WebDriver d) {
				return getElement(locator);
			}
		});
		return el;
		
	}
	public void click(Locator locator){
		WebElement e =findElement(locator);
		e.click();
	}
	
}
