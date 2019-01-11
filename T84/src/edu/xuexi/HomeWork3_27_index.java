package edu.xuexi;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class HomeWork3_27_index {
public static void main(String[] args){
	/*Homework_3_27 cust1 =new Homework_3_27("qaaa");
	cust1.view();
	cust1.setmoney(5);
	cust1.pay(1);*/
	VIP1 v = new VIP1("csj");
	v.setmoney(1);
	v.conversion(500);
	v.setscore(500);
	v.pay(5);
	int a=v.getmoney();
	
	System.out.println("Óà¶îÎª"+a);
}
}


