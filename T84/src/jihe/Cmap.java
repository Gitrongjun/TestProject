package jihe;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Cmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map的练习
		//1.定义一个学生的Map
		//2.往map中增加数据
		//3.查看map的长度 size()
		//4.查看单个条目：get(键值)
		//5.打印全部数据  循环遍历
        //5.1 通过Key来循环
		//5.2 通过 元素来循环
		//6. 检查会否包含键或键值
		//7.移除一组键和值
		//8.清除Map的所有数据
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
