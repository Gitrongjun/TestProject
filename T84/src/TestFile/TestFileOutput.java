package TestFile;
import java.io.FileOutputStream;

public class TestFileOutput {

	public static void main(String[] args) throws Exception {
		String str = "Åµ¿ËÈøË¹ÍòËêaaab";
		byte b[] = str.getBytes();
		//byte b[]={a,a};
		FileOutputStream o =new FileOutputStream("D:\\a.txt");
		o.write(b);
		o.close();
     	}

}
