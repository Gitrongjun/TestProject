import java.util.Random;
import java.util.Scanner;

public class caidaxiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yy; //定义变量，用来储存用户输入数据
		int xt=1; //定义变量，用来储存随机数
		int level=2;//定义变量，用来存储随机范围变量
		int a;
		System.out.println("家长控制，此游戏小孩子只能玩三次");
		for(int l=0;l<3;l++){
		System.out.println("每次游戏有猜三次的机会");
		System.out.println("请选择您的游戏难度");
		System.out.println("1或2，1的难度为0-9，2的难度为0-99");
		Scanner le = new Scanner(System.in);
		level = le.nextInt();
		if(level==2){
		System.out.println("答案在0-99以内");
		a = new Random().nextInt(100) +1;
		xt=a;
		}else if(level==1){
		//提示用户抽奖次数
		xt = (int) ((Math.random())*10);//产生随机数
		System.out.println("答案在10以内");
		}else{
		System.out.println("其他数值默认使用0-99");
		}
		for(int i=0;i<3;i++){ //for循环，用来控制用户输入次数
		System.out.println("请输入您的数字：");//提示用户输入数据
		Scanner sc = new Scanner(System.in);//用户输入方法
			yy = sc.nextInt();//将用户输入数据存储进入变量
		if(yy>100){
			System.out.println("您输入的数大于100，系统自动调节为5");
			yy=5;
		}
		if (yy>xt){//判断用户输入的数据与随机数是否吻合
			System.out.println("您猜的数字大了!");
		}
		if (yy<xt){
			System.out.println("您猜的数字小了!");
		}
		if (yy==xt){
			System.out.println("猜中了！正确的数字为"+yy);
			break;//当用户输入正确的答案时跳出循环
		}
		if (i==0){
			System.out.println("这是猜第一次");
		}//判断用户输入次数
		if (i==1){
			System.out.println("这是猜第二次");
		}
		if (i==2&&yy!=xt){
		System.out.println("三次均未猜中");
		}
		System.out.println("这是第"+(l+1)+"次游戏");
		}
		
		
		}
		System.out.println("家长控制每天只能玩三次，你已经玩了三次");
	}

}
