package CAutotest;

import java.util.concurrent.ThreadPoolExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeOpenbaidu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dri = new ChromeDriver();
		dri.get("https://www.baidu.com");
		dri.manage().window().maximize();
	/*	dri.findElement(By.linkText("hao123")).click();
		wait(2);
		dri.navigate().back();
		wait(2);*/
		//dri.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/a[5]")).click();
		/*dri.findElement(By.xpath("//div[3]/a[5]")).click();*/
		//dri.findElement(By.xpath("//a[@name=\"tj_trtieba\"]")).click();
		//dri.findElement(By.xpath("//a[contains(@name,'tj_trtieba')]")).click();
		
		wait(2);
		dri.quit();
	}
	public static void wait(int time){
		try {
			Thread.sleep(time*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
