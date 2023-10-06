package MAX_CG_pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Pre_Quote_MAX {

	@FindBy(how=How.XPATH,using="//input[@id='txtCustomerName']")
		private WebElement name;
		
		
		@FindBy(how=How.XPATH,using="//input[@id='txtMobileNo']")
		private WebElement mono;
		
		
		@FindBy(how=How.XPATH,using="//input[@id='txtEmail']")
		private WebElement mail1;
		
		@FindBy(how=How.XPATH,using="//button[text()='View Plans']")
		private WebElement button1;
		
	
		public WebElement getName() {
			return name;
		}
	
		public WebElement getMono() {
			return mono;
		}
	
		public WebElement getMail1() {
			return mail1;
		}
		public WebElement getbutton1() {
			return button1;
		}
	
	
	
	

}
