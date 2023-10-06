package Max_Smart_Flexi_protect_Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.utility.Base_Class;
import com.utility.Library;

import MAX_CG_pagefactory.Pre_Quote_MAX;

public class a01_prequote_Test extends Base_Class {
	
	
	public static WebDriverWait wait;
	@Test
	public static void preq_01() throws Exception {
		
		Pre_Quote_MAX name1=PageFactory.initElements(driver, Pre_Quote_MAX.class);
		Library.custom_Sendkeys(name1.getName(), excel.getstringdata("Max_SFP", 1, 2),"Name");
		Library.custom_Sendkeys(name1.getMono(), excel.getstringdata("Max_SFP", 2, 2),"Mono");
		Library.custom_Sendkeys(name1.getMail1(), excel.getstringdata("Max_SFP", 3, 2),"Mail");
	
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='View Plans']")));
		Library.custom_click(name1.getbutton1(), "button1");	
		
} 
	}



