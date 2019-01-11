package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H_1_alert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver dri = new ChromeDriver();
		dri.get("file:///C:/Users/jc/Desktop/selenium%E6%BC%94%E7%A4%BA%E4%BE%8B%E5%AD%90/alert.html");
		dri.findElement(By.id("alert")).click();
		Thread.sleep(3000);
		dri.switchTo().alert().accept();
		Thread.sleep(3000);
		dri.findElement(By.id("confirm")).click();
		Thread.sleep(3000);
		dri.switchTo().alert().dismiss();
		Thread.sleep(3000);
		dri.findElement(By.id("prompt")).click();
		dri.switchTo().alert().sendKeys("有问题？");
		String str = dri.switchTo().alert().getText();
		System.out.println(str);
		Thread.sleep(3000);
		dri.switchTo().alert().accept();
		
		
	}

}
