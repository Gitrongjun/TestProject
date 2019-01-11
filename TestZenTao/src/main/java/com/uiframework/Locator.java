/**
 * 
 */
package com.uiframework;

/**
 * @author jrj
 * @version 1.0.0
 * @since 
 * 创建时间：2018年5月15日 下午8:16:43
 * 功能描述：实体类locator，提供hashmap使用数据类型
 * 邮箱地址：519028651@qq.com
 */

public class Locator {
	//定义枚举类型,ByType使用类型只能是下面定义的几种
	public enum ByType{
		xpath,id,linkText,name,className,cssSelector,partialLinkText,tagName
	}
	//声明元素名称
	private String elementName;
	//声明定位信息
	private String locatorInfo;
	//声明超时
	private int timeout;
	//声明枚举类型
	private ByType bytype;
	//构造方法为实体类赋值
	public Locator(String elementName,String locatorInfo,int timeout,ByType bytype){
		this.elementName=elementName;
		this.locatorInfo=locatorInfo;
		this.timeout=timeout;
		this.bytype=bytype;
	}
	public String getElementName() {
		return elementName;
	}
	public String getLocatorInfo() {
		return locatorInfo;
	}
	public int getTimeout() {
		return timeout;
	}
	public ByType getBytype() {
		return bytype;
	}
}
