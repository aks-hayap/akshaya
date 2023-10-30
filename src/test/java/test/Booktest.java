package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Bookpage;

public class Booktest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://noorchikankari.in/account/login?return_url=%2Faccount");
	}
	@Test
	public void testlogin()
	{
		Bookpage ob=new Bookpage(driver);
		ob.setvalues("akshaya@gmail.com","abs");
		ob.login();
	

}
	}
