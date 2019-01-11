package CAutotest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class googleJDpay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dri =new ChromeDriver();
		//WebDriver dri1 =new FirefoxDriver();
		dri.get("https://www.jd.com");
		dri.manage().window().maximize();
		dri.findElement(By.linkText("你好，请登录")).click();
		dri.findElement(By.linkText("账户登录")).click();
		dri.findElement(By.id("loginname")).sendKeys("15674214383");
		dri.findElement(By.id("nloginpwd")).sendKeys("jc95a2b28c");
		wait(10);
		dri.findElement(By.id("loginsubmit")).click();
		wait(1);
		dri.findElement(By.id("key")).sendKeys("神舟战神");
		dri.findElement(By.className("button")).click();
		wait(1);
		dri.findElement(By.xpath("//*[@id=\"J_goodsList\"]/ul/li[1]/div/div[7]/a[3]")).click();
		String dw = dri.getWindowHandle();
		for(String i :dri.getWindowHandles()){
			if(i.equals(dw)){
				continue;
			}
			dri.switchTo().window(i);
		}
		wait(1);
		dri.findElement(By.xpath("//*[@id=\"settleup-2014\"]/div[1]/a")).click();
		String dw1 = dri.getWindowHandle();
		for(String i :dri.getWindowHandles()){
			if(i.equals(dw1)){
				continue;
			}
			dri.switchTo().window(i);
		}
		
		wait(3);
		
		dri.findElement(By.xpath("//*[@id=\"cart-floatbar\"]/div/div/div/div[2]/div[4]/div[1]/div/div[1]")).click();
		dri.findElement(By.id("order-submit")).click();
		wait(3);
		dri.findElement(By.xpath("//*[@id=\"payMallPlatVm\"]/div/div/div[1]/div/a")).click();

		//dri.findElement(By.className("submit-btn")).click();
		
		//dri.findElement(By.xpath("//*[@id=\"cart-floatbar\"]/div/div/div/div[2]/div[4]/div[1]/div/div[1]/a")).click();
		//dri.findElement(By.linkText("\"								去结算\"")).click();

		/*dri.close();*/
		wait(3);
		File screenShotFile = ((TakesScreenshot)dri).getScreenshotAs(OutputType.FILE);  
        try {
			Files.copy(screenShotFile, new File("F:\\testJD.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void wait(int s){
		try {
			Thread.sleep(s*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
