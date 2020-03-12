package test.Maven_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModelorPageFactory {
	public static WebDriver driver;
	
	   //static RegisterPageMale regM;
	   static RegisterPageFemale regF;
	   static LogIn loginPage;
	   
	   
	   public static void screenshot(String s)
		{
			File screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					
			try
			{
					String screenshotLocation= s;	
					FileUtils.copyFile(screenshot,new File(screenshotLocation));
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	   
	   
	   
	   public static void setup()
	   {
		   System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
			driver=new ChromeDriver();
	       driver.get("http://demowebshop.tricentis.com/");
	       System.out.println("Browser launched Successfully");
	       
	       driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
	       driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	   }
	   
	   
	   public static void functionality()
	   {
		   regF=PageFactory.initElements(driver, RegisterPageFemale.class);
			loginPage=PageFactory.initElements(driver, LogIn.class);
			
			/*regM=PageFactory.initElements(driver, RegisterPageMale.class);
			loginPage=PageFactory.initElements(driver, LogIn.class);
			
			regF.validRegistrationFemale("Monish","S" ,"smonish@gmail.com", "password");
			loginPage.validLogIn("smonish@gmail.com", "password");*/
			
			regF.invalidRegistrationFemale("Bhavana", "s", "bhavanagmail.com", "password");
			System.out.println("Registration Failed");
			screenshot("C:\\Users\\Public\\Pictures\\Sample Pictures\\registerFail.png");
			
			regF.validRegistrationFemale("Bhavana","S" ,"bhavanas7@gmail.com", "password");
			System.out.println("Registration Successfull");
			screenshot("C:\\Users\\Public\\Pictures\\Sample Pictures\\registerPass.png");
			
			driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
			System.out.println("Logout Successfull");
			screenshot("C:\\Users\\Public\\Pictures\\Sample Pictures\\logout.png");
			
			
			driver.findElement(By.xpath("//a[@class='ico-login']")).click();
			loginPage.validLogIn("sbhavana@gmail.com", "password");
			System.out.println("Login Successfull");
			String ex="Demo Web Shop";
			String ac=driver.getTitle();
			System.out.println(ac);
			screenshot("C:\\Users\\Public\\Pictures\\Sample Pictures\\title.png");
			if(ex.equals(ac))
			{
				System.out.println("PASS");
			}
			else
			{
				System.out.println("FAIL");
			}
			driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
			System.out.println("Logout Successfull");
	   }
	   
	   
	   
	   public static void tearDown()
	   {
		   driver.close();
			System.out.println("Browser successfully closed");
	   }
	   
	    
		public static void main(String[] args) {
			
			setup();
	        functionality();
	        tearDown();
		}


}
