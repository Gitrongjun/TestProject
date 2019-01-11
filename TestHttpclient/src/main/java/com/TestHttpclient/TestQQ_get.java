package com.TestHttpclient;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class TestQQ_get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个模拟客户端httpclient其类型是CloseableHttpClient
		CloseableHttpClient httpclient = null;
		//创建一个储存结果的respinse其类型是CloseableHttpResponse
		CloseableHttpResponse response = null;
		//创建一个HttpEntity实体类型为HttpEntity
		HttpEntity entity = null;
		//定义一个字符串用来打印response中的值
		String responseContent = null;
		//定义一个字符串用来存放url
		String url = "http://www.qq.com";
		try {
			//实例化一个模拟默认客户端
			httpclient =  HttpClients.createDefault();
			//实例化一个get请求，并且赋实参url
			HttpGet httpGet =new HttpGet(url);
			//response从get请求中获取内容
			response = httpclient.execute(httpGet);
			//使用httpentity实体获取respinse中的值
			entity = response.getEntity();
			//将实体entity转化为String值
			responseContent =EntityUtils.toString(entity,"utf-8");//可以不转码，但是为了不出意外还是转码号
			//打印
			System.out.println(responseContent);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				response.close();
				httpclient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
