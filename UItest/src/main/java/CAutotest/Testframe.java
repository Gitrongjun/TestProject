package CAutotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.UItest.Chrome;

public class Testframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dri = new ChromeDriver();
		dri.get("file:///C:/Users/jc/Desktop/selenium%E6%BC%94%E7%A4%BA%E4%BE%8B%E5%AD%90/frame/frame.html");
		dri.manage().window().maximize();
		dri.switchTo().frame("top");
		dri.findElement(By.cssSelector("input[name='message']")).sendKeys("sssssss");
		dri.switchTo().parentFrame();
		dri.switchTo().frame("left");
		dri.findElement(By.cssSelector("input[name='message']")).sendKeys("ssfasf");
		dri.switchTo().parentFrame();
		dri.switchTo().frame("main");
		dri.findElement(By.cssSelector("input[name='message']")).sendKeys("asd");
		dri.switchTo().parentFrame();
		dri.switchTo().frame("left");
		dri.findElement(By.cssSelector("a[href='main.html']")).click();
	}

}
