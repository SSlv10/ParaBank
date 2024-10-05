package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOut extends BasePage {
	
	//constructor
	
	public LogOut(WebDriver driver)
	{
		super(driver);
	}
	
	//Locator
	
	@FindBy(linkText = "Log Out")
	WebElement lgOut;
	
	@FindBy(xpath = "//h2[normalize-space()='Customer Login']")
	WebElement textConfirmation;
	
	//Action methods
	public void clickLogOut()
	{
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(lgOut));
		lgOut.click();
		
	}
	
	public String txtVerification()
	{
		try {
			return(textConfirmation.getText());
		}
		catch(Exception e){
			return(e.getMessage());
		}
	}
}
