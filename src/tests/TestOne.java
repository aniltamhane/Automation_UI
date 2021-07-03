package tests;

import java.io.IOException;

import pageObjects.DressesPage;
import pageObjects.HomePage;
import pageObjects.MyAccount;
import pageObjects.TShirt;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestOne extends BaseTest {
	
	HomePage objHome;
	MyAccount objMyacc;
	DressesPage objDresses;
	TShirt objTshirt;
	
	
	@Test(priority=1)
	public void TCOne() throws IOException{
		
		objHome = PageFactory.initElements(driver, HomePage.class);
		eTest = extent.createTest("Test One");
		
		objHome.openHomePage(objReadProperties.getUrl());
		objHome.clickSignIn();
		log.info("Login Page title is:" + objHome.getPageTitle());
		
		eTest.pass("Ext. Login Page title is:" + objHome.getPageTitle());
		Assert.assertEquals(objHome.getPageTitle(), "Login - My Store");
		
	
		//Enter UserName
		objHome.enterUsername(objReadExcel.getValuefromTestData(1,"UserName"));
		log.info("Username entered: " + objReadExcel.getValuefromTestData(1,"UserName"));
		eTest.info("Ext. Username entered: " + objReadExcel.getValuefromTestData(1,"UserName"));
		
		//Enter Password
		objHome.enterPwd(objReadExcel.getValuefromTestData(1,"Password"));
		log.info("Password entered: " + objReadExcel.getValuefromTestData(1,"Password"));
		eTest.info("Ext. Password entered: " + objReadExcel.getValuefromTestData(1,"Password"));
		
		//Click Sign In button
		objHome.clickSignInBtn();
		log.info("Sign In button clicked.");
		log.info("Home Page title is:" + objHome.getPageTitle());
		eTest.info("Ext. User logged in. Home Page title is:" + objHome.getPageTitle());
		
		Assert.assertEquals(objHome.getPageTitle(), "My account - My Store");
	
	}

	
	@Test(priority=2)
	public void TCTwo() throws IOException{
		
		objMyacc = PageFactory.initElements(driver, MyAccount.class);
		
		eTest = extent.createTest("Test Two");
		objMyacc.clickTshirt();
		log.info("Page title for T-Shirt is:" + objHome.getPageTitle());
		String pageTitle = "T-shirts - My Store";
		
		//Assert.assertEquals(objHome.getPageTitle(), "T-shirts - My Store");
		if (pageTitle.equals(objHome.getPageTitle())){
			
			eTest.info("Page title for T-Shirt is:" + objHome.getPageTitle() + "Test Pass");
		
		}
		else{
			
			eTest.fail("Page title for T-Shirt don't match.");
			
			
		}
	}  
	
	
	@Test(priority=3)
	public void TCThree() throws IOException{
		
		objDresses = PageFactory.initElements(driver, DressesPage.class);
		
		eTest = extent.createTest("Test Three");
		
		
		System.out.println(objDresses.getDressTitle()); 
		
		objMyacc.clickTshirt();
		log.info("Page title for T-Shirt is:" + objHome.getPageTitle());
		String pageTitle = "T-shirts - My Store";
		
		//Assert.assertEquals(objHome.getPageTitle(), "T-shirts - My Store");
		if (pageTitle.equals(objHome.getPageTitle())){
			
			eTest.info("Page title for T-Shirt is:" + objHome.getPageTitle() + "Test Pass");
		
		}
		else{
			
			eTest.fail("Page title for T-Shirt don't match.");
			
		} 
	}  

	@Test(priority=4)
	public void TCFour_TShirts (){
		
		objTshirt = PageFactory.initElements(driver, TShirt.class);
		
		eTest = extent.createTest("Test Four");
		log.info("T-Shirt Price is:" + objTshirt.getTshirtPrice());
		
	}
}
