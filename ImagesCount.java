package navigatingDemo;



import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImagesCount 
{
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/kailash.k/Downloads/chromedriver_mac64 (4)/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		Date d = new Date();
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Report's Date:" + d.toString());
		System.out.println("-------------------------------------------------------------------------------------------");
		
	}
	
	@Test
	public void imagesCount()
	{
		String pageLink = "https://www.empuls.io/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(pageLink);
		System.out.println("Page Link : " + pageLink);
		String pageTitle = driver.getTitle();
		System.out.println("Page Title : " + pageTitle);
		
		List<WebElement> imageLink = driver.findElements(By.tagName("img"));
		
		System.out.println("Total images available on this page are : " + imageLink.size());
		
		System.out.println("____________________________________________________________________________________________");
		
		System.out.println("Links of Images with itheir size");
		
		for(WebElement Link : imageLink)
		{
			System.out.println("_____________________________________________________________________________________________________________________________________________________");
			try
			{
				System.out.println("Image Source : " + Link.getAttribute("src"));
				
				URLConnection urlConnection = new URL(Link.getAttribute("src")).openConnection();
				int size = urlConnection.getContentLength();
				
				System.out.println("Image size : " + size + " Bytes");
				
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			} 
			
			System.out.println("_____________________________________________________________________________________________________________________________________________________");
		
		}
	}
	
	
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}
