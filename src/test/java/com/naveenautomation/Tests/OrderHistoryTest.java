package com.naveenautomation.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.naveenautomation.Base.TestBase;
import com.naveenautomation.Pages.AccountLoginPage;
import com.naveenautomation.Pages.AddressBookPage;
import com.naveenautomation.Pages.HomePage;
import com.naveenautomation.Pages.LaptopsAndNotebooksPage;
import com.naveenautomation.Pages.MyAccountPage;
import com.naveenautomation.Pages.MyWishListPage;
import com.naveenautomation.Pages.OrderHistoryPage;

public class OrderHistoryTest extends TestBase{
	SoftAssert softAssert;
	HomePage homePage;
	AccountLoginPage accountLoginPage;
	MyAccountPage myAccountPage;

	@BeforeMethod
	public void setUp() {
		launchBrowser();
		softAssert = new SoftAssert();
		homePage = new HomePage();
		accountLoginPage = new AccountLoginPage();
		homePage.clickLoginLink();
		accountLoginPage.login("harinder@gmail.com", "Password1");
	}

	@Test
	public void validateOrderHistory() {
		OrderHistoryPage orderHistoryPage = myAccountPage.clickOrderHistoryLink();
		

		
	}

	@AfterMethod
	public void teardown() {
		quitBrowser();
	}
}
