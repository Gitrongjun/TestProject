package com.zendao;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.soap.SAAJResult;

import org.apache.commons.collections4.map.HashedMap;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.pages.LoginPage;
import com.uiframwork.Locator;
import com.uiframwork.Locator.ByType;
import com.utils.xmlUtils;

public class readxml {

	public static void main(String[] args) throws DocumentException {
	 HashedMap<String, Locator> ls=xmlUtils.readElementInfo("LoginPage.xml");
   String name= ls.get("userLink").getElementName();
	System.out.println(name);
}
}
