package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signPage extends basePage  {
	WebDriver driver;
	public signPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//p[@content='Use Email Address']")
	WebElement lnkUseEmailAddress;
	@FindBy(xpath = "//p[@content='Sign in with Facebook']")
	WebElement lnkFacebookSignIn;
	@FindBy(xpath = "//p[@content='Sign in with Google']")
	WebElement lnkGoogleSignIn;
	
	public void clickUseEmailAddress()
	{
		lnkUseEmailAddress.click();
	}
	public void clickSigninWithGoogle()
	{
		lnkGoogleSignIn.click();
	}
	public void clickSigninWithFacebook()
	{
		lnkFacebookSignIn.click();
	}
	}
