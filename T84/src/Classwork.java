import java.util.Scanner;

public class Classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 通用手工输入的方式，输入两个字符。比较两个字符是否相等，把结果输出。再次比较两个字符，输出大的那个（三目运算）。*/
      char a,b;
      String str;
      Scanner sc= new Scanner(System.in);
      System.out.println("请输入两个字母");
      str = sc.nextLine();
      a =str.charAt(0);
      b =str.charAt(1);
      boolean c =a==b;
      System.out.println(c);
      char d = a>b?a:b;
      System.out.println("两个字母中最大的是"+d);
      
      
      
      
     /* 用代码实现：  result += 5 ;并做五则运算，看是否都能够使用。*/ 
      double e,f,g,h,j;
      System.out.println("输入数字验证可否输出+=");
      e = sc.nextDouble();
      e += 5.23;
      System.out.println("验证可否输出+="+e);
      
      System.out.println("输入数字验证可否输出-=");
      f = sc.nextDouble();
      f -= 5.23;
      System.out.println("验证可否输出-="+f);
      
      System.out.println("输入数字验证可否输出*=");
      g = sc.nextDouble();
      g *= 5.23;
      System.out.println("验证可否输出*="+g);
      
      System.out.println("输入数字验证可否输出/=");
      h = sc.nextDouble();
      h /= 5.23;
      System.out.println("验证可否输出/="+h);
      
      System.out.println("输入数字验证可否输出%=");
      j = sc.nextDouble();
      j %= 5.23;
      System.out.println("验证可否输出%="+j);
      System.out.println("程序结束");
      
      
	}

}
