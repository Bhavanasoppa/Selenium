package Sel.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
			WebDriver dr=new ChromeDriver();
	        dr.get("http://demowebshop.tricentis.com/");
	        dr.findElement(By.partialLinkText("Log")).click();

	}

}
