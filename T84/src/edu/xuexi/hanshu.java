package edu.xuexi;

import java.util.Scanner;

public class hanshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		char b;
		int inputff;
		Scanner sc =new Scanner(System.in);
		System.out.println("������Ҫ��ӡ������");
		a =sc.nextInt();
		System.out.println("������Ҫ��ӡ���ַ���");
		b =sc.next().charAt(0);
		System.out.println("������Ҫ��ӡ����״��0������ 1������");
		inputff =sc.nextInt();
		switch (inputff) {
		case 0:
			sjx(a,b);
			break;

		default:
			sjx1(a,b);
			break;
		}
		
		
	}
	public static void sjx(int num,char xz){
		for(int row=0;row<num;row++){
		for(int col=0;col<row;col++){
		System.out.print(xz+" ");
		}
		System.out.println();
		}
	}
	
	public static void sjx1(int num,char xz){
		for(int row=0;row<num;row++){
		for(int col=0;col<num-row;col++){
		System.out.print(xz+" ");
		}
		System.out.println();
		}
	}
	
}
