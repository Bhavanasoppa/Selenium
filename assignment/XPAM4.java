package Sel.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPAM4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
		WebDriver dr=new ChromeDriver();
		
		//form[@method='post']//child::div  (search for node with div tag in the entire family tree)
		//form[@method='post']//child::div[2]
		//form[@method='post']//child::div[2]/input
        dr.get("http://demowebshop.tricentis.com/login");
        dr.findElement(By.xpath("//form[@method='post']//child::div[2]/input"));
        dr.findElement(By.xpath("//form[@method='post']//child::div[3]/input"));
        dr.findElement(By.xpath("//form[@method='post']//child::div[5]/input"));
        
        
        
	}

}
