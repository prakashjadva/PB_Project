package MAX_CG_pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Journy {
	
	//Basic info
	
	@FindBy(how=How.XPATH,using="//*[@id=\"ddlAddressProof\"]")
	 private WebElement proofofadd;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"txtAddressProofIdNo\"]")
	 private WebElement IDNO;
	
	@FindBy(how=How.XPATH,using="//input[@id='txtIDExpiryDate']")
	 private WebElement ExpiryDate;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a")
	 private WebElement ExpiryDateselected;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"pnlBasic\"]/div[3]/button[2]")
	 private WebElement Button6;
	
	//Family info
	
	@FindBy(how=How.XPATH,using="//*[@id=\"ddlMaritalStatus\"]")
	 private WebElement MaritalStatus;
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"txtFatherFirstName\"]")
	 private WebElement FatherName;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"txtFatherLastName\"]")
	 private WebElement FatherLasttName;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"txtMotherFirstName\"]")
	 private WebElement MotherName;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"txtMotherLastName\"]")
	 private WebElement MotherLastName;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"secPerFamilyInfo\"]/div[3]/button[2]")
	 private WebElement Button7;
	
	//Personal info
//Contact***
	
	@FindBy(how=How.XPATH,using="//*[@id=\"txtMailingAddress")
	 private WebElement FlateName;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"txtMailingAddress2\"]")
	 private WebElement RoadName;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"txtMailingAddress3\"]")
	 private WebElement LandMark;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"secPerContactInfo\"]/div[3]/button[2]")
	 private WebElement Button8;
	
	
	//Education & Occupation
	
	@FindBy(how=How.XPATH,using="//*[@id=\"txtOrganisationName\"]")
	 private WebElement Organizationname;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"txtNatureOfDuties\"]")
	 private WebElement N_ofduty;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"divPEPQuestion\"]/div[2]/div/label[2]/span/span")
	 private WebElement Que;
	@FindBy(how=How.XPATH,using="//*[@id=\"txtOtherIndustryType\"]")
	 private WebElement Other_industry_Type;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"secPerEducationInfo\"]/div[3]/button[2]")
	 private WebElement Button9;
	
	
//Nominee page
	
	@FindBy(how=How.XPATH,using="//*[@id=\"txtNomineeFirstName1\"]")
	 private WebElement Nominee_F_Name;
	@FindBy(how=How.XPATH,using="//*[@id=\"txtNomineeMiddleName1\"]")
	 private WebElement Nominee_M_Name;
	@FindBy(how=How.XPATH,using="//*[@id=\"txtNomineeLastName1\"]")
	 private WebElement Nominee_L_Name;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"txtPercentageEntitlement1\"]")
	 private WebElement Percentage;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"btnNextProceed")
	 private WebElement Button10;

// General info
	
	@FindBy(how=How.XPATH,using="//*[@id=\"MainContent_UCLifeStyle1_ddlHeightInFeet\"]")
	 private WebElement Feet;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"MainContent_UCLifeStyle1_ddlHeightInches\"]")
	 private WebElement Inch;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"MainContent_UCLifeStyle1_txtWeight\"]")
	 private WebElement Weight;
	

	@FindBy(how=How.XPATH,using="//*[@id=\"QuesTravel\"]/div[1]/div[2]/div/label[1]/span/span")
	 private WebElement Question1;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"MainContent_UCLifeStyle1_ddlTravelCountry\"]")
	 private WebElement Country;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"MainContent_UCLifeStyle1_txtTravelCity")
	 private WebElement City;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"MainContent_UCLifeStyle1_txtTravelDurationInWeeks\"]")
	 private WebElement Duration;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"MainContent_UCLifeStyle1_ddlTravelPurpose\"]")
	 private WebElement Purpose;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"divAdventrous\"]/div[1]/div[2]/div/label[1]/span/span")
	 private WebElement Question2;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"MainContent_UCLifeStyle1_ddlhazardousActivities\"]")
	 private WebElement sub;
	
	
	
	public WebElement getProofofadd() {
		return proofofadd;
	}

	public WebElement getIDNO() {
		return IDNO;
	}

	public WebElement getExpiryDate() {
		return ExpiryDate;
	}

	public WebElement getExpiryDateselected() {
		return ExpiryDateselected;
	}

	public WebElement getButton7() {
		return Button7;
	}


	public WebElement getMaritalStatus() {
		return MaritalStatus;
	}




	public WebElement getFatherName() {
		return FatherName;
	}

	public WebElement getFatherLasttName() {
		return FatherLasttName;
	}

	public WebElement getMotherName() {
		return MotherName;
	}

	public WebElement getMotherLastName() {
		return MotherLastName;
	}

	public WebElement getButton6() {
		return Button6;
	}

	public WebElement getFlateName() {
		return FlateName;
	}

	public WebElement getRoadName() {
		return RoadName;
	}

	public WebElement getLandMark() {
		return LandMark;
	}

	public WebElement getButton8() {
		return Button8;
	}

	public WebElement getOrganizationname() {
		return Organizationname;
	}

	public WebElement getN_ofduty() {
		return N_ofduty;
	}

	public WebElement getQue() {
		return Que;
	}

	public WebElement getOther_industry_Type() {
		return Other_industry_Type;
	}

	public WebElement getButton9() {
		return Button9;
	}

	public WebElement getNominee_F_Name() {
		return Nominee_F_Name;
	}

	public WebElement getNominee_M_Name() {
		return Nominee_M_Name;
	}

	public WebElement getNominee_L_Name() {
		return Nominee_L_Name;
	}

	public WebElement getPercentage() {
		return Percentage;
	}

	public WebElement getButton10() {
		return Button10;
	}

	public WebElement getFeet() {
		return Feet;
	}

	public WebElement getInch() {
		return Inch;
	}

	public WebElement getWeight() {
		return Weight;
	}

	public WebElement getQuestion1() {
		return Question1;
	}

	public WebElement getCountry() {
		return Country;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getDuration() {
		return Duration;
	}

	public WebElement getPurpose() {
		return Purpose;
	}
	

}
