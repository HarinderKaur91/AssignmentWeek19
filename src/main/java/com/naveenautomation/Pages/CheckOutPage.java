package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.naveenautomation.Base.TestBase;

public class CheckOutPage extends TestBase {
	public CheckOutPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[name='firstname']")
	WebElement fName;

	@FindBy(css = "input[name='lastname']")
	WebElement lName;

	@FindBy(css = "input[name='address_1']")
	WebElement address1;

	@FindBy(css = "input[name='city']")
	WebElement city;

	@FindBy(css = "input[name='postcode']")
	WebElement postalCode;

	@FindBy(id = "input-payment-country")
	WebElement country;

	@FindBy(id = "input-payment-zone")
	WebElement state;

	@FindBy(id = "button-payment-address")
	WebElement continueBtn;

	private void enterFirstNameField(String fname) {
		fName.sendKeys(fname);
	}

	private void enterLastNameField(String lname) {
		lName.sendKeys(lname);
	}

	private void enterAddress1(String address) {
		address1.sendKeys(address);
	}

	private void enterCity(String cityName) {
		city.sendKeys(cityName);
	}

	private void enterPostalCode(String zipCode) {
		postalCode.sendKeys(zipCode);
	}

	private void enterCountry(String countryName) {
		Select sc = new Select(country);
		sc.selectByVisibleText(countryName);
	}

	private void enterState(String stateName) {
		Select sc = new Select(state);
		sc.selectByVisibleText(stateName);	}

	private void clickContinueBtn() {
		continueBtn.click();
	}
	

	public void fillBillingDetails(String fname, String lname, String address, String cityName, String zipCode,
			String countryName, String stateName) {
		enterFirstNameField(fname);
		enterLastNameField(lname);
		enterAddress1(address);
		enterCity(cityName);
		enterPostalCode(zipCode);
		enterCountry(countryName);
		enterState(stateName);
		clickContinueBtn();
	}

}
