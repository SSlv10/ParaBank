package pageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration extends BasePage {
	
	//Constructor
     
     public AccountRegistration(WebDriver driver)
     {
    	 super(driver);
     }
     
     //Locator
     @FindBy(xpath = "//a[normalize-space()='Register']") 
     WebElement reg;
     
     @FindBy(xpath = "//input[@id='customer.firstName']")
     WebElement fn;
     
     @FindBy(xpath = "//input[@id='customer.lastName']")
     WebElement ln;
     
     @FindBy(xpath="//input[@id='customer.address.street']")
     WebElement address;
     
     @FindBy(xpath ="//input[@id='customer.address.city']")
     WebElement city;

     @FindBy(xpath = "//input[@id='customer.address.state']")
     WebElement state;

     @FindBy(xpath = "//input[@id='customer.address.zipCode']")
     WebElement zcode;
     
     @FindBy(xpath = "//input[@id='customer.phoneNumber']")
     WebElement pNumber;
     
     @FindBy(xpath = "//input[@id= 'customer.ssn']")
     WebElement ssn;
     
     @FindBy(xpath = "//input[@id='customer.username']")
     WebElement un;
     
     @FindBy(xpath = "//input[@id='customer.password']")
     WebElement pwd;
     
     @FindBy(xpath = "//input[@id='repeatedPassword']")
     WebElement confirm;
     
     @FindBy(xpath = "//input[@class = 'button']")
     WebElement rButton;
     
     //Active Methods
     
     public void getRegisterLink()
     {
    	 reg.click();
     }
     
     public void setFirstName(String user)
     {
    	 fn.sendKeys(user);
     }
     
     public void setLastName(String user)
     {
    	 ln.sendKeys(user);
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
     
     public void setPhoneNumber(String user)
     {
    	 pNumber.sendKeys(user);
     }
     
     public void setSSN(String user)
     {
    	 ssn.sendKeys(user);
     }
     
     public void setUN(String user)
     {
    	 un.sendKeys(user);
     }
     
     public void setPwd(String user)
     {
    	 pwd.sendKeys(user);
     }
     
     public void setConfirm(String user)
     {
    	 confirm.sendKeys(user);
     }
     
     public void clickRegister()
     {
    	 rButton.click();
     }
}


