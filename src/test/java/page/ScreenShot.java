package page;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShot {
ChromeDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void url()
{
	driver.get("https://noorchikankari.in");
}
@Test
public void test1() throws IOException
{
	File srs=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(srs, new File("./sreenShot//Elementscreenshot.png"));
}
}