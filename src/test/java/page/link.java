package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class link {
	
		ChromeDriver driver;
		@BeforeClass
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("https://noorchikankari.in");
		}
		@Test
		public void test() 
		{
			List<WebElement>li=driver.findElements(By.tagName("a"));
			System.out.println("no of links : "+li.size());
			
					
		    for(WebElement s:li)
		    {
		    	String link=s.getAttribute("href");
		    	String text=s.getText();
		    	System.out.println(link+"--------"+text);
		    	
		    }
			
		}
			
		

	}



