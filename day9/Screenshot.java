package Sel.day9;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeDriver;



import org.openqa.selenium.*;



public class Screenshot {
	 static WebDriver dr;
	public static void screenshot(String s)
	{
		File screenshot=((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
				
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

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//launching the browser
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
		dr=new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com/");
		screenshot("C:\\Users\\Public\\Pictures\\Sample Pictures\\screenshot.png");
		dr.findElement(By.xpath("//a[@class='ico-login']")).click();
		dr.findElement(By.name("Email")).sendKeys("bhavanasoppa1997@gmail.com");
        dr.findElement(By.id("Password")).sendKeys("monish");
        dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
        screenshot("C:\\Users\\Public\\Pictures\\Sample Pictures\\screenshot1.png");
        	}

}
