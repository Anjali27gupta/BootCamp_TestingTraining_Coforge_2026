package com.coforge.DataReaderApachePOI;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReaderApachePOI {
	public static void main(String[] args) throws Exception {
		File src = new File("./TestData/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data form Excel is ..." + data0);
		
		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data form Excel is ..." + data1);
		
		int rowcount = sheet1.getLastRowNum();
		System.out.println("Total Rows in Excel Sheet"+rowcount);
		
		for (int i =0 ; i<= rowcount;i++) {
			String data= sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data form Row ........"+i +" is "+data);
		}

		
		wb.close();
	}
}
