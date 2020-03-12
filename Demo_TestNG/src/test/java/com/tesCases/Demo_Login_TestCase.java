package com.tesCases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.BaseClasses.WrapperClass;
import com.pages.Demo_Login;

public class Demo_Login_TestCase extends WrapperClass {
	

	
	@Test
	public void log() throws IOException
	{
	launchApplication("https://www.amazon.in/");
	Demo_Login log_in = new  Demo_Login(driver);
	
	log_in=PageFactory.initElements(driver, Demo_Login.class);
	
	log_in.login("bhavanasoppa02@gmail.com","monish123");
    screenshot("C:\\845124\\Demo_TestNG\\src\\test\\resources\\Screenshots\\s2.png");
	}
	
	@AfterClass
	public void close()
	{
	quit();
	}
	

}
