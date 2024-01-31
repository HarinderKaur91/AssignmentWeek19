package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;

public class NewsletterSubscriptionPage extends TestBase {

	NewsletterSubscriptionPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[value='1']")
	WebElement subscribeYesRadioBtn;

	@FindBy(css = "input[value='0']")
	WebElement subscribeNoRadioBtn;

	@FindBy(css = "input[value='Continue']")
	WebElement continueBtn;

	public void clicksubscribeYesRadioButton() {
		if (!subscribeYesRadioBtn.isSelected()) {
			subscribeYesRadioBtn.click();
		}
	}

	public void clicksubscribeNoRadioButton() {
		if (!subscribeNoRadioBtn.isSelected()) {
			subscribeNoRadioBtn.click();
		}
	}

	public MyAccountPage clickContinueButton(String choiceForSubscription) {
		if (choiceForSubscription.equalsIgnoreCase("Yes")) {
			clicksubscribeYesRadioButton();
		}else if (choiceForSubscription.equalsIgnoreCase("No")) {
			clicksubscribeNoRadioButton();
		}
		continueBtn.submit();
		return new MyAccountPage();
	}
}
