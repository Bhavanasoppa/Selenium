package Sel.day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
			
			//launching the browser
			
			WebDriver dr=new ChromeDriver();
			dr.get("http://demowebshop.tricentis.com/");
			
			//implicit wait
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			//explicit wait
			WebDriverWait wt=new WebDriverWait(dr,20);
			wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='ico-login1']")));
			
			 dr.findElement(By.xpath("//a[@class='ico-login1']")).click();
	}

}
