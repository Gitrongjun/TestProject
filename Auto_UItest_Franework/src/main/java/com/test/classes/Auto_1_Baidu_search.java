package com.test.classes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.readXlsx.logDemo;


public class Auto_1_Baidu_search {
	private static Logger logger = LogManager.getLogger(logDemo.class.getName());
	public static WebDriver OpenBrower(WebDriver driver,String url){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Auto_1_Baidu_search.waitTime(3);
		driver.get(url);
		logger.info("打开URL"+url);
		return driver;
	}
	public static WebDriver search(WebDriver driver,String searchKey){
		Auto_1_Baidu_search.waitTime(3);
		driver.findElement(By.cssSelector("input#kw")).sendKeys(searchKey);
		logger.info("搜索"+searchKey);
		driver.findElement(By.cssSelector("input#su")).click();
		logger.info("点击了百度一下，input#su");
		Auto_1_Baidu_search.waitTime(3);
		return driver;	
	}
	public static void quit(WebDriver driver){
		driver.quit();
		logger.info("退出了");
	}
	public static void waitTime(int s){
		try {
			Thread.sleep(s*1000);
			logger.info("等待了"+s+"秒");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
