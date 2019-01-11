package by.xiaomi.auto;

import java.lang.reflect.WildcardType;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXiaomi {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver dri = new ChromeDriver();
		dri.get("https://www.mi.com");
		dri.manage().window().maximize();
		dri.findElement(By.linkText("登录")).click();
		dri.findElement(By.id("username")).sendKeys("15674214383");
		dri.findElement(By.id("pwd")).sendKeys("jc95a2b28cxm");
		dri.findElement(By.cssSelector("input[value='登录']")).click();
		Thread.sleep(2000);
		dri.findElement(By.id("search")).sendKeys("小米mix2s");
		Thread.sleep(2000);
		dri.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);
		dri.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/h2/a")).click();
		Thread.sleep(2000);
		dri.findElement(By.linkText("立即购买")).click();
		Thread.sleep(2000);
		dri.findElement(By.xpath("//*[@id=\"J_list\"]/div[1]/ul/li[3]/a")).click();
		//跳到黑色版本
		int height = 0;
			try {
			String setscroll = "document.documentElement.scrollTop=" + height;
			JavascriptExecutor jse=(JavascriptExecutor) dri;
			jse.executeScript(setscroll);
			} catch (Exception e) {
			System.out.println("Fail to set the scroll.");
			}
		//黑色Xpath地址
		try {
			WebElement target = dri.findElement(By.xpath("//*[@id=\"J_list\"]/div[2]/ul/li[1]/a"));
			((JavascriptExecutor) dri).executeScript("arguments[0].scrollIntoView();", target);
			target.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			String str = dri.findElement(By.xpath("//*[@id=\"J_buyBtnBox\"]/li/a")).getText();
		//	boolean tf = dri.findElement(By.xpath("//*[@id=\"J_buyBtnBox\"]/li/a")).isEnabled();
			//System.out.println(tf);
			System.out.println("现在的状态是"+str);
			for(int i = 0;i<=1000000;i++){
				str = dri.findElement(By.xpath("//*[@id=\"J_buyBtnBox\"]/li/a")).getText();
				//tf = dri.findElement(By.xpath("//*[@id=\"J_buyBtnBox\"]/li/a")).isEnabled();
				//System.out.println("是否禁用"+tf);
				System.out.println("现在的状态是"+str);
				if(str.equals("已预约")/*||tf==true*/){
					Thread.sleep(1);
					i++;
					System.out.println("状态已预约程序正在运行，第"+i+"毫秒");
					/*if(i%1000==0){
						System.out.println(i);
					}*/
				}else if(str.equals("加入购物车")/*||tf==true*/){
					Thread.sleep(1);
					i++;
					System.out.println("状态购物车程序正在运行，第"+i+"毫秒");
					/*if(i%1000==0){
						System.out.println(i);
					}*/
				}else{
					dri.findElement(By.xpath("//*[@id=\"J_buyBtnBox\"]/li/a")).click();
					System.out.println("点击了抢小米！");
					System.out.println("程序在第"+i+"毫秒点击抢购小米手机");
					break;
				}
			}
			System.out.println("程序运行完毕");
			dri.findElement(By.xpath("//*[@id=\"J_buyBtnBox\"]/li/a")).click();	
		}
		/*while(dri.findElement(By.linkText("已预约")).getText()!="已预约"){
		}*/
		
	}

}
