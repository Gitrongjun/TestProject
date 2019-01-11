package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H_2_select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dri = new ChromeDriver();
		dri.get("file:///C:/Users/jc/Desktop/selenium%E6%BC%94%E7%A4%BA%E4%BE%8B%E5%AD%90/select.html");
		dri.findElement(By.cssSelector("select#status")).findElement(By.cssSelector("option[value='2']")).click();
	}

}
