package edu.xuexi;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc =new Scanner(System.in);
		System.out.println("���������");
		year =sc.nextInt();
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.println("������");
		}else{
			System.out.println("��������");
		}
	}

}
