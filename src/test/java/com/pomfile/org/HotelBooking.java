package com.pomfile.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBooking {
	
	public static WebDriver driver;
	
	@FindBy(name="first_name")
	private WebElement Fname;
	
	@FindBy(name="last_name")
	private WebElement lname;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(name="cc_num")
	private WebElement cardno;
	
	@FindBy(name="cc_type")
	private WebElement cardtype;
	
	@FindBy(name="cc_exp_month")
	private WebElement expirymonth;
	
	
	@FindBy(name="cc_exp_year")
	private WebElement expyear;
	
	@FindBy(name="cc_cvv")
	private WebElement cvno;
	
	
	@FindBy(id="book_now")
	private WebElement booknow;

	public HotelBooking(WebDriver ndriver) {
		
		this.driver=ndriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFname() {
		return Fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvno() {
		return cvno;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	

}
