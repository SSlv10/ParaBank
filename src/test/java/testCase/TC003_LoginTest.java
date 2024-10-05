package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LogOut;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC003_LoginTest extends BaseClass {
	
	@Test
	public void verify_Login()
	{
	LoginPage lp = new LoginPage(driver);
	lp.setLoginUn(p.getProperty("email"));
	lp.setLoginPwd(p.getProperty("password"));
	lp.clickLogin();
	//String confirmMsg = lp.getLoginConfirmation();
	//Assert.assertEquals(confirmMsg, "Welcome");
	}
	
	
	/*@Test
	public void verify_Logout()
	{
		LogOut lg = new LogOut(driver);
		lg.clickLogOut();
	}*/
}
