package edu.xuexi;
public class Homework_3_27{
	private String name;
	private int money;
	public  Homework_3_27( ){}
public  Homework_3_27(String name){
	this.name=name;
	this.money=0;
	System.out.println("�����˺ųɹ�������Ϊ"+this.name+"�����Ϊ"+this.money);
}
public void setname(String name){
	if(name.length()>10){
		System.out.println("��������ȷ�����֣�");
	}else{
		this.name=name;
	}
}
public String getname(){
	return this.name;
}
public void setmoney(int money){
	if(money>=0){
	this.money+=money;
	System.out.println("��ֵ�ɹ��������ڵ������Ϊ"+this.money+"Ԫ");

	}else{
		System.out.println("��������ȷ�Ľ�");
	}
}
public int getmoney(){
	return this.money;
}
public void pay(int amount){
	this.money-=amount;
	System.out.println("��������"+amount+"Ԫ"+"���Ϊ"+this.money+"Ԫ");
}	
public void view(){
	if(this.money>100){
	System.out.println("�������Ϊ"+this.money+"Ԫ");
	}else{
	System.out.println("��������Ѳ���100Ԫ�����ֵ");
	System.out.println("�������Ϊ"+this.money+"Ԫ");
	}
}
}
class VIP1 extends Homework_3_27{
	private int score;
	public VIP1(){
		score=0;
	}	
	public VIP1(String name,int money,int score) {
		super.setname(name);
		super.setmoney(money);
		this.setscore(score);
	}
	public VIP1(String name,int money) {
		super.setname(name);
		super.setmoney(money);
		this.setscore(0);
	}
	public VIP1(String name) {
		super(name);
		this.setscore(0);
	}
	public void pay(int amount){
		/*if(amount<=super.getmoney()||amount<=(super.getmoney()+(score/100))){
			
			if(amount>super.getmoney()){
				int tempscore;
				int tempmoney;
				tempscore=this.score;
				tempmoney=super.getmoney();
				super.pay((super.getmoney()+(score/100)));
				
				System.out.println("���������Թ������Ʒ���Զ��һ����ֹ���");
				this.score-=score;
				System.out.println("ʹ����"+amount+"Ԫ��"+(tempscore-this.score)+"����");
				
				
			}else{
				super.pay(amount);
			}
		}else{
			System.out.println("�������ӻ��ֲ����Թ������Ʒ");
		}*/
		if(amount<=super.getmoney()){
			super.pay(amount);
			this.score+=amount;
			System.out.println("���Ļ���������"+amount+"��");
		}else if(amount<=super.getmoney()||amount<=(super.getmoney()+(score/100))){
			System.out.println("���������Թ������Ʒ���һ����ֺ���Թ������Ʒ�����ȶһ�����");
		}else{
			System.out.println("�������ӻ��ֲ����Թ������Ʒ");
		}
		
	}
	public void conversion(int score){
		System.out.println("��ʹ��"+score+"����"+"�һ���"+(score/100)+"Ԫ");
		super.setmoney((score/100));
	}
	public void setscore(int scroe){
		if(score>=0){
			this.score=scroe;
		}else{
			System.out.println("��������ȷ�Ļ���");
		}
	}
	public int getscore(){
		return this.score;
	}
}


