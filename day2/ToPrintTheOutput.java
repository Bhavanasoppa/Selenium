package Sel.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPrintTheOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
			
			//launching the browser
			
			WebDriver dr=new ChromeDriver();
			dr.get("http://demowebshop.tricentis.com/");
			dr.findElement(By.linkText("Log in")).click();
			dr.findElement(By.name("Email")).sendKeys("bhavanasoppa1997@gmail.com");
	        dr.findElement(By.id("Password")).sendKeys("monish");
	        dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	        
	        String xp="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a";
	        String s= dr.findElement(By.xpath(xp)).getText();
	        System.out.println(s);
	}

}
