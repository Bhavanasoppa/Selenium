package Sel.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
		
		//launching the browser
		
		WebDriver dr=new ChromeDriver();
        dr.get("http://examples.codecharge.com/Store/Default.php");
        WebElement we= dr.findElement(By.name("category_id"));
        Select sel=new Select(we);
        sel.selectByVisibleText("Databases");
        String s= "/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[3]/td/input";
        dr.findElement(By.xpath(s)).click();
	}

}
