package edu.xuexi;

public class 分数求和 {
	public static void main(String[] args){
	   double sum=0;
	   for(int i=1;i<100;i++){
		   if(sum>=5){
			   System.out.println("结果超过5，现在i是"+i+"，和为"+sum);
			   break;
		   }else{
			   System.out.println("结果低于5，现在i是"+i+"，和为"+sum);
		   }
		   sum+=1/(double)i;
	   }
   }
}
