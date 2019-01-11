package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class H_3_chandao_BUG_Submit {

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
		dri.findElement(By.cssSelector("a[href='/zentao/qa/']")).click();
		Thread.sleep(2000);
		dri.findElement(By.cssSelector("a[href='/zentao/bug-browse-1.html']")).click();
		Thread.sleep(2000);
		dri.findElement(By.cssSelector("a[href='/zentao/bug-create-1-0-moduleID=0.html']")).click();
		//所属项目
		dri.findElement(By.xpath("//*[@id=\"project_chosen\"]/a/div")).click();
		dri.findElement(By.cssSelector("li.active-result")).click();
		//当前指派
		Thread.sleep(2000);
		dri.findElement(By.xpath("//*[@id=\"assignedTo_chosen\"]/a/div")).click();
		List<WebElement> lis = new ArrayList<WebElement>(dri.findElements(By.cssSelector("li.active-result")));
		lis.get(3).click();
		//BUG类型
		dri.findElement(By.cssSelector("select[id='type']")).findElement(By.cssSelector("option[value='security']")).click();
		dri.findElement(By.cssSelector("select[id='os']")).findElement(By.cssSelector("option[value='win2000']")).click();
		dri.findElement(By.cssSelector("select[id='browser']")).findElement(By.cssSelector("option[value='ie6']")).click();
		//所属模块
		dri.findElement(By.xpath("//*[@id=\"module_chosen\"]/a")).click();
		List<WebElement> lis1 = new ArrayList<WebElement>(dri.findElements(By.cssSelector("li.active-result")));
		lis1.get(3).click();
		//影响版本
		dri.findElement(By.cssSelector("input[type='text'][class='default']")).click();
		//List<WebElement> lis2 = new ArrayList<WebElement>(dri.findElements(By.cssSelector("li.active-result")));
		//lis2.get(1).click();
		//Actions ac = new Actions(dri);
		//WebElement el = dri.findElement(By.cssSelector("li.active-result"));
		//ac.contextClick(lis2.get(1));
		//ac.sendKeys(el,Keys.DOWN).sendKeys(el,Keys.ENTER).sendKeys(el,Keys.ENTER);
		//截止日期
		dri.findElement(By.xpath("//*[@id=\"openedBuild_chosen\"]/div/ul/li[2]")).click();
		dri.findElement(By.cssSelector("input[name='deadline']")).sendKeys("2018-04-13");
		//bug标题颜色
		dri.findElement(By.xpath("//*[@id=\"dataform\"]/table/tbody/tr[5]/td/div/div[1]/div/div[1]/button")).click();
		Thread.sleep(2000);
		dri.findElement(By.xpath("//*[@id=\"dataform\"]/table/tbody/tr[5]/td/div/div[1]/div/div[1]/ul/li[4]")).click();
		//bug标题文本
		dri.findElement(By.cssSelector("input[id='title']")).sendKeys("新的bug已经出现，怎么能够停滞不前");
		//严重程度
		dri.findElement(By.xpath("//*[@id=\"dataform\"]/table/tbody/tr[5]/td/div/div[2]/div/div[1]/button")).click();
		Thread.sleep(2000);
		dri.findElement(By.xpath("//*[@id=\"dataform\"]/table/tbody/tr[5]/td/div/div[2]/div/div[1]/ul/li[3]/a")).click();
		//优先级
		dri.findElement(By.xpath("//*[@id=\"dataform\"]/table/tbody/tr[5]/td/div/div[2]/div/div[2]/button")).click();
		Thread.sleep(2000);
		dri.findElement(By.xpath("//*[@id=\"dataform\"]/table/tbody/tr[5]/td/div/div[2]/div/div[2]/ul/li[2]/a")).click();
		//重现步骤
		dri.switchTo().frame(dri.findElement(By.xpath("//*[@id=\"dataform\"]/table/tbody/tr[6]/td/div[2]/div[2]/iframe")));
		WebElement el = dri.findElement(By.xpath("/html/body"));
		Thread.sleep(2000);
		el.click();
		dri.findElement(By.xpath("/html/body")).sendKeys("穿越时空,竭尽全力,我会来到你身边");
		dri.findElement(By.xpath("/html/body")).sendKeys(Keys.DOWN+""+Keys.ENTER+"穿越时空,竭尽全力,我会来到你身边");
		dri.findElement(By.xpath("/html/body")).sendKeys(Keys.UP+""+Keys.UP+Keys.UP+Keys.UP+"穿越时空,竭尽全力,我会来到你身边");
		dri.switchTo().parentFrame();
		//抄送给
		dri.findElement(By.xpath("//*[@id=\"mailto_chosen\"]/ul")).click();
		dri.findElement(By.xpath("//*[@id=\"mailto_chosen\"]/div/ul/li[2]")).click();
		//关键词
		dri.findElement(By.id("keywords")).sendKeys("微笑面对危险");
		//标题
		dri.findElement(By.cssSelector("input[name='labels[]']")).sendKeys("梦想成真不会遥远");
		//保存
		Thread.sleep(2000);
		dri.findElement(By.cssSelector("input[name='labels[]']")).sendKeys(Keys.ENTER);
	}

}
