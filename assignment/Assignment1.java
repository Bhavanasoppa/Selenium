package Sel.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launching the browser
        System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe.exe");
		WebDriver dr=new ChromeDriver();
        dr.get("http://examples.codecharge.com/Store/Default.php");
        String e_title="Online Bookstore";
        System.out.println(e_title);
        String a_title=dr.getTitle();
        System.out.println(a_title);
        /*String s=dr.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/font")).getAttribute("Online");
        System.out.println(s);*/
        WebElement we= dr.findElement(By.name("category_id"));
        Select sel=new Select(we);
        sel.selectByVisibleText("Databases");
        String a= "/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[3]/td/input";
        dr.findElement(By.xpath(a)).click();
        dr.findElement(By.xpath("//a[@href='ProductDetail.php?product_id=1']")).click();
        String x=dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/h1")).getText();
        System.out.println(x);
        String xp="/html/body/table[5]/tbody/tr/td/form/table/tbody/tr/td[2]";
        String s= dr.findElement(By.xpath(xp)).getText();
        System.out.println(s);
        dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[1]/input")).clear();
        dr.findElement(By.name("quantity")).sendKeys("2");
        dr.findElement(By.xpath("//input[@name='Insert1']")).click();
        String xp1="/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr[2]/td[3]/input";
        String s1=dr.findElement(By.xpath(xp1)).getAttribute("value");
        System.out.println(s1);
        
        String l="/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr[2]/td[2]";
        String m= dr.findElement(By.xpath(l)).getText();
        System.out.println("Price\t"  +m);
        String j=m.substring(1,6);
        System.out.println("actual price:" +j);
        double p=Double.parseDouble(j);
        //double p= 39.99;
        double q= Double.parseDouble(s1);
        System.out.println("quantity:" + q);
        double res=(p*q);
        System.out.println("result:" + res);
        String r="/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/p";
        String h= dr.findElement(By.xpath(r)).getText();
        System.out.println(h);
        String g=h.substring(8,13);
        System.out.println("actual:" +g);
        double k=Double.parseDouble(g);
        if(res==k)
        	System.out.println("PASS");
        else
        	System.out.println("FAIL");
	}

}
