package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logoutpage {

WebDriver driver;
	
	public Logoutpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void logout() {
		driver.findElement(By.xpath("/html/body/div[3]/form/input")).click();
	
	}
	public boolean LogInDisplayed() {
		WebElement logi = driver.findElement(By.name("submit"));
		   return logi.isDisplayed();
	}
}
