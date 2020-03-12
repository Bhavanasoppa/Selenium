package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BaseClass.Wrapper;
import com.ExcelUtility.Login_Excel;
import com.pages.Jpet_login;

public class Jpet_Login_testcases extends Wrapper{

	Jpet_login lg;
	
	@BeforeMethod
	public void start(){
		launchApplication("https://petstore.octoperf.com/actions/Catalog.action");
	}
	
	
	@Test(dataProvider="pet")
	public void login(String name,String password) throws IOException{
		lg = PageFactory.initElements(driver,Jpet_login.class);
		lg.signin_method(name,password);
		screenshot("login\\");
		quit();
	}
	
	@DataProvider
	public String[][] pet() throws IOException
	{
		Login_Excel ex=new Login_Excel();
		String[][] data;
		data=ex.user_id();
		return data;
	}
}
