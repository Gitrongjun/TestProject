package TestFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestFileI {
public static void main(String[] args) throws Exception{
	Reader r =new FileReader("D:\\a.xlsx");
	char s[] = new char[1024];
	int num=0;
	/*for(char b:s){
		System.out.print(b);
	}*/
	while((num=r.read(s))!=-1){
	System.out.println(new String(s,0,num));
	}
	
/*	int len = r.read() ;*/
}
}
