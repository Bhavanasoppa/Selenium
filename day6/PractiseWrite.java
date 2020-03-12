package Sel.day6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PractiseWrite {
	public void write(String filename,String sheetname,int r,int c,String data)
	{
		File f=new File(filename);
		try
		{
			FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet(sheetname);
			XSSFRow row=sh.getRow(r);
			XSSFCell cell=row.createCell(c);
			
			cell.setCellValue(data);
			FileOutputStream fos=new FileOutputStream(f);
			wb.write(fos);;
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
