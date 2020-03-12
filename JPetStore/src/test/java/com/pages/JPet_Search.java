package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JPet_Search {
	
WebDriver driver;

    @FindBy(name="keyword")
    public WebElement search_textField;
	
	@FindBy(name="searchProducts")
	public WebElement search;
	
	
	public void search_pet()
	{
		search_textField.clear();
		search_textField.sendKeys("fish");
		search.click();	
	}
}
