package TestFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestFileInputStream {
public static void main(String[] args) throws Exception{
	InputStream in =new FileInputStream("D:\\a.xlsx");
	byte a[] =new byte[1024];
	int b = in.read(a);
	System.out.println(new String(a));
}
}
