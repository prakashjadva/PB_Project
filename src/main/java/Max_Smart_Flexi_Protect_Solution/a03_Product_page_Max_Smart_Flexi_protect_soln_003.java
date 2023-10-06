


package Max_Smart_Flexi_Protect_Solution;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class a03_Product_page_Max_Smart_Flexi_protect_soln_003 {
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"DOB\"]")
	private WebElement Dob;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"btnsaveProceed\"]")
	private WebElement Button1;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"Email\"]")
	private WebElement Email;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"Occupation\"]")
	private WebElement Occupation;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"Education\"]")
	private WebElement Education;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"AnnualIncome\"]")
	private WebElement Annual_income;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"btnsaveProceed\"]")
	private WebElement Button2;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"NatureOfDuty\"]")
	private WebElement Nature_of_Duty;
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"Pincode\"]")
	private WebElement pincode;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"City\"]")
	private WebElement city;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"PANCard\"]")
	private WebElement pan_no;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"HeightInFeet\"]")
	private WebElement Height_Feet;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"HeightInInch\"]")
	private WebElement Height_inches;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"Weight\"]")
	private WebElement Wt_kg;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"btnsaveProceed\"]")
	private WebElement Button_pincode_page;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"btnsaveProceed\"]")
	private WebElement Button_Review_Details;
	
	
	
	
	
	
	
	
	
	public WebElement getDob() {
		return Dob;
	}

	public WebElement getButton1() {
		return Button1;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getOccupation() {
		return Occupation;
	}

	public WebElement getEducation() {
		return Education;
	}

	public WebElement getAnnual_income() {
		return Annual_income;
	}

	public WebElement getButton2() {
		return Button2;
	}

	public WebElement getNature_of_Duty() {
		return Nature_of_Duty;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getPan_no() {
		return pan_no;
	}

	public WebElement getHeight_Feet() {
		return Height_Feet;
	}

	public WebElement getHeight_inches() {
		return Height_inches;
	}

	public WebElement getWt_kg() {
		return Wt_kg;
	}

	public WebElement getButton_pincode_page() {
		return Button_pincode_page;
	}
	
}
