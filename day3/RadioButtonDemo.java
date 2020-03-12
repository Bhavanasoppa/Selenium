package Sel.day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButtonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launching the browser
        System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
		WebDriver dr=new ChromeDriver();
        dr.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        List rb= dr.findElements(By.name("optradio"));
        for(int i=0;i<rb.size();i++)
        {
            ((WebElement) rb.get(i)).click();
            dr.findElement(By.xpath("//button[@id='buttoncheck']")).click();
            String a="/html/body/div[2]/div/div[2]/div[1]/div[2]/p[3]";
            String s= dr.findElement(By.xpath(a)).getText();
            System.out.println(s);
            if(s.equals("Radio button 'Male' is checked"))
            	System.out.println("PASS");
            else if(s.equals("Radio button 'Female' is checked"))
            	System.out.println("PASS");
            else
            	System.out.println("FAIL");
        }
	}

}
