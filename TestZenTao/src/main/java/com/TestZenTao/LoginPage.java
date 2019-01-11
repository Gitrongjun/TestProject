package com.TestZenTao;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	//元素定义一个驱动和两个元素
	private WebDriver driver;
	private WebElement usernameInputBox;
	private WebElement passwordInputBox;

	private WebElement loginButtoon;
	//2构造方法
	public LoginPage(WebDriver dr){
		this.driver=dr;
		wait(2);
		usernameInputBox = driver.findElement(By.cssSelector("input[name='account']"));
		passwordInputBox = driver.findElement(By.cssSelector("input[name='password']"));
		loginButtoon = driver.findElement(By.cssSelector("button#submit"));
	}
	
	//3登陆成功方法
	public MainPage loginOprate(String name,String password){
		wait(2);
		usernameInputBox.sendKeys(name);
		passwordInputBox.sendKeys(password);
		wait(2);
		loginButtoon.click();
		wait(2);
		//创建一个匿名对象，并且将驱动放入其中传出去
		return new MainPage(getDriver());
		
	}
	//4登陆失败方法
	public String loginFailOperate(String name ,String password){
		wait(2);
		usernameInputBox.sendKeys(name);
		passwordInputBox.sendKeys(password);
		loginButtoon.click();
		wait(2);
		//创建一个Alert保存弹框元素，并且使用switchTo切换
		Alert alert = driver.switchTo().alert();
		//获取弹窗信息并打印
		String value = alert.getText();
		System.out.println(value);
		//点击弹窗确定并将文本信息传出去
		alert.accept();
		return value;
	}
	
	//等待方法
	public void wait(int s){
		try {
			Thread.sleep(s*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
