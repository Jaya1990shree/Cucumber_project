package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adaactin.configuration.FileManagerReader;
import com.adaactin.configuration.PageObjectModel;
import com.adactin.baseclass.Baseclass;
import com.adactin.runner.Runner;
import com.pomfile.org.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition extends Baseclass {
	
	public static WebDriver driver=Runner.driver;
	public  PageObjectModel pom=new PageObjectModel(driver);
	
	
	@Given("^User launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
		
		geturl(FileManagerReader.getFileReader().getConfig().getUrl());

	}

	@When("^User enter the user name \"([^\"]*)\"$")
	public void user_enter_the_user_name(String arg1) throws Throwable {
		
		inputValueElement(pom.getLp().getUsername(), arg1);
	}

	@When("^User enter the password \"([^\"]*)\"$")
	public void user_enter_the_password(String arg1) throws Throwable {
		inputValueElement(pom.getLp().getPwd(), arg1);
	}

	@Then("^click the login Button$")
	public void click_the_login_Button() throws Throwable {
		
		elementOnClick(pom.getLp().getLoginbtn());
	}


	
				}
