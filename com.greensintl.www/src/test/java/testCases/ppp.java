package testCases;

import org.testng.annotations.Test;

import genericUtilities.excelUtility;
import pageObjects.homePage;
import pageObjects.signPage;
import pageObjects.signPageWithPassword;
import testBase.BaseClass;

public class ppp extends BaseClass {
@Test
public void veri() throws Throwable 
{
//	homePage hp=new homePage(driver);
//	hp.clickSignIn();
//	signPage sip=new signPage(driver);
//	sip.clickUseEmailAddress();
//	signPageWithPassword spwp=new signPageWithPassword(driver);
//	logger.info("Entering customer details");
//	spwp.setEmail("testerrllp1@gmail.com");
//	spwp.setPassword("Tester123#");
//	spwp.clickSigninBtn();
	excelUtility ex=new excelUtility();
	String re = ex.getSingleDataFromExcel("sheet1", 2, 2);
	System.out.println(re);
}
}
