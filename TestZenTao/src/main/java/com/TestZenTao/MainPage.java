package com.TestZenTao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//构造
public class MainPage {
	private WebElement userMenu;
	private WebDriver driver;
	public MainPage(WebDriver dri){
		this.driver = dri;
		userMenu = driver.findElement(By.cssSelector("div#userMenu"));
	}
//获取登陆的用户名
public String getloginUsername(){
	return userMenu.getText();
	
}
	

}
