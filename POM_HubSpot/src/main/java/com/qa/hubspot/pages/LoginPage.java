package com.qa.hubspot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	// 1.define your PageObjects
	// 2.define Page actions/methods
	// page objects : with page factory and without page factory

	@FindBy(id = "username")
	WebElement emailId;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "loginBtn")
	WebElement loginButton;

	@FindBy(linkText = "sign up")
	WebElement signUpLink;

	// create the constructor of this page class :
	public LoginPage(WebDriver driver) {

		this.driver = driver;
		// PageFactory.initElements(driver, LoginPage.class); (........or..........)
		PageFactory.initElements(driver, this);
	}

	// define page actions/methods :
	public String getLoginPageTitle() {

		return driver.getTitle();
	}

	public boolean verifySignupLink() {

		return signUpLink.isDisplayed();

	}

	public void doLogin(String username, String pwd) {
		emailId.sendKeys(username);
		password.sendKeys(pwd);
		loginButton.click();
	}

}
