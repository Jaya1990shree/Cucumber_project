package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adaactin.configuration.PageObjectModel;
import com.adactin.baseclass.Baseclass;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition1 extends Baseclass {
	
	public static WebDriver driver=Runner.driver;
	public static PageObjectModel pom=new PageObjectModel(driver);
	
	

@Given("^User launch the application$")
	public void user_launch_the_application() {
		System.out.println("User launch the application");
	}


@Given("^User login the application$")

	public void user_login_the_application() {
		System.out.println("User login the application");

	}
@When("^User select the location by using dropdown$")
	public void user_select_the_location_by_using_dropdown() {
		
	selectOption(pom.getSh().getLocation(), "Visibletext", "New York");
		
	}

@When("^User select the hotel by using dropdown$")
	public void user_select_the_hotel_by_using_dropdown() {
		
		selectOption(pom.getSh().getHotels(), "Visibletext", "Hotel Sunshine");
	}
@When("^User select the roomtype by using dropdown$")
	public void user_select_the_roomtype_by_using_dropdown() {
		
		selectOption(pom.getSh().getRoomtype(), "Visibletext", "Double");
	}

@When("^User select the Number of room by using dropdown$")
	public void user_select_the_Number_of_room_by_using_dropdown() {
		
		selectOption(pom.getSh().getRoomno(), "ByValue", "3");
	}

@When("^User enter the check in date$")
	public void user_enter_the_check_in_date() {
		pom.getSh().getCheckin().clear();
		inputValueElement(pom.getSh().getCheckin(), "26/02/2020");
	}

@When("^User enter the Check out date$")
	public void user_enter_the_Check_out_date() {
		
		pom.getSh().getCheckout().clear();
		inputValueElement(pom.getSh().getCheckout(), "03/03/2020");
	}
@When("^User Select Adultsper roon by using drop down$")
	public void user_Select_Adultsper_roon_by_using_drop_down() {
		
		selectOption(pom.getSh().getAdultroom(), "ByValue", "4");
	}
@When("^User Select number of childern in room using drop down$")
	public void user_Select_number_of_childern_in_room_using_drop_down() {
		selectOption(pom.getSh().getChildroom(), "ByValue", "2");
	}

@Then("^User click the searchButton for search$")
	public void user_click_the_searchButton_for_search() {
		
		elementClick(pom.getSh().getSubmit());
	}
	
	
@Then("^user Click the radio button to confirm booking$")
	public void user_Click_the_radio_button_to_confirm_booking() {
		
		pom.getSh().getRadiobtn().click();
	}

@Then("^User click the continue Button to proceed the hotel booking$")
	public void user_click_the_continue_Button_to_proceed_the_hotel_booking() {
		
		elementClick(pom.getSh().getContinuebtn());
	}


	 
	


}
