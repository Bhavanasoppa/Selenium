package com.BMW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bmw {
	protected static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\845124\\BMW\\Driver\\chromedriver_v80.exe.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.bmw.in/en");
		driver.findElement(By.linkText("Models")).click();
		driver.findElement(By.linkText("7")).click();
		//driver.findElement(By.xpath("//*[@id='the-top-navigation']/div/div/div/div[2]/div/div[1]/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/div"));
		
		Thread.sleep(30000);
		Actions action=new Actions(driver);
		WebElement a=driver.findElement(By.xpath("//*[@id='the-top-navigation']/div/div/div/div[3]/div/div/div[3]/div[2]/div/div/div/div[2]/div/div[1]/div/div/div[1]/div"));
		action.moveToElement(a);
		action.click(a).build().perform();
		

	}

}
