package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page.Loginpage;
import Page.Logoutpage;

public class LogoutTest {

	@Test
	public void LogoutTst() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ANUP\\OneDrive\\Desktop\\selinium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/insurance/v1/index.php");
	driver.manage().window().maximize();
	
	Loginpage loginpage = new Loginpage(driver);
	loginpage.login();
	
	Logoutpage logoutpage = new Logoutpage(driver);
	logoutpage.logout();
	
	//login button present
	Assert.assertTrue(logoutpage.LogInDisplayed());
	
	//page title
	String title = driver.getTitle();
	Assert.assertEquals(title,"Insurance Broker System - Login");
	
	//page URL
	String currentURL =driver.getCurrentUrl();
	Assert.assertEquals(currentURL,"http://demo.guru99.com/insurance/v1/index.php");
}
}
