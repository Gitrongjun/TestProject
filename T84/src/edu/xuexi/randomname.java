package edu.xuexi;

import java.util.Random;
import java.util.Scanner;

public class randomname {
public static void main(String[] args){
	String a[]={"csj","ysn","jxj","hwy","dm","ns"};
	Random b =new Random();
	//ʵ��random
	int x=0;
	//����X���������û�����
	Scanner sc =new Scanner(System.in);
	//ʵ����Scanner
	System.out.println("��������Ҫ�������ٴ�");
	x = sc.nextInt();
	//X�����û�����
	int d[]=new int[a.length];
	//����һ����a������ͬ���ȵ�d�������洢��������
	for(int c=0;c<x;c++){
		//ѭ������Ϊ�û��������x
		int i = b.nextInt(a.length);
		//���ֵ����Ϊ����a�ĳ���
		d[i]++;
		//ÿ�ε�����¼������˭����Ӧ����+1
		System.out.print(a[i]+"��");
		//���ÿ�ε��е�����
	}
	System.out.println();
	//����
	for(int e:d){
		System.out.print(e+",");
		//�г����б������
	}
	int temp=0;
	int temp1=0;
	/*int temp2=0;
	int temp3=0;*/
	for(int j=0;j<d.length;j++){
		
		if(temp<d[j]){
			
		/*	if(temp==d[j]){
				//����е�������һ������������
				temp2=d[j];
				temp3=j;
				System.out.println("1111");
				}*/
			temp=d[j];
			//�õ����������˵Ĵ���
			temp1=j;
			//�õ����������˵������±�
			
		}
	}
	//if(temp!=temp2){
	System.out.println("��������������"+a[temp1]+"��������"+temp+"��");
	//}else{
	//System.out.println("��������������"+a[temp1]+"��������"+temp+"�κ�"+"��������������"+a[temp3]+"��������"+temp2+"��");
	//}
	
}
}
