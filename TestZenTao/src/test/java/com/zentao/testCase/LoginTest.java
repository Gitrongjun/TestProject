package com.zentao.testCase;

import org.testng.annotations.Test;

import com.TestZenTao.LoginPage;
import com.TestZenTao.MainPage;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.awt.Container;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest {
	WebDriver dri= null;
  @Test
  public void f() {
	  LoginPage loginpage= new LoginPage(dri);
	  MainPage mainPage = loginpage.loginOprate("admin", "Qweqwe123");
	  
	  Assert.assertEquals(mainPage.getloginUsername(), "admin");
	  
  }
@Test
  public void f1() {
	  LoginPage loginpage= new LoginPage(dri);
	  String value = loginpage.loginFailOperate("admin", "Qweqwe12");
	  Assert.assertEquals(value, "登录失败，请检查您的用户名或密码是否填写正确。");
  }
  @BeforeMethod
  public void beforeMethod() {
	  dri= new ChromeDriver();
	  dri.get("http://192.168.0.137/zentao/");
  }

  @AfterMethod
  public void afterMethod() {
	  dri.quit();
  }

}
