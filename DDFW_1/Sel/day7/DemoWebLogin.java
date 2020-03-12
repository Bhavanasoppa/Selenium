package DDFW_1.Sel.day7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DemoWebLogin {
	
	public static String login(String emailId,String Password) 
	{
		//launching the browser
        System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
		WebDriver dr=new ChromeDriver();
        dr.get("http://demowebshop.tricentis.com/");
        dr.findElement(By.xpath("//a[@class='ico-login']")).click();        
        dr.findElement(By.name("Email")).sendKeys(emailId);
        dr.findElement(By.id("Password")).sendKeys(Password);
        dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
        String ar= dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
        dr.close();
        return ar;
	}
	
	public static String read_excel(int r,int c)
	{
		String s=null;
		String filename="C:\\Users\\BLTuser.BLT147\\Desktop\\New folder\\3.xlsx";
		String sheetname="Sheet1";
		File f=new File(filename);
		try
		{
			FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet(sheetname);
			XSSFRow row=sh.getRow(r);
			XSSFCell cell=row.getCell(c);
			s=cell.getStringCellValue();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return s;
	}
	
	
	 static void write_excel(int r,String ar,String tr)
     {
    	 
 		File f = new File("C:\\Users\\BLTuser.BLT147\\Desktop\\New folder\\3.xlsx");
    	 try
    	 {
    	 FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet("Sheet1");
			XSSFRow row=sh.getRow(r);
			XSSFCell cell=row.createCell(3);
		    cell.setCellValue(ar);
		   XSSFCell cell1=row.createCell(4);
	    cell1.setCellValue(tr);
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
		String test_res;
		for(int i=1;i<6;i++)
		{
				String e=read_excel(i,0);
				String p=read_excel(i,1);
				String ex_res=read_excel(i,2);
				String ac_res=login(e,p);
				if(ex_res.equals(ac_res))
				{
					System.out.println("PASS");
					test_res="PASS";
				}
				else
				{
					System.out.println("FAIL");
					test_res="FAIL";
				}
				write_excel(i,ac_res,test_res);
		}
	}

}
