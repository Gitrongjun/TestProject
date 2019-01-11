/**
 * 
 */
package com.zentao.framework;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author jrj
 * @version 1.0.0
 * @since 
 * 创建时间：2018年5月11日
 * 功能描述：
 * 邮箱地址：519028651@qq.com
 */

public class PropertiesUtils {
	private static Properties properties;
	private static String propertiesFileName=null;
	//构造
	public PropertiesUtils(String pach){
		this.propertiesFileName=pach;
	}
	//封装提取值的方法
	public static String getPropretieValue(String keyname){
		properties=new Properties();
		InputStream in =PropertiesUtils.class.getClassLoader().getResourceAsStream("config//local1.properties");
		String value = null;
		try {
			properties.load(in);
			value = properties.getProperty(keyname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.toString());
		}
		
		return value;  
	}
}
