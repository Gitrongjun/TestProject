package edu.xuexi;

import java.util.Random;
import java.util.Scanner;

public class randomname {
public static void main(String[] args){
	String a[]={"csj","ysn","jxj","hwy","dm","ns"};
	Random b =new Random();
	//实例random
	int x=0;
	//定义X用来接收用户输入
	Scanner sc =new Scanner(System.in);
	//实例化Scanner
	System.out.println("请输入您要点名多少次");
	x = sc.nextInt();
	//X接受用户输入
	int d[]=new int[a.length];
	//定义一个与a数组相同长度的d，用来存储点名次数
	for(int c=0;c<x;c++){
		//循环次数为用户输入次数x
		int i = b.nextInt(a.length);
		//随机值设置为数组a的长度
		d[i]++;
		//每次点名记录点中了谁，对应数组+1
		System.out.print(a[i]+"，");
		//输出每次点中的人名
	}
	System.out.println();
	//换行
	for(int e:d){
		System.out.print(e+",");
		//列出所有被点次数
	}
	int temp=0;
	int temp1=0;
	/*int temp2=0;
	int temp3=0;*/
	for(int j=0;j<d.length;j++){
		
		if(temp<d[j]){
			
		/*	if(temp==d[j]){
				//如果有点名次数一样的人拿下来
				temp2=d[j];
				temp3=j;
				System.out.println("1111");
				}*/
			temp=d[j];
			//拿到点名最多的人的次数
			temp1=j;
			//拿到点名最多的人的数组下标
			
		}
	}
	//if(temp!=temp2){
	System.out.println("被点名最多的人是"+a[temp1]+"，被点名"+temp+"次");
	//}else{
	//System.out.println("被点名最多的人是"+a[temp1]+"，被点名"+temp+"次和"+"被点名最多的人是"+a[temp3]+"，被点名"+temp2+"次");
	//}
	
}
}
