package com.naveenautomation.Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.naveenautomation.Base.TestBase;
import com.naveenautomation.Pages.AccountLoginPage;
import com.naveenautomation.Pages.CheckOutPage;
import com.naveenautomation.Pages.HomePage;
import com.naveenautomation.Pages.MyAccountInformation;
import com.naveenautomation.Pages.MyAccountPage;
import com.naveenautomation.Pages.NewsletterSubscriptionPage;

public class CheckOutTest extends TestBase{

	
	HomePage homePage;
	AccountLoginPage accountLoginPage;
	MyAccountPage myAccountPage;
	CheckOutPage checkOutPage;
	SoftAssert softAssert;

	@BeforeMethod
	public void setUp() {
		launchBrowser();
		softAssert = new SoftAssert();
		homePage = new HomePage();
		myAccountPage = new MyAccountPage();
		accountLoginPage = new AccountLoginPage();
		homePage.clickLoginLink();
		accountLoginPage.login("harinder@gmail.com", "Password1");
	}

	@Test
	public void validateBillingDetails() {
		checkOutPage.fillBillingDetails("harinder", "kaur", "2232", "edmonton","T6T0Z1", "Canada", "Alberta");
		softAssert.assertEquals(myAccountPage.getMyAccountText(), "My Account", "Login Failed");
		softAssert.assertAll();
	}
	
	@BeforeMethod
	public void tearDown() {
		quitBrowser();
	}
	
}
