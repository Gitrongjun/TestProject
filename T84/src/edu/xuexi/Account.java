package edu.xuexi;

public class Account {
	 String name;
	 int money;
	public  Account() {
		// TODO Auto-generated method stub
		System.out.println("����һ���µ��û���");

	}
	public  Account(String name,int money){
		this();
		this.name=name;
		this.money=money;
	}
	//���ӽ��
	public void add(int money){
		this.money=this.money+money;
		System.out.println("��ֵ��������");
	}
	//���ѽ��
	public void rem(int money){
		this.money=this.money-money;
		System.out.println("���ѽ�������");
	}
	//��ʾ�û���Ϣ
	private String show(){
		return "�û���Ϊ"+this.name+"���Ϊ��"+this.money;
	}
	//��ʾ�û���Ϣ
	public void xx(){
		System.out.println(this.show());
	}
	

}
