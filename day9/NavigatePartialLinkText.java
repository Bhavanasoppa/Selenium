package Sel.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatePartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
		   WebDriver dr=new ChromeDriver();
	       dr.navigate().to("https://www.google.com/");
	       dr.findElement(By.partialLinkText("Busi")).click();
	       }
	}
