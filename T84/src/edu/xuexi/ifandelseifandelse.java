package edu.xuexi;

import java.util.Scanner;

public class ifandelseifandelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int score;
	Scanner sc =new Scanner(System.in);
	System.out.println("������ɼ�");
	score =sc.nextInt();
	if(score<60){
		System.out.println("����û����");
	}else if(score>=60&&score<=100){
		System.out.println("��Ӵ����������");
	}else{
		System.out.println("��Ϲ��������");
	}
	
	
	
	}
 
}
