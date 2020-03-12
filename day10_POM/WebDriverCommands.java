package Sel.day10_POM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver_v80.exe.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/");
		System.out.println("Browser successfully launched");
		//driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		String a=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[1]/strong")).getText();
		System.out.println(a);
		String p=driver.findElement(By.xpath("//*[@id='newsletter-subscribe-button']")).getAttribute("type");
		System.out.println(p);
		String q=driver.findElement(By.xpath("//*[@id='newsletter-subscribe-button']")).getAttribute("value");
		System.out.println(q);
		Point x=driver.findElement(By.xpath("//*[@id='newsletter-subscribe-button']")).getLocation();
		System.out.println(x);
		String s=driver.getCurrentUrl();
		System.out.println("CurrentUrl" +s);
		Dimension y=driver.findElement(By.xpath("//*[@id='newsletter-subscribe-button']")).getSize();
		System.out.println(y);
		driver.close();
		
	}

}
