package edu.xuexi;

public class VIP extends Account {
	char level='a';
	//���ӽ��
	public void add(int money){
		this.money=this.money+money;
		System.out.println("��ֵ�ɹ�");
	}
	public void del(int money){
		this.money=this.money-money;
		System.out.println("���ѳɹ�");

	}
	public void xx(){
		
	}
}
