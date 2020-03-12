package com.BaseClasses;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrapperClass {
	protected WebDriver driver;
	
	//To launch the chrome browser
	
	public void launchApplication(String url)
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\845124\\Demo_TestNG\\src\\test\\resources\\Drivers\\chromedriver_v80.exe.exe");
	     driver=new ChromeDriver();
		 driver.get(url);
	}
	
	
	/*public void launchApllicatio(String browser,String url)
	{
		try{
			if(browser.equals("firefox"))
			{
				driver=new FirefoxDriver();
			}
			else if(browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
				driver= new ChromeDriver();
				driver.get("url");
			}
		}
		catch(WebDriverException e)
		{
			e.printStackTrace();
		}
	}*/
	
	
	//To take Screenshot
	
	public void screenshot(String path) throws IOException
	{
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,new File(path));
	}
	
	//To close the browser
	
	public void quit()
	{
		driver.close();
	}

}
