package com.test.readXlsx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readXlsx {

	public static void main(String[] args) {
		File xlsxFile = new File("d://stu.xlsx");
		try {
			FileInputStream in = new FileInputStream(xlsxFile);
			try {
				XSSFWorkbook wb = new XSSFWorkbook(in);
				Sheet sheet = wb.getSheetAt(0);
				//求总行数
				int cell1 = sheet.getRow(0).getPhysicalNumberOfCells();
				int rowNum = sheet.getLastRowNum();
				//求某一行的数据
				Row row3 = sheet.getRow(3);
				short cellNum = row3.getLastCellNum();
				for(short i = 0;i<cellNum;i++){
					System.out.println(row3.getCell(i));
				}
				//遍历所有数据
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
