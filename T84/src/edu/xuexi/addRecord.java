package edu.xuexi;

public class addRecord {
	int money;
	String name;
public  addRecord() {
		System.out.println("�����˻��ɹ���");
		
	}
public  addRecord(int money, String name){
	this();
	this.money=this.money+money;
	System.out.println("���ĺ�Ľ���ǣ�"+this.money);
	this.name= name;
	System.out.println("����Ϊ��"+this.name);
}
}
