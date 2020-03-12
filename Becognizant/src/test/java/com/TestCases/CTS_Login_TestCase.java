package com.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseClass.Wrapper;
import com.pages.CTS_Login;

public class CTS_Login_TestCase extends Wrapper{
	
CTS_Login lg;
	
	@BeforeMethod
	public void start(){
		LauchApplication("https://be.cognizant.com/");
	}
	
	@Test
	public void login() throws InterruptedException{
		lg = PageFactory.initElements(driver,CTS_Login.class);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		lg.login();
	}
	
	/*@AfterMethod
	public void close()
	{
		quit();
	}*/

}

