package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import pageObjects.HomePage;
import utility.Log;

public class HomePageSteps {
		
	TestContext testContext;
	WebDriver driver;
	HomePage homePage;
	
	public HomePageSteps(TestContext context) {
		testContext = context;
		driver = testContext.getWebDriverManager().getDriver();
		homePage = testContext.getPageObjectManager().getHomePage();
	}
	
	@Given("^I go to the website$")
	public void goToWebsite(){
		Log.startTestCase("Go to the Apple website");
		homePage.navigateTo_HomePage();	
		
	}
 
	

}
