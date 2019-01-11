package edu.xuexi;

public class testduotai {
public static void main(String[] args){
	f f=new f();
	f.fun1();
	f.fun2();
	s s=new s();
	s.fun1();
	s.fun2();
	f s1=new s();
	s1.fun1();
	s1.fun2();
	s1.fun3();
	
}
}
class f{
	public f(){
		System.out.println("父类的无参构造方法");

	}
	public void fun1(){
		System.out.println("父类的fun1方法");
	}
    public void fun2(){
		System.out.println("父类的fun2方法");
	}
	public void fun3(){
		System.out.println("父类的fun3方法");
	}
	
}
class s extends f{
	public s(){
		System.out.println("子类的无参构造方法");

	}
	public void fun1(){
		System.out.println("子类的fun1方法");
	}
	public void fun2(){
		System.out.println("子类的fun2方法");
	}
}
