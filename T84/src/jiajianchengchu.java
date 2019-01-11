import java.util.Scanner;

public class jiajianchengchu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,jia,jian,cheng,chu,quyu;
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入第一个数");
		a =sc.nextDouble();
		System.out.println("请输入第二个数");
		b =sc.nextDouble();
		jia = a+b;
		jian =a-b;
		cheng =a*b;
		chu =a/b;
		quyu =a%b;
		System.out.println("和为："+jia);
		System.out.println("相减："+jian);
		System.out.println("相乘："+cheng);
		System.out.println("相除："+chu);
		System.out.println("取余："+quyu);
		
	}

}
