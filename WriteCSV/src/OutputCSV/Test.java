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
		File file = new File("D:/test/agency_rebate_20190122_310000.csv");
		
		if (file.isFile() && file.exists()) {
			boolean delete = file.delete();
			if (!delete) {
				System.out.println("删除失败， 请关闭文件后再删除");
				return;
			}
		}
		
		String header = "productNO,AreaName,CityName,RebateType,RebateAmt,FirstRebateAt,TotalPeriodCount,ActivityNo,OutTradeType,MarchantNo,InstitutionNo,PromptCode,PackageAMt,ProtocolBeginAt,ProtocolEndAt";
		String data1 = "17321481501,上海,上海,COUPON,100,20190110,12,HD10147121,DF0001,01310104040130606,5775,default,100,20190114,20190616";
		String data2 = "17321481502,上海,上海,CASH,100,20190110,12,HD10655681,DF0002,01310104040130606,5775,default,100,20190114,20190616";
		String data3 = "17321481503,上海,上海,VOUCHER,100,20190110,12,HD10713754,DF0003,01310104040130606,5775,default,100,20190114,20190616";
		String data4 = "17321481504,上海,上海,VOUCHER,100,20190110,12,HD10269479,DF0005,01310104040130606,5775,default,100,20190114,20190616";
		String data5 = "13203054746,湖南,衡阳,VOUCHER,100,20190110,12,HD10856800,DF0006,01310104040130606,5775,default,100,20190114,20190616";

		try (FileWriter writer = new FileWriter(file); 
				BufferedWriter bw = new BufferedWriter(writer)) {
			bw.write(header);
			bw.newLine();
			for (int i = 1; i <= 200000; i++) {
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
		
		System.out.println("执行完毕");
		
	}

}
