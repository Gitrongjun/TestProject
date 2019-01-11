package com.pages;

import org.dom4j.DocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.config.LocalConfig;
import com.uiframwork.BasePage;
import com.uiframwork.Locator;
import com.utils.xmlUtils;

public class LoginPage extends BasePage {

		
		
		public WebDriver getDriver() {
			return driver;
		}
		
		public LoginPage(WebDriver dr) throws DocumentException {
			super(dr);
			openWeb(LocalConfig.URL);
			
		}
		Locator usernameInputbox=getLocator("usernameInputbox");
		Locator passwordInputbox=getLocator("passwordInputbox");
		Locator loginButton=getLocator("loginButton");
			

       public MainPage loginOperate(String name,String password) throws DocumentException {
    	   input(usernameInputbox, name);
    	  input(passwordInputbox, password);
    	 click(loginButton);
    	  
    	    wait(3);
    	   return new MainPage(getDriver());
       }
	public String loginFailOperate(String name,String password) {
		   wait(3);
		   input(usernameInputbox, name);
	    	  input(passwordInputbox, password);
	    	 click(loginButton);
			wait(2);
		 String value=getAlertText();
			alertAcepet();
		
		 return value;
	}
	public void wait(int seconds){
    	try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
}
