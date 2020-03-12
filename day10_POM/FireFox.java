package Sel.day10_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geko.driver", "gekodriver.exe");
		WebDriver driver=new FirefoxDriver();
       driver.get("http://demowebshop.tricentis.com/");
       System.out.println("Browser launched Successfully");

	}

}
