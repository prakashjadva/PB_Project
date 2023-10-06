package Max_Smart_Flexi_protect_Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.utility.Base_Class;
import com.utility.Library;


import Max_Smart_Flexi_Protect_Solution.a02Quote_002;

public class a02_Quote_Test extends Base_Class {

	public static WebDriverWait wait;
	@Test
	public static void Quate_page1() throws Exception {
		a01_prequote_Test.preq_01();
		a02Quote_002  button2=PageFactory.initElements(driver, a02Quote_002  .class);
		

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
				wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_20333")));
			
			}
		
		Library.custom_click(button2.getbutton2(),"getbutton2");
		Thread.sleep(2000);
		WebElement ele=driver.switchTo().activeElement();
		ele.click();
	//	wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Proceed']")));
		Thread.sleep(15);
		Library.custom_click(button2.getbutton4(),"getbutton4");
		Thread.sleep(15);
		
	}
		
	}

