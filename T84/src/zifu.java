import java.util.Scanner;

public class zifu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char a;
		Scanner sc= new Scanner(System.in);
		System.out.println("������һ���ַ�:");
		a = sc.next().charAt(0);
		if(a>47&&a<58)
		{
			System.out.println("�������Ϊ��������ĸ��");
		}else if(a>64&&a<91){
			System.out.println("�������Ϊ��д��ĸ��");
		}else if(a>96&&a<123){
			System.out.println("�������ΪСд��ĸ��");
		}else{
			System.out.println("�������Ϊ������");
		}*/
		//==================================================================
		/*float b;
		Scanner sc= new Scanner(System.in);
		System.out.println("������ɼ�:");
		b = sc.nextFloat();
		if(b<60){
			System.out.println("��ĳɼ���"+(b+5));
		}else if(b>60){
			System.out.println("��ĳɼ���"+b);
		}else{
			System.out.println("��ĳɼ���"+b);
		}*/
		
		int c,d,tmp;
		Scanner sc= new Scanner(System.in);
		System.out.println("�������һ����");
		c = sc.nextInt();
		System.out.println("������ڶ�����");
		d = sc.nextInt();
		tmp = c;
		if(c>d){
			c=d;
			d=tmp;
			System.out.println("��һ���ȵڶ����󣬽������ֵΪ����һ����"+c+"�ڶ�����"+d);
		}else{
			System.out.println("��һ���ȵڶ���С��û�н�������һ����"+c+"�ڶ�����"+d);
		}
		
		
		
		

	}

}
