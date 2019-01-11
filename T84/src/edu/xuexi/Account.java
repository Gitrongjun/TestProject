package edu.xuexi;

public class Account {
	 String name;
	 int money;
	public  Account() {
		// TODO Auto-generated method stub
		System.out.println("创建一个新的用户！");

	}
	public  Account(String name,int money){
		this();
		this.name=name;
		this.money=money;
	}
	//增加金额
	public void add(int money){
		this.money=this.money+money;
		System.out.println("充值金额审核中");
	}
	//消费金额
	public void rem(int money){
		this.money=this.money-money;
		System.out.println("消费金额审核中");
	}
	//显示用户信息
	private String show(){
		return "用户名为"+this.name+"余额为："+this.money;
	}
	//显示用户信息
	public void xx(){
		System.out.println(this.show());
	}
	

}
