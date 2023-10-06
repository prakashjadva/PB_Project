package MAXCG_PlanTest;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import com.utility.Base_Class;
import com.utility.Library;

import MAX_CG_pagefactory.Pre_Quote_MAX;

public class Pre_Quote_Test_Max extends Base_Class {

	public static WebDriverWait wait;
	@Test
	public static void preq() throws Exception {
		
		Pre_Quote_MAX name1=PageFactory.initElements(driver, Pre_Quote_MAX.class);
		Library.custom_Sendkeys(name1.getName(), excel.getstringdata("Max_CG", 0, 0),"Name");
		Library.custom_Sendkeys(name1.getMono(), excel.getstringdata("Max_CG", 0, 1),"Mono");
		Library.custom_Sendkeys(name1.getMail1(), excel.getstringdata("Max_CG", 0, 2),"Mail");
	
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='View Plans']")));
		Library.custom_click(name1.getbutton1(), "button1");	
		
} 
	}
