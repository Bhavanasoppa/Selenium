package test.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launching the browser
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
        WebDriver dr=new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com/");
        dr.findElement(By.xpath("//a[@class='ico-login']")).click();        
        dr.findElement(By.name("Email")).sendKeys("bhavanasoppa1997@gmail.com");
        dr.findElement(By.id("Password")).sendKeys("monish");
        dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
        

	}

}
