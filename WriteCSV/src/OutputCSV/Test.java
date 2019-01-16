package OutputCSV;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws Exception {
		File file = new File("D:/test/ljq.csv");
		
		if (file.isFile() && file.exists()) {
			boolean delete = file.delete();
			if (!delete) {
				System.out.println("ɾ��ʧ�ܣ� ��ر��ļ�����ɾ��");
				return;
			}
		}
		
		String header = "�ֻ�1,AreaName,CityName,RebateType,RebateAmt,FirstRebateAt,TotalPeriodCount,ActivityNo,OutTradeType,MarchantNo,InstitutionNo,PromptCode,PackageAMt,ProtocolBeginAt,ProtocolEndAt";
		String data1 = "1,����,����,coupon,100,20190110,5,HD10655681,DF0002,1310104040130600,5775,default,100,20190114,20190116";
		String data2 = "1,����,����,coupon,100,20190110,5,HD10655681,DF0002,1310104040130600,5775,default,100,20190114,20190116";
		String data3 = "1,����,����,coupon,100,20190110,5,HD10655681,DF0002,1310104040130600,5775,default,100,20190114,20190116";
		String data4 = "1,����,����,coupon,100,20190110,5,HD10655681,DF0002,1310104040130600,5775,default,100,20190114,20190116";
		String data5 = "1,����,����,coupon,100,20190110,5,HD10655681,DF0002,1310104040130600,5775,default,100,20190114,20190116";

		try (FileWriter writer = new FileWriter(file); 
				BufferedWriter bw = new BufferedWriter(writer)) {
			bw.write(header);
			bw.newLine();
			for (int i = 1; i <= 100; i++) {
				if (i % 100 == 0) {
					System.out.println(i);
				}
				bw.write(data1);
				bw.newLine();
				bw.write(data2);
				bw.newLine();
				bw.write(data3);
				bw.newLine();
				bw.write(data4);
				bw.newLine();
				bw.write(data5);
				bw.newLine();
				bw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("ִ�����");
		
	}

}