package Sel.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new HtmlUnitDriver();
		dr.get("http://demowebshop.tricentis.com/");
		System.out.println(dr.getTitle());

	}

}
