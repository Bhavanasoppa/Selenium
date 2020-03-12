package com.BaseClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wrapper {

protected WebDriver driver;
	
	//To launch the chrome browser
	
	public void launchApplication(String url)
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\845124\\JPetStore\\src\\test\\resources\\Driver\\chromedriver_v80.exe.exe");
	     driver=new ChromeDriver();
		 driver.get(url);
	}
	
	//To take Screenshot
	
	int count=1;
	
	public void screenshot(String s) throws IOException
	{
		String path="C:\\845124\\JPetStore\\src\\test\\resources\\Screenshot\\";
		String name=count+ ".png";
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,new File(path+s+name));
		count++;
	}
	
	//To close the browser
	
	public void quit()
	{
		driver.close();
	}

}

