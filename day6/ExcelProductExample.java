package Sel.day6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

 /*   class Product {
	int productID;
	String productName;
	int productUnitPrice;

}
*/

public class ExcelProductExample {
	
        static Product readExcelFirstSheet(int index){
		Product p = new Product();
		File file = new File("C:\\Users\\BLTuser.BLT147\\Desktop\\2.xlsx");

		try
		{
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(index);
		XSSFCell columnOne = row.getCell(0);
		XSSFCell columnTwo = row.getCell(1);
		

		p.productID = (int)columnOne.getNumericCellValue();
		p.productQuantity = (int)columnTwo.getNumericCellValue();

		}
		catch(FileNotFoundException e)
		{
		e.printStackTrace();
		}
		catch(IOException e)
		{
		e.printStackTrace();
		}
		return p;
		}
        
        
        static Product readExcelSecondSheet(int index){
    		Product p = new Product();
    		File file = new File("C:\\Users\\BLTuser.BLT147\\Desktop\\2.xlsx");

    		try
    		{
    		FileInputStream fis = new FileInputStream(file);
    		XSSFWorkbook workbook = new XSSFWorkbook(fis);
    		XSSFSheet sheet = workbook.getSheet("Sheet2");
    		XSSFRow row = sheet.getRow(index);
    		XSSFCell columnOne = row.getCell(0);
    		XSSFCell columnTwo = row.getCell(1);
    		XSSFCell columnThree = row.getCell(2);

    		p.productID = (int)columnOne.getNumericCellValue();
    		p.productName = columnTwo.getStringCellValue();
    		p.productUnitPrice = (int)columnThree.getNumericCellValue();

    		}
    		catch(FileNotFoundException e)
    		{
    		e.printStackTrace();
    		}
    		catch(IOException e)
    		{
    		e.printStackTrace();
    		}
    		return p;
    		}
        
        
         static void write_excel(Product p1,int n)
         {
        	 Product p = new Product();
     		File f = new File("C:\\Users\\BLTuser.BLT147\\Desktop\\2.xlsx");
        	 try
        	 {
        	 FileInputStream fis=new FileInputStream(f);
 			XSSFWorkbook wb=new XSSFWorkbook(fis);
 			XSSFSheet sh=wb.getSheet("Sheet3");
 			XSSFRow row=sh.createRow(n);
 			XSSFCell cell=row.createCell(0);
 		    cell.setCellValue(p1.productID);
 		   XSSFCell cell1=row.createCell(1);
		    cell1.setCellValue(p1.productName);
		    XSSFCell cell2=row.createCell(2);
 		    cell2.setCellValue(p1.productUnitPrice);
 		   XSSFCell cell3=row.createCell(3);
		    cell3.setCellValue(p1.productTotal);
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
        	 
        
        
        static void searchProduct(int productId, int productQuantity){
    		Product product = new Product();
    		for(int i=1; i<4; i++){
    		product = readExcelSecondSheet(i);

    		if(productId == product.productID)
    		{
    		System.out.println(product.productID + "\t" + product.productName + "\t" + product.productUnitPrice + "\t" + productQuantity);
    		product.productTotal=(product.productUnitPrice*productQuantity);
    		write_excel(product,i);
    		}
    		}
            }
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(int i=1;i<3;i++)
			{
				Product a=readExcelFirstSheet(i);
				searchProduct(a.productID,a.productQuantity);
			}
		}

		}

	
