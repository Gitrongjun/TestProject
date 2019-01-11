package com.zendao;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.MainPage;
import com.uiframwork.DriverFactory;
import com.utils.AssertUtils;


public class LoginTest {
	
	WebDriver driver;
	AssertUtils assertUtils;
	@BeforeTest
	public void setUp(){
		assertUtils=new AssertUtils();
		driver=DriverFactory.getChormeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	   @Test
	    public void LoginTest01() throws Exception{
	    	LoginPage lp=new LoginPage(driver);
	   
	    	String value=lp.loginFailOperate("admin", "admin123");
	    	assertUtils.checkStringContains(value, "登录失败", "登陆测试失败");
//	    	Assert.assertEquals(value.contains("登录失败"), true,"登陆测试失败");
	    }
    @Test
    public void LoginTest02() throws Exception {
    	LoginPage lp=new LoginPage(driver);

    	MainPage mp=lp.loginOperate("admin", "admin123.");
    	String value =mp.getLoginUserName();
    	Assert.assertEquals(value.contains("admin"), true,"登陆测试失败");
    }
 
    @AfterTest
    public void tearDown(){
			driver.quit();
			
		
    }
    
}
