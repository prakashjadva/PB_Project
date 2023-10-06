package Max_Smart_Flexi_Protect_Solution;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class a02Quote_002 {
	
	
public static WebDriverWait driver;
	
	@FindBy(how=How.ID,using="btn_20333")
	private WebElement button2;
	
	@FindBy(how=How.XPATH,using="//button[text()='Proceed']")
	private WebElement button4;
	
	public WebElement getbutton2() {
		return button2;
	}

	public WebElement getbutton4() {
		return button4;
	}

	


}


