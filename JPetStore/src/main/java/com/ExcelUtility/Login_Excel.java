package com.ExcelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Login_Excel {
	
	public static String[][] test_data;
	
	public  String[][] user_id() throws IOException {
		  
		test_data=new String[2][2];
		for(int i=0;i<2;i++)
		{
		  FileInputStream fil = new FileInputStream(new File("C:\\845124\\JPetStore\\src\\test\\resources\\Data\\data.xlsx"));
		  XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheet("Sheet1");
		  int count=sheet.getLastRowNum();
		  System.out.println(count);
		    
			  XSSFRow row =sheet.getRow(i);
			  XSSFCell cell=row.getCell(0);
			  test_data[i][0]=cell.getStringCellValue();
			  XSSFCell cell_1=row.getCell(1);
			  test_data[i][1]=cell_1.getStringCellValue();
		}
		
		return test_data;
}
}
