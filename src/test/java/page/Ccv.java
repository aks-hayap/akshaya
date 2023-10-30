package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ccv {
EdgeDriver driver;
@BeforeTest
public void set()
{
	driver=new EdgeDriver();
}
@BeforeMethod
public void url()
{
	driver.get("https://noorchikankari.in/account/login?return_url");
}
@Test
public void test()
{
	WebElement email=driver.findElement(By.xpath("//*[@id=\"CustomerEmail\"]"));
	email.sendKeys("abc");
	WebElement password=driver.findElement(By.xpath("//*[@id=\"CustomerPassword\"]"));
	Actions act=new Actions(driver);
	act.keyDown(email,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	act.keyDown(email,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	act.keyDown(password,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	act.perform();

}

}
