package MAX_CG_pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MAX_CG_Product_page {
	
	@FindBy(how=How.XPATH,using="//span[@class='checkmark'][1]")
	private WebElement Gender1;
	
	@FindBy(how=How.XPATH,using="//input[@id='DOB']")
	private WebElement Dob;
	
	@FindBy(how=How.XPATH,using="//input[@type='email']")
	private WebElement Email;
	
	@FindBy(how=How.XPATH,using="//input[@id='Mobile']")
	private WebElement Mobile;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"AnnualIncome\"]")
	private WebElement Annualincome;
	
    @FindBy(how=How.XPATH,using="//*[@id=\"pageNumber1\"]/div[1]/div/label[1]/span") 
	private WebElement Gender;
    
    @FindBy(how=How.XPATH,using="//*[@id=\"BasicSumAssured\"]")
	private WebElement InvestmentAmount;
    
    @FindBy(how=How.XPATH,using="//*[@id=\"PolicyTerm\"]")
	private WebElement PolicyTerm;
    
    @FindBy(how=How.XPATH,using="//*[@id=\"ModeOfPremium\"]")
	private WebElement ModeofPremium;
    
    @FindBy(how=How.XPATH,using="//*[@id=\"productForm\"]/section[2]/div[1]/div/div[1]/div[2]/div[7]/div/div/div/div[3]/button")
	private WebElement Button1;
  //*[@id="productForm"]/section[2]/div[1]/div/div[1]/div[2]/div[7]/div/div/div/div[3]/button
    @FindBy(how=How.XPATH,using="//input[@name='Pincode']")
	private WebElement Pincode;
	
    @FindBy(how=How.ID,using="City")
	private WebElement SearchCity;
    
	@FindBy(how=How.XPATH,using="//a[text()='ABDASA (GUJARAT)']")
	private WebElement City;
    
    @FindBy(how=How.XPATH,using="//*[@id=\"PANCard\"]")
	private WebElement Pancard;
    
    @FindBy(how=How.XPATH,using="//*[@id=\"productForm\"]/section[2]/div[1]/div/div[1]/div[2]/div[7]/div/div/div/div[3]/button")
  	private WebElement Button2;
 
    @FindBy(how=How.XPATH,using="//*[@id=\"paymentModeForm\"]/div[2]/div[2]/div/div/div[2]/button")
   	private WebElement Button3;
    
    @FindBy(how=How.XPATH,using="//*[@id=\"paymentModeForm\"]/div[2]/div[2]/div/div/div/div[2]/button")
   	private WebElement Button4;
    
  
    
  //*[@id="paymentModeForm"]/div/div[3]/div/div/div[2]/button
  
	public WebElement getDob() {
		return Dob;
	}

	public WebElement getGender1() {
		return Gender1;
	}
	public WebElement getEmail() {
		return Email;
	}

	public WebElement getMobile() {
		return Mobile;
	}

	public WebElement getAnnualincome() {
		return Annualincome;
	}

	public WebElement getGender() {
		return Gender;
	}

	public WebElement getInvestmentAmount() {
		return InvestmentAmount;
	}

	public WebElement getPolicyTerm() {
		return PolicyTerm;
	}

	public WebElement getModeofPremium() {
		return ModeofPremium;
	}
	public WebElement getButton1() {
		return Button1;
	}

	public WebElement getPincode() {
		return Pincode;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getPancard() {
		return Pancard;
	}
	public WebElement getButton2() {
		return Button2;
	}
	public WebElement getButton3() {
		return Button3;
	}
    
	public WebElement getButton4() {
		return Button4;
	}
	public WebElement getSearchcity() {
		return SearchCity;
	}

}
