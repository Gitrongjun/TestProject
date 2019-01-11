package com.UItest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Chrome  {
public static void main(String[]  args) throws Exception {
WebDriver driver = new ChromeDriver();
driver.get("https://www.baidu.com");
driver.manage().window().maximize();
driver.findElement(By.id("kw")).sendKeys("12306");
WebElement  btn = driver.findElement(By.id("su"));
btn.click();
Thread.sleep(3000);
driver.close();
}
}