package FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writerchar {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
				//写字符文件
				//1，打通输出的通道
				//2.创建输出的缓冲区
				//3.准备需要写入文件的string 
				//4.打通输入的通道
			    //5. 创建输入的缓冲区
				//6. 从输入缓冲区读取数据
				//7. 写入文件
				//8. 关闭二个缓冲区，二个通道
		FileWriter fw=null;
		fw =new FileWriter("D:\\a.txt");
		BufferedWriter bw=null;
		bw= new BufferedWriter(fw);
		String str ="asdafasdfsadfsdfsdafsfs十分士大夫十分";
		BufferedReader br =null;
		



	}

}
