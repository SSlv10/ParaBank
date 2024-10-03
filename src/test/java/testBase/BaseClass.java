package testBase;

import java.time.Duration;
import org.openqa.selenium.WebDriver;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver;
	
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://parabank.parasoft.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}	
	
	
	
	
	public String randomString()
	{
		String generatedstring  = RandomStringUtils.randomAlphabetic(10);
		return generatedstring;
		
	}
	
	public String randomInteger()
	{
		String generatednumber = RandomStringUtils.randomNumeric(10);
		return generatednumber;
	}
	
	public String randomAlphaNm()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(10);
		String generatednumber = RandomStringUtils.randomNumeric(3);
		return (generatedstring + "@"+ generatednumber);
	}

	

}
