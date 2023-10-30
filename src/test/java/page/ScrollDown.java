package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollDown {
	ChromeDriver driver;
	@BeforeTest
	public void settup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://noorchikankari.in");
	}
	@Test
	public void test1()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2500)", " ");
		driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--15413536129083__footer\"]/footer/div/div/div[2]/div/div/div/ul/li[4]/a")).click();
		
	}


}
