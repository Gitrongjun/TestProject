package edu.xuexi;

public class ������� {
	public static void main(String[] args){
	   double sum=0;
	   for(int i=1;i<100;i++){
		   if(sum>=5){
			   System.out.println("�������5������i��"+i+"����Ϊ"+sum);
			   break;
		   }else{
			   System.out.println("�������5������i��"+i+"����Ϊ"+sum);
		   }
		   sum+=1/(double)i;
	   }
   }
}
