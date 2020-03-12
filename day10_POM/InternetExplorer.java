package Sel.day10_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.IE.driver", "IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
       driver.get("http://demowebshop.tricentis.com/");
       System.out.println("Browser launched Successfully");

	}

}
