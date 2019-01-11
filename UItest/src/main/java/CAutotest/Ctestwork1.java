package CAutotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ctestwork1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//先实例化一个驱动对象
		WebDriver dri = new ChromeDriver();
		//获取目标网址
		dri.get("http://www.baidu.com");
		//最大化浏览器
		dri.manage().window().maximize();
		//dri.findElement(By.cssSelector("input[id='kw']")).sendKeys("新梦想测试");
		dri.findElement(By.cssSelector("input[type='submit']")).click();
		//用元素接口向上转型实例化一个元素对象保存
		WebElement a  =	dri.findElement(By.cssSelector("a[href='http://www.baidu.com/gaoji/preferences.html']"));
		//实例化鼠标动作对象，将要执行动作的驱动对象放在参数中
		Actions action =new Actions(dri);
		//将保存好的a对象右击
		//action.contextClick(a).perform();;
		Thread.sleep(3000);
		action.moveToElement(dri.findElement(By.cssSelector("a[href='http://www.baidu.com/gaoji/preferences.html']"))).perform();;
		Thread.sleep(3000);
		dri.findElement(By.cssSelector("a[class='setpref']")).click();
		action.release().perform();
	}

}
