package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.qa.Base.Base_Class;

public class ReadExcelFile extends Base_Class
{
	String ExcelFilePath="C:\\Users\\ravis5\\Desktop\\ReadExcel.xlsx";
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static DataFormatter formatter=new DataFormatter();
	
	
	public static Object[][] getTestData(String sheetName, String ExcelFilePath)
	{
		try {
			FileInputStream fis=new FileInputStream(ExcelFilePath);
			workbook=new XSSFWorkbook(fis);
			sheet =workbook.getSheet(sheetName);
			} catch (Exception e) {
			e.printStackTrace();
	}
		
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int k=0;k<sheet.getRow(i).getLastCellNum();k++)
			{
				data[i][k] =formatter.formatCellValue(sheet.getRow(i+1).getCell(k));	
			}
		}
		return data;
		}
	
	

}
