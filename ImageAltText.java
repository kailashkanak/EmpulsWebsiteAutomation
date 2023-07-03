package navigatingDemo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImageAltText {
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver" , "/Users/kailash.k/Downloads/chromedriver_mac64 (4)/chromedriver");
		
		driver = new ChromeDriver();
		
		Date d = new Date();
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		System.out.println("Test Report Date : " + d.toString());
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
	}
	
	@Test
	public void imageAltText()
	{
		String url = "https://www.empuls.io";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("Page Link : " + url);
		
		List<WebElement> imageList = driver.findElements(By.tagName("img"));
		
		System.out.println("Available Images on this page : " + imageList.size());
		
		List<String> imageWithoutAltText = new ArrayList<>();
		
		String imageSource;
		
		for(WebElement image : imageList)
		{
			
			
			String altText = image.getAttribute("alt");
			
			if(altText == null || altText.isEmpty())
			{
				imageSource = image.getAttribute("src");
				
				imageWithoutAltText.add(imageSource);
			}
			else
			{
				System.out.println("_________________________________________________________________________________________________________");
				
				imageSource = image.getAttribute("src");
				
				System.out.println("Image source : " + imageSource);
				
				System.out.println("Alt Text : " + altText);
				
				System.out.println("_________________________________________________________________________________________________________");
			}
				
			
		}
		
		System.out.println("_________________________________________________________________________________________________________");
		
		System.out.println("Total images without Alt Text are : " + imageWithoutAltText.size());
		
		System.out.println("List of Images without Alt Text are : ");
		
		for(String mylist : imageWithoutAltText)
		{
			System.out.println(mylist);
		}
		
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	

}
