package jihe;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CIterator {
	public static void main(String[] args){
		//1. 创建一个集合
	    //2. 往集合里面添加数据
		//3. 把集合转成迭代器对象
		//4. 通过循环取出所有的数据, 通过结束判定控制循环
		//5. 每次取下一笔
		//6. 使用contains判定是否存在
		//7. 如果存在就删除
		//8. 把集合转成数组，使用for的第二中用法遍历
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
