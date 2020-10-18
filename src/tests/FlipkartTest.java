package tests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.FlipkartHomePage;
import utils.ReadProperties;

public class FlipkartTest extends BaseTest {
	
	FlipkartHomePage objFlipkartHomePage;
	ReadProperties objReadProperties;
	
	@Test (priority = 1)
	public void openFlipkart() throws IOException, InterruptedException{
		
		objReadProperties = new ReadProperties();		
		objFlipkartHomePage = PageFactory.initElements(driver, FlipkartHomePage.class);
		
		objFlipkartHomePage.openFlipkartUrl(objReadProperties.getFlipkartUrl());
		log.info("Flipkart Url Opened.");
		Thread.sleep(15000);
	}
	
	
	@Test (enabled = false)
	public void clickElectronics() throws IOException, InterruptedException{
		
	
		objFlipkartHomePage.closePopupOnHomePage();
		log.info("Popup closed.");
		
		objFlipkartHomePage.clickElectronics();
		log.info("Clicked on Electronics option.");
		
		Thread.sleep(5000);
		
	
	}	
	


}
