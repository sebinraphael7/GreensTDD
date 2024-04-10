package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.googleSignInPage;
import pageObjects.homePage;
import pageObjects.signPage;
import testBase.BaseClass;

public class TC_001_Gmail_AutoSignin_valid_data extends BaseClass{
	
//	public WebDriver driver;
	

	
	@Test
	public void verify_Gmail_AutosignIn_valid() throws Throwable
	{
		try {
		homePage hp=new homePage(driver);
		hp.clickSignIn();
		signPage spg=new signPage(driver);
		spg.clickSigninWithGoogle();
		googleSignInPage gsp= new googleSignInPage(driver);
		gsp.setEmail("testerrllp1@gmail.com");
		gsp.clickNext();
		gsp.setPassword("pat190#a");
		gsp.clickpswdNext();
		
		} catch (Exception e) {
			logger.error("test failed");
			logger.debug("debug logs");
			Assert.fail();
	}
}
}
