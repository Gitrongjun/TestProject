package CAutotest;

import java.io.ObjectInputStream.GetField;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import okhttp3.Cookie;

public class CTestwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	WebDriver driver =new ChromeDriver();
		driver.get("http://www.baidu.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("kw")).sendKeys("lajisd");
		wait(3);
		driver.findElement(By.id("kw")).clear();
		
		driver.findElement(By.cssSelector("input#kw")).sendKeys("草泥马");
		wait(3);
		driver.findElement(By.cssSelector("form#form")).submit();
		wait(3);*/
		
		
		//WebElement接口常用方法
		/*WebDriver dri = new ChromeDriver();
		dri.get("http://www.baidu.com");
		dri.manage().window().maximize();
		int h = dri.findElement(By.cssSelector("input#kw")).getSize().height;
		int w = dri.findElement(By.cssSelector("input#kw")).getSize().width;
		System.out.println("高是"+h+",宽是"+w);
		String txt = dri.findElement(By.cssSelector("div.qrcode-text p b")).getText();
		System.out.println("文字是"+txt);
		boolean t = dri.findElement(By.cssSelector("div.qrcode-text p b")).isDisplayed();
		System.out.println("能看见吗-->"+t);
		boolean ban = dri.findElement(By.cssSelector("div.qrcode-text p b")).isEnabled();
		System.out.println("被禁用了吗-->"+ban);
		WebElement ss = dri.findElement(By.cssSelector("input#kw"));
		System.out.println("属性名为-->"+ss.getAttribute("name"));
		System.out.println("是否被选中-->"+ss.isSelected());
		System.out.println("tagname是-->"+ss.getTagName());
		System.out.println("获取元素坐标-->"+ss.getLocation());*/
		
		
		//cookie操作
	/*	WebDriver dri = new ChromeDriver();
		dri.get("http://www.baidu.com");
		Set<org.openqa.selenium.Cookie> cookies =  dri.manage().getCookies();
		System.out.println(cookies.toString());
		System.out.println(cookies.size());
		//cookies类似set集合，保存这很多条cookie记录，要单独拿出属性需要用for循环将它一条条的拿出来	
		for(org.openqa.selenium.Cookie cookie:cookies){
			System.out.print("name:"+cookie.getName()+"--");
			System.out.print("Domain:"+cookie.getDomain()+"--");
			System.out.println("Value:"+cookie.getValue());		
		}	*/
		
		
		
		
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
