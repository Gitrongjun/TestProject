import java.util.Scanner;

public class zifu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char a;
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入一个字符:");
		a = sc.next().charAt(0);
		if(a>47&&a<58)
		{
			System.out.println("您输入的为阿拉伯字母。");
		}else if(a>64&&a<91){
			System.out.println("您输入的为大写字母。");
		}else if(a>96&&a<123){
			System.out.println("您输入的为小写字母。");
		}else{
			System.out.println("您输入的为标点符号");
		}*/
		//==================================================================
		/*float b;
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入成绩:");
		b = sc.nextFloat();
		if(b<60){
			System.out.println("你的成绩是"+(b+5));
		}else if(b>60){
			System.out.println("你的成绩是"+b);
		}else{
			System.out.println("你的成绩是"+b);
		}*/
		
		int c,d,tmp;
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入第一个数");
		c = sc.nextInt();
		System.out.println("请输入第二个数");
		d = sc.nextInt();
		tmp = c;
		if(c>d){
			c=d;
			d=tmp;
			System.out.println("第一个比第二个大，交换后的值为，第一个："+c+"第二个："+d);
		}else{
			System.out.println("第一个比第二个小，没有交换，第一个："+c+"第二个："+d);
		}
		
		
		
		

	}

}
