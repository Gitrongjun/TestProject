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
		System.out.println("������޲ι��췽��");

	}
	public void fun1(){
		System.out.println("�����fun1����");
	}
    public void fun2(){
		System.out.println("�����fun2����");
	}
	public void fun3(){
		System.out.println("�����fun3����");
	}
	
}
class s extends f{
	public s(){
		System.out.println("������޲ι��췽��");

	}
	public void fun1(){
		System.out.println("�����fun1����");
	}
	public void fun2(){
		System.out.println("�����fun2����");
	}
}
