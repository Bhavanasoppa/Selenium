package Sel.Day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class Screenshot {
	static WebDriver dr;
	public static void screenshot()
	{
		File screenshot=((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
				
		try
		{
				String screenshotLocation= "C:\\Users\\Public\\Pictures\\Sample Pictures\\screenshot.png";	
				FileUtils.copyFile(screenshot,new File(screenshotLocation));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
		dr=new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com/");
	}

}
