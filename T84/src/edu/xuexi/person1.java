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
	 System.out.println("�û�����"+username+"����"+password+"����"+age+"�ֻ��ţ�"+phone);    
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
		System.out.println("���ֹ���");
	}else{	
		this.username = username;
	}
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	if(password.length()>=11){
		System.out.println("�������");
	}else{	
		this.password = password;
	}
	
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age>=150){
		System.out.println("�������");
	}else if(age>=0&&age<=149){	
		this.age = age;
	}else{
		System.out.println("�����������");
	}
	
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {

	this.phone = phone;
}

}
