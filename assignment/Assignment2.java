package Sel.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launching the browser
        System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
		WebDriver dr=new ChromeDriver();
        dr.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
        dr.findElement(By.name("user_login")).sendKeys("1234");
        dr.findElement(By.name("user_password")).sendKeys("monish");
        dr.findElement(By.name("first_name")).sendKeys("Bhavana");
        dr.findElement(By.name("last_name")).sendKeys("S");
        dr.findElement(By.name("email")).sendKeys("bhavanasoppa1997@gmail.com");
        dr.findElement(By.name("address1")).sendKeys("Kallupalli");
        dr.findElement(By.name("address2")).sendKeys("Chittoor");
        dr.findElement(By.name("address3")).sendKeys("Andhra Pradesh");
        dr.findElement(By.name("city")).sendKeys("Chittoor");
        WebElement we= dr.findElement(By.name("state_id"));
        Select sel=new Select(we);
        sel.selectByVisibleText("California");
        dr.findElement(By.name("zip")).sendKeys("51740");
        WebElement a= dr.findElement(By.name("country_id"));
        Select q=new Select(a);
        q.selectByVisibleText("Australia");
        dr.findElement(By.name("phone_home")).sendKeys("7894561230");
        dr.findElement(By.name("phone_work")).sendKeys("2310456987");
        WebElement b= dr.findElement(By.name("language_id"));
        Select z=new Select(b);
        z.selectByVisibleText("English");
        WebElement c= dr.findElement(By.name("age_id"));
        Select y=new Select(c);
        y.selectByVisibleText("18-24");
        WebElement d= dr.findElement(By.name("gender_id"));
        Select p=new Select(d);
        p.selectByVisibleText("Female");
        WebElement e= dr.findElement(By.name("education_id"));
        Select r=new Select(e);
        r.selectByVisibleText("Graduate School");
        WebElement f= dr.findElement(By.name("income_id"));
        Select t=new Select(f);
        t.selectByVisibleText("$25,000 - $34,000");
        dr.findElement(By.name("note")).sendKeys("acfshjbcfsflgjsglskgsjgvs");
        dr.findElement(By.xpath("//input[@name='Insert']")).click();
	}

}

//XPATH FOR FIRST NAME
//table[@class='Record']//child::tr
//table[@class='Record']//child::tr[3]
//table[@class='Record']//child::tr[3]//child::td
//table[@class='Record']//child::tr[3]//child::td[2]
//table[@class='Record']//child::tr[3]//child::td[2]/input


//XPATH FOR STATE
//table[@class='Record']//child::tr
//table[@class='Record']//child::tr[10]
//table[@class='Record']//child::tr[10]//child::td
//table[@class='Record']//child::tr[10]//child::td[2]
//table[@class='Record']//child::tr[10]//child::td[2]/select
//table[@class='Record']//child::tr[10]//td/select


