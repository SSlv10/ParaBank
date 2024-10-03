package testCase;

import org.testng.annotations.Test;

import pageObjects.ForgetPassword;
import testBase.BaseClass;

public class TC002_ForgetPassword extends BaseClass {
	
	@Test
	public void verify_Forget_pwd()
	{
		ForgetPassword fp = new ForgetPassword(driver);
		fp.getForgetPwd();
		fp.setFirstName(randomString().toLowerCase());
		fp.setLastName(randomString());
		fp.setAddress(randomAlphaNm());
		fp.setCity(randomString());
		fp.setState(randomString());
		fp.setZcode(randomAlphaNm());
		fp.setSSN(randomAlphaNm());
		fp.clickButton();		
	}

}
