import java.util.Scanner;

public class Tswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("�밴��");
		a = sc.nextInt();
		switch (a) {
		case 0:
			System.out.println("�ñ���ʫ��");
			break;
		case 1:
			System.out.println("�ó�������");
			break;

		default:
			System.out.println("����ͣ��");
			break;
		}
		
		
		
	}

}
