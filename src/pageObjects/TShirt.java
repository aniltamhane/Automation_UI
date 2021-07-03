package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TShirt extends BasePage{

	public TShirt(WebDriver driver) {
		
		super(driver);
		
	}
		
	@FindBy(xpath ="//div[@class='right-block']//span[@class='price product-price']")
	WebElement tShirtPrice;
	
	public double getTshirtPrice(){
		
		return objStringUtils.getDoubleFromString(getTextFromElement(tShirtPrice));
		
	}
	
	
}
