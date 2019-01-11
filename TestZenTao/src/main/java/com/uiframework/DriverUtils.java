/**
 * 
 */
package com.uiframework;

import org.openqa.selenium.WebDriver;

/**
 * @author jrj
 * @version 1.0.0
 * @since 
 * 创建时间：2018年5月15日 下午7:39:15
 * 功能描述：基本浏览器操作类
 * 邮箱地址：519028651@qq.com
 */

public class DriverUtils {
	protected WebDriver driver;
	//关联鼠标工具类
	//protected static MouseUtils mouse;
	
	//关联键盘工具类
	//protected static keyBoardUtils mouse;
	
	//构造实例化鼠标键盘工具类
	public DriverUtils(WebDriver driver){
		this.driver=driver;
		//mouse = new keyBoardUtils(this.driver);
		//keyBoard = new keyBoarUtils(this.driver);	
	}
	
	//打开网址
	public void openWeb(String url){
		driver.get(url);
	}
	//浏览器后退操作
	public void back(){
		this.driver.navigate().back();
	}
	//浏览器前进操作
	public void forword(){
		this.driver.navigate().forward();
	}
	//浏览器刷新操作
	public void refresh(){
		this.driver.navigate().refresh();
	}
	//线程等待
	public void wait(int seconds){
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//获取当前页面的标题
	public String getTitle(){
		return this.driver.getTitle();
		
	}
	//获取当前页面网址
	public String getCurrentUrl(){
		return this.driver.getCurrentUrl();	
	}
	//关闭浏览器（此操作不会退出驱动）
	public void close(){
		this.driver.close();
	}
	//退出浏览器
	public void quit(){
		this.driver.quit();
	}
}
	
