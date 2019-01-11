package CAutotest;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ctestwork3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//先实例化一个驱动对象
		WebDriver dri = new ChromeDriver();
		//获取目标网址
		dri.get("http://www.baidu.com");
		//最大化浏览器
		dri.manage().window().maximize();
		
		String str = dri.getTitle();
		if(str.contains("百度")){
			System.out.println("包含百度");
		}else{
			System.out.println("不包含百度");
		}
		if(str.contentEquals("百度一下，你就知道")){
			System.out.println("等于百度一下，你就知道");
		}else{
			System.out.println("不等于百度一下，你就知道");
		}
		
		
	}

}
