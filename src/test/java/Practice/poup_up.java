package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class poup_up {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://investmentnewqa.policybazaar.com/quote?enquiryId=NDE1NzYwMQ%253D%253D&leadId=NDQzNTkzMDU%253D&IsMatrixLeadCreated=true&enquiryKey=MjhqAu8w%252bG%252b4LqfkGFNHNw%253d%253d&leadKey=Kw8gbzniJCBn6hQRXh%252bHbA%253d%253d&planType=1&sateid=1&sateins=");
		driver.manage().window().maximize();
		
		Thread.sleep(20000);
		
		//driver.switchTo().window("ChildWindow");
	
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-quote-initial-popup/div/div[1]/div[2]/div[1]")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id=\"txtCity\"]")).sendKeys("Gurgaon");
		
		
		Thread.sleep(20000);
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-quote-initial-popup/div/div[1]/div[2]/div[2]/ul/li")).click();

	}

}
