import java.util.Scanner;

public class Classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ͨ���ֹ�����ķ�ʽ�����������ַ����Ƚ������ַ��Ƿ���ȣ��ѽ��������ٴαȽ������ַ����������Ǹ�����Ŀ���㣩��*/
      char a,b;
      String str;
      Scanner sc= new Scanner(System.in);
      System.out.println("������������ĸ");
      str = sc.nextLine();
      a =str.charAt(0);
      b =str.charAt(1);
      boolean c =a==b;
      System.out.println(c);
      char d = a>b?a:b;
      System.out.println("������ĸ��������"+d);
      
      
      
      
     /* �ô���ʵ�֣�  result += 5 ;�����������㣬���Ƿ��ܹ�ʹ�á�*/ 
      double e,f,g,h,j;
      System.out.println("����������֤�ɷ����+=");
      e = sc.nextDouble();
      e += 5.23;
      System.out.println("��֤�ɷ����+="+e);
      
      System.out.println("����������֤�ɷ����-=");
      f = sc.nextDouble();
      f -= 5.23;
      System.out.println("��֤�ɷ����-="+f);
      
      System.out.println("����������֤�ɷ����*=");
      g = sc.nextDouble();
      g *= 5.23;
      System.out.println("��֤�ɷ����*="+g);
      
      System.out.println("����������֤�ɷ����/=");
      h = sc.nextDouble();
      h /= 5.23;
      System.out.println("��֤�ɷ����/="+h);
      
      System.out.println("����������֤�ɷ����%=");
      j = sc.nextDouble();
      j %= 5.23;
      System.out.println("��֤�ɷ����%="+j);
      System.out.println("�������");
      
      
	}

}
