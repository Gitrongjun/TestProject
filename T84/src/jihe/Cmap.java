package jihe;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Cmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map����ϰ
		//1.����һ��ѧ����Map
		//2.��map����������
		//3.�鿴map�ĳ��� size()
		//4.�鿴������Ŀ��get(��ֵ)
		//5.��ӡȫ������  ѭ������
        //5.1 ͨ��Key��ѭ��
		//5.2 ͨ�� Ԫ����ѭ��
		//6. �������������ֵ
		//7.�Ƴ�һ�����ֵ
		//8.���Map����������
		Map<Integer,String> smap = new HashMap<Integer,String>();
		smap.put(1, "zhangsan");
		smap.put(2, "zhangsan1");
		smap.put(3, "zhangsan2");
		smap.put(4, "zhangsan3");
		smap.put(5, "zhangsan4");
		System.out.println(smap.toString());
		int len =smap.size();
		System.out.println(len);
		String get1 = smap.get(1);
		System.out.println(get1);
		for(Integer s:smap.keySet()){
			System.out.println(smap.get(s));
		}
		for(Entry<Integer, String> s:smap.entrySet()){
			System.out.println(s);
		}
		boolean s = smap.containsValue("zhangsan");
		System.out.println(s);
		smap.remove(0);
		System.out.println(smap.toString());
		smap.put(1, "zhangsan");
		smap.clear();
		System.out.println(smap.toString());
	}

}
