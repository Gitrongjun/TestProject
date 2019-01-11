package CTestNG;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public  class C_3_lianxi {
	WebDriver dri;
	//打开百度
	@BeforeMethod
	public void Openbd(){
		 dri = new ChromeDriver();
		dri.get("http://www.baidu.com");
		dri.manage().window().maximize();
		dri.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	//填写搜索内容并搜索,并核对搜索答案
	@Test(groups="test3")
	public void ss(){
		dri.findElement(By.id("kw")).sendKeys("新梦想测试");
		dri.findElement(By.id("su")).click();
		wait(3);
		assertEquals((dri.getTitle()), "新梦想测试_百度搜索");
	}
	@Test(groups={"test1","test2"})
	public void ss1(){
		dri.findElement(By.id("kw")).sendKeys("qwe");
		dri.findElement(By.id("su")).click();
		wait(3);
		assertEquals((dri.getTitle()), "qwe_百度搜索");
	}
	@Test(groups="test2")
	public void ss2(){
		dri.findElement(By.id("kw")).sendKeys("asd");
		dri.findElement(By.id("su")).click();
		wait(3);
		assertEquals((dri.getTitle()), "asd_百度搜索");
	}
	//退出
	@AfterMethod
	public void colse(){
		dri.quit();
	}
	
	
	public static void wait(int time){
		try {
			Thread.sleep(time*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println("传入时间数据有误"+e);
		}
		
	}
}
