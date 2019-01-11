package CAutotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testsleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dri = new ChromeDriver();
		dri.get("file:///C:/Users/jc/Desktop/selenium%E6%BC%94%E7%A4%BA%E4%BE%8B%E5%AD%90/Wait.html");
		dri.manage().window().maximize();
		dri.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebDriverWait wait =new WebDriverWait(dri, 10);
		dri.findElement(By.cssSelector("button#b")).click();
		//dri.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement o = dri.findElement(By.cssSelector("div.red_box"));
		dri.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		highlightElement(dri,o);
	}
	
	
	/** <Summary>
	/// Highlight WebElement
	/// </Summary>
	**/
	public static void highlightElement(WebDriver driver, WebElement element) {
	 
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("element = arguments[0];" +
	             "original_style = element.getAttribute('style');" +
	                 "element.setAttribute('style', original_style + \";" +
	             "background: yellow; border: 2px solid red;\");" +
	             "setTimeout(function(){element.setAttribute('style', original_style);}, 1000);", element);
	        
	        //高亮如何使用
	       /* WebDriver oDriver = new ChromeDriver();
	        oDriver.get("http://www.baidu.com");
	        WebElement oEdit = oDriver.findElement(By.name("wd"));
	        WebElement oButton = oDriver.findElement(By.id("su"));
	        highlightElement(oDriver, oButton);*/
	        
	}

}
