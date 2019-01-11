package Homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H_4_chandao_BUG_process {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver dri = new ChromeDriver();
		dri.get("http://192.168.1.173/zentao/");
		dri.manage().window().maximize();
		//登陆
		dri.findElement(By.cssSelector("input#account")).sendKeys("csj");
		dri.findElement(By.cssSelector("input[name='password']")).sendKeys("Qweqwe123");
		dri.findElement(By.cssSelector("button#submit")).click();
		//跳转页面   
		Thread.sleep(2000);
		dri.findElement(By.cssSelector("a[href='/zentao/my-bug.html']")).click();
		Thread.sleep(2000);
		dri.findElement(By.cssSelector("a[href='/zentao/bug-view-23.html']")).click();
		Thread.sleep(3000);
		//最后跳转的页面需要获得句柄
		Set<String> handles = new HashSet<String>(dri.getWindowHandles()) ;
		List<String> it =new ArrayList<String>(handles);
		System.out.println(it.get(0));
		System.out.println(it.get(1));
		
		Thread.sleep(2000);
		dri.switchTo().window(it.get(0));
		Thread.sleep(2000);
		dri.navigate().refresh();
		dri.switchTo().window(it.get(1));
		Thread.sleep(1000);
		dri.switchTo().window(it.get(1));
		Thread.sleep(1000);
		dri.switchTo().window(it.get(1));
		Thread.sleep(1000);
		dri.switchTo().window(it.get(1));
		Thread.sleep(2000);
		dri.findElement(By.xpath("//*[@id=\"titlebar\"]/div[2]/div[1]/a[1]")).click();
		//确认BUG_iframe
		Thread.sleep(2000);
		dri.switchTo().frame(dri.findElement(By.xpath("//*[@id=\"modalIframe\"]")));
		Thread.sleep(2000);
		//指派给
		dri.findElement(By.xpath("//*[@id=\"assignedTo_chosen\"]/a/div")).click();
		List<WebElement> lis = new ArrayList<WebElement>(dri.findElements(By.cssSelector("li.active-result")));
		lis.get(3).click();
		//BUG类型
		dri.findElement(By.cssSelector("select[id='type']")).findElement(By.cssSelector("option[value='config']")).click();
		dri.findElement(By.cssSelector("select[id='pri']")).findElement(By.cssSelector("option[value='3']")).click();
		//抄送给
		dri.findElement(By.xpath("//*[@id=\"mailto_chosen\"]/ul")).click();
		dri.findElement(By.xpath("//*[@id=\"mailto_chosen\"]/div/ul/li[2]")).click();
		//重现步骤
		dri.switchTo().frame(dri.findElement(By.xpath("/html/body/div[1]/form/table/tbody/tr[5]/td/div/div[2]/iframe")));
		WebElement el = dri.findElement(By.xpath("/html/body"));
		Thread.sleep(2000);
		el.click();
		dri.findElement(By.xpath("/html/body")).sendKeys("穿越时空,竭尽全力,我会来到你身边");
		dri.switchTo().parentFrame();
		//保存
		dri.findElement(By.id("submit")).click();
		
		
		//解决BUG
		Thread.sleep(2000);
		dri.switchTo().window(it.get(0));
		Thread.sleep(2000);
		dri.switchTo().window(it.get(1));
		dri.findElement(By.xpath("//*[@id=\"titlebar\"]/div[2]/div[1]/a[2]")).click();
		Thread.sleep(2000);
		//解决方案
		
		dri.switchTo().frame(dri.findElement(By.xpath("//*[@id=\"modalIframe\"]")));
		Thread.sleep(2000);
		dri.findElement(By.cssSelector("select[id='resolution']")).findElement(By.cssSelector("option[value='bydesign']")).click();
		//解决版本
		dri.findElement(By.xpath("//*[@id=\"assignedTo_chosen\"]/a/div")).click();
		List<WebElement> lis1 = new ArrayList<WebElement>(dri.findElements(By.cssSelector("li.active-result")));
		lis1.get(1).click();
		//解决日期
		dri.findElement(By.cssSelector("input[name='resolvedDate']")).sendKeys("2018-04-13");
		//标题
		dri.findElement(By.cssSelector("input[name='labels[]']")).sendKeys("梦想成真不会遥远");
		//备注
		dri.switchTo().frame(dri.findElement(By.xpath("/html/body/div[1]/form/table/tbody/tr[7]/td/div/div[2]/iframe")));
		WebElement el1 = dri.findElement(By.xpath("/html/body"));
		Thread.sleep(2000);
		el1.click();
		dri.findElement(By.xpath("/html/body")).sendKeys("穿越时空,竭尽全力,我会来到你身边");
		dri.switchTo().parentFrame();
		dri.findElement(By.id("submit")).click();
		//跳转关闭
		Thread.sleep(2000);
		dri.switchTo().window(it.get(0));
		Thread.sleep(2000);
		dri.switchTo().window(it.get(1));
		dri.findElement(By.xpath("//*[@id=\"titlebar\"]/div[2]/div[1]/a[2]")).click();
		//备注
		dri.switchTo().frame(dri.findElement(By.xpath("//*[@id=\"modalIframe\"]")));
		Thread.sleep(2000);
		dri.switchTo().frame(dri.findElement(By.xpath("/html/body/div[1]/form/table/tbody/tr[1]/td/div/div[2]/iframe")));
		WebElement el2 = dri.findElement(By.xpath("/html/body"));
		Thread.sleep(2000);
		el2.click();
		dri.findElement(By.xpath("/html/body")).sendKeys("穿越时空,竭尽全力,我会来到你身边");
		dri.switchTo().parentFrame();
		dri.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	}

}
