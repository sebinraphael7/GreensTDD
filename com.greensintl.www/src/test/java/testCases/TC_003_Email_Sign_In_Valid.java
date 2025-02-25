package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilities.excelUtility;
import pageObjects.homePage;
import pageObjects.signPage;
import pageObjects.signPageWithPassword;
import pageObjects.toastPage;
import testBase.BaseClass;

public class TC_003_Email_Sign_In_Valid extends BaseClass {

	@Test(groups = {"regression","master"})
	public void verify_Email_Login_Valid() throws Throwable {
		logger.info("*****starting TC_003_Email_Sign_In_ValidTest*****");

		logger.debug("application logss start");

		try {
			homePage hp = new homePage(driver);
			hp.clickSignIn();
			signPage sip = new signPage(driver);
			sip.clickUseEmailAddress();
			signPageWithPassword spwp = new signPageWithPassword(driver);
			logger.info("Entering customer details");
			excelUtility ex = new excelUtility();

//			spwp.setEmail(ex.getSingleDataFromExcel("Sheet1", 2, 2));
			spwp.setEmail("test");
			spwp.setPassword(ex.getSingleDataFromExcel("Sheet1", 3, 2));
			spwp.clickSigninBtn();
			logger.info("clicked on signin");
			toastPage tp = new toastPage(driver);
			Thread.sleep(2000);
			String st = tp.getToastMsg();
			System.out.println(st);
			String st2 = ex.getSingleDataFromExcel("Sheet1", 3, 4);
			logger.info("validating expected message");

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
		logger.debug("application logs end");
		logger.info("*****finishing TC_003_Email_Sign_In_ValidTest*****");
	}

}
