package CAutotest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTestPhpwind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dri = new ChromeDriver();
		dri.get("http://192.168.0.135/phpwind/index.php");
		dri.manage().window().maximize();
		dri.findElement(By.cssSelector("input#nav_pwuser")).sendKeys("admin");
		dri.findElement(By.cssSelector("input#showpwd")).sendKeys("123456");
		dri.findElement(By.cssSelector("button[name='head_login']")).click();
		wait(3);
		dri.findElement(By.cssSelector("a[id='fn_4']")).click();
		dri.findElement(By.cssSelector("a[id='td_post1']")).click();
		dri.findElement(By.cssSelector("input[id='atc_title']")).sendKeys("admin");
		wait(3);
		dri.switchTo().frame(dri.findElement(By.tagName("iframe"))).findElement(By.cssSelector("html body")).sendKeys("erdxcytvuyfvsaduyfbuysafbusy fbusdgfbsdgfbuysfbushdfbvusydfbusadfbvuyasdfbuysufy hasudyhbfujhs");
		dri.switchTo().parentFrame();
		wait(3);
		dri.findElement(By.cssSelector("button[name='Submit']")).click();

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
