package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Loginpage {
	
	WebDriver driver;
	
	public Loginpage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void login() {


	driver.findElement(By.id("email")).sendKeys("navyashree98.20@gmail.com");

	driver.findElement(By.id("password")).sendKeys("Navya");

	driver.findElement(By.name("submit")).click();
	
	
}
	
	public boolean LogOutDisplayed() {
		WebElement log = driver.findElement(By.xpath("/html/body/div[3]/form/input"));
		   return log.isDisplayed();
}
	
	public boolean TextDisplayed() {
		WebElement text = driver.findElement(By.xpath("//*[@id='tabs-1']/h2"));
		   return text.isDisplayed();
}
}
