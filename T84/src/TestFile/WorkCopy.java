package TestFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WorkCopy {

	public static void main(String[] args) throws Exception {
		
		
				
	}
	public static void FileCopy(String Inputfile,String OutputFile) throws Exception{
				// TODO Auto-generated method stub
				//声明文件输入输入对象名
				FileInputStream fis = null;
				BufferedInputStream bis=null;
				FileOutputStream fos=null;
				BufferedOutputStream bos=null;
				//开辟地址，并给出实参
				fis =new FileInputStream(Inputfile);
				bis = new BufferedInputStream(fis);
				fos = new FileOutputStream(OutputFile);
				bos = new BufferedOutputStream(fos);
				//定义一个字节数组接受缓冲区内容,定义一个int接受字符串长度
				byte b[] =new byte[1024];
				int len =0;
				while((len=bis.read(b))!=-1){
					fos.write(b, 0, len);
					fos.flush();
				}
				bos.close();
				fos.close();
				bis.close();
				fis.close();
				System.out.println("文件复制成功！");
	}

}
