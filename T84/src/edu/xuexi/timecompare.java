package edu.xuexi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class timecompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date day=new Date();    

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 

		System.out.println(df.format(day)+"��һ�����п�ʼʱ");   
		
		String result = "�������ǣ�";
		for(int i= 0;i<100000;i++){
			result=result+1;
			
		}
		System.out.println(result);
		System.out.println(df.format(day)+"��һ�����н���ʱ"); 
		
		System.out.println();
		
		
		
		System.out.println(df.format(day)+"�ڶ������п�ʼʱ"); 
		StringBuffer add= new StringBuffer("�������ǣ�");
		for(int i= 0;i<100000;i++){
			add = add.append(i);
			
		}
		System.out.println(add);
		System.out.println(df.format(day)+"�ڶ������н���ʱ"); 
		
	}

}
