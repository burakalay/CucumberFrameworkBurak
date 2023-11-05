package com.neotech.steps;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchEmloyeeSteps extends CommonMethods {
	
	@Given("user is logged in with valid credentials")
	public void user_is_logged_in_with_valid_credentials() {
	    
		login.login();
		
		
	}

	@Then("employee information is displayed")
	public void employee_information_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Yes i see it!");
		wait(5);
	}
	
	
	@And("user navigates to employee list page")
	public void user_navigates_to_employee_list_page() {
	    // Write code here that turns the phrase above into concrete actions
		click(dashboard.pim);
		click(dashboard.employeeList);
	}
	
	@When("user enters valid employee first and last name")
	public void user_enters_valid_employee_first_and_last_name() {
	    // Write code here that turns the phrase above into concrete actions
		sendText(employeeList.searchBox, "Brody Alan");
		wait(3);
	}
	
	@And("clicks on search button")
	public void clicks_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		click(employeeList.searchIcon);
	}


	
	@When("user enters valid employee id")
	public void user_enters_valid_employee_id() {
	    // Write code here that turns the phrase above into concrete actions
		sendText(employeeList.searchBox, "1000");
		wait(5);
	}







}
