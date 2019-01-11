package CAutotest;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ctestwork2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//先实例化一个驱动对象
		WebDriver dri = new ChromeDriver();
		//获取目标网址
		dri.get("http://www.baidu.com");
		//最大化浏览器
		dri.manage().window().maximize();
		Actions action =new  Actions(dri);
		dri.findElement(By.cssSelector("a[href=\"http://news.baidu.com\"]")).sendKeys(Keys.TAB);
		dri.findElement(By.cssSelector("input[id='kw']")).sendKeys("这是我要复制的内容");
		WebElement a=  dri.findElement(By.cssSelector("input[id='kw']"));
		Thread.sleep(3000);
		action.doubleClick(a).perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		Actions b=  action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		a.click();
		b.moveToElement(a).perform();
		b.perform();
		
	}

}
