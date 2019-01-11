/**
 * 
 */
package com.Utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.uiframework.Locator;
import com.uiframework.Locator.ByType;

/**
 * @author jrj
 * @version 1.0.0
 * @since 
 * 创建时间：2018年5月15日 下午8:53:32
 * 功能描述：读取xml文件内容
 * 邮箱地址：519028651@qq.com
 */

public class xmlUtils {
	public static HashMap<String, Locator> readElementInfo(String filePath){
		//定义xml文件名，放外面因为局部变量
		Document document = null;
		Map<String,Locator>elementinfos=new HashMap<String, Locator>();
		//SAXReader主要用于解析XML文件,是当前比较流行的xml解决方案.
		SAXReader sexReader = new SAXReader();
		//读取文件的的路径并放入Docment中
		try {
		document = sexReader.read(filePath);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//获取xml文件的根节点
		Element root = document.getRootElement();
		//获取所有根节点下的locator子节点
		List<Element>chlidlist = root.elements("locator");
		//使用for循环取chlilist中所有locator子节点的值
		for(Element e:chlidlist){
			//从locator元素中获取属性name值
			String name =e.attributeValue("name").toString();
			//从locator元素中获取属性value值
			String value=e.attributeValue("value").toString();
			//由于timeout在xml中本来就是int类型所以用integer转码就行
			int timeout =Integer.parseInt(e.attributeValue("timeout"));
			//从locator中获取属性type值
			String type =e.attributeValue("type").toString();
			//将所有属性值放入实体类locator中做成一个实体 	
			Locator locator = new Locator(name,value,timeout,getType(type));
			//从xml获取Text用作map的键
			String keyName=e.getText();
			//将keyName键和locator实体值放入mapelementinfos中
			elementinfos.put(keyName, locator);
		}
		//将mapelementinfos传出
		return (HashMap<String, Locator>) elementinfos;
		
	}
	//获取locator中枚举类型ByType从xml中传入的类型
	public static ByType getType(String value){
		ByType type=null;
		switch(value){
		case "css":
			type=ByType.cssSelector;
		case "id":
			type=ByType.id;
		case "linkText":
			type=ByType.linkText;
		case "name":
			type=ByType.name;
		case "className":
			type=ByType.className;
		case "xpath":
			type=ByType.xpath;
		case "partialLinkText":
			type=ByType.partialLinkText;
		case "tagName":
			type=ByType.tagName;
		}
		return type;
		
	}
}
