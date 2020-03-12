package test.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn {

public static WebDriver driver;
	
	@FindBy(name="Email")
	public WebElement emailTextField;
	
	@FindBy(id="Password")
	public WebElement passwordTextField;
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	public WebElement logInButtonField;
	
	public void validLogIn(String username,String password)
	{
		emailTextField.clear();
		emailTextField.sendKeys(username);
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		logInButtonField.click();
	}
}
