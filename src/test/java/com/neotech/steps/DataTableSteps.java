package com.neotech.steps;

import java.util.List;
import java.util.Map;

import com.neotech.pages.LoginPageElements;
import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableSteps extends CommonMethods{

	@When("login to the HRMS")
	public void login_to_the_hrms() {
	   
		System.out.println("Login");
		
		
	}
	@When("I want to add Employees")
	public void ı_want_to_add_employees(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		//List of Maps -- what would be the shape of this??
		//Recap - explaining what List of Maps is made of...
		/*
		 * Map<String, String> map1 = new HashMap<>(); map1.put("FN", "Omer");
		 * map1.put("MN", "Faruk"); map1.put("LN", "Turkoglu");
		 * 
		 * Map<String, String> map2 = new HashMap<>(); map2.put("FN", "Emre");
		 * map2.put("MN", ""); map2.put("LN", "Cinar");
		 * 
		 * Map<String, String> map3 = new HashMap<>(); map3.put("FN", "Cihan");
		 * map3.put("MN", "Boss"); map3.put("LN", "Abbak");
		 * 
		 * 
		 * List<Map<String, String>> lm = new ArrayList<>(); lm.add(map1); lm.add(map2);
		 * lm.add(map3);
		 */		
		
		//getting data from the incoming DataTable
		
		List<Map<String, String>> listOfMaps = dataTable.asMaps();
		
		for ( Map<String, String> map : listOfMaps)
		{
			System.out.println(map);
			System.out.println("---------------------");
			
			System.out.println("First Name: " + map.get("FirstName"));
			System.out.println("Middle Name: "+ map.get("MiddleName"));
			System.out.println("Last Name: " + map.get("LastName"));
			
		}
	}
	@Then("I validat eemployee is added")
	public void ı_validat_eemployee_is_added() {
			System.out.println("Validated Employee Added");
		}
	
	
	
}
