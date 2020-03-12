package Sel.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAccessMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
		WebDriver dr=new ChromeDriver();
        dr.get("http://demowebshop.tricentis.com/login");
        dr.findElement(By.xpath("//label[contains(text(),'Pass')]"));
        dr.findElement(By.xpath("//label[text()='Password:']"));
        dr.findElement(By.xpath("//div[@class='inputs']//child::input"));
        dr.findElement(By.xpath("//div[@class='inputs']//following::input"));
        dr.findElement(By.xpath("//div[@class='form-fields']"));
        dr.findElement(By.xpath("//*[text()='Password:']//following::input"));
        dr.findElement(By.xpath("//*[contains(text(),'word')]"));
        dr.findElement(By.xpath("//div[@class='form-fields']//child::div/input"));
        dr.findElement(By.xpath("//div[@class='form-fields']//child::div[2]//child::label"));
        dr.findElement(By.xpath("//div[@class='form-fields']//child::div[2]/input"));
	}

}
