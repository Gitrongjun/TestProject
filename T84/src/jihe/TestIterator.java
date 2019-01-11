package jihe;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection schools =new HashSet();
		schools.add("csj");
		schools.add("ll");
		schools.add("tsl");
		schools.add("znc");
		Iterator iter = schools.iterator();
		while(iter.hasNext()){
			String school = (String)iter.next();
			if(school.compareTo("csj")==0){
				iter.remove();
			}
		}
		System.out.println(schools);
	
	String str[]=null;
	str = (String[])schools.toArray(new String[0]);
	for(String s:str){
		System.out.println(s);
	}
}
}
