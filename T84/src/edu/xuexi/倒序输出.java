package edu.xuexi;

public class 倒序输出 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//已知一个三位数，分别输出该三位数的个位，十位，百位，并倒序输入
    int x =  123;
    int g=x%10 ;
    int s=x/10%10;
    //除以10时，原各位变小数丢失，再使用取余获得十位
    int b=x/100 ;
    //除以100直接使十位和个位变为小数，在int类型下丢失
    int dx=g*100+s*10+b;
    
    
    System.out.println("结果为"+g+s+b);
	}

}
