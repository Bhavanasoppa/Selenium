package Sel.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebregister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
			WebDriver dr=new ChromeDriver();
	        dr.get("http://demowebshop.tricentis.com/");
	        dr.findElement(By.xpath("//a[@class='ico-register']")).click();
	        List rb= dr.findElements(By.name("Gender"));
	        ((WebElement) rb.get(1)).click();
	        dr.findElement(By.name("FirstName")).sendKeys("Bhavana");
	        dr.findElement(By.name("LastName")).sendKeys("S");
	        dr.findElement(By.name("Email")).sendKeys("soppabhavana02@gmail.com");
	        dr.findElement(By.name("Password")).sendKeys("monish");
	        dr.findElement(By.name("ConfirmPassword")).sendKeys("monish");
	        dr.findElement(By.xpath("//input[@class='button-1 register-next-step-button']")).click();
	}

}
