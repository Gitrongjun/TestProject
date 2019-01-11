package com.TestJson;

import org.json.JSONObject;

public class TestJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject jo = new JSONObject("{'name':'jiang','age':18}");
		String name = jo.getString("name");
		System.out.println(name);
		JSONObject js = new JSONObject("[{'name':'jiang','age':18},{'name':'rongjun','age':19}]");
		int i = js.length();
		//String nameARR = js.getJSONArray(1)
	//	System.out.println(nameARR);
		//String name1 = nameARR.getInt(0);
		String man = "{'name':'xiaohong','age':20,'school':['师大附中','湖南大学']}";
		JSONObject xx = new JSONObject(man);
		//JSONObject School = xx.getJSONArray(school);
	}

}
