package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.MacBookProPage;
 
 
 
public class PageObjectManager {
 
	private WebDriver driver; 
	
	private HomePage homePage;
	
	private MacBookProPage macBookProPage;
	
	public PageObjectManager(WebDriver driver) {
 
		this.driver = driver;
 
	}
 
	
 
	public HomePage getHomePage(){
 
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
 
	}
	
	public MacBookProPage getMacBookProPage(){
		 
		return (macBookProPage == null) ? macBookProPage = new MacBookProPage(driver) : macBookProPage;
 
	}
	
}
