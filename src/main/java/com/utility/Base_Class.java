package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	
	public static ConfigData_Provider config;
	public static  WebDriver driver;
	public static ExcelData_provider excel;
	
	@BeforeSuite
	public void BS() throws Exception {
			config=new ConfigData_Provider();
			 excel=new ExcelData_provider();
			 
	}
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
	
		//driver.get("https://investmentnewqa.policybazaar.com/");	
       driver.get(config.get_url1());
		driver.manage().window().maximize();
		
		}
	@AfterMethod
	public void TearDown() {	
		//driver.close();
		
		
		
		
	}

}
