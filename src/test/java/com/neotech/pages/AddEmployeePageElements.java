package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class AddEmployeePageElements extends CommonMethods{
	
	@FindBy(xpath="//*[@id=\"menu_pim_addEmployee\"]")
	public WebElement addEmployee;
	
	@FindBy(id="first-name-box")
	public WebElement firstNameBox;
	
	@FindBy(id = "middle-name-box")
	public WebElement middleNameBox;

	@FindBy(id="last-name-box")
	public WebElement lastNameBox;
	
	@FindBy(id="employeeId")
	public WebElement employeeID;
	
	@FindBy(id="location")
	public WebElement location;
	
	@FindBy(id = "hasLoginDetails")
	public WebElement loginDetailsToggle;
	
	@FindBy(id="username")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(id="confirmPassword")
	public WebElement confirmPassword;
	
	@FindBy(id="modal-save-button")
	public WebElement saveButton;
	
	@FindBy(id="pimPersonalDetailsForm")
	public WebElement personalForm;
	
	public AddEmployeePageElements() {
		PageFactory.initElements(driver, this);
	}

}
