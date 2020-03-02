package com.pomfile.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	
	
	@FindBy (name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(name="login")
	private WebElement loginbtn;

	public LoginPage(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
}