package org.loctr;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends BaseClass{
	
	public Locators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement emailBox;
	
	@FindBy(id="pass")
	private WebElement passwordBox;	
	
	@FindBy(name="login")
	private WebElement loginButton;
	
	@FindBy (xpath="//div[@class='_9ay7']")
	private WebElement emailError;
	
	@FindBy(xpath="//div[@class='_9ay7']")
	private WebElement  passwordError;
	
	@FindBy(xpath="//div[@class='_9lsa']")
	private WebElement passEye;

	
//  Getters

	public WebElement getPassEye() {
		return passEye;
	}

	public WebElement getEmailBox() {
		return emailBox;
	}

	public WebElement getPasswordBox() {
		return passwordBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getEmailError() {
		return emailError;
	}

	public WebElement getPasswordError() {
		return passwordError;
	}
	
	
	

}
