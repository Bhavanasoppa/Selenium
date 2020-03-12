package com.testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.Wrapper;
import com.pages.Scenarios;

public class test extends Wrapper{
	
	Scenarios s;
	
	@BeforeTest
	public void start(){
		launchApplication("https://www.selenium.dev/");
	}
	
	
	@Test
	public void xyz()
	{
	
		s.abc();
		quit();
	}
	
	

}
