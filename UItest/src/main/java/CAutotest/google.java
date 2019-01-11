package CAutotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dri =new ChromeDriver();
		WebDriver dri1 =new FirefoxDriver();
		dri.get("https://www.baidu.com");
		dri.manage().window().maximize();
		dri.findElement(By.name("wd")).sendKeys("装逼成功");
		dri.findElement(By.id("su")).click();
		/*dri.close();*/
		
		dri1.get("https://www.baidu.com");
		dri1.manage().window().maximize();
		dri1.findElement(By.name("wd")).sendKeys("装逼成功");
		dri1.findElement(By.id("su")).click();
		/*dri1.close();*/
	}

}
