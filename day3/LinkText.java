package Sel.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launching the browser
        System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
		WebDriver dr=new ChromeDriver();
        dr.get("http://demowebshop.tricentis.com/");
        dr.findElement(By.linkText("Log in")).click();
	}

}
