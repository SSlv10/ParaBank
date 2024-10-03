package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	//Constructor
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Locator
	@FindBy(xpath = "//input[@name = 'username']")
	WebElement logUn;
	
	@FindBy(xpath = "//input[@name = 'password']")
	WebElement logPwd;
	
	@FindBy(xpath = "//input[@class ='button']")
    WebElement logIn;
	
	@FindBy(xpath = "//p[@class='smallText']")
	WebElement loginMsgConfirmation;
	
	//Action methods
	public void setLoginUn(String user)
	{
		logUn.sendKeys(user);
	}
	
	public void setLoginPwd(String user)
	{
		logPwd.sendKeys(user);
	}
	
	public void clickLogin()
	{
		logIn.click();
	}
	
	public String getLoginConfirmation()
	{
		try {
			return(loginMsgConfirmation.getText());
		}
			catch(Exception e)
		{
				return (e.getMessage());	
		}
	}
}
