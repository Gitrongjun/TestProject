package edu.zhengze;

public class zhengze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		String regex1 = "\\w+@\\w+(\\.\\w{2,3})";
		String a = "5190@qq.om";
		String b = "5190@163.com";
		String c = "519028651@qq.com";
		if(a.matches(regex)){
			System.out.println(a+"����ȷ������");
		}else{
			System.out.println(a+"������ȷ������");
		}
		if(b.matches(regex)){
			System.out.println(b+"����ȷ������");
		}else{
			System.out.println(b+"������ȷ������");
		}
		if(c.matches(regex1)){
			System.out.println(c+"����ȷ������");
		}else{
			System.out.println(c+"������ȷ������");
		}
	}

}
