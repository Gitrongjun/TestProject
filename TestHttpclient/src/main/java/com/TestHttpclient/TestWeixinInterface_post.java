package com.TestHttpclient;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;

public class TestWeixinInterface_post {
	public static void main(String[] args){
	HttpClient httpClient = null;
	HttpGet httpget = null;
	HttpResponse  response=null;
	HttpEntity entity = null;
	HttpPost httpPost = null;
	String responseContent = null;
	String url = "";
	
	try {
		httpClient = HttpUtils.createSSLClientDefault();
		httpget = new HttpGet(url);
		response = httpClient.execute(httpget);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	httpClient = HttpClients.createDefault();

	
	}
}
