package com.adaactin.configuration;

import org.openqa.selenium.WebDriver;

import com.pomfile.org.HotelBooking;
import com.pomfile.org.LoginPage;
import com.pomfile.org.SearchHotel;

public class PageObjectModel {
	
	public static WebDriver driver;
	
	private LoginPage lp;
	private HotelBooking hb;
	private SearchHotel sh;
	
	
	public PageObjectModel(WebDriver mdriver) {
		
		this.driver=mdriver;
		
	}
	
	
	public LoginPage getLp() {
		lp=new LoginPage(driver);
		return lp;
	}
	public HotelBooking getHb() {
		hb=new HotelBooking(driver);
		return hb;
	}
	public SearchHotel getSh() {
		sh=new SearchHotel(driver);
		return sh;
	}

}
