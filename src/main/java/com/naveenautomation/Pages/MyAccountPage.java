package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;

public class MyAccountPage extends TestBase {
	Actions action = new Actions(driver);

	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#content h2:first-of-type")
	WebElement myAccountText;
	
	@FindBy(css = "div.list-group a:nth-of-type(2)")
	WebElement editAccountLink;
	
	@FindBy(css = "#content ul:first-of-type li:first-of-type a")
	WebElement editAccountInformation;
	
	@FindBy(css = "ul.nav.navbar-nav li.dropdown:nth-of-type(2) a.dropdown-toggle")
	WebElement laptopAndNotebooksHoverButton;

	@FindBy(css = "ul li.dropdown:nth-of-type(2) a.see-all")
	WebElement showAllLaptops;

	@FindBy(css = "div.list-group a:nth-of-type(4)")
	WebElement addressBookLink;

	@FindBy(css = "div.alert-success")
	WebElement telephoneChangeSuccessBanner;
	
	public String getMyAccountText() {
		return myAccountText.getText();
	}

	public MyAccountInformation clickEditAccount() {
		editAccountInformation.click();
		return new MyAccountInformation();
	}

	public void hoverOnLaptopAndNotebooks() {
		action.moveToElement(laptopAndNotebooksHoverButton).perform();
	}

	public LaptopsAndNotebooksPage clickShowAllLaptops() {
		showAllLaptops.click();
		return new LaptopsAndNotebooksPage();
	}
	public String getTelephoneChangeSuccessMessage() {
		return telephoneChangeSuccessBanner.getText();
	}

	public AddressBookPage clickAddressBookLink() {
		addressBookLink.click();
		return new AddressBookPage();
	}

}
