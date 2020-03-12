package Sel.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLogin {
	static WebDriver dr;
	static String exp_name;
	static String exp_price;
	
	static void login(String user_id,String password)
	{
		 System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
			 dr=new ChromeDriver();
	        dr.get("https://www.saucedemo.com/");        
	        dr.findElement(By.id("user-name")).sendKeys(user_id);
	        dr.findElement(By.id("password")).sendKeys(password);
	        dr.findElement(By.xpath("//input[@class='btn_action']")).click();
	}
	static void addProduct()
	{
		dr.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
	    exp_name= dr.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/a/div")).getText();
		System.out.println("expected name:\t" +exp_name);
	    String a=dr.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
	    exp_price=a.substring(1,6);
		System.out.println("expected price:\t" +exp_price);
	}
	static void verify()
	{
		dr.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		String ac_name= dr.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
		System.out.println("actual name:\t" +ac_name);
		String ac_price= dr.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
		System.out.println("actual price:\t" +ac_price);
		if(ac_name.equals(exp_name)&&(exp_price.equals(ac_price)))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login("standard_user","secret_sauce");
		addProduct();
		verify();

	}

}
