package com.MobleTest;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
public class C_4_jd_process {
public static void main(String[] args) throws Exception {
		AndroidDriver driver;
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability("automationName", "Appium");//appium做自动化
		//cap.setCapability("app", "D:\\temp\\xiaomijisuanqi_115.apk");//安装apk
		//cap.setCapability("browserName", "chrome");//设置HTML5的自动化，打开谷歌浏览器
		cap.setCapability("deviceName", "SAMSUNG_SM_N900A");//设备名称
		cap.setCapability("platformName", "Android"); //安卓自动化还是IOS自动化
		cap.setCapability("platformVersion", "4.4"); //安卓操作系统版本
		cap.setCapability("udid", "127.0.0.1:6555"); //设备的udid (adb devices 查看到的)
		cap.setCapability("appPackage", "com.jingdong.app.mall");//被测app的包名
		cap.setCapability("appActivity",".main.privacy.PrivacyActivity");//被测app的入口Activity名称
		cap.setCapability("unicodeKeyboard", "True"); //支持中文输入
		cap.setCapability("resetKeyboard", "True"); //支持中文输入，必须两条都配置
		cap.setCapability("noSign", "True"); //不重新签名apk
		cap.setCapability("newCommandTimeout", "30"); //没有新命令，appium30秒退出
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);//把以上配置传到appium服务端并连接手机
		//隐式等待
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*driver.findElement(By.id("com.miui.calculator:id/btn_1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.miui.calculator:id/btn_plus")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.miui.calculator:id/btn_2")).click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("等于").click();
		Thread.sleep(1000);*/
	
}
}