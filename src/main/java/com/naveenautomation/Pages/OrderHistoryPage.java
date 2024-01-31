package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;

public class OrderHistoryPage extends TestBase{
	public  OrderHistoryPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#input-firstname")
	WebElement firstName;

}
