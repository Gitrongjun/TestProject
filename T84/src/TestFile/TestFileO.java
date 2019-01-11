package TestFile;
import java.io.File;
import java.io.IOException;
public class TestFileO {
public static void main(String[] args){
	File a =new File("D:\\a.rmvb");
	File r =new File("D:\\");
	if(a.exists()==false){
		try {
			a.createNewFile();
			System.out.println("文件创建成功");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}else{
		a.delete();
		System.out.println("文件删除成功");
	}
	String c[]=r.list();
	System.out.println("开始打印此目录下所有文件和文件夹名");
	for(String m:c){
		System.out.println(m);
	}
	
}
}
