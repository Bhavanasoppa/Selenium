package Sel.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrivingDetailsOfaParticularRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launching the browser
				System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
				WebDriver dr=new ChromeDriver();
		        dr.get("https://www.w3schools.com/css/css_table.asp");
		        String xp;
		        int i=0,j=0,r,c;
		        for(r=2;r<=7;r++)
		        {
		        	for(c=3;c<=3;c++)
		        	{
		        		xp="//*[@id=\"customers\"]/tbody/tr[" +r+ "]/td[" +c+ "]";
		        	    String s1 = dr.findElement(By.xpath(xp)).getText();
		        	if(s1.equals("Sweden"))
		        		i=r;
		        	    j=c;
		        	    break;
		        	}
		        	if(i>0&&j>0)
		        		break;
		        }
		        for(r=i;r<=i;r++)
		        {
		        	for(c=1;c<=j;c++)
		        	{
		        		xp="//*[@id=\"customers\"]/tbody/tr[" +r+ "]/td[" +c+ "]";
		                String s=dr.findElement(By.xpath(xp)).getText();
		                System.out.print(s + "\t");
		        	}
		        }
	}

}
