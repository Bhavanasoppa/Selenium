package test.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActions {
	
	@Test
	public void mouse_action()
	{
		WebDriver driver;
	 System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
     driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 WebElement a=driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
	 WebElement b=driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']/a/span"));
		Actions builder=new Actions(driver);
		Actions seriousOfActions=builder.moveToElement(a);
		builder.moveToElement(b).click();
		seriousOfActions.perform();
		
	}

}
