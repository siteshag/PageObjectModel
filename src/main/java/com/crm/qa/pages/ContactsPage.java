package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath = "//td[contains(text(),'Contacts')]")
	WebElement contactsLabel;
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	@FindBy(xpath ="//*[@class='ui active visible fluid search selection upward dropdown' ]")
	WebElement company;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Save']")
	WebElement saveBtn;
	
	
	
	@FindBy(xpath = "//*[@class='ui linkedin button' and text()='New']")
	WebElement NewBtn;
	
	// Initializing the Page Objects:
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyContactsLabel(){
		return contactsLabel.isDisplayed();
	}
	
	
	public void selectContactsByName(String name){
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']"
				+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
	}
	
	
	public void createNewContact(String title, String ftName, String ltName, String comp){
		/*
		 * Select select = new Select(driver.findElement(By.name("title")));
		 * select.selectByVisibleText(title);
		 */
		
		NewBtn.click();
		
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		company.sendKeys(comp);
		//saveBtn.click();
		
	}
	
	
	

}
