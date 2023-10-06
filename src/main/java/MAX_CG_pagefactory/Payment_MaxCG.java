package MAX_CG_pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Payment_MaxCG {
	
	
	@FindBy(how=How.ID,using="netbanking")
	WebElement ntb;
	
	@FindBy(how=How.ID,using="4")
	WebElement bname;
	
	@FindBy(how=How.ID,using="paynb")
	WebElement paynb;
	
    @FindBy(how=How.XPATH,using="//button[text()='Success']")
    WebElement suc;
    
    @FindBy(how=How.ID,using="netbanking")
	WebElement netbanking;
    
    @FindBy(how=How.XPATH,using="/html/body/div[8]/section[1]/div[2]/div[1]/div/div[5]/div/div[2]/div/div[1]/label/div/select")
	WebElement drp;
   
    @FindBy(how=How.ID,using="acc-number")
	WebElement accno;
    
    @FindBy(how=How.ID,using="confirm-acc-number")
	WebElement Caccno;
    
    @FindBy(how=How.ID,using="acc-ifcs-code")
	WebElement ifsc;
    
    @FindBy(how=How.ID,using="acc-holder-name")
	WebElement acchname;
    
    @FindBy(how=How.ID,using="mobile-number")
	WebElement Mono;
    
    @FindBy(how=How.XPATH,using="(//button[@class='register-autopay btn'])[1]")
	WebElement AUTOPAY;
    
    @FindBy(how=How.XPATH,using="//*[@id=\"emandate-inner\"]/div/div[5]/div/select")
    WebElement acctype;
    
    @FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div/div[3]/div[4]/form/div[4]/div")
    WebElement BUT;
    
	public WebElement getNtb() {
		return ntb;
	}
	public WebElement getBname() {
		return bname;
	}
	public WebElement getPaynb() {
		return paynb;
	}
	public WebElement getSuc() {
		return suc;
	}
	public WebElement getNetbanking() {
		return netbanking;
	}
	public WebElement getDrp() {
		return drp;
	}
	public WebElement getAccno() {
		return accno;
	}
	public void setAccno(WebElement accno) {
		this.accno = accno;
	}
	public WebElement getCaccno() {
		return Caccno;
	}
	public void setCaccno(WebElement caccno) {
		Caccno = caccno;
	}
	public WebElement getIfsc() {
		return ifsc;
	}
	public void setIfsc(WebElement ifsc) {
		this.ifsc = ifsc;
	}
	public WebElement getAcchname() {
		return acchname;
	}
	public WebElement getMono() {
		return Mono;
	}
	public WebElement getAUTOPAY() {
		return AUTOPAY;
	}	
   public WebElement getacctype() {
   return acctype;
   }
			
  public WebElement getBUT() {
 return BUT;
			}
		
		
	}
   



