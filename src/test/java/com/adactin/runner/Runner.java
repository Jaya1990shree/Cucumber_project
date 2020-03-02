package com.adactin.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.adaactin.configuration.FileManagerReader;
import com.adactin.baseclass.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature", 
	glue="com\\adactin\\stepdefinition",plugin="html:Report", dryRun=false,
	    strict=true,monochrome=true)

public class Runner {
	
	public static WebDriver driver;
	 
	@BeforeClass
	public static void setup() throws Throwable {
		driver=Baseclass.getdriver(FileManagerReader.getFileReader().getConfig().getBrowser());

	}

}
