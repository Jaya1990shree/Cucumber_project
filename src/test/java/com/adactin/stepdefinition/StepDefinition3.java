package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adaactin.configuration.PageObjectModel;
import com.adactin.baseclass.Baseclass;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition3 extends Baseclass{
	public static WebDriver driver=Runner.driver;
	public static PageObjectModel pom=new PageObjectModel(driver);
	
	/*@Before
	public void beforeHooks1(Scenario scenario) {
		System.out.println("Name: "+scenario.getName());
	}
	
	@After
	public void afterHooks1(Scenario scenario) {
		System.out.println("Status: "+scenario.getStatus());
	}
	*/
	
	@When("^User enter the Firstname,last name and billing address$")
	public void user_enter_the_Firstname_last_name_and_billing_address() {
		
		inputValueElement(pom.getHb().getFname(), "Raja");
		inputValueElement(pom.getHb().getLname(), "Kumar");
		inputValueElement(pom.getHb().getAddress(), "plot no 1/34 Maheshwari street,Padmaathy road, medavakkam");
	}

	@When("^User enter the  Credit Card the detail$")
	public void user_enter_the_Credit_Card_the_detail() {
		
		inputValueElement(pom.getHb().getCardno(), "1234567887654321");
		selectOption(pom.getHb().getCardtype(), "Visibletext", "VISA");
		selectOption(pom.getHb().getExpirymonth(), "Visibletext", "March");
		selectOption(pom.getHb().getExpyear(), "Visibletext", "2022");
		inputValueElement(pom.getHb().getCvno(), "456");
		
	}

	@Then("^User click the Book now button to confirm the booking$")
	public void user_click_the_Book_now_button_to_confirm_the_booking() {
		elementClick(pom.getHb().getBooknow());
	}



}
