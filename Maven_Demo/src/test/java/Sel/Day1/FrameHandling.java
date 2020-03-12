package Sel.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launching the browser
        System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
	    WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/draggable/");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        System.out.println(driver.findElement(By.id("draggable")).isDisplayed());
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Droppable")).click();
	}

}
