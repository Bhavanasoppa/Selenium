package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseClass.Wrapper;
import com.pages.JPet_Search;
import com.pages.Jpet_login;

public class JPet_search_testCase extends Wrapper {

JPet_Search js;
	
	@BeforeMethod
	public void start(){
		launchApplication("https://petstore.octoperf.com/actions/Catalog.action");
	}
	
	@Test
	public void search() throws IOException
	{
		js=PageFactory.initElements(driver,JPet_Search.class);
		js.search_pet();
		screenshot("search\\");
		quit();
	}
	
	
}
