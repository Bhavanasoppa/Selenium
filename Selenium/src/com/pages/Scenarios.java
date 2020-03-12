package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.BaseClass.Wrapper;

public class Scenarios extends Wrapper {
	
	 WebDriver driver;
	
	public WebElement download = driver.findElement(By.xpath("//*[@id='navbar']/a[1]"));
	public WebElement documentation = driver.findElement(By.xpath("/html/body/div[1]/div[2]/p[2]/a"));
	

	
	public void abc(){
		download.click();
		documentation.click();
		//driver.switchTo().defaultContent();
	}
	
	
	

}
