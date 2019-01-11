package com.utils;

import org.testng.Assert;

public class AssertUtils {
//整形，字符串，字符串包含，非空，实型断言
	
	public void checkIntNum(int actual,int expected,String... com){
	Assert.assertEquals(actual, expected);	
	}
	public void checkString(String actual,String expected,String... com){
		Assert.assertEquals(actual, expected);	
		}
	public void checkStringContains(String actual,String expected,String... com){
		Assert.assertEquals(true, actual.contains(expected));	
		}
	public void checkNull(Object actual,String... com){
		Assert.assertNotNull(actual);
	}
}
