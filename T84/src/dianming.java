import java.util.Random;

public class dianming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String class1[]={"江思聪","郭成乾","肖俊","施静燕","周念楚","邓霞漫","蒋伟","徐佳磊","蒋勇","涂顺岚","李龙","刘亦萌","曹森剑","蒋荣俊","聂理诗"};
		int class2[]=  new int[class1.length];
		for(int j=0;j<10;j++){
		int i;
		i =new Random().nextInt(14);
		System.out.println(i+"      "+class1[i]);
		class1[i]=class1[i]+1;
			System.out.println(class1[i]+class2[i]+"次");
		
		
		
		}//统计被点名次数
		
	}

}
