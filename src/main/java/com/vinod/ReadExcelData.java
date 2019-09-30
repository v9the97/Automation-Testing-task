package com.vinod;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class ReadExcelData {
	
	@Test
	public void  readCredentials() throws IOException{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\rahul\\Documents\\Book.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		XSSFRow row = sheet.getRow(0);
		String firstCell = row.getCell(0).getStringCellValue().toString();
		
		String firstCell1 = row.getCell(1).getStringCellValue().toString();

		System.out.println(firstCell+" "+firstCell1);
		
		
	}
	

}
