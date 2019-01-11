package com.uiframwork;

import org.openqa.selenium.WebDriver;

public class DriverUtils {
	protected WebDriver driver;
	protected static MouseUtils mouse;
	protected static keyBoardUtils keyboard;
	public DriverUtils(WebDriver dr){
		driver=dr;
		mouse= new MouseUtils(driver); 
		keyboard=new keyBoardUtils(driver);
	}
    public void openWeb(String url){
    	driver.get(url);
    }
    public void back(){
    	driver.navigate().back();
    }
    public void forword(){
    	driver.navigate().forward();
    }
    public void refresh(){
    	driver.navigate().refresh();
    }
    public void wait(int seconds){
    	try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
    public String getTitle(){
    return	driver.getTitle();
    }
    public String getUrl(){
    	return driver.getCurrentUrl();
    }
    public void close(){
    	driver.close();
    }
    public void quit(){
    	driver.quit();
    }
}
