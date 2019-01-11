import java.util.Scanner;

public class T1sum100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=1;
		int sum=0;
		do {
			sum = sum + a;
			a++;
			System.out.println("第"+(a-1)+"次计算的和为"+sum);
		} while (sum<666);
		System.out.println("计算完成！1+2+3+...."+(a-1)+"等于："+sum);
		*/
		
		
		
		
	
	/*	double b=1;
		double sum=0;
		do {
			sum = sum + (1/b);
			b++;
			System.out.println("第"+(b-1)+"次计算的和为"+sum);
		} while (sum<=5);
		System.out.println("计算完成！1+1/2+1/3+...."+"1/"+(b-1)+"等于："+sum);
		*/
		
		
		
		
		
		/*int c=0;
		int d=1;
		for(int i=0;i<100;i++){
			c=d+c;
			d++;
		}
		System.out.println(c);
		
*/
		
		
		
		/*int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份！");
		year = sc.nextInt();
		if((year%4==0&&year%100!=0)||year%400==0){
			System.out.println("您输入的是闰年！");
		}else{
			System.out.println("您输入的不是闰年！");
		}
		//==============================================================================
		System.out.println("开始计算您输入的年份以及之前的所有年份是否是闰年。");
		for(;year>0;year--){
			if((year%4==0&&year%100!=0)||year%400==0){
				System.out.println(year+"是闰年！");
			}else{
				System.out.println(year+"不是闰年！");
			}
		}*/
		/*int c =100;
		for(;c>0;c--){
			if(c%3==2&&c%5==3&&c%7==2){
				System.out.println(c);
			}
		}
		*/
		int q=0,w=0,e=0;
		for (; q <= 900; e++){
		for (; w <= 90; w++){
		for (; e <= 9; q++) {
			if(((q*q*q)+(w*w*w)+(e*e*e))==(q+(w*10)+(e*100))){
				System.out.println(q+w+e);
				
			}	
			
		}
		
		}
		}
		
		
		
		
	}

}
