package Sel.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launching the browser
       System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
	   WebDriver dr=new ChromeDriver();
       dr.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
	   dr.findElement(By.tagName("input")).sendKeys("Bhavana");
       dr.findElement(By.xpath("//input[@name='lastName']")).sendKeys("S");
       dr.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/div/div[1]/input")).sendKeys("sbhavana");
       dr.findElement(By.cssSelector("#passwd > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("password123");
       dr.findElement(By.cssSelector("#confirm-passwd > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("password123");
       dr.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	}

}



