package edu.xuexi;

import java.util.Scanner;

public class hanshuleijia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ÇëÊäÈëÀÛ¼Óµ½:");
		int a;
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		int result;
		result=leijiaqi(a);
		System.out.println(result);
	}
	
	public static int leijiaqi(int num){
		int c=0;
		for(int i=num;i>0;i--){
		c =c+num;
		num--;
		}
		return c;
		
	}
	
	
}
