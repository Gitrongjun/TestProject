/**
 * 
 */
package com.zendao;

import org.openqa.selenium.WebDriver;

import com.uiframwork.DriverFactory;
import com.utils.PropertiesUtils;


/**
 *  * @author 郭成乾  * @version 1.0.0  * @since   *   * 创建时间：2018年5月11日  * 功能描述：  
 */
public class demo {

	public static void main(String[] args) {
//		PropertiesUtils propertiesUtils = new PropertiesUtils("local.properties");
//		String url = propertiesUtils.getPropertieValue("url");
//		System.out.println(url);
//		WebDriver driver=DriverFactory.getFireFoxDriver();
//		driver.get("https://www.baidu.com");
		String path=System.getProperty("user.dir");
		System.out.println(path+"\\Driver");
	}

}
