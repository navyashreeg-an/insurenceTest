package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page.Loginpage;


public class LoginTest {
	
	@Test
	public void logTest() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ANUP\\OneDrive\\Desktop\\selinium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/insurance/v1/index.php");
	driver.manage().window().maximize();
	
	Loginpage loginpage = new Loginpage(driver);
	loginpage.login();
	
	//logout button present
	Assert.assertTrue(loginpage.LogOutDisplayed());
	
	//Title
	String title = driver.getTitle();
	Assert.assertEquals(title,"Insurance Broker System");
	
	//URL
	String currentURL =driver.getCurrentUrl();
	Assert.assertEquals(currentURL,"http://demo.guru99.com/insurance/v1/header.php");
	
	//Broker insurance Webpage text is present
	Assert.assertTrue(loginpage.TextDisplayed());
	}
}
	
