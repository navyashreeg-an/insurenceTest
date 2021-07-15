package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Home {
	
	WebDriver driver;
	
	public Home(WebDriver driver) {
		this.driver = driver;
	}
   public void CalculatePremium() {	
	   
	//Request Quotation Page
	driver.findElement(By.linkText("Request Quotation")).click();


	//Radio button as yes
	driver.findElement(By.id("quotation_windscreenrepair_t")).click();
	
	
	//estimated value
	driver.findElement(By.id("quotation_vehicle_attributes_value")).sendKeys("1000");

	//Parking location as Public
	Select select = new Select(driver.findElement(By.id("quotation_vehicle_attributes_parkinglocation"))); 
	select.selectByIndex(3);

	// Calculate Premium
	driver.findElement(By.xpath("//input[@value='Calculate Premium']")).click();
	

}
   
   public boolean RequestQuotationTabPresent() {
	   WebElement request = driver.findElement(By.xpath("//*[@id='tabs-2']/h2"));
	   return request.isDisplayed();
   }
   public boolean RadioButtonSelected() {
	   WebElement radio = driver.findElement(By.id("quotation_windscreenrepair_t"));
	   return radio.isSelected();
   }
   
   public boolean EstimatedValueEntered() {
	   WebElement estimated = driver.findElement(By.id("calculatedpremium"));
	   return estimated.isDisplayed();
   }
   
   public boolean ParkingPublicPlaceSelected() {
	   WebElement parking = driver.findElement(By.xpath("//*[@id='quotation_vehicle_attributes_parkinglocation']/option[4]"));
	   return parking.isSelected();
   }
   
   public boolean CalculatedPremiumDisplayed() {
	   WebElement Calcpr = driver.findElement(By.id("calculatedpremium"));
	   return Calcpr.isDisplayed();
   }
   
}