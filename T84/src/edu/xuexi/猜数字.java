package edu.xuexi;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ������ {
	public static void main(String[] args){
		double x=0;
		x=Math.random()*100;
		System.out.println("�´�С����ʼ��ϵͳ����һ��һ����������������������Ĵ�С");
		for(int j=4;j>=0;j--){
		int i=0;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("������һ��һ�����ڵ�����");
		i=sc.nextInt();
		if(i==(int)x)
		{System.out.println("�¶���,������"+(int)x);
		break;
		}else if(i>(int)x){
		System.out.println("���µ����ֹ���");
		}else if(i<(int)x){
		System.out.println("���µ����ֹ�С");
		}
		 else{
			
		}
		if(j>=1){
		System.out.println("�㻹��"+j+"�λ���");
		}else{
			System.out.println("���Ĵ��������ˣ�ף���´κ���");
			System.out.println("��û�в³���ȷ�𰸣�����"+(int)x);
		}
		}
		
		
	}

}

