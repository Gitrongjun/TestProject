package CAutotest;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ctestwork5 {

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
				dri.findElement(By.cssSelector("p[title='用户名登录']")).click();
				Thread.sleep(3000);
				dri.findElement(By.cssSelector("form#TANGRAM__PSP_10__form")).findElement(By.cssSelector("input#TANGRAM__PSP_10__userName")).sendKeys("a519028651");
				dri.findElement(By.cssSelector("input#TANGRAM__PSP_10__password")).sendKeys("jc95a2b28cbd");
				Thread.sleep(10000);
				dri.findElement(By.cssSelector("input#TANGRAM__PSP_10__submit")).click();
	
	}

}
