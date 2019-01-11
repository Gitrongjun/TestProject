package edu.xuexi;

public class person1 {
 private String username;
 private String password;
 private int age;
 private int phone;
 public person1(){
	 
 }
 public person1(String a,String b,int c,int d){
	 this.username=a;
	 this.password=b;
	 this.age=c;
	 this.phone=d;
 }
 public void reg(){
	 System.out.println("用户名："+username+"密码"+password+"年龄"+age+"手机号："+phone);    
 }
public void SetUsername(String username){
	this.username=username;
}
public String GetUsername(){
	return this.username;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	if(username.length()>=11){
		System.out.println("名字过长");
	}else{	
		this.username = username;
	}
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	if(password.length()>=11){
		System.out.println("密码过长");
	}else{	
		this.password = password;
	}
	
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age>=150){
		System.out.println("年龄错误");
	}else if(age>=0&&age<=149){	
		this.age = age;
	}else{
		System.out.println("年龄输入错误");
	}
	
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {

	this.phone = phone;
}

}
