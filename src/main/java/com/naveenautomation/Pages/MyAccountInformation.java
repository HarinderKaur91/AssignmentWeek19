package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;

public class MyAccountInformation extends TestBase {

	public MyAccountInformation() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#input-firstname")
	WebElement firstName;

	@FindBy(css = "#input-lastname")
	WebElement lastName;

	@FindBy(css = "#input-email")
	WebElement email;

	@FindBy(css = "#input-telephone")
	WebElement telephone;

	@FindBy(css = "input[value='Continue']")
	WebElement continueBtn;

	public MyAccountPage updateTelephone(String mobile) {
		telephone.clear();
		telephone.sendKeys(mobile);
		System.out.println(telephone.getText());
		continueBtn.submit();
		return new MyAccountPage();
	}

	public String getTextFromFirstName() {
		return firstName.getAttribute("value");
	}

	public String getTextFromLastName() {
		return lastName.getAttribute("value");
	}

	public String getTextFromEmail() {
		return email.getAttribute("value");
	}

	public String getTextFromTelephone() {
		return telephone.getAttribute("value");
	}
}
