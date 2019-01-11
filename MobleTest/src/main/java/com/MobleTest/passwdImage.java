package com.MobleTest;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class passwdImage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        AndroidDriver driver;
		
	    DesiredCapabilities cap=new DesiredCapabilities();
	    
	    cap.setCapability("automationName", "Appium");//appium做自动化
//	    cap.setCapability("app", "c:\\software\\CalcTest.apk");//安装apk
//	    cap.setCapability("browserName", "chrome");//设置HTML5的自动化，打开谷歌浏览器
	    cap.setCapability("deviceName", "S4");//设备名称
	    cap.setCapability("platformName", "Android"); //安卓自动化还是IOS自动化
	    cap.setCapability("platformVersion", "4.4"); //安卓操作系统版本
	    cap.setCapability("udid", "192.168.153.101:5555"); //设备的udid (adb devices 查看到的)
	    cap.setCapability("appPackage", "com.android.settings");//被测app的包名
	    cap.setCapability("appActivity", ".Settings");//被测app的入口Activity名称
	    cap.setCapability("unicodeKeyboard", "True"); //支持中文输入
	    cap.setCapability("resetKeyboard", "True");   //支持中文输入，必须两条都配置
	    cap.setCapability("noSign", "True");  //不重新签名apk
	    cap.setCapability("newCommandTimeout", "10");  //没有新命令，appium30秒退出
	    
	    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);//把以上配置传到appium服务端并连接手机
         //隐式等待
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.scrollTo("备份和重置");
		driver.openNotifications();
		driver.tap(1222,38,1, 0);
		
		driver.findElementByName("安全").click();
		Thread.sleep(1000);
		driver.findElementByName("屏幕锁定").click();
		Thread.sleep(1000);
		driver.findElementByName("图案").click();
		Thread.sleep(1000);
		
		 
		 //  9:(870,1320)  5:(540,990)  1:(210,660)  
		
		TouchAction action = new TouchAction(driver);
		action.press(870,1320).moveTo(-330, -330).moveTo(-330, -330).moveTo(660, 330)
		.moveTo(-330, -330).moveTo(-330, 330).moveTo(660, -330).moveTo(-330, 330)
		.moveTo(-330, 330).perform();
		
//		action.press(210,660).moveTo(330,0).moveTo(0, 330).moveTo(330,0).release().perform();
		driver.tap(10, 100, 100, 1000);
		Thread.sleep(2000);
		File screen = driver.getScreenshotAs(OutputType.FILE);
		File screenFile = new File("F:\\T72\\passwdImage.png");
		try {
			FileUtils.copyFile(screen, screenFile); //commons-io-2.0.1.jar中的api
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
