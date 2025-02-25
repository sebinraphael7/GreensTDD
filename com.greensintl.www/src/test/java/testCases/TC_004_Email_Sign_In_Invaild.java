package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericUtilities.excelUtility;
import pageObjects.homePage;
import pageObjects.signPage;
import pageObjects.signPageWithPassword;
import pageObjects.toastPage;
import testBase.BaseClass;

public class TC_004_Email_Sign_In_Invaild extends BaseClass {
	@Test(groups = "master")
	public void verify_Email_Login_Invalid() throws Throwable {
		try {
			homePage hp = new homePage(driver);
			hp.clickSignIn();
			signPage sip = new signPage(driver);
			sip.clickUseEmailAddress();
			signPageWithPassword spwp = new signPageWithPassword(driver);
			excelUtility ex = new excelUtility();
			spwp.setEmail(ex.getSingleDataFromExcel("Sheet1", 6, 2));
			spwp.setPassword(ex.getSingleDataFromExcel("Sheel", 7, 2));
			spwp.clickSigninBtn();
			toastPage tp = new toastPage(driver);
			Thread.sleep(2000);
			String st = tp.getToastMsg();
			System.out.println(st);
			String st2 = ex.getSingleDataFromExcel("Sheet1", 6, 4);
			if (st.equals(st2)) {
				logger.info("test is passed");
				Assert.assertTrue(true);
			} else {
				logger.error("test is failed");
				Assert.fail();
			}
		} catch (Exception e) {
			logger.error("test failed");
			logger.debug("debug logs");
			Assert.fail();
		}
	}

}
