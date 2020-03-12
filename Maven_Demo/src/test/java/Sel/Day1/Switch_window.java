package Sel.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launching the browser
        System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.get("");
	    String main_win_hnd=driver.getWindowHandle();
	    for(String handle : driver.getWindowHandles())
	    {
	    	driver.switchTo().window(handle);
	    	System.out.println("handle =" +handle+ "Title =" +driver.getTitle());
	    }
	    
	}

}
