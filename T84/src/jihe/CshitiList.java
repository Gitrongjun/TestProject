package jihe;

import java.util.ArrayList;
import java.util.List;

public class CshitiList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<CshitiListClass> enty =new ArrayList<>();
		CshitiListClass stu0 = new CshitiListClass(1,"zhangsan1",100);
		CshitiListClass stu1 = new CshitiListClass(2,"zhangsan2",100);
		CshitiListClass stu2 = new CshitiListClass(3,"zhangsan3",100);
		CshitiListClass stu3 = new CshitiListClass(4,"zhangsan4",100);
		CshitiListClass stu4 = new CshitiListClass(5,"zhangsan5",100);
		enty.add(stu0);
		enty.add(stu1);
		enty.add(stu2);
		enty.add(stu3);
		enty.add(stu4);
		for(CshitiListClass a:enty){
			System.out.println(a.getStuno());
			System.out.println(a.getName());
			System.out.println(a.getScroe());
			System.out.println("--------------------------------");

		}
	}

}
