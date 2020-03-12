package Sel.Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launching the browser
        System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
	    WebDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("asdfg");
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
        try
        {
        	Thread.sleep(3000);
        }
        catch(InterruptedException e)
        {
        	e.printStackTrace();
        }
        Alert a=driver.switchTo().alert();
        String s=a.getText();
        System.out.println(s);
        a.accept();
        
        try
        {
        	Thread.sleep(3000);
        }
        catch(InterruptedException e)
        {
        	e.printStackTrace();
        }
        Alert a1=driver.switchTo().alert();
        s=a.getText();
        a1.accept();
        System.out.println(s);
	}

}
