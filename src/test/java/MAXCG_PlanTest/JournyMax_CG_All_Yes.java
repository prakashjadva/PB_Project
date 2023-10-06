package MAXCG_PlanTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.utility.Base_Class;
import com.utility.Library;

import MAX_CG_pagefactory.Journy;

public class JournyMax_CG_All_Yes extends Base_Class {
	
	
	
	public static WebDriverWait wait;

	@Test
	public static void journymaxtest_All_yes() throws Exception {
		Payment_Test_Max.payment();
		Thread.sleep(2000);
		
		
//Basic info

		Journy jour=PageFactory.initElements(driver, Journy.class);
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ddlAddressProof\"]")));
			
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"ddlAddressProof\"]"));
		Select sal=new Select(ele);
		sal.selectByValue("Passport");
		
		Thread.sleep(2000);
		
		Library.custom_Sendkeys(jour.getIDNO(), excel.getstringdata("Max_CG", 0, 10), "proof");
		
		Thread.sleep(2000);
		Library.custom_click(jour.getExpiryDate(), "ExDate");
		
		Thread.sleep(2000);
		Library.custom_click(jour.getExpiryDateselected(), "ExDateSelected");
		Thread.sleep(2000);
		Library.custom_click(jour.getButton6(), "Button6");
		
//Family info
		Thread.sleep(2000);
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ddlMaritalStatus\"]")));
		
		WebElement ele1 =driver.findElement(By.xpath("//*[@id=\"ddlMaritalStatus\"]"));
		Select sal1=new Select(ele1);
		sal1.selectByValue("1");                  
		Thread.sleep(2000);
		Library.custom_Sendkeys(jour.getFatherName(), excel.getstringdata("Max_CG", 0, 11), "Fahtername");
		Thread.sleep(2000);
		Library.custom_Sendkeys(jour.getFatherLasttName(), excel.getstringdata("Max_CG", 0, 12), "FLastName");
		Thread.sleep(2000);
		Library.custom_Sendkeys(jour.getMotherName(), excel.getstringdata("Max_CG", 0, 13), "MotherN");
		Thread.sleep(2000);
		Library.custom_Sendkeys(jour.getMotherLastName(), excel.getstringdata("Max_CG", 0, 14), "MotherLName");
		Thread.sleep(2000);
		Library.custom_click(jour.getButton7(), "Button7");
		Thread.sleep(2000);
		
		//Personal info
//Contact
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"txtMailingAddress\"]")));
		
		driver.findElement(By.xpath("//*[@id=\"txtMailingAddress\"]")).sendKeys("Savkhed");
		
		//Library.custom_Sendkeys(jour.getFlateName(), excel.getstringdata("Sheet1", 1, 0), "Fname");
		Thread.sleep(2000);
		Library.custom_Sendkeys(jour.getRoadName(), excel.getstringdata("Max_CG", 2, 0), "Rname");
		Thread.sleep(2000);
		Library.custom_Sendkeys(jour.getLandMark(), excel.getstringdata("Max_CG", 3, 0), "Lmark");
		Thread.sleep(2000);
		Library.custom_click(jour.getButton8(), "Button8");
		Thread.sleep(2000);
		
//Education & Occupation
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ddlOccupation\"]")));
		
		WebElement occu=driver.findElement(By.xpath("//*[@id=\"ddlOccupation\"]"));
		Select sel2=new Select(occu);
		sel2.selectByValue("13");
		
	/*	wait=new WebDriverWait(driver,Duration.ofSeconds(25));
		
	      boolean txtOrganisationName = driver.findElement(By.id("txtOrganisationName")).isDisplayed();
	      boolean organisationSearch = driver.findElement(By.id("organisationSearch")).isDisplayed();
	      
	      if (organisationSearch) {
	    	  Thread.sleep(1000);
		  		wait.until(ExpectedConditions.elementToBeClickable(By.id("organisationSearch")));
	    	    driver.findElement(By.id("organisationSearch")).click();
	    	    driver.findElement(By.id("organisationSearch")).sendKeys("3i Group");
	    	    System.out.println("organisationSearch");
	      }else if (txtOrganisationName) {
	    	  Thread.sleep(1000);
	  		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtOrganisationName")));
	  	    driver.findElement(By.id("txtOrganisationName")).sendKeys("3i Group");
	  	    System.out.println("txtOrganisationName");
	      }else {
	    	  System.out.println("not found");
	      }
*/
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"txtOrganisationName\"]")));
	
		WebElement NameOfOrg=driver.findElement(By.xpath("//*[@id=\"txtOrganisationName\"]"));
        NameOfOrg.click();
        WebElement SelectOrg=driver.findElement(By.xpath("//*[@id=\"ulOrganisationName\"]/li[1171]/a"));
        SelectOrg.click();
       
		Thread.sleep(2000);
		WebElement orgtype=driver.findElement(By.xpath("//*[@id=\"ddlOrganisationType\"]"));
		Select sel3=new Select(orgtype);
		sel3.selectByValue("01");
		
		Thread.sleep(2000);
		Library.custom_Sendkeys(jour.getN_ofduty(), excel.getstringdata("Max_CG", 5, 0), "Nature_of_Duty");
		
		Thread.sleep(2000);
		WebElement Designnation=driver.findElement(By.xpath("//*[@id=\"ddlDesignation\"]"));
		Select sel4=new Select(Designnation);
		sel4.selectByValue("189");
		Thread.sleep(2000);
		WebElement Education=driver.findElement(By.xpath("//*[@id=\"ddlEducation\"]"));
		Select sel5=new Select(Education);
		sel5.selectByValue("2");
		Thread.sleep(2000);
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,150)", "");
		
		
	WebElement bu=	driver.findElement(By.xpath("//*[@id=\"divPEPQuestion\"]/div[2]/div/label[2]/span/span"));
		Actions actions = new Actions(driver); 
		actions.moveToElement(bu).click().build().perform();
		
		
		Thread.sleep(2000);
		WebElement ocupaindustry=driver.findElement(By.xpath("//*[@id=\"ddlIndustryType\"]"));
		Select sel6=new Select(ocupaindustry);
		sel6.selectByValue("6");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"txtOtherIndustryType\"]")).sendKeys("Other");
		Thread.sleep(2000);
		
		Library.custom_click(jour.getButton9(), "Button9");
		Thread.sleep(2000);
		
		
//Nominee page	
		
		Library.custom_Sendkeys(jour.getNominee_F_Name(), excel.getstringdata("Max_CG", 7, 0), "Nominee_F_Name");
		Thread.sleep(2000);
		
		Library.custom_Sendkeys(jour.getNominee_M_Name(), excel.getstringdata("Max_CG", 8, 0), "Nominee_M_Name");
		Thread.sleep(2000);
		
		Library.custom_Sendkeys(jour.getNominee_L_Name(), excel.getstringdata("Max_CG", 9, 0), "Nominee_L_Name");
		Thread.sleep(2000);
		
		
		WebElement Relation=driver.findElement(By.xpath("//*[@id=\"ddlRelationship1\"]"));
		Select sel7=new Select(Relation);
		sel7.selectByValue("1");
		Thread.sleep(2000);
		
		WebElement DD=driver.findElement(By.xpath("//*[@id=\"ddlNomineeDay1\"]"));
		Select sel8=new Select(DD);
		sel8.selectByValue("6");
		Thread.sleep(2000);
		
		WebElement MM=driver.findElement(By.xpath("//*[@id=\"ddlNomineeMonth1\"]"));
		Select sel9=new Select(MM);
		sel9.selectByValue("2");
		Thread.sleep(2000);
		
		WebElement YY=driver.findElement(By.xpath("//*[@id=\"ddlNomineeYear1\"]"));
		Select sel0=new Select(YY);
		sel0.selectByValue("1976");
		Thread.sleep(2000);
		
		Library.custom_Sendkeys(jour.getPercentage(), excel.getstringdata("Max_CG", 10, 0), "Percentage");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"btnNextProceed\"]")).click();
		//Library.custom_click(jour.getButton10(), "Button10");
		Thread.sleep(2000);
		
//General info	
	
		
		Select ft=new Select(jour.getFeet());
		ft.selectByValue("6");
		 Thread.sleep(3000);
		 
		 Select inch=new Select(jour.getInch());
			inch.selectByValue("5");
			 Thread.sleep(3000);
			 
		 Library.custom_Sendkeys(jour.getWeight(), excel.getstringdata("Max_CG", 13, 1), "Weight");
				Thread.sleep(2000);
		
		
		Library.custom_click(jour.getQuestion1(), "Q1");
		
		Select country=new Select(jour.getCountry());
		country.selectByValue("4");
		Thread.sleep(2000);
		Library.custom_Sendkeys(jour.getCity(), excel.getstringdata("Max_CG", 14, 1), "City");
		Thread.sleep(2000);
		Library.custom_Sendkeys(jour.getDuration(), excel.getstringdata("Max_CG", 15, 1), "Duration");
		
		Select purpose=new Select(jour.getPurpose());
		purpose.selectByValue("Meeting");
		Thread.sleep(2000);
		
		JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("window.scrollBy(0,150)", "");
		
		

}}
