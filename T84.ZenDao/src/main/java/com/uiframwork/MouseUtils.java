package com.uiframwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseUtils {
	private Actions action;
	public MouseUtils(WebDriver driver){
	    action =new Actions(driver);
		
	}
	public void rightClick(WebElement e){
		action.contextClick(e).perform();;
	}
	public void doubleClick(WebElement e){
		action.doubleClick(e).perform();;
	}
	//3.悬停
		public void clickAndHold(WebElement e){
			action.clickAndHold(e).perform();
		}	
		//4.拖动
		public void dragAndDrop(WebElement e,WebElement e2){
			action.dragAndDrop(e, e2).perform();
		}
		//5.移动到某个元素上
		public void moveToElement(WebElement e){
			action.moveToElement(e).perform();
		}
	
}
