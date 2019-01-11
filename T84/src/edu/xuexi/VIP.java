package edu.xuexi;

public class VIP extends Account {
	char level='a';
	//增加金额
	public void add(int money){
		this.money=this.money+money;
		System.out.println("充值成功");
	}
	public void del(int money){
		this.money=this.money-money;
		System.out.println("消费成功");

	}
	public void xx(){
		
	}
}
