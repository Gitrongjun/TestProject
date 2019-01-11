package CTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class C_2_baidu {
	//打开百度
	public static WebDriver  OpenBrowse(WebDriver dri,String url){
		dri.get(url);
		dri.manage().window().maximize();
		wait(3);
		return dri;
	}
	//填写搜索内容并搜索
	public static void Search(WebDriver dri,String SearchStr){
		dri.findElement(By.id("kw")).sendKeys(SearchStr);
		dri.findElement(By.id("su")).click();
		wait(3);
	}
	//退出
	public static void quit(WebDriver dri){
		dri.quit();
	};
	
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
