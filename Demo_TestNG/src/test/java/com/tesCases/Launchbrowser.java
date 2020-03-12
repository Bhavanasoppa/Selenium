package com.tesCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClasses.WrapperClass;

public class Launchbrowser extends WrapperClass{
	
	//@Test(priority=0)
	@BeforeTest
	public void start()
	{
		launchApplication("https://www.amazon.in/");
	}
	
	//@Test(priority=1)
	@Test
	public void capture() throws IOException
	{
		screenshot("C:\\845124\\Demo_TestNG\\src\\test\\resources\\Screenshots\\s1.png");
	}
	
	@Test(priority=1)
	//@AfterClass
	public void close()
	{
		quit();
	}
	

}
