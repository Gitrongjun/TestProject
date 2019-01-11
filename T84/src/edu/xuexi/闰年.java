package edu.xuexi;

import java.util.Scanner;

public class 闰年 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入年份");
		year =sc.nextInt();
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.println("是闰年");
		}else{
			System.out.println("不是闰年");
		}
	}

}
