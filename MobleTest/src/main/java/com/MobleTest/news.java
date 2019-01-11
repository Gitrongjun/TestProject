package com.MobleTest;

import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class news {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

        AndroidDriver driver;
		
	    DesiredCapabilities cap=new DesiredCapabilities();
	    
	    cap.setCapability("automationName", "Appium");//appium做自动化
//	    cap.setCapability("app", "F:\\software\\CalcTest.apk");//自动安装apk
//	    cap.setCapability("browserName", "chrome");//设置HTML5的自动化，打开谷歌浏览器
	    cap.setCapability("deviceName", "S4");//设备名称
	    cap.setCapability("platformName", "Android"); //安卓自动化还是IOS自动化
	    cap.setCapability("platformVersion", "4.4"); //安卓操作系统版本
	    cap.setCapability("udid", "192.168.235.101:5555"); //设备的udid (adb devices 查看到的)
	    cap.setCapability("appPackage", "com.ss.android.article.news");//被测app的包名
	    cap.setCapability("appActivity", ".activity.MainActivity");//被测app的入口Activity名称
	    cap.setCapability("unicodeKeyboard", "True"); //支持中文输入
	    cap.setCapability("resetKeyboard", "True");   //支持中文输入，必须两条都配置
	    cap.setCapability("noSign", "True");  //不重新签名apk
	    cap.setCapability("newCommandTimeout", "10");  //没有新命令，appium30秒退出
	    
	    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);//把以上配置传到appium服务端并连接手机
         //隐式等待
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		
		//7、截取屏幕
//		File screen = driver.getScreenshotAs(OutputType.FILE);
//		File screenFile = new File("F:\\T56test\\news.png");
//		try {
//			FileUtils.copyFile(screen, screenFile); //commons-io-2.0.1.jar中的api
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		//滑动屏幕
		// 定义一个文件
		File screen=driver.getScreenshotAs(OutputType.FILE);
		//把截图变成了照片
		BufferedImage bos=ImageIO.read(screen);
		//获取不同手机屏幕的宽和高度
		int width=bos.getWidth();
		int heigth=bos.getHeight();
		
		Thread.sleep(5000);
		//1. 往右边     从右边往左边滑动
		driver.swipe(width*9/10, heigth/2, width*1/10, heigth/2, 1000);
		Thread.sleep(1000);
		driver.swipe(width*9/10, heigth/2, width*1/10, heigth/2, 1000);
		
		Thread.sleep(3000);
		//2. 往左边
		driver.swipe(width*1/10, heigth/2, width*9/10, heigth/2, 1000);
		Thread.sleep(1000);
		driver.swipe(width*1/10, heigth/2, width*9/10, heigth/2, 1000);
		Thread.sleep(3000);
		//3.往下滑
		driver.swipe(width/2, heigth*9/10, width/2, heigth*1/10, 1000);
		Thread.sleep(1000);
		driver.swipe(width/2, heigth*9/10, width/2, heigth*1/10, 1000);
		Thread.sleep(3000);
		
		//4.往下滑
		driver.swipe(width/2, heigth*2/10, width/2, heigth*9/10, 1000);
		Thread.sleep(1000);
		driver.swipe(width/2, heigth*2/10, width/2, heigth*9/10, 1000);
		Thread.sleep(1000);
	}

}
