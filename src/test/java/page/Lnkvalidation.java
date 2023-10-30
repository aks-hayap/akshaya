package page;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Lnkvalidation {
	EdgeDriver driver;
	@BeforeClass
	public void set()
	{
		driver=new EdgeDriver();
		driver.get("https://noorchikankari.in");
	}
	@Test
	public void linkout()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("total no of links="+li.size());
		for(WebElement s:li)
		{
			String link=s.getAttribute("href");
			verify(link);
		}
	}
	public void verify(String link) {
		try {
			URL ob=new URL(link);
			HttpURLConnection con=(HttpURLConnection)ob.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("valid----"+link);
				
			}
			else
			{
				System.out.println("invalid---"+link);
			}
		
			
				
				
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
	}
	

}
