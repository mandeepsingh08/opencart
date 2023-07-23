package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.BaseClass;

import pageObject.HomePage;

import pageObject.AccountRegistrationPage;

public class TC_001_AccountRegistrationTest extends BaseClass {
	@Test
	
	public void test_account_Registration() {
		logger.info("Test case starting");
		logger.trace("This is trace");
		try
		
		{
			
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			hp.clickRegister();
			captureScreen("Register");
			AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
			
			regpage.setFirstName(randomeString().toUpperCase());
			regpage.setLastName(randomeString().toUpperCase());
			regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
		
			
			String password=randomAlphaNumeric();
			regpage.setPassword(password);
			
			
			regpage.setPrivacyPolicy();
			
			
			regpage.clickContinue();
		}
		
		catch (Exception e) {
			Assert.fail();
		}
		logger.info("TEst case ending");	
			
			
			
		}
	
	

}
