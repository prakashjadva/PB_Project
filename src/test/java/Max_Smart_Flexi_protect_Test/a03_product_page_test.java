package Max_Smart_Flexi_protect_Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.utility.Base_Class;
import com.utility.Library;

import Max_Smart_Flexi_Protect_Solution.a03_Product_page_Max_Smart_Flexi_protect_soln_003;

public class a03_product_page_test extends Base_Class {
	public static WebDriverWait wait;
	
	@Test
	public static void product_test1() throws Exception{
		a02_Quote_Test.Quate_page1() ;
		
		a03_Product_page_Max_Smart_Flexi_protect_soln_003 product_page=	PageFactory.initElements(driver, a03_Product_page_Max_Smart_Flexi_protect_soln_003.class);
		
		Thread.sleep(2000);
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"DOB\"]")));
		
		driver.findElement(By.xpath("//*[@id=\"DOB\"]")).clear();
	    Library.custom_Sendkeys(product_page.getDob(), excel.getstringdata("Max_SFP", 5, 2), "Dob");
	   
	    JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("window.scrollBy(0,150)", "");
		driver.findElement(By.xpath("//*[@id=\"Mobile\"]")).click();
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"btnsaveProceed\"]")));
	
		Library.custom_click(product_page.getButton1(), "Button1");
		
		Library.custom_Sendkeys(product_page.getEmail(), excel.getstringdata("Max_SFP", 6, 2), "Email");
		Library.custom_click(product_page.getOccupation(), "Occupation");
		Select select=new Select(product_page.getOccupation());
		select.selectByValue("13");
		
		Library.custom_click(product_page.getEducation(), "Education");
		Select select1=new Select(product_page.getEducation());
		select1.selectByValue("2");
		
		Library.custom_click(product_page.getNature_of_Duty(), "Nature_of_duty");
		Select select2=new Select(product_page.getNature_of_Duty());
		select2.selectByValue("642");
		
		Library.custom_Sendkeys(product_page.getAnnual_income(), excel.getstringdata("Max_SFP", 7, 2), "Annual_Income");
		
		Library.custom_click(product_page.getButton2(), "Button2");
		Library.custom_click(product_page.getButton2(), "Button2");
		
		
		Library.custom_Sendkeys(product_page.getPincode(), excel.getstringdata("Max_SFP", 8, 2), "Pin_Code");
		Library.custom_Sendkeys(product_page.getCity(), excel.getstringdata("Max_SFP", 9, 2), "City");
		Library.custom_Sendkeys(product_page.getPan_no(), excel.getstringdata("Max_SFP", 10, 2), "Pan_No");
		Thread.sleep(1000);
		Library.custom_click(product_page.getHeight_Feet(), "Ht_Feet");
		Select select4=new Select(product_page.getHeight_Feet());
		select4.selectByValue("5");
		
		Thread.sleep(1000);
		Library.custom_click(product_page.getHeight_inches(), "Ht_inches");
		Select select5=new Select(product_page.getHeight_inches());
		select5.selectByValue("2");
		
		driver.findElement(By.xpath("//*[@id=\"Weight\"]")).sendKeys("60");
		//Library.custom_Sendkeys(product_page.getWt_kg(), excel.getstringdata("Max_SFP", 11, 2), "Wt_kg");
		
		Library.custom_click(product_page.getButton_pincode_page(), "button");

		System.out.println("Prakash");

	
		
	}

}
