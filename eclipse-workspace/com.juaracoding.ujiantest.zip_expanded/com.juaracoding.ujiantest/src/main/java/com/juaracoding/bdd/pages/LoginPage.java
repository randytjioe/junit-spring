package com.juaracoding.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.bdd.driver.DriverSingleton;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement btn_sign_in;
	
	@FindBy(id="email")
	private WebElement input_email_login;
	
	@FindBy(id="passwd")
	private WebElement input_password_login;
	
	@FindBy(id="SubmitLogin")
	private WebElement btn_submit_login;
	
	@FindBy(css="#center_column > p")
	private WebElement textLogin;
	

	public WebElement getBtn_sign_in() {
		return btn_sign_in;
	}

	public void setBtn_sign_in(WebElement btn_sign_in) {
		this.btn_sign_in = btn_sign_in;
	}

	public WebElement getInput_email_login() {
		return input_email_login;
	}

	public void setInput_email_login(WebElement input_email_login) {
		this.input_email_login = input_email_login;
	}

	public WebElement getInput_password_login() {
		return input_password_login;
	}

	public void setInput_password_login(WebElement input_password_login) {
		this.input_password_login = input_password_login;
	}

	public WebElement getBtn_submit_login() {
		return btn_submit_login;
	}

	public void setBtn_submit_login(WebElement btn_submit_login) {
		this.btn_submit_login = btn_submit_login;
	}

	public WebElement getTextLogin() {
		return textLogin;
	}

	public void setTextLogin(WebElement textLogin) {
		this.textLogin = textLogin;
	}

}
