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
			System.out.println("�ļ������ɹ�");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}else{
		a.delete();
		System.out.println("�ļ�ɾ���ɹ�");
	}
	String c[]=r.list();
	System.out.println("��ʼ��ӡ��Ŀ¼�������ļ����ļ�����");
	for(String m:c){
		System.out.println(m);
	}
	
}
}
