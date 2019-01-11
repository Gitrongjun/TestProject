package edu.xuexi;
public class Homework_3_27{
	private String name;
	private int money;
	public  Homework_3_27( ){}
public  Homework_3_27(String name){
	this.name=name;
	this.money=0;
	System.out.println("创建账号成功，名字为"+this.name+"，余额为"+this.money);
}
public void setname(String name){
	if(name.length()>10){
		System.out.println("请输入正确的名字！");
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
	System.out.println("充值成功，您现在的与余额为"+this.money+"元");

	}else{
		System.out.println("请输入正确的金额！");
	}
}
public int getmoney(){
	return this.money;
}
public void pay(int amount){
	this.money-=amount;
	System.out.println("您消费了"+amount+"元"+"余额为"+this.money+"元");
}	
public void view(){
	if(this.money>100){
	System.out.println("您的余额为"+this.money+"元");
	}else{
	System.out.println("您的余额已不足100元，请充值");
	System.out.println("您的余额为"+this.money+"元");
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
				
				System.out.println("您的余额不足以购买此商品，自动兑换积分购买");
				this.score-=score;
				System.out.println("使用了"+amount+"元和"+(tempscore-this.score)+"积分");
				
				
			}else{
				super.pay(amount);
			}
		}else{
			System.out.println("您的余额加积分不足以购买此商品");
		}*/
		if(amount<=super.getmoney()){
			super.pay(amount);
			this.score+=amount;
			System.out.println("您的积分增加了"+amount+"分");
		}else if(amount<=super.getmoney()||amount<=(super.getmoney()+(score/100))){
			System.out.println("您的余额不足以购买此商品，兑换积分后可以购买此商品，请先兑换积分");
		}else{
			System.out.println("您的余额加积分不足以购买此商品");
		}
		
	}
	public void conversion(int score){
		System.out.println("您使用"+score+"积分"+"兑换了"+(score/100)+"元");
		super.setmoney((score/100));
	}
	public void setscore(int scroe){
		if(score>=0){
			this.score=scroe;
		}else{
			System.out.println("请输入正确的积分");
		}
	}
	public int getscore(){
		return this.score;
	}
}


