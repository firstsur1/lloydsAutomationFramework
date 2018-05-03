package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import managers.FileReaderManager;
import selenium.Wait;
import utility.Log;
 
public class MacBookProPage {
	WebDriver driver;
	JavascriptExecutor jse;
	Actions actions;
	
	
	public MacBookProPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
		jse = (JavascriptExecutor)driver;
		actions = new Actions(driver);
	}
	
	@FindBy(how = How.CSS, using = ".ac-gn-link.ac-gn-link-mac")
	private WebElement lnk_SelectMac;
	
	@FindBy(how = How.LINK_TEXT, using = "MacBook Pro")
	private WebElement lnk_SelectMacBookPro;	
	
	@FindBy(how = How.CSS, using = ".ac-ln-button" )
	private WebElement btn_Buy;
	
	@FindAll(@FindBy(how = How.CSS, using = ".as-filter-button"))
	private List<WebElement> allbtn_Screen;
	
	@FindAll(@FindBy(how = How.XPATH, using = ".//*[@id='configuration-form']/div/span/button"))
	private List<WebElement> allbtn_Processor;	

	@FindAll(@FindBy(how = How.NAME, using = "colorOptionGroup_MACBOOKPRO15-ultimate"))
	private List<WebElement> allrdbtn_Colour;
	
	@FindBy(how = How.XPATH, using =".//*[@id='sw_logic_pro_x_z0ue_065_c29h_2']")
	private WebElement allrdbtn_Software;
	
	@FindAll(@FindBy(how = How.CSS, using = ".as-price-currentprice>span"))	
	private List<WebElement> txt_MacBookProPrice;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='actiontray']/div/div[2]/div/div/div[2]/button")
	private WebElement btn_AddToBag;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='main']/store-provider/ajax-handler/attach/div/div[3]/accessory/div/div[4]/async-add-bag/button")
	private WebElement btn_AddToBagDisplayAdapter;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='Review Bag']")
	private WebElement btn_ReviewBag;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='cart-summary']/div/div/table/tr[9]/td[2]")
	private WebElement txt_TotalPrice;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='cart-summary']/div/div/table/tr[12]/td/span[2]")
	private WebElement txt_VatPrice;	
	
	
	//functions
	
	public void navigateToWebsite() {
		driver.get("https://www.apple.com/uk/shop/buy-mac/macbook-pro");
	}	
		
	public void selectMacLink() {
		try {
		lnk_SelectMac.click();
		} catch(NoSuchElementException e){
			Log.error("Element not found");
		}
	}
	
	public void selectMacBookProLink() {
		try {
		lnk_SelectMacBookPro.click();
		} catch(NoSuchElementException e){
			Log.error("Element not found");
		}
	}
	
	public void selectBuyMacBookPro() {
		try {
		btn_Buy.click();
		} catch(NoSuchElementException e){
			Log.error("Element not found");
		}
	}
	
	public void selectMacBookProByScreen(String screen) {
	
		try {
			for (WebElement w : allbtn_Screen)
			{
			    if (w.getText().equals(screen))
			    {
			        w.click();
			        break;
			    }	
			}
		} catch(NoSuchElementException e){
			Log.error("Element not found");
		}
	}
	
	public void selectMacBookProByProcessor(String processor) {
		try {
			for (WebElement w : allbtn_Processor)
			{
				if (w.getText().contains(processor))
			    {				
			        w.click();
			        break;
			    }	
			}
		} catch(NoSuchElementException e){
			Log.error("Element not found");
		}
	}
	
	public void selectMacBookProByColour(String colour) {
		
		try {
			for (WebElement w : allrdbtn_Colour)
			{
				if(w.getAttribute("datacolor").equals(colour)) {
		        	jse.executeScript("arguments[0].click();", w); 
		            return;
		        }
			}	
		} catch(NoSuchElementException e){
			Log.error("Element not found");
		}
	}
	
	public void selectMacBookProBySoftware(String software) {	
		try {
			allrdbtn_Software.click();
			
		} catch(NoSuchElementException e){
			Log.error("Element not found");
		}
	}
 
	public void clickAddToBag() {
		try {
			btn_AddToBag.click();		
		} catch(NoSuchElementException e){
			Log.error("Element not found");
		}
	}
	
	public void addDisplayAdapterAccessory(String s) {
	
		try {
			btn_AddToBagDisplayAdapter.click();
		} catch(NoSuchElementException e){
			Log.error("Element not found");
		}
	}
	
	public void scrollDown1000() {		 
		jse.executeScript("window.scrollBy(0,1000)", "");
	}
	
	public void scrollDown2000() {		 
		jse.executeScript("window.scrollBy(0,1500)", "");
	}
	
	public void clickReviewBag() {
		try {
			btn_ReviewBag.click();	
		} catch(NoSuchElementException e){
			Log.error("Element not found");
		}
	}	
		
	public void selectMacBookProByPrice(String price) {
		try {
			for (WebElement w : allbtn_Screen)
			{
			    if (w.getText().equals("15-inch"))
			    {
			        w.click();
			        break;
			    }	
			}
			for (WebElement w1 : allbtn_Processor)
			{
				if (w1.getText().contains("2.9GHz"))
			    {
					w1.click();
			        break;
			    }	
			}
		} catch(NoSuchElementException e){
			Log.error("Element not found");
		}
	}
	
	public void selectMacBookProSoftwareByPrice(String price) {
		try {
			allrdbtn_Software.click();
			
		} catch(NoSuchElementException e){
			Log.error("Element not found");
		}
	}
	
	public void selectMacBookProAccessoryByPrice(String price) {
		try {
			btn_AddToBagDisplayAdapter.click();
			
		} catch(NoSuchElementException e){
			Log.error("Element not found");
		}
	}
	
	public void totalPriceDisplayed(String totalPrice) {
		try {
			Assert.assertEquals(txt_TotalPrice.getText(),totalPrice);
			if (txt_TotalPrice.getText().equals(totalPrice))
			{
				Log.info("Total Price is correct");
			}
			else			
				Log.info("Total Price is incorrect");
		} catch(NoSuchElementException e){
			Log.error("Element not found");
		}
		
	}
	
	public void vatPriceDisplayed(String vatPrice) {
		try {
			if (txt_VatPrice.getText().equals(vatPrice))
			{
				Log.info("Vat Price is correct");
			}
			else			
				Log.info("Vat Price is incorrect");
		
		} catch(NoSuchElementException e){
			Log.error("Element not found");
		}
		
	}
	
	
	
	

}
