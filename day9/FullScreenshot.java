package Sel.day9;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullScreenshot {
	static WebDriver dr;
	
	public static void fullScreenshot(String p) throws IOException
	{
	    Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(dr);
		ImageIO.write(s.getImage(), "jpg", new File(p));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
		dr=new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com/");
		fullScreenshot("C:\\Users\\Public\\Pictures\\Sample Pictures\\screenshot2.png");
		dr.findElement(By.xpath("//a[@class='ico-login']")).click();
		dr.findElement(By.name("Email")).sendKeys("bhavanasoppa1997@gmail.com");
        dr.findElement(By.id("Password")).sendKeys("monish");
        dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
        fullScreenshot("C:\\Users\\Public\\Pictures\\Sample Pictures\\screenshot3.png");

	}

}

