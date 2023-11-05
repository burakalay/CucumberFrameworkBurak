package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;



public class DashboardSteps extends CommonMethods {

	@Then("I want to validate the items on the menu")
	public void ı_want_to_validate_the_items_on_the_menu(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   
		List<String> expectedList = dataTable.asList();
		List<String> actualList = new ArrayList<>();
		
		click(dashboard.moreMenuItem);
		
		wait(2);
		
		for(WebElement el: dashboard.menuList ) {
			
			actualList.add(el.getText());
			}
		System.out.println("Actual List: " + actualList);
		
		Assert.assertEquals(expectedList, actualList);
	}
	
	
}
