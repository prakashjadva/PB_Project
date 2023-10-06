package MAXCG_PlanTest;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.utility.Base_Class;
import MAX_CG_pagefactory.Payment_MaxCG;

public class Payment_Test_Max extends Base_Class{
	public static WebDriverWait wait;
	@Test
	public static void payment() throws Exception {
		
		 MAXCG_Product_Page_Test.producttest();
		
		Thread.sleep(20000);
		
		Payment_MaxCG nb=PageFactory.initElements(driver, Payment_MaxCG.class);
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("netbanking")));
			
		//nb.getNtb().click();
		
		Thread.sleep(10000);
		nb.getBname().click();
		
		Thread.sleep(10000);
		nb.getPaynb().click();
		
		Thread.sleep(10000);
		
		nb.getSuc().click();
		Thread.sleep(20000);
	
		nb.getNetbanking().click();
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[8]/section[1]/div[2]/div[1]/div/div[5]/div/div[2]/div/div[1]/label/div/select")));
			
          Select sel=new Select(nb.getDrp()); 
		  sel.selectByValue("UTIB");
		  Thread.sleep(3000);
	
		  nb.getAccno().sendKeys("123456789");
		  Thread.sleep(200);
		  nb.getCaccno().sendKeys("123456789");
		  Thread.sleep(200);
		  nb.getIfsc().sendKeys("HDFC0003000");
		  Thread.sleep(200);
		  nb.getAcchname().sendKeys("myname");
		  Thread.sleep(200);
		  nb.getMono().sendKeys("9898989898");
		  Thread.sleep(200);
		  nb.getAUTOPAY().click();
		  Thread.sleep(2000);
		  
						  
			  
				  Thread.sleep(2000);  
		  driver.switchTo().frame(0);
		  
		 /* wait=new WebDriverWait(driver,Duration.ofSeconds(15));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"emandate-inner\"]/div/div[5]/div/select")));
			
		 WebElement drp1= driver.findElement(By.xpath("//*[@id=\"emandate-inner\"]/div/div[5]/div/select"));
		  drp1.click();
		  
		  Select select=new Select(drp1);
		  
		  select.selectByValue("savings");*/
		 
		  Thread.sleep(2000);
		  

		 
		  nb.getBUT().click();
		 
		  String parent=driver.getWindowHandle();

		  Set<String>s=driver.getWindowHandles();

		 
		  Iterator<String> I1= s.iterator();

		  while(I1.hasNext())
		  {

		  String child_window=I1.next();


		  if(!parent.equals(child_window))
		  {
		  driver.switchTo().window(child_window);

		  System.out.println(driver.switchTo().window(child_window).getTitle());
		  
		  
		  wait=new WebDriverWait(driver,Duration.ofSeconds(15));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/button[1]")));
		  
		  driver.findElement(By.xpath("/html/body/form/button[1]")).click();
		  
		  Thread.sleep(2000);
		  }
		  
		  }
		  driver.switchTo().window(parent);
		  
		  wait=new WebDriverWait(driver,Duration.ofSeconds(15));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/div[2]/div/div[2]/div[2]/input[1]")));
		  
		  driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/div[2]/div/div[2]/div[2]/input[1]")).click();
		//*[@id="MainContent_btnSubmit"]
 }
}




