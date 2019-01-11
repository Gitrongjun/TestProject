package edu.xuexi;

public class person {
	private String name;
	private int age;
	public void setName(String name){
		if(name.length()<5&&name.equals("")==false){
			this.name=name;
		}else{
			System.out.println("非法的姓名");
		}
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<150&&age>0){
			this.age = age;
		}else{
			System.out.println("非法年龄");
		}
		
	}
	public String getName(){
		return this.name;
	}
	public person(int a,String n){
		name=n;
		age=a;
	}
	public void show(){
		System.out.println("注册成功，你的名字是:"+name+"年龄是:"+age);
	}
}
