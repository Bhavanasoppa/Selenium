package com.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wrapper {

	protected WebDriver driver;
	
	public void LauchApplication(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\845124\\JPetStore\\src\\test\\resources\\Driver\\chromedriver_v80.exe.exe");
	     driver=new ChromeDriver();
		 driver.get(url);
	}
	
	
	public void quit()
	{
		driver.close();
	}
}
