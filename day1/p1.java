package Sel.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
		
		//launching the browser
		
		WebDriver dr=new ChromeDriver();
        dr.get("http://demowebshop.tricentis.com/");
	}

}
