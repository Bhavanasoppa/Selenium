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

public class AverageExcel {
	static File f;
	static int readExcel(int r,int c)
	{
		int s=0;
		try
		{
		 FileInputStream fis=new FileInputStream(f);
         @SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(fis);
         XSSFSheet sh=wb.getSheet("Sheet2");
         XSSFRow row=sh.getRow(r);
         XSSFCell cell=row.getCell(c);
         s=(int)cell.getNumericCellValue();
		}
         catch(FileNotFoundException e)
         {
         e.printStackTrace();
         }
         catch(IOException e)
         {
         	e.printStackTrace();
         }
		return  s;
	}
	static int readExcel1(int r,int c)
	{
		int s=0;
		try
		{
		 FileInputStream fis=new FileInputStream(f);
         @SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(fis);
         XSSFSheet sh=wb.getSheet("Sheet2");
         XSSFRow row=sh.getRow(r);
         XSSFCell cell=row.getCell(c);
         s=(int)cell.getNumericCellValue();
		}
         catch(FileNotFoundException e)
         {
         e.printStackTrace();
         }
         catch(IOException e)
         {
         	e.printStackTrace();
         }
		return  s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f=new File("C:\\Users\\BLTuser.BLT147\\Desktop\\1.xlsx");
		int java=readExcel(2,1);
		System.out.print(java +"\t");
		int selenium=readExcel1(2,2);
		System.out.print(selenium);
		int avg=average(java,selenium);
	}
}
