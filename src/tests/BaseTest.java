package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.log4j.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utils.ReadDataFromExcel;


public class BaseTest {
	
    WebDriver driver;
    Logger log;
    ReadDataFromExcel objReadExcel;
    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    ExtentTest eTest;
    	
	@BeforeClass
	public void tearUp() {
		
		log = Logger.getLogger(BaseTest.class);
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		log.info("Browser opened, window maximised.");
		objReadExcel = new ReadDataFromExcel();
		
		htmlReporter = new ExtentHtmlReporter("C:\\Eclipse_Selenium_Workspace\\Automation_UI\\ExtentReportResults.html");
	
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	
		htmlReporter.config().setChartVisibilityOnOpen(true);
	    htmlReporter.config().setDocumentTitle("Extent Report Demo");
	    htmlReporter.config().setReportName("Test Report");
	    htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	    htmlReporter.config().setTheme(Theme.STANDARD);
	    htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		
	}
	
	
	@AfterClass
	public void tearDown() {
		
		driver.close();
		extent.flush();
	}
}
