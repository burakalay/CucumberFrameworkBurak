package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods {
	
	@FindBy(id = "account-name")
	public WebElement accountName;
	
	
	@FindBy(xpath="//*[@id=\"menu_pim_viewPimModule\"]/a/span[2]")
	public WebElement pim;
	
	@FindBy(linkText = "Add Employee")
	public WebElement addEmployeeLink;

	@FindBy(id = "menu_pim_viewEmployeeList")
	public WebElement employeeList;
	
	@FindBy(id = "account-job")
	public WebElement accountMenu;
	
	
	@FindBy(xpath = "//li[@id='menu_news_More']/a")
	public WebElement moreMenuItem;
	
	
	@FindBy(xpath = "//div[@id='menu-content']/ul/li")
	public List<WebElement> menuList;	
	
	
	
	@FindBy(id = "logoutLink")
	public WebElement logout;
	
	public DashboardPageElements() {
		PageFactory.initElements(driver, this);
	}

}