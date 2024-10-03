package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistration;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC001_AccountRegistration extends BaseClass {

	
	@Test
 public void verify_Account_Reg()
	{
		AccountRegistration ac = new AccountRegistration(driver);
		ac.getRegisterLink();
		ac.setFirstName(randomString().toUpperCase());
		ac.setLastName(randomString().toLowerCase());
		ac.setAddress(randomString().toLowerCase());
		ac.setCity(randomString().toLowerCase());
		ac.setState(randomAlphaNm().toLowerCase());
		ac.setZcode(randomInteger());
		ac.setPhoneNumber(randomInteger());
		ac.setSSN(randomInteger());
		ac.setUN(randomString().toLowerCase());
		ac.setPwd(randomAlphaNm());
		ac.setConfirm(randomAlphaNm());
		ac.clickRegister();
	}
	
	@Test
	public void verify_login()
	{
		LoginPage lp = new LoginPage(driver);
		lp.setLoginUn(randomString().toLowerCase());
		lp.setLoginPwd(randomAlphaNm());
		lp.clickLogin();
		String confirmMsg = lp.getLoginConfirmation();
		Assert.assertEquals(confirmMsg, "Welcome Someleze Thembisa");
	}

}
