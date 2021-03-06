package OutputCSV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class testOPL {

	public static List<String> importCsv(File file) {
		List<String> dataList = new ArrayList<String>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = "";
			while ((line = br.readLine()) != null) {
				dataList.add(line);
			}
		} catch (Exception e) {
		} finally {
			if (br != null) {
				try {
					br.close();
					br = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return dataList;
	}

	public static void exportCsv() {
		List<String> dataList = new ArrayList<String>();
		dataList.add("ProducNo,AreaName,CityName,RebateType,RebateAmt,FirstRebateAt,TotalPeriodCount,ActivityNo,OutTradeType,MarchantNo,InstitutionNo,PromptCode,PackageAMt,ProtocolBeginAt,ProtocolEndAt");
		for(int i =0;i<=6;i++){
		dataList.add("1,anhui,anqing,coupon,100,20190110,5,HD10655681,DF0002,1310104040130600,5775,default,100,20190114,20190116");
		dataList.add("1,anhui,anqing,coupon,100,20190110,5,HD10655681,DF0002,1310104040130600,5775,default,100,20190114,20190116");
		dataList.add("1,anhui,anqing,coupon,100,20190110,5,HD10655681,DF0002,1310104040130600,5775,default,100,20190114,20190116");
		dataList.add("1,anhui,anqing,coupon,100,20190110,5,HD10655681,DF0002,1310104040130600,5775,default,100,20190114,20190116");
		dataList.add("1,anhui,anqing,coupon,100,20190110,5,HD10655681,DF0002,1310104040130600,5775,default,100,20190114,20190116");
		}
		
		dataList.forEach(item -> item= item + "\n11111");
		System.out.println(dataList.get(0));
		
		
//		boolean isSuccess = testOPL.exportCsv(new File("D:/test/ljq.csv"), dataList);
//		System.out.println(isSuccess);
	}

	public static boolean exportCsv(File file, List<String> dataList) {
		boolean isSucess = false;

		FileOutputStream out = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			out = new FileOutputStream(file);
			osw = new OutputStreamWriter(out);
			bw = new BufferedWriter(osw);
			if (dataList != null && !dataList.isEmpty()) {
				for (String data : dataList) {
					bw.append(data).append("\r");
				}
			}
			isSucess = true;
		} catch (Exception e) {
			isSucess = false;
		} finally {
			if (bw != null) {
				try {
					bw.close();
					bw = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (osw != null) {
				try {
					osw.close();
					osw = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
					out = null;
				} catch (IOException e) {
				}
			}
		}
		return isSucess;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exportCsv();
	}

}
