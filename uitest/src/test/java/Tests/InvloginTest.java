package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page.Invloginpg;



public class InvloginTest {
	@Test
	public void logTest() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ANUP\\OneDrive\\Desktop\\selinium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/insurance/v1/index.php");
	driver.manage().window().maximize();
	
	Invloginpg inv = new Invloginpg (driver);
	inv.Invlogin();
	
	//login button present 
	Assert.assertTrue(inv.LogInDisplayed());
	
	//error message is displayed
	Assert.assertTrue(inv.ErrorMessageDisplayed());
	}
}