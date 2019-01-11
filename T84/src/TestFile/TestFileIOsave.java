package TestFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestFileIOsave {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream in = new FileInputStream("D:\\a.txt");
		byte[] b =new byte[1024];
		int a =in.read(b);
	}

}
