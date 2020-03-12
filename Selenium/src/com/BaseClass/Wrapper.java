package com.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wrapper {
	public static WebDriver driver;
	
	public void launchApplication(String url)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\845124\\Selenium\\Driver\\chromedriver_v80.exe.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.get(url);
	}
	
	public void quit()
	{
		driver.close();
	}

}
