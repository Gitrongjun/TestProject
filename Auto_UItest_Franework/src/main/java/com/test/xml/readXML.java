package com.test.xml;

import java.util.List;

import javax.swing.text.Document;

import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class readXML {

	public static void main(String[] args) {
		SAXReader saxReader = new SAXReader();
		try {
			org.dom4j.Document document = saxReader.read("D:\\xuexi\\Auto_UItest_Franework\\src\\main\\java\\com\\test\\xml\\stu.xml");
			Element root = document.getRootElement();
			System.out.println(root.getNodeTypeName());
			List<Element> childList=root.elements();
			for(Element el:childList){
				System.out.println("标签名称"+el.getName());
				System.out.println("学生姓名"+el.attributeValue("name"));
				System.out.println("学生年龄"+el.attributeValue("age"));
				System.out.println("学号"+el.getText());
			}
			System.out.println("--------------------------------");
			List<Element> childList1=root.elements("stub");
			for(Element el:childList1){
				System.out.println("标签名称"+el.getName());
				System.out.println("学生姓名"+el.attributeValue("name"));
				System.out.println("学生年龄"+el.attributeValue("age"));
				System.out.println("学号"+el.getText());
			}
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
