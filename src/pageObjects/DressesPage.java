package pageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressesPage extends BasePage {

	//*[@id="block_top_menu"]/ul/li[2]/a
	
	
	@FindBy (xpath ="//*[@id='center_column']/div[1]/div/div/span")
	WebElement leftDresscolumn;
	
	public DressesPage(WebDriver driver) throws Exception {
		
		super(driver);
	}
	
	
	public String getDressTitle(){
		
		return leftDresscolumn.getText();
	}
	
	
	
}
