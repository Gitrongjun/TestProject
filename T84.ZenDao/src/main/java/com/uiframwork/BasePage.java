package com.uiframwork;

import org.dom4j.DocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class BasePage extends WebElementUtils{

	 public BasePage(WebDriver dr) throws DocumentException{
	   	 super(dr);
	    }
	//获取网页元代码，js弹窗问题，frame。。。
	 public String getPageSource(){
		 wait(3);
		 return driver.getPageSource();
	 }
	 public void alertAcepet(){
		 Alert alert=driver.switchTo().alert();
		 alert.accept();
	 }
	 public void alertDismiss(){
		 Alert alert=driver.switchTo().alert();
		 alert.dismiss();
	 }
	 public String getAlertText(){
		 Alert alert=driver.switchTo().alert();
		 return alert.getText();
	 }
	 public void inputAlert(String value){
		 Alert alert=driver.switchTo().alert();
		 alert.sendKeys(value);
	 }
	 
}
