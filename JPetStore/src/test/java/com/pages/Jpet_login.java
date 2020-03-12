package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Jpet_login {


	WebDriver driver;
	
	@FindBy(xpath="//*[@id='MenuContent']/a[2]")
	public WebElement signin;
	
	@FindBy(name="username")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(name = "signon")
	public WebElement btn_signin;
	
	
	
	public void signin_method(String name,String pass){
		signin.click();
		
		username.clear();
		username.sendKeys(name);
		
		password.clear();
		password.sendKeys(pass);
		
		
		btn_signin.click();
	}
}
