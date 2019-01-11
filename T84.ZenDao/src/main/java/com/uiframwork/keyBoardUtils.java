package com.uiframwork;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class keyBoardUtils {
	private Actions action;
	public keyBoardUtils(WebDriver driver){
	    action =new Actions(driver);
		
	}//方向向下按几次
	public void pressDown(int times){
		try {
			Robot robot=new Robot();
			for(int i=0;i<times;i++){
				robot.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}//修饰键
	public void keyDown(String keys,String key){
		switch(keys){
		case "SHIFT":
			action.keyDown(Keys.SHIFT).sendKeys(keys).perform();
		case "ALT":
			action.keyDown(Keys.ALT).sendKeys(keys).perform();
		case "CONTROL":
			action.keyDown(Keys.CONTROL).sendKeys(keys).perform();
		default:
			System.out.println("提示:修饰按键未找到");
			break;
		}

		try {
			Thread.sleep(2000);
			action.sendKeys(Keys.NULL) ;
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}
	}
}
