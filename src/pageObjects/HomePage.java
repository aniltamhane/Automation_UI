package pageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{
	
		
	@FindBy (xpath ="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement SignInLink;
	
	@FindBy (id="email") 
	WebElement uname;
	
	@FindBy (id="passwd") 
	WebElement pass;
	
	@FindBy (id ="SubmitLogin")
	WebElement SignInBtn;
	
	
	public HomePage(WebDriver driver) {
		
		super(driver);
	}
	
	public void clickSignIn(){
		
		SignInLink.click();
	}
			
	public void openHomePage() throws IOException{
	
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\properties\\projectProperties.properties");
		Properties prop = new Properties();
		
		prop.load(file);
		String baseUrl = prop.getProperty("URL");	
		driver.get(baseUrl);
	}
	
	public void enterUsername (String username){
		
		uname.sendKeys(username);
		
	}
	
	public void enterPwd (String pwd){
		 	
		pass.sendKeys(pwd);
									
	}
	
	public String getPageTitle (){
		
		return driver.getTitle();
	}
	
	public void clickSignInBtn(){
		
		SignInBtn.click();
	}
}

