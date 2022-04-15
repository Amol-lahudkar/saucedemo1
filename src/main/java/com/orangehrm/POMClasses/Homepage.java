package com.orangehrm.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Homepage {
	private WebDriver driver;
	private Actions act;
	private Select s;
	@FindBy(xpath="//b[normalize-space()='Admin']")
	private WebElement admin;
	@FindBy(xpath="//input[@id='searchSystemUser_userName']")
	private WebElement user;
	@FindBy(xpath="//select[@name='searchSystemUser[userType]']")
	 WebElement dropdown;
	public void  senduser()
	{user.sendKeys("adash");}
	public void dropdown()
	{dropdown.click();
	s = new Select(dropdown);}
	
	
	
	

}
