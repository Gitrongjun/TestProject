import java.util.Random;

public class dianming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String class1[]={"��˼��","����Ǭ","Ф��","ʩ����","�����","��ϼ��","��ΰ","�����","����","Ϳ˳�","����","������","��ɭ��","���ٿ�","����ʫ"};
		int class2[]=  new int[class1.length];
		for(int j=0;j<10;j++){
		int i;
		i =new Random().nextInt(14);
		System.out.println(i+"      "+class1[i]);
		class1[i]=class1[i]+1;
			System.out.println(class1[i]+class2[i]+"��");
		
		
		
		}//ͳ�Ʊ���������
		
	}

}
