package com.pages;

import org.dom4j.DocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.uiframwork.BasePage;
import com.uiframwork.Locator;

public class MainPage extends BasePage {
	public MainPage(WebDriver dr) throws DocumentException{
		super(dr);
		
	}
	Locator userMenu=getLocator("userMenu");
	public String getLoginUserName(){
		wait(2);
		return getText(userMenu);
		
	} 
}
