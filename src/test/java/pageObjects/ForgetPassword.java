package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetPassword extends BasePage {
	
	WebDriver driver;
	
	//Constructor
	public ForgetPassword(WebDriver driver)
	{
		super(driver);
	}
	
	//Locator
	@FindBy(xpath = "//a[normalize-space()='Forgot login info?']")
	WebElement forgetPwd;
	
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='address.street']")
	WebElement address;
	
	@FindBy(xpath = "//input[@id='address.city']")
	WebElement city;
	
	@FindBy(xpath = "//input[@id='address.state']")
	WebElement state;
	
	@FindBy(xpath = "//input[@id='address.zipCode']")
	WebElement zcode;
	
	@FindBy(xpath = "//input[@id='ssn']")
	WebElement ssn;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement button;
	
	//Action methods
	
	public void getForgetPwd()
	{
		forgetPwd.click();
	}
	
	public void setFirstName(String user)
	{
		firstName.sendKeys(user);
	}
	
	public void setLastName(String user)
	{
		lastName.sendKeys(user);
	}

	public void setAddress(String user)
	{
		address.sendKeys(user);
	
	}
	
	public void setCity(String user)
	{
		city.sendKeys(user);
	}
	
	public void setState(String user)
	{
		state.sendKeys(user);
	}
	public void setZcode(String user)
	{
		zcode.sendKeys(user);
	}
	

	
	public void setSSN(String user)
	{
		ssn.sendKeys(user);
	}
	
	public void clickButton()
	{
		button.click();
	}
}
