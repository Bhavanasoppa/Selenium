package Sel.day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteExcel {
	static File f;
	static String readExcel()
	{
		String s="";
		try
		{
		 FileInputStream fis=new FileInputStream(f);
         XSSFWorkbook wb=new XSSFWorkbook(fis);
         XSSFSheet sh=wb.getSheet("Sheet1");
         XSSFRow row=sh.getRow(0);
         XSSFCell cell=row.getCell(0);
         s=cell.getStringCellValue();
		}
         
         catch(FileNotFoundException e)
         {
         e.printStackTrace();
         }
         catch(IOException e)
         {
         	e.printStackTrace();
         }
		return s;
	}
	static void writeExcel(String str)
	{
		try
		{
		 FileInputStream fis=new FileInputStream(f);
         XSSFWorkbook wb=new XSSFWorkbook(fis);
         XSSFSheet sh=wb.getSheet("Sheet1");
         XSSFRow row=sh.getRow(0);
         XSSFCell cell=row.getCell(0);
        /* XSSFRow row=sh.createRow();
         XSSFCell cell=row.createCell();*/
         cell.setCellValue(str);
         FileOutputStream fos=new FileOutputStream(f);
         wb.write(fos);
		}
         
         catch(FileNotFoundException e)
         {
         e.printStackTrace();
         }
         catch(IOException e)
         {
         	e.printStackTrace();
         }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 f=new File("C:\\Users\\BLTuser.BLT147\\Desktop\\1.xlsx");
		 writeExcel("bhavana,lohitha,tharun");
		 String s=readExcel();
		 System.out.println(s);
       }
}
