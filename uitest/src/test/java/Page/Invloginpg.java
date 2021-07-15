package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Invloginpg {

WebDriver driver;
	
	public Invloginpg (WebDriver driver)
	{
		this.driver = driver;
	}
	public void Invlogin() {


	driver.findElement(By.id("email")).sendKeys("na@gmail.com");

	driver.findElement(By.id("password")).sendKeys("Na");

	driver.findElement(By.name("submit")).click();
	
	
}
	
	public boolean LogInDisplayed() {
		WebElement logi = driver.findElement(By.name("submit"));
		   return logi.isDisplayed();
	}
	
	public boolean ErrorMessageDisplayed() {
		WebElement error = driver.findElement(By.xpath("//*[@id='login-form']/div[2]/span/b"));
		   return error.isDisplayed();
	}
	}
