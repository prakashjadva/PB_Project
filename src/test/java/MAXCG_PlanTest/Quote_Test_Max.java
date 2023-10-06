package MAXCG_PlanTest;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.utility.Base_Class;
import com.utility.Library;

import MAX_CG_pagefactory.Quote_Max;


public class Quote_Test_Max extends Base_Class{
	
	public static WebDriverWait wait;
	@Test
	public static void Quate_page() throws Exception {
		Pre_Quote_Test_Max.preq();
		Quote_Max  button2=PageFactory.initElements(driver, Quote_Max .class);
		
	/*	 wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/ngb-modal-window/div/div/app-quote-initial-popup/div/div[1]/div[2]/div[1]")));
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-quote-initial-popup/div/div[1]/div[2]/div[1]")).click();
		 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"txtCity\"]")).sendKeys("Gurgaon");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-quote-initial-popup/div/div[1]/div[2]/div[2]/ul/li")).click();
	*/
		
		 //Thread.sleep(10000);
		
	/*	wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"txtCustomerAge\"]")));
		driver.findElement(By.xpath("//*[@id=\"txtCustomerAge\"]")).sendKeys("45");
		
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-retirement-questions/div/div/div[1]/div/div[3]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"txtCity\"]")).sendKeys("Gurgaon");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-retirement-questions/div/div/div[2]/div/div[2]/ul/li")).click();
		*/
	
		
		boolean he = false;
		if (he) {
				 wait=new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/ngb-modal-window/div/div/app-quote-initial-popup/div/div[1]/div[2]/div[1]")));
			WebElement he1=driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-quote-initial-popup/div/div[1]/div[2]/div[1]"));
			he1.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"txtCity\"]")).sendKeys("Gurgaon");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-quote-initial-popup/div/div[1]/div[2]/div[2]/ul/li")).click();
		
			} else {

				wait=new WebDriverWait(driver,Duration.ofSeconds(20));
				wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_314")));
			
			}
		
	
		
		//wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_314")));
	
		Library.custom_click(button2.getbutton2(),"getbutton2");
		Thread.sleep(2000);
		WebElement ele=driver.switchTo().activeElement();
		ele.click();
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Proceed']")));
		
		Library.custom_click(button2.getbutton4(),"getbutton4");
		
		
	}
		
	}





