package FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fileinput {
	public static void main(String[] args){
		
		FileReader re = null;
		try {
			//实例化地址
			re = new FileReader("D:\\a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//将地址中的东西实例化到缓冲区
		BufferedReader br =new BufferedReader(re);
		String str =null;
		
		try {
			//读取缓冲区
			while((str = br.readLine())!=null){
				System.out.println(str);
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			br.close();
			re.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
