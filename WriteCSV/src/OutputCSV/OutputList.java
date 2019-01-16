package OutputCSV;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class OutputList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeCSV(OutputList.List(), "D:\\fjptest5_20190115.csv");

	}
	public static ArrayList<DataList> List(){
	ArrayList<DataList> dataList = new ArrayList<DataList>();
	DataList dataList1 = new DataList();
	dataList1.setProducNo("1");
	dataList1.setAreaName("ss");
	dataList1.setCityName("ss");
	dataList1.setRebateType("coupon");
	dataList1.setRebateAmt("100");
	dataList1.setFirstRebateAt("20190109");
	dataList1.setTotalPeriodCount("5");
	dataList1.setActivityNo("8953");
	dataList1.setOutTradeType("RG001");
	dataList1.setMarchantNo("7557");
	dataList1.setInstitutionNo("5775");
	dataList1.setPromptCode("default");
	dataList1.setPackageAMt("100");
	dataList1.setProtocolBeginAt("20190113");
	dataList1.setProtocolEndAt("20190114");
	//-----------------------------------------------------
	DataList dataList2 = new DataList();
	dataList2.setProducNo("1");
	dataList2.setAreaName("ss");
	dataList2.setCityName("ss");
	dataList2.setRebateType("CASH");
	dataList2.setRebateAmt("50");
	dataList2.setFirstRebateAt("20190110");
	dataList2.setTotalPeriodCount("5");
	dataList2.setActivityNo("8953");
	dataList2.setOutTradeType("RG001");
	dataList2.setMarchantNo("7557");
	dataList2.setInstitutionNo("5775");
	dataList2.setPromptCode("default");
	dataList2.setPackageAMt("100");
	dataList2.setProtocolBeginAt("20190114");
	dataList2.setProtocolEndAt("20190114");
	//----------------------------------------------------
	DataList dataList3 = new DataList();
	dataList3.setProducNo("1");
	dataList3.setAreaName("ss");
	dataList3.setCityName("ss");
	dataList3.setRebateType("VOUVHER");
	dataList3.setRebateAmt("100");
	dataList3.setFirstRebateAt("20190110");
	dataList3.setTotalPeriodCount("5");
	dataList3.setActivityNo("8953");
	dataList3.setOutTradeType("RG001");
	dataList3.setMarchantNo("7557");
	dataList3.setInstitutionNo("5775");
	dataList3.setPromptCode("default");
	dataList3.setPackageAMt("100");
	dataList3.setProtocolBeginAt("20190114");
	dataList3.setProtocolEndAt("20190114");
	//----------------------------------------------------------
	DataList dataList4 = new DataList();
	dataList4.setProducNo("1");
	dataList4.setAreaName("ss");
	dataList4.setCityName("ss");
	dataList4.setRebateType("coupon");
	dataList4.setRebateAmt("100");
	dataList4.setFirstRebateAt("20190110");
	dataList4.setTotalPeriodCount("5");
	dataList4.setActivityNo("8953");
	dataList4.setOutTradeType("RG001");
	dataList4.setMarchantNo("7557");
	dataList4.setInstitutionNo("5775");
	dataList4.setPromptCode("default");
	dataList4.setPackageAMt("100");
	dataList4.setProtocolBeginAt("20190114");
	dataList4.setProtocolEndAt("20190114");
	//-------------------------------------------------------
	DataList dataList5 = new DataList();
	dataList5.setProducNo("1");
	dataList5.setAreaName("ss");
	dataList5.setCityName("ss");
	dataList5.setRebateType("coupon");
	dataList5.setRebateAmt("100");
	dataList5.setFirstRebateAt("20190110");
	dataList5.setTotalPeriodCount("5");
	dataList5.setActivityNo("8953");
	dataList5.setOutTradeType("RG001");
	dataList5.setMarchantNo("7557");
	dataList5.setInstitutionNo("5775");
	dataList5.setPromptCode("default");
	dataList5.setPackageAMt("100");
	dataList5.setProtocolBeginAt("20190114");
	dataList5.setProtocolEndAt("20190114");
	return dataList;

	}
	public static void writeCSV(ArrayList<DataList> dataList, String finalPath) {
		FileOutputStream out = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			File finalCSVFile = new File(finalPath);
			out = new FileOutputStream(finalCSVFile);
			osw = new OutputStreamWriter(out, "UTF-8");
			// 手动加上BOM标识
			osw.write(new String(new byte[] { (byte) 0xEF, (byte) 0xBB, (byte) 0xBF }));
			bw = new BufferedWriter(osw);
			/**
			 * 往CSV中写新数据
			 */
			String title = "";
			title = "ProducNo,AreaName,CityName,RebateType,RebateAmt,FirstRebateAt,TotalPeriodCount,ActivityNo,OutTradeType,MarchantNo,InstitutionNo,PromptCode,PackageAMt,ProtocolBeginAt,ProtocolEndAt";
			bw.append(title).append("\r\n");
 
			if (dataList != null && !dataList.isEmpty()) {
				for (DataList data : dataList) {
					bw.append(data.getProducNo() + ",");
					bw.append(data.getAreaName() + ",");
					bw.append(data.getCityName() + ",");
					bw.append(data.getRebateType()+ ",");
					bw.append(data.getRebateAmt()+ ",");
					bw.append(data.getFirstRebateAt()+ ",");
					bw.append(data.getTotalPeriodCount()+ ",");
					bw.append(data.getActivityNo()+ ",");
					bw.append(data.getOutTradeType()+ ",");
					bw.append(data.getMarchantNo()+ ",");
					bw.append(data.getInstitutionNo()+ ",");
					bw.append(data.getPromptCode()+ ",");
					bw.append(data.getPackageAMt()+ ",");
					bw.append(data.getProtocolBeginAt()+ ",");	
					bw.append(data.getProtocolEndAt());
					bw.append("\r");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
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
					e.printStackTrace();
				}
			}
 
		}
		System.out.println(finalPath + "数据导出成功");
	}
}
