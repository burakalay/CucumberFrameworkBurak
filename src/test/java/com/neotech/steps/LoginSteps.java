package com.neotech.steps;

import java.util.List;
import java.util.Map;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods{

	



	@When("I enter a valid username")
	public void i_enter_a_valid_username() {
		sendText(login.username, ConfigsReader.getProperty("username"));
	}

	@When("I enter a valid password")
	public void i_enter_a_valid_password() {
		sendText(login.password, ConfigsReader.getProperty("password"));
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		click(login.loginButton);
	}

	@Then("I validate that I am logged in")
	public void i_validate_that_i_am_logged_in() {
		String expected = "Jacqueline White";
		String actual = dashboard.accountName.getText();
		
		if(actual.equals(expected))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test failed");
		}
	
	}
	
	@When("user enters login info {string} and {string}")
	public void user_enters_login_info_and(String username, String password) {
	    System.out.println("User enters username: "+username+" and password: "+password);
	}
	@When("I click on login button")
	public void ı_click_on_login_button() {
	    System.out.println("User clicks the login button");
	}
	@Then("Welcome {string} message is displayed")
	public void welcome_message_is_displayed(String firstname) {
	  System.out.println("User logged in, welcome! "+firstname);
	}

	
	@When("user enters username and password and clicks on login")
	public void user_enters_username_and_password_and_clicks_on_login(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	  
		List<Map<String, String>> listOfMap = dataTable.asMaps();
		
		for(Map map: listOfMap) {
			
			System.out.println(map);
			System.out.println("User enters username: "+map.get("username")+ " and password "+ map.get("password"));
			
		}
	
		
		
	}
	
	
}
