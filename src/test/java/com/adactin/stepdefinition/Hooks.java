package com.adactin.stepdefinition;

import com.adactin.baseclass.Baseclass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends Baseclass{

	@Before
	public void beforeHooks(Scenario scenario) { 
		
		System.out.println("Name: "+scenario.getName());
	}
	
	@After
	public void afterHooks(Scenario scenario) throws Throwable {
		System.out.println("Status:"+ scenario.getStatus());
		
		if (scenario.isFailed()) {
			getscreenshot("C:\\Users\\prath\\eclipse-workspace\\Cucumberproject1\\Screenshot\\"+scenario.getName()+".png");
		}
	}
}
