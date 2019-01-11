package edu.xuexi;

public class 棋盘 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num =0.5 ;
		double s=0;
		
		for(int i=1;i<=32;i++){
			num*=2;
			s+=num;
			System.out.println("i的值"+i+"num的值"+num+"和"+s);
		}
	}

}
