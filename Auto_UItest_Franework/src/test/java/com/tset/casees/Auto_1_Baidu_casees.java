package com.tset.casees;

import org.testng.annotations.Test;

import com.test.classes.Auto_1_Baidu_search;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Auto_1_Baidu_casees {
	WebDriver driver = null;
	@DataProvider(name = "data")
	public static Object[][] primeNumbers(){
		return new Object[][] {{"ss","ss_百度搜索"},{"aa","aa_百度搜索"},{"cc","cc_百度搜索"}};
	}
  @Test(dataProvider = "data")
  public void f(String ss,String tt) {
	 driver= Auto_1_Baidu_search.search(driver,ss);
	 Reporter.log("<span style=\"color:#FF34B3\"><p>开始搜索</p>");
	  String title = driver.getTitle();
	  assertEquals(title, tt);
	  Reporter.log("<span style=\"color:#FF34B3\"><p>对比结果</p>");
  }
  @BeforeMethod
  @Parameters("url")
  public void beforeMethod(String url) {
	   driver = Auto_1_Baidu_search.OpenBrower(driver, url);
	   System.setProperty("org.uncommons.reportng.escape-output", "false");
	   Reporter.log("<span style=\"color:#FF34B3\"><p>打开浏览器进入百度</p>");
  }

  @AfterMethod
  public void afterMethod() {
	  Auto_1_Baidu_search.quit(driver);
	  Reporter.log("<span style=\"color:#FF34B3\"><p>退出浏览器</p>");
  }

}
