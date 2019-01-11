package edu.xuexi;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class 猜数字 {
	public static void main(String[] args){
		double x=0;
		x=Math.random()*100;
		System.out.println("猜大小程序开始，系统产生一个一百以内随机数，请您猜它的大小");
		for(int j=4;j>=0;j--){
		int i=0;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一个一百以内的数字");
		i=sc.nextInt();
		if(i==(int)x)
		{System.out.println("猜对了,数字是"+(int)x);
		break;
		}else if(i>(int)x){
		System.out.println("您猜的数字过大");
		}else if(i<(int)x){
		System.out.println("您猜的数字过小");
		}
		 else{
			
		}
		if(j>=1){
		System.out.println("你还有"+j+"次机会");
		}else{
			System.out.println("您的次数用完了，祝您下次好运");
			System.out.println("您没有猜出正确答案，答案是"+(int)x);
		}
		}
		
		
	}

}

