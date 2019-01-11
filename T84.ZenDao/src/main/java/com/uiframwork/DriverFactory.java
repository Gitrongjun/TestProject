package com.uiframwork;

import java.io.IOException;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.config.LocalConfig;

public class DriverFactory {
	private static WebDriver driver;
    static Runtime runtime=Runtime.getRuntime();
    
	public static WebDriver getChormeDriver() {
		try {
			runtime.exec("taskill /F /IM chorme.exe");//杀进程
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		String driverpath=System.getProperty("user.dir")+LocalConfig.CHOME_PATH;
		System.setProperty("webdriver.chrome.driver",driverpath);
		// 1.3启动的时候黄条条问题
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("chrome.switches", Arrays.asList("--start-maximized"));
		options.addArguments("--test-type", "--start-maximized");
		driver = new ChromeDriver(options);
		return driver;

	}
	public static WebDriver getFireFoxDriver() {
		try {
			runtime.exec("taskill /F /IM geckodriver.exe");//杀进程
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		String driverpath=System.getProperty("user.dir")+LocalConfig.FIREFOX_PATH;
		System.setProperty("webdriver.gecko.driver",driverpath);
		driver = new FirefoxDriver();
		return driver;

	}
}
