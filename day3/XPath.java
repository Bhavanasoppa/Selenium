package Sel.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
			WebDriver dr=new ChromeDriver();
	        dr.get("http://demowebshop.tricentis.com/login");
	        dr.findElement(By.xpath("//input[@class='email']")).sendKeys("bhavanasoppa1997@gmail.com");
	        dr.findElement(By.xpath("//input[@id='Password']")).sendKeys("monish");
	        dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	        dr.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}

}
