package MAXCG_PlanTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.utility.Base_Class;
import com.utility.Library;

import MAX_CG_pagefactory.MAX_CG_Product_page;


public class MAXCG_Product_Page_Test extends Base_Class{
	public static WebDriverWait wait;
	@Test
	public static void producttest() throws Exception {
		Quote_Test_Max.Quate_page();
		
		
		MAX_CG_Product_page elements=PageFactory.initElements(driver, MAX_CG_Product_page.class);
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='checkmark'][1]")));
		
		
		Library.custom_click(elements.getGender1(), "Gender1");
		Library.custom_Sendkeys(elements.getEmail(), excel.getstringdata("Max_CG", 0, 3), "Email");
		elements.getDob().clear();
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='DOB']")));
		
		
		Library.custom_Sendkeys(elements.getDob(), excel.getstringdata("Max_CG", 0, 4), "DOB");
		Library.custom_Sendkeys(elements.getAnnualincome(), excel.getstringdata("Max_CG", 0, 5), "Annualincome");
		//elements.getMobile().clear();
		
	//	wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='Mobile']")));
		
		//Library.custom_Sendkeys(elements.getMobile(), excel.getstringdata("Max_CG", 0, 6), "Mobile");
		Library.custom_click(elements.getButton1(), "Button1");
		Library.custom_click(elements.getButton1(), "Button1");
		Library.custom_Sendkeys(elements.getPincode(), excel.getstringdata("Max_CG", 0, 7), "pincode");
		
		
			//wait=new WebDriverWait(driver,Duration.ofSeconds(15));
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='City']")));
					
WebElement Element =driver.findElement(By.xpath("/html/body/form/section[2]/div/div/div[1]/div[2]/div[4]/div[1]/div[2]/div[2]/div/input"));
Element.click();
driver.findElement(By.xpath("/html/body/form/div[5]/div[2]/div[1]/div/ul/li[1]/a")).click();
		Library.custom_Sendkeys(elements.getPancard(), excel.getstringdata("Max_CG", 0, 9), "pancard");
	    Library.custom_click(elements.getButton2(), "Button2");
	    Library.custom_click(elements.getButton3(), "Button3");
	    Library.custom_click(elements.getButton3(), "Button3");
	    
	   
		JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("window.scrollBy(0,150)", "");
		
	    driver.findElement(By.xpath("//*[@id=\"divDeclaration\"]/label/span[1]")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath(" //*[@id=\"paymentModeForm\"]/div[2]/div[2]/div/div/div[2]/button")).click();
	    //Library.custom_click(elements.getButton4(), "Button4");
	    
		
		
	
		
		
		
		
		
		
		
		
		
	}
 

}
