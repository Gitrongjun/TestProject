package com.Auto_UItest_Franework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class readproperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*方法1，必须放在项目的根目录下
		 *
		Properties p = new Properties();
		try {
			p.load(new FileInputStream("config/local1.properties"));
			System.out.println(p.toString());
			String name = p.getProperty("name");
			System.out.println(name);
			String age = p.getProperty("age");
			System.out.println(age);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//配置文件必须放在与包同级目录下
		InputStream in = readproperties.class.getClassLoader().getResourceAsStream("local1.properties");
		Properties p = new Properties();
		try {
			p.load(in);
			System.out.println(p.toString());
			String name = p.getProperty("name");
			System.out.println(name);
			String age = p.getProperty("age");
			System.out.println(age);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
