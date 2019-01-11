package CAutotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_6_JsAlert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver dri= new ChromeDriver();
		/*dri.get("http://www.baidu.com");
		dri.manage().window().maximize();
		dri.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js =(JavascriptExecutor)dri;
		js.executeScript("alert(\"我们都在阴沟里，但仍有人仰望星空。\");");
		dri.switchTo().alert().accept();
		dri.findElement(By.id("kw")).sendKeys("我们都在阴沟里，但仍有人仰望星空");
		String str= (String)js.executeScript("return document.getElementById(\"kw\").value");
		System.out.println(str);
		Thread.sleep(2000);
		((JavascriptExecutor)dri).executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		((JavascriptExecutor)dri).executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);
		((JavascriptExecutor)dri).executeScript("window.scrollTo(0,document.body.scrollHeight)");*/
		
		dri.get("http://www.baidu.com");
		dri.manage().window().maximize();
		dri.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js =(JavascriptExecutor)dri;
		js.executeScript("alert(\"我们都在阴沟里，但仍有人仰望星空。\");");
		dri.switchTo().alert().accept();
		dri.findElement(By.id("kw")).sendKeys("我们都在阴沟里，但仍有人仰望星空");
		
		C_6_JsAlert sc = new C_6_JsAlert();
		sc.scroll(dri, 1111);
	}
		public void scroll(WebDriver dri,int height) throws Exception{
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor)dri;
			//将传入的值转成字符串
			String sc ="window.scrollBy(0,"+height+")";
			//传入的两个值都是字符串
			js.executeScript(sc);
		}
				

}
