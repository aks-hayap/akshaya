package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Bookpage {
WebDriver driver;

 By bookemail=By.xpath("//*[@id=\"CustomerEmail\"]");
 By bookpassword=By.xpath("//*[@id=\"CustomerPassword\"]");
 By Login=By.xpath("//*[@id=\"customer_login\"]/p[1]/button");

	
 public Bookpage (WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String email, String password)
	{
		
		driver.findElement(bookemail).sendKeys(email);
		driver.findElement(bookpassword).sendKeys(password);
		
		
	}
	public void login()
	{
		driver.findElement(Login).click();
	}
			
	
}
