import java.util.Random;
import java.util.Scanner;

public class caidaxiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yy; //������������������û���������
		int xt=1; //����������������������
		int level=2;//��������������洢�����Χ����
		int a;
		System.out.println("�ҳ����ƣ�����ϷС����ֻ��������");
		for(int l=0;l<3;l++){
		System.out.println("ÿ����Ϸ�в����εĻ���");
		System.out.println("��ѡ��������Ϸ�Ѷ�");
		System.out.println("1��2��1���Ѷ�Ϊ0-9��2���Ѷ�Ϊ0-99");
		Scanner le = new Scanner(System.in);
		level = le.nextInt();
		if(level==2){
		System.out.println("����0-99����");
		a = new Random().nextInt(100) +1;
		xt=a;
		}else if(level==1){
		//��ʾ�û��齱����
		xt = (int) ((Math.random())*10);//���������
		System.out.println("����10����");
		}else{
		System.out.println("������ֵĬ��ʹ��0-99");
		}
		for(int i=0;i<3;i++){ //forѭ�������������û��������
		System.out.println("�������������֣�");//��ʾ�û���������
		Scanner sc = new Scanner(System.in);//�û����뷽��
			yy = sc.nextInt();//���û��������ݴ洢�������
		if(yy>100){
			System.out.println("�������������100��ϵͳ�Զ�����Ϊ5");
			yy=5;
		}
		if (yy>xt){//�ж��û������������������Ƿ��Ǻ�
			System.out.println("���µ����ִ���!");
		}
		if (yy<xt){
			System.out.println("���µ�����С��!");
		}
		if (yy==xt){
			System.out.println("�����ˣ���ȷ������Ϊ"+yy);
			break;//���û�������ȷ�Ĵ�ʱ����ѭ��
		}
		if (i==0){
			System.out.println("���ǲµ�һ��");
		}//�ж��û��������
		if (i==1){
			System.out.println("���ǲµڶ���");
		}
		if (i==2&&yy!=xt){
		System.out.println("���ξ�δ����");
		}
		System.out.println("���ǵ�"+(l+1)+"����Ϸ");
		}
		
		
		}
		System.out.println("�ҳ�����ÿ��ֻ�������Σ����Ѿ���������");
	}

}
