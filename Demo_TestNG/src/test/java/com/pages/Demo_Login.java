package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Demo_Login {

	public WebDriver driver;

	public Demo_Login( WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(name="email")
	public WebElement emailtext;

	@FindBy(id="continue")
	public WebElement cont;

	@FindBy(name="password")
	public WebElement passwordfield;

	@FindBy(id="signInSubmit")
	public WebElement login;



	public void login(String email,String password)
	{
		WebElement a=driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		WebElement b=driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']/a/span"));
		Actions builder=new Actions(driver);
		Action seriousOfActions= builder.moveToElement(a).moveToElement(b).click().build();
		seriousOfActions.perform();		
		emailtext.clear();
		emailtext.sendKeys(email);
		cont.click();
		passwordfield.clear();
		passwordfield.sendKeys(password);
		login.click();

	}
}
