package jihe;

import java.util.ArrayList;
import java.util.List;

public class Clist {
public static void main(String[] args){
		//1. �½�һ��List ѧ��list
			//2.��List1����������
			//3. size() ���б���
			//4.��ӡ�б� 
			//4.1��ʽ1��ʹ���±�    list1.get(i)��ȡ
			//4.2 ʹ��for����
			//5.set�޸�����
			//6.�Ƴ������ַ�ʽ
			//7.����Ƿ�������������������true
			//8. ���Ƶ�һ���µ�������
			//9. �������
		List<String> students =new ArrayList<String>();//���ʽ
		students.add("qwe");
		students.add("asd");
		students.add("zxc");
		students.add("wer");
		int size = students.size();
		System.out.println(size);
		for(int i=0;i<size;i++){
			String arr=students.get(i);
			System.out.println(arr);
		}
		students.set(0, "����ʫ");
		System.out.println(students.toString());
		students.remove("����ʫ");
		students.remove(1);
		System.out.println(students.toString());
		boolean a  = students.contains("����ʫ");
		System.out.println(a);
		String b[] = students.toArray(new String[0]);//���ʽ                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
		for(String c:b){
			System.out.println(c);
		}
		students.clear();
		System.out.println(students.toString());



		
		
		
}

}
