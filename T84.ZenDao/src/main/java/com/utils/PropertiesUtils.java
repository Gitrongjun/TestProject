      package com.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class PropertiesUtils {
     private static Properties properties;
     private static String propertiesFileName=null;
     //构造方法
     public PropertiesUtils(String path){
    	 this.propertiesFileName=path;
     }//获取属性值  
     public String getPropertieValue(String keyName){
    	 properties=new Properties();
    	 InputStream in=PropertiesUtils.class.getClassLoader().getResourceAsStream("com/config/"+propertiesFileName);
    	String value=null;
    	 try {
			properties.load(in);
			value=properties.getProperty(keyName);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    	 return value;
  
     }
}
 