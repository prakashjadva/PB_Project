package MAXCG_PlanTest;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

public class JournyMAX_Test extends Base_Class{
	public static WebDriverWait wait;

	@Test
	public static void journymaxtest() throws Exception {
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
		
		
//General 
		
		WebElement Ft=driver.findElement(By.xpath("//*[@id=\"MainContent_UCLifeStyle1_ddlHeightInFeet\"]"));
		Select sel11=new Select(Ft);
		sel11.selectByValue("5");
		Thread.sleep(2000);
		
		WebElement Inch=driver.findElement(By.xpath("//*[@id=\"MainContent_UCLifeStyle1_ddlHeightInches\"]"));
		Select sel12=new Select(Inch);
		sel12.selectByValue("3");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"MainContent_UCLifeStyle1_txtWeight\"]")).sendKeys("67");
		Thread.sleep(2000);
		
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,150)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"btnGeneral\"]")).click();
		
		
//Excisting policies
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"btnPolicyNext\"]")).click();
		
// Family History
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SectionFamilyHistory\"]/div[3]/button[2]")).click();
		
//		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"MainContent_UCLifeStyle1_Button1\"]")).click();
		Thread.sleep(2000);
		
//		
		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("window.scrollBy(0,250)", "");
		
		driver.findElement(By.xpath("//*[@id=\"stCongenitalDefect\"]/div[2]/div/label[2]/span/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"divGeneticTesting\"]/div[1]/div[2]/div/label[2]/span/span")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"stCovid19\"]/div[2]/div/label[2]/span/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"divCovidVaccine\"]/div[2]/div/label[2]/span/span")).click();
		Thread.sleep(2000);
		
		
		JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("window.scrollBy(0,150)", "");
		
		
		driver.findElement(By.xpath("//*[@id=\"txtBankAccountNo\"]")).sendKeys("9999998888");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"txtBankIFSC\"]")).sendKeys("HDFC0003000");
		Thread.sleep(2000);
		JavascriptExecutor js5=(JavascriptExecutor)driver;
		js5.executeScript("window.scrollBy(0,150)", "");
		
		driver.findElement(By.xpath("//*[@id=\"spnchkDeclaration\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
		Thread.sleep(10000);
		
// OTP Page	
		driver.findElement(By.xpath("//*[@id=\"txtOTP\"]")).sendKeys("1234");
		
		driver.findElement(By.xpath("//*[@id=\"divCustomerVerification\"]/div[1]/button")).click();
		
		Thread.sleep(20000);
		
//Doc upload		
		WebElement chooseFile = driver.findElement(By.id("fileUpload"));
		chooseFile.sendKeys("C:/Users/prakashjadav/Downloads/test.pdf");
		Thread.sleep(2000);

		WebElement doc=driver.findElement(By.xpath("//select[@class='ddlDocTypeList floating-select docTypeCode_4 sharedDoc empty']"));
		Select sel13=new Select(doc);
		sel13.selectByVisibleText("Aadhar/Uuid Card");
		Thread.sleep(2000);
		System.out.println("Done");
		

		JavascriptExecutor js6=(JavascriptExecutor)driver;
		js6.executeScript("window.scrollBy(0,150)", "");
		
		Thread.sleep(2000);
		WebElement chooseFile1 = driver.findElement(By.xpath("//input[@class='docFileUpload incomeProofDoc fileCtrl_4'][1]"));
		chooseFile1.sendKeys("C:/Users/prakashjadav/Downloads/test1.pdf");
		Thread.sleep(2000);
		WebElement chooseFile2 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div/div/div[3]/section/div[5]/div[2]/div[3]/div[1]/div[2]/div/input"));
		chooseFile2.sendKeys("C:/Users/prakashjadav/Downloads/test.pdf");
		
		
		WebElement doc4=driver.findElement(By.xpath("//select[@class='ddlDocTypeList floating-select docTypeCode_3 sharedDoc empty valid']"));
		Select sel14=new Select(doc4);
		sel14.selectByVisibleText("PAN Card");
		Thread.sleep(2000);
	
		
		WebElement chooseFile3 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div/div/div[3]/section/div[5]/div[3]/div[3]/div[1]/div[1]/div/input"));
		chooseFile3.sendKeys("C:/Users/prakashjadav/Downloads/test1.pdf");
		
		System.out.println("Doc uploaded");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"lnkDocumentUpload\"]")).click();
		
		Thread.sleep(2000);
		System.out.println("Thanks");
	
		
	}
	
}
