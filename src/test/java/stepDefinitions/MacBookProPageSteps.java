package stepDefinitions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cucumber.TestContext;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.MacBookProPage;
import utility.Log;

public class MacBookProPageSteps {
		
	TestContext testContext;
	MacBookProPage macBookProPage;
	
	public MacBookProPageSteps(TestContext context) {
		testContext = context;
		macBookProPage = testContext.getPageObjectManager().getMacBookProPage();
	}
	
	@When("^I choose a MacBook Pro with the following features and accessories$")
	public void chooseMacBookProWithSelectedFeaturesAndAccessories(DataTable data) throws Throwable {
				
		Thread.sleep(2000);
		macBookProPage.selectMacLink();
		Log.info("Navigated to the Mac page selecting Mac link");		
		
		macBookProPage.selectMacBookProLink();
		Log.info("Navigated to the Mac Book Pro page selecting MacBookPro link");		
		
		macBookProPage.selectBuyMacBookPro();
		Log.info("Navigated to the Buy MacBookPro screen clicking Buy button");
		
		// code to handle Data Table
		List<Map<String,String>> specificationsDataList = data.asMaps();
		
		HashMap<String,String> specificationsData=new HashMap<>();
		for(int i=0;i<specificationsDataList.size();i++)
		{
		   specificationsData.put(specificationsDataList.get(i).get("Option"),specificationsDataList.get(i).get("Specification"));
		}


		Log.info("Select Screen Size as 15 inches");
		macBookProPage.selectMacBookProByScreen(specificationsData.get("Screen")); 
		
		macBookProPage.scrollDown1000();
		
		Log.info("Select Colour as Silver");
		macBookProPage.selectMacBookProByColour(specificationsData.get("Colour"));	
		
		Log.info("Select Processor as 2.9GHz");
		macBookProPage.selectMacBookProByProcessor(specificationsData.get("Processor"));				
		
		macBookProPage.scrollDown2000();
		
		Log.info("Select Software as Logic Pro");
		macBookProPage.selectMacBookProBySoftware(specificationsData.get("Software"));
		
		macBookProPage.clickAddToBag();
	
		Log.info("Select Accessory 'Display Adapter'");
		macBookProPage.addDisplayAdapterAccessory(specificationsData.get("Display Adapter"));
		
		
	}
	
	@Then("^I can place an order for it$")
	public void placeOrder() throws Throwable {
		macBookProPage.clickReviewBag();
	}
	
	
	@Given("^when I choose the following items:$")
	public void when_I_choose_the_following_items(DataTable data) throws Throwable {
		
		macBookProPage.navigateToWebsite();
		
		// code to handle Data Table
		List<Map<String,String>> priceList = data.asMaps();
		
		HashMap<String,String> priceData=new HashMap<>();
		for(int i=0;i<priceList.size();i++)
		{
		   priceData.put(priceList.get(i).get("Option"),priceList.get(i).get("Price in £"));
		}
		Thread.sleep(2000);
		macBookProPage.selectMacBookProByPrice(priceData.get("MacBook Pro"));
		macBookProPage.scrollDown2000();
		
		macBookProPage.selectMacBookProSoftwareByPrice(priceData.get("Logic Pro X"));
		
		macBookProPage.clickAddToBag();
		
		macBookProPage.selectMacBookProAccessoryByPrice(priceData.get("Display adapter"));			
	}

	@When("^I proceed to the checkout$")
	public void I_proceed_to_the_checkout() throws Throwable {
		macBookProPage.clickReviewBag();
	}

	@Then("^a total price of £(\\d+).(\\d+) will be displayed$")
	public void a_total_price_of_£_will_be_displayed(int arg1, int arg2) throws Throwable {
		macBookProPage.totalPriceDisplayed(String.valueOf(arg1)+"."+String.valueOf(arg2));
	}

	@Then("^£(\\d+).(\\d+) will be listed for VAT.$")
	public void £_will_be_listed_for_VAT(int arg1, int arg2) throws Throwable {
		macBookProPage.vatPriceDisplayed(String.valueOf(arg1)+"."+String.valueOf(arg2));
	}

	
	

	


}
