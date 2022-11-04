package com.amul.SeliniumP;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amul.base.Base;

public class FaceBookLoginPage extends Base {
// WebDriver driver;
	@FindBy(xpath = "//input[@name='email']")
	WebElement userNameWE;

	@FindBy(xpath = "//input[@name='pass']")
	WebElement passwordWE;

	@FindBy(xpath = "//button[@name='login']")
	WebElement loginBtnWE;

	public FaceBookLoginPage() {
		PageFactory.initElements(driver, this);
	}

	// PageFactory.initElements(this,driver);
	public HomePage loginVerification() {
		userNameWE.sendKeys(userName);
		passwordWE.sendKeys(password);
		loginBtnWE.click();

		return new HomePage();
	}

}
