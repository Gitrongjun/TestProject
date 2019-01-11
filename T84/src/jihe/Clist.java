package jihe;

import java.util.ArrayList;
import java.util.List;

public class Clist {
public static void main(String[] args){
		//1. 新建一个List 学生list
			//2.向List1中增加数据
			//3. size() ；列表长度
			//4.打印列表 
			//4.1方式1：使用下标    list1.get(i)读取
			//4.2 使用for遍历
			//5.set修改数据
			//6.移除，二种方式
			//7.检查是否包含，如果包含，返回true
			//8. 复制到一个新的数组中
			//9. 清除数据
		List<String> students =new ArrayList<String>();//查格式
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
		students.set(0, "聂理诗");
		System.out.println(students.toString());
		students.remove("聂理诗");
		students.remove(1);
		System.out.println(students.toString());
		boolean a  = students.contains("聂理诗");
		System.out.println(a);
		String b[] = students.toArray(new String[0]);//查格式                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
		for(String c:b){
			System.out.println(c);
		}
		students.clear();
		System.out.println(students.toString());



		
		
		
}

}
