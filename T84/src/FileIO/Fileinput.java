package FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fileinput {
	public static void main(String[] args){
		
		FileReader re = null;
		try {
			//ʵ������ַ
			re = new FileReader("D:\\a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//����ַ�еĶ���ʵ������������
		BufferedReader br =new BufferedReader(re);
		String str =null;
		
		try {
			//��ȡ������
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
