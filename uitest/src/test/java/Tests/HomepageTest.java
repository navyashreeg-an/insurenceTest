package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page.Home;
import Page.Loginpage;

public class HomepageTest {

	@Test
	public void requestQuoteTest() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ANUP\\OneDrive\\Desktop\\selinium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/insurance/v1/index.php");
	driver.manage().window().maximize();
	
	Loginpage loginpage = new Loginpage(driver);
	loginpage.login();
	
	Home homepg = new Home(driver);
	homepg.CalculatePremium();
	
	//logout  button is present
	Assert.assertTrue(loginpage.LogOutDisplayed());
	
	//Request quotation tab is present
	Assert.assertTrue(homepg.RequestQuotationTabPresent());
	
	//Radio button selected
	Assert.assertTrue(homepg.RadioButtonSelected());
	
	//Estimated value is entered
	Assert.assertNotNull(homepg.EstimatedValueEntered());
	
	//Public Place Parking yes selected
	Assert.assertTrue(homepg.ParkingPublicPlaceSelected());
	
	//calculated premium is not null
	Assert.assertNotNull(homepg.CalculatedPremiumDisplayed());
	
	
	
	driver.quit();
	}


}
