package jihe;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CshitiMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,CshitiListClass> smap = new HashMap<Integer,CshitiListClass>();
		CshitiListClass stu0 = new CshitiListClass(1,"zhangsan1",100);
		CshitiListClass stu1 = new CshitiListClass(2,"zhangsan2",100);
		CshitiListClass stu2 = new CshitiListClass(3,"zhangsan3",100);
		CshitiListClass stu3 = new CshitiListClass(4,"zhangsan4",100);
		CshitiListClass stu4 = new CshitiListClass(5,"zhangsan5",100);
		smap.put(1, stu0);
		smap.put(2, stu1);
		smap.put(3, stu2);
		smap.put(4, stu3);
		smap.put(5, stu4);
		for(Entry<Integer, CshitiListClass> s:smap.entrySet()){
			System.out.println(s.getValue().getStuno());
			System.out.println(s.getValue().getName());
			System.out.println(s.getValue().getScroe());
			System.out.println("---------------------------");
		}
		for(int no:smap.keySet()){
			System.out.println("------"+smap.get(no).getStuno());
			System.out.println("------"+smap.get(no).getName());
			System.out.println("------"+smap.get(no).getScroe());
			System.out.println("---------------------------");
			
		}
	}

}
