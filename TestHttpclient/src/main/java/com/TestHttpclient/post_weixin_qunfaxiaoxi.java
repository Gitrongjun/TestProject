package com.TestHttpclient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class post_weixin_qunfaxiaoxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloseableHttpClient httpclient = null;
		HttpPost httppost = null;
		HttpResponse response= null;
		HttpEntity entity = null;
		String url = "https://api.weixin.qq.com/cgi-bin/message/mass/sendall?access_token=";
		String uri =get_token() ;
		System.out.println(uri);
		String entityContent = null;
		String postdata="{\"filter\":{\"is_to_all\":true},\"text\":{\"content\":\"小嘛小儿郎呀！\"},\"msgtype\":\"text\"}";
		
		try {
			httpclient = HttpClients.createDefault();
			//拼接url
			httppost = new HttpPost(url+uri);
			//声明一个实体，以postdata数据进行初始化，编码格式为utf-8
			StringEntity seEntity = new StringEntity(postdata,"utf-8");
			seEntity.setContentEncoding("utf-8");
			//设置ContentType的类型为application/jso
			seEntity.setContentType("application/json");
			//将seEntity里面的数据放入httppost
			httppost.setEntity(seEntity);
			response = httpclient.execute(httppost);
			entity = response.getEntity();
			entityContent = EntityUtils.toString(entity,"utf-8");
			System.out.println(entityContent);
			
			
			//entity = response.getEntity();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static String get_token(){
		CloseableHttpClient httpclient = null;
		HttpGet httpget = null;
		HttpResponse response =null;
		HttpEntity entyti = null;
		String entityConetent = null;
		String url = "https://api.weixin.qq.com/cgi-bin/token";
		String access_token ="";
		
		try {
			httpclient = HttpUtils.createSSLClientDefault();
			
			List<NameValuePair> NameValuePair = new ArrayList<NameValuePair>();
			NameValuePair.add(new BasicNameValuePair("grant_type", "client_credential"));
			NameValuePair.add(new BasicNameValuePair("appid", "wxe96fc7461bfae1ec"));
			NameValuePair.add(new BasicNameValuePair("secret", "a6a4c414c85795428bffcccb1dd31938"));
			String str = EntityUtils.toString(new UrlEncodedFormEntity(NameValuePair,Consts.UTF_8));
			System.out.println(url+"?"+str);
			httpget = new HttpGet(url+"?"+str);
			/*httpget.setHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36 Edge/16.16299");
			httpget.setHeader("Accept","text/html, application/xhtml+xml, image/jxr, *转义//*");*/
			
			response = httpclient.execute(httpget);
			entyti = response.getEntity();
			entityConetent = EntityUtils.toString(entyti,"utf-8");
			System.out.println(entityConetent);
			//查找前面一段"access_token\":"出现的为u在，中间的\是用来转义
			int indexof = entityConetent.indexOf("access_token\":");
			//查找结束的一段",\"expires_in"出现的为u在，中间的\是用来转义
			int endof = entityConetent.lastIndexOf(",\"expires_in");
			endof-=1;
			System.out.println(indexof);
			//得到的值多出"access_token\":"
			String access_token1 = entityConetent.substring(indexof, endof);
			//去除前面一段
			access_token = access_token1.substring(15);
			System.out.println(access_token);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				httpclient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return access_token;
		
		
		
	}

}
