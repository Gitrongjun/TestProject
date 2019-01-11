package TestFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String st="德玛西亚万岁！！haha";
	//	File f = new File("D:\\a.txt");
		FileWriter f =new FileWriter("D:\\a.txt");
		f.write(st);
		f.close();
	}

}
