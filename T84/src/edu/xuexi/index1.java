package edu.xuexi;

import java.util.Scanner;

public class index1 {
public static void main(String[] args){
	person1 p= new person1();
	p.setUsername("cs1111111111111111111111111j");
	p.setPassword("123123");
	p.setAge(123);
	p.setPhone(1386876578);
	p.reg();
	Scanner a= new Scanner(System.in);
	
	person1 p1= new person1("≤‹…≠Ω£","123",22,1383838383);
	//p1.reg();
	
	person2 p2 = new person2();
	person2 p3 = new person2();
	p2.city="asad";
	p3.city="qwe";
	System.out.println(p2.city);
	System.out.println(p3.city);
}
}
