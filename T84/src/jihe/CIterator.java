package jihe;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CIterator {
	public static void main(String[] args){
		//1. ����һ������
	    //2. �����������������
		//3. �Ѽ���ת�ɵ���������
		//4. ͨ��ѭ��ȡ�����е�����, ͨ�������ж�����ѭ��
		//5. ÿ��ȡ��һ��
		//6. ʹ��contains�ж��Ƿ����
		//7. ������ھ�ɾ��
		//8. �Ѽ���ת�����飬ʹ��for�ĵڶ����÷�����
		 Collection schools =new HashSet();
		 schools.add("csj");
		 schools.add("nls");
		 schools.add("tsl");
		 schools.add("znc");
		 schools.add("jxj");
		 Iterator ite = schools.iterator();
		 while(ite.hasNext()){
			 String school =(String) ite.next();
			 System.out.println(ite.next());
			 if(school.contains("csj")){
				 ite.remove();
			 }
			 
		 }
		 String str[]=null;
			str = (String[])schools.toArray(new String[0]);
			for(String s:str){
				System.out.println(s);
			}
		 
	}
}
