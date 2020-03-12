package Sel.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrievingTableData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launching the browser
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
		WebDriver dr=new ChromeDriver();
        dr.get("https://www.w3schools.com/html/html_tables.asp");
        String xp;
        int r,c;
        for(r=2;r<=7;r++)
        {
        	for(c=1;c<=3;c++)
        	{
        		xp="//*[@id=\"customers\"]/tbody/tr[" +r+ "]/td[" +c+ "]";
        	    String s1 = dr.findElement(By.xpath(xp)).getText();
        		System.out.print(s1 +" ");
        	}
        	System.out.println();
        }
	}

}
