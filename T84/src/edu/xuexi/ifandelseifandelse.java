package edu.xuexi;

import java.util.Scanner;

public class ifandelseifandelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int score;
	Scanner sc =new Scanner(System.in);
	System.out.println("请输入成绩");
	score =sc.nextInt();
	if(score<60){
		System.out.println("渣渣没及格");
	}else if(score>=60&&score<=100){
		System.out.println("哎哟不错，及格了");
	}else{
		System.out.println("别瞎几把乱输");
	}
	
	
	
	}
 
}
