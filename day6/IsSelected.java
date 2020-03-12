package Sel.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launching the browser
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com/");
		boolean b=dr.findElement(By.xpath("")).isSelected();
	}

}
