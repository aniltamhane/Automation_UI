package pageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage {

	
	@FindBy (xpath ="//*[@id='block_top_menu']/ul/li[3]/a")
	WebElement tShirtTab;
	
	public MyAccount(WebDriver driver) throws Exception {
		
		super(driver);
	}
	
	
	
	public void clickTshirt(){
		
		tShirtTab.click();
		
	}

}
