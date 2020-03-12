package Sel.day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupRadioButtonsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launching the browser
        System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
		WebDriver dr=new ChromeDriver();
        dr.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        List rb= dr.findElements(By.name("gender"));
        for(int i=0;i<rb.size();i++)
        {
        ((WebElement) rb.get(i)).click();
        List ar= dr.findElements(By.name("ageGroup"));
        for(int j=0;j<ar.size();j++)
        {
		((WebElement) ar.get(j)).click();
        dr.findElement(By.xpath("//button[@onclick='getValues();']")).click();
        String a="/html/body/div[2]/div/div[2]/div[2]/div[2]/p[2]";
        String s= dr.findElement(By.xpath(a)).getText();
        System.out.println(s);
        
        if(s.equals("Sex : Male\nAge group: 0 - 5"))
        	System.out.println("PASS");
        else if(s.equals("Sex : Male\nAge group: 5 - 15"))
        	System.out.println("PASS");
        else if(s.equals("Sex : Male\nAge group: 15 - 50"))
        	System.out.println("PASS");
        else if(s.equals("Sex : Female\nAge group: 0 - 5"))
             System.out.println("PASS");
        else if(s.equals("Sex : Female\nAge group: 5 - 15"))
        	System.out.println("PASS");
        else if(s.equals("Sex : Female\nAge group: 15 - 50"))
        	System.out.println("PASS");
        else
        	System.out.println("FAIL");	 
        }
        }
	}

}
