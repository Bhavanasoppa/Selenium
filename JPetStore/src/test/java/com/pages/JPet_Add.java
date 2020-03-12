package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JPet_Add {
	
	WebDriver driver;

    @FindBy(xpath="//*[@id='Catalog']/table/tbody/tr[2]/td[1]/a")
    public WebElement select;
	
	@FindBy(xpath="//*[@id='Catalog']/table/tbody/tr[2]/td[5]/a")
	public WebElement add;
	
	
	public void add_to_cart()
	{
		select.click();
		add.click();	
	}

}
