package Sel.day9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchonization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
		
		//launching the browser
		
		WebDriver dr=new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com/");
		dr.manage().window().maximize();
		
		//implicit wait
		/*dr.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		dr.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);*/
		dr.findElement(By.xpath("//a[@class='ico-login']")).click(); 
		//explicit wait
	
		dr.findElement(By.name("Email")).sendKeys("bhavanasoppa1997@gmail.com");
        dr.findElement(By.id("Password")).sendKeys("monish");
        WebDriverWait wt=new WebDriverWait(dr,60);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='button-1 login-button1']")));
		dr.findElement(By.xpath("//input[@class='button-1 login-button1']")).click();
	}

}
