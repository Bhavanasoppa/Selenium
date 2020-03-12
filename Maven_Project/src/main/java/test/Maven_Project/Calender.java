package test.Maven_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
		WebDriver dr=new ChromeDriver();
        dr.get("https://www.path2usa.com/travel-companions");
        
        //to select month
        
        dr.findElement(By.id("travel_date")).click();
        while(!dr.findElement(By.cssSelector(""))).getText().contains("May")
        {
        	dr.findElement(By.cssSelector("")).click();
        }
        
        List<WebElement> dates=dr.findElements(By.className("day"));
        
        
        int count=dr.findElements(By.className("day")).size();
        
        for(int i=0;i<count;i++)
        {
           String text=dr.findElements(By.className("day")).get(i).getText();
           if(text.equalsIgnoreCase("21"))
           {
        	   dr.findElements(By.className("day")).get(i).click();
        	   break;
           }
        }
	}

}
