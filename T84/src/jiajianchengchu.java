import java.util.Scanner;

public class jiajianchengchu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,jia,jian,cheng,chu,quyu;
		Scanner sc =new Scanner(System.in);
		System.out.println("�������һ����");
		a =sc.nextDouble();
		System.out.println("������ڶ�����");
		b =sc.nextDouble();
		jia = a+b;
		jian =a-b;
		cheng =a*b;
		chu =a/b;
		quyu =a%b;
		System.out.println("��Ϊ��"+jia);
		System.out.println("�����"+jian);
		System.out.println("��ˣ�"+cheng);
		System.out.println("�����"+chu);
		System.out.println("ȡ�ࣺ"+quyu);
		
	}

}
