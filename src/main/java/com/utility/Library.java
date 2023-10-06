package com.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	static ExtentTest test;
	
	public static void custom_Sendkeys(WebElement element,String value, String fieldname) {
		try {
		element.sendKeys(value);
		test.log(Status.PASS,fieldname +"==Value Succesfully send=="+value);
		}
		catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
			//System.out.println(e.getMessage());
		
		}
		
	}
	public static void custom_click(WebElement element,String fieldname) {
		try {
		element.click();
		test.log(Status.PASS, "Succesfully cliked=="+fieldname);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
			
			//System.out.println(e.getMessage());
			
		}
	}
	
   public static void custom_dropdown(WebElement element,String text) {
	
	try {
	Select sel=new Select(element);
	sel.selectByVisibleText(text);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
}
   public static void custom_clear(WebElement element,String fieldname) {
		
		try {
		Select sel=new Select(element);
		sel.selectByVisibleText(fieldname);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	
	

   }
   }
