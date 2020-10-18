package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipkartHomePage extends BasePage {
	
	@FindBy (xpath = "/html/body/div[2]/div/div/button/")
	WebElement closeHomePopUp;
	
	@FindBy (xpath = "//*[@id='container']/div/div[2]/div/div/span[1]")
	WebElement electronics;
	
		
	public FlipkartHomePage(WebDriver driver){
		
		super(driver);
		
	}
	
	public void openFlipkartUrl(String flipUrl){
		
		openUrl(flipUrl);
	}
	
	public void closePopupOnHomePage(){
		
		waitForElementToBeClickable(closeHomePopUp);
		closeHomePopUp.click();
	}
	
	public void clickElectronics(){
		
		electronics.click();
		
	}
	
 

}
