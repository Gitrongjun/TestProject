package CAutotest;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ctestwork4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
				WebDriver dri = new ChromeDriver();
				dri.get("http://www.baidu.com");
				dri.manage().window().maximize();
				dri.findElement(By.cssSelector("input[type='submit']")).click();
				WebElement a  =	dri.findElement(By.cssSelector("a[href='http://www.baidu.com/gaoji/preferences.html']"));
				Thread.sleep(3000);
				dri.findElement(By.linkText("登录")).click();
				Thread.sleep(3000);
				dri.findElement(By.linkText("立即注册")).click();
				Set<String> handles = dri.getWindowHandles();
				List<String> hList = new ArrayList<	String>(handles);
				dri.switchTo().window(hList.get(1));
				List<WebElement> inputs =	dri.findElements(By.cssSelector("input.pass-text-input"));
				for(WebElement temp:inputs){
					temp.sendKeys("广积粮，高筑墙，缓称王");
				}
				List<WebElement> radios = dri.findElements(By.cssSelector("input[name='isAgree']"));
				for(WebElement temp:radios){
					temp.click();
				}
	}

}
