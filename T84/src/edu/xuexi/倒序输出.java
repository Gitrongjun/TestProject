package edu.xuexi;

public class ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//��֪һ����λ�����ֱ��������λ���ĸ�λ��ʮλ����λ������������
    int x =  123;
    int g=x%10 ;
    int s=x/10%10;
    //����10ʱ��ԭ��λ��С����ʧ����ʹ��ȡ����ʮλ
    int b=x/100 ;
    //����100ֱ��ʹʮλ�͸�λ��ΪС������int�����¶�ʧ
    int dx=g*100+s*10+b;
    
    
    System.out.println("���Ϊ"+g+s+b);
	}

}
