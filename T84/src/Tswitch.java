import java.util.Scanner;

public class Tswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("请按键");
		a = sc.nextInt();
		switch (a) {
		case 0:
			System.out.println("该背唐诗了");
			break;
		case 1:
			System.out.println("该唱儿歌了");
			break;

		default:
			System.out.println("可以停了");
			break;
		}
		
		
		
	}

}
