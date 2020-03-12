package Sel.day10_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageMale {
	public static WebDriver driver;
	
	@FindBy(id="gender-male")
	public WebElement maleButtonField;
	
	@FindBy(name="FirstName")
	public WebElement firstNameTextField;
	
	@FindBy(id="LastName")
	public WebElement lastNameTextField;
	
	@FindBy(id="Email")
	public WebElement emailTextField;
	
	@FindBy(css="#Password")
	public WebElement passwordTextField;
	
	@FindBy(name="ConfirmPassword")
	public WebElement confirmPasswordTextField;
	
	@FindBy(xpath="//input[@id='register-button']")
	public WebElement registerButtonField;
	
	public void validRegistrationMale(String fn,String ln,String email,String password)
	{  
		maleButtonField.click();
		firstNameTextField.clear();
		firstNameTextField.sendKeys(fn);
		lastNameTextField.clear();
		lastNameTextField.sendKeys(ln);
		emailTextField.clear();
		emailTextField.sendKeys(email);
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		confirmPasswordTextField.clear();
		confirmPasswordTextField.sendKeys(password);
		registerButtonField.click();
	}
}
