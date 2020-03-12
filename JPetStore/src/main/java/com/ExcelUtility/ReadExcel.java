package com.ExcelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	//To read and return username
		public  String user_id(int a) throws IOException {
			  
			  FileInputStream fil = new FileInputStream(new File(""));
			  XSSFWorkbook workbook = new XSSFWorkbook(fil);
			  XSSFSheet sheet=workbook.getSheet("Sheet1");
			  int count=sheet.getLastRowNum();
			  System.out.println(count);
			    
				  XSSFRow row =sheet.getRow(a);
				  XSSFCell cell=row.getCell(0);
				  String un=cell.getStringCellValue();
				  
	            
			return un;
	}
		
		//To read and return password
		public  String password(int a) throws IOException {
			  
			  FileInputStream fil = new FileInputStream(new File("C:\\Users\\BLTuser.BLT147\\Desktop\\Demo\\TestFramework\\src\\test\\resources\\Testdata\\testdata.xlsx"));
			  XSSFWorkbook workbook = new XSSFWorkbook(fil);
			  XSSFSheet sheet=workbook.getSheet("Sheet1");
			  int count=sheet.getLastRowNum();
			  System.out.println(count);
			    
				  XSSFRow row =sheet.getRow(a);
				  XSSFCell cell=row.getCell(1);
				  String pass=cell.getStringCellValue();
				  
	            
			return pass;
	}
		
		//To read and return lastname
		public  String lastname(int a) throws IOException {
			  
			  FileInputStream fil = new FileInputStream(new File("C:\\Users\\BLTuser.BLT147\\Desktop\\Demo\\TestFramework\\src\\test\\resources\\Testdata\\testdata.xlsx"));
			  XSSFWorkbook workbook = new XSSFWorkbook(fil);
			  XSSFSheet sheet=workbook.getSheet("Sheet1");
			  int count=sheet.getLastRowNum();
			  System.out.println(count);
			    
				  XSSFRow row =sheet.getRow(a);
				  XSSFCell cell=row.getCell(2);
				  String lastn=cell.getStringCellValue();
				  
	            
			return lastn;
	}
		
		//To read and return email
		public  String email(int a) throws IOException {
			  
			  FileInputStream fil = new FileInputStream(new File("C:\\Users\\BLTuser.BLT147\\Desktop\\Demo\\TestFramework\\src\\test\\resources\\Testdata\\testdata.xlsx"));
			  XSSFWorkbook workbook = new XSSFWorkbook(fil);
			  XSSFSheet sheet=workbook.getSheet("Sheet1");
			  int count=sheet.getLastRowNum();
			  System.out.println(count);
			    
				  XSSFRow row =sheet.getRow(a);
				  XSSFCell cell=row.getCell(3);
				  String e=cell.getStringCellValue();
				  
	            
			return e;
	}
	
	
}
