package com.TestHttpclient;




import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

public class Testbaidu_get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HttpClient httpClient = null;
		HttpGet httpGet = null;
		HttpResponse response = null;
		String responseContent = null;
		try {
			String url = "http://www.baidu.com";
			String uri = "/s?wd=newdream";
			httpGet = new HttpGet(url+uri);
			response = httpClient.execute(httpGet);
			responseContent = response.toString();
			System.out.println(responseContent);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
