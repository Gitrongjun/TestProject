package edu.xuexi;

public class addRecord {
	int money;
	String name;
public  addRecord() {
		System.out.println("建立账户成功！");
		
	}
public  addRecord(int money, String name){
	this();
	this.money=this.money+money;
	System.out.println("更改后的金额是："+this.money);
	this.name= name;
	System.out.println("命名为："+this.name);
}
}
