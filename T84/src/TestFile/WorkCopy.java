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
				//�����ļ��������������
				FileInputStream fis = null;
				BufferedInputStream bis=null;
				FileOutputStream fos=null;
				BufferedOutputStream bos=null;
				//���ٵ�ַ��������ʵ��
				fis =new FileInputStream(Inputfile);
				bis = new BufferedInputStream(fis);
				fos = new FileOutputStream(OutputFile);
				bos = new BufferedOutputStream(fos);
				//����һ���ֽ�������ܻ���������,����һ��int�����ַ�������
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
				System.out.println("�ļ����Ƴɹ���");
	}

}
