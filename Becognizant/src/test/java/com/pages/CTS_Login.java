package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CTS_Login {
	
	WebDriver driver;
	
	@FindBy(name="loginfmt")
	public WebElement mailTextField;
	
	
	@FindBy(id="idSIButton9")
	public WebElement next;
	
	
	@FindBy(xpath="//*[@id='userNameInput']")
	public WebElement username;
	
	@FindBy(name="Password")
	public WebElement password;
	
	@FindBy(id="Log_On1")
	public WebElement logon;
	
	@FindBy(xpath="//*[@id='idTxtBx_SAOTCC_OTC']")
	public WebElement otp;
	
	@FindBy(xpath="//*[@id='idSubmit_SAOTCC_Continue']")
	public WebElement verify;
	
	@FindBy(xpath="//*[@id='idBtn_Back']")
	public WebElement no;
	
	
	
	public void login() throws InterruptedException
	{
		mailTextField.clear();
		mailTextField.sendKeys("");
		next.click();
		username.clear();
		username.sendKeys("");
		password.clear();
		password.sendKeys("");
		logon.click();
		Thread.sleep(80000);
		verify.click();
		no.click();
	}

}
