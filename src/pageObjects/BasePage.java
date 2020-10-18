package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	protected WebDriver driver;
	WebDriverWait wait;
	
	public BasePage (WebDriver driver){
		
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void openUrl(String url){
		
		driver.get(url);
	}
	
	public void waitForElementToBeClickable(WebElement element){
		
		wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	


}
