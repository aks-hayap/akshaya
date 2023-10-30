package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mousehvr {
	EdgeDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new EdgeDriver();
	}
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://noorchikankari.in");
	}
	@Test
	public void test1()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement mouse=driver.findElement(By.xpath("//*[@id=\"site-nav-item--2\"]/summary"));
		Actions act=new Actions(driver);
		act.moveToElement(mouse).perform();
		driver.findElement(By.xpath("//*[@id=\"site-nav-item--2\"]/ul/li[3]/a")).click();
	}

}
