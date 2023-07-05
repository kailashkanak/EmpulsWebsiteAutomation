package navigatingDemo;

import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HeadingTagsCount {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/kailash.k/Downloads/chromedriver_mac64 (4)/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		Date d = new Date();
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		System.out.println("Report's Date:" + d.toString());
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		System.out.println();
		
	}
	
	@Test
	public void headingTag()
	{
		String url = "https://www.empuls.io/";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> h1Tag = driver.findElements(By.tagName("h1"));
		
		List<WebElement> h2Tag = driver.findElements(By.tagName("h2"));
		
		List<WebElement> h3Tag = driver.findElements(By.tagName("h3"));
		
		List<WebElement> h4Tag = driver.findElements(By.tagName("h4"));
		
		List<WebElement> h5Tag = driver.findElements(By.tagName("h5"));
		
		List<WebElement> h6Tag = driver.findElements(By.tagName("h6"));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		System.out.println("Page Link : " + url);
		
		System.out.println("Count of H1 Tag : " + h1Tag.size());
		
		int h1Count = 0;
		
		int h2Count = 0;
		
		int h3Count = 0;
		
		int h4Count = 0;
		
		int h5Count = 0;
		
		int h6Count = 0;
		
		for(WebElement H1Tag : h1Tag)
		{
			String h1headingText = H1Tag.getText();
			
			if(h1headingText == null || h1headingText.isEmpty())
			{
				h1Count++;
		
			}
			else
			{
				System.out.println("Heading Text : " + h1headingText);
				System.out.println("Count of characters in the Heading Text : " + h1headingText.length());
			}
			
			System.out.println("Count of H1 Tags without heading text : " + h1Count);
			
			
		}
		
			
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		System.out.println();
		
		System.out.println("Count of H2 Tag : " + h2Tag.size());
		
		for(WebElement H2Tag : h2Tag)
		{
			String h2headingText = H2Tag.getText();
			
			if(h2headingText == null || h2headingText.isEmpty())
			{
				h2Count++;
		
			}
			else
			{
				System.out.println("Heading Text : " + h2headingText);
				System.out.println("Count of characters in the Heading Text : " + h2headingText.length());
			}
			
			
		}
		
		System.out.println("Count of H2 Tag without heading text : " + h2Count);
		
		System.out.println();
		
		System.out.println("-------------------------------------------------------------------------------------------");
			
		System.out.println();
		
		System.out.println("Count of H3 Tag : " + h3Tag.size());
		
		for(WebElement H3Tag : h3Tag)
		{
			String h3headingText = H3Tag.getText();
			
			if(h3headingText == null || h3headingText.isEmpty())
			{
				h3Count++;
		
			}
			else
			{
				System.out.println("Heading Text : " + h3headingText);
				System.out.println("Count of characters in the Heading Text : " + h3headingText.length());
			}
			
		}
		
		System.out.println("Count of H3 Tag without heading text : " + h3Count);
		
		System.out.println();
			
		System.out.println("-------------------------------------------------------------------------------------------");
			
		System.out.println();
		
		System.out.println("Count of H4 Tag : " + h4Tag.size());
		
		for(WebElement H4Tag : h4Tag)
		{
			String h4headingText = H4Tag.getText();
			
			if(h4headingText == null || h4headingText.isEmpty())
			{
				
				h4Count++;
		
			}
			else
			{
				System.out.println("Heading Text : " + h4headingText);
				System.out.println("Count of characters in the Heading Text : " + h4headingText.length());
			}
			
				
		}
		
		System.out.println("Count of H4 Tag without heading text : " + h4Count);
			
			System.out.println("-------------------------------------------------------------------------------------------");
			
			System.out.println();
		
			System.out.println("Count of H5 Tag : " + h5Tag.size());
		
			for(WebElement H5Tag : h5Tag)
			{
				String h5headingText = H5Tag.getText();
			
				if(h5headingText == null || h5headingText.isEmpty())
				{
					h5Count++;
		
				}
				else
				{
					System.out.println("Heading Text : " + h5headingText);
					System.out.println("Count of characters in the Heading Text : " + h5headingText.length());
				}
			
			}
			
			System.out.println("Count of H5 Tag without heading text : " + h5Count);
			
			System.out.println("-------------------------------------------------------------------------------------------");
			
			System.out.println();
		
			System.out.println("Count of H6 Tag : " + h6Tag.size());
		
			for(WebElement H6Tag : h6Tag)
			{
				String h6headingText = H6Tag.getText();
			
				if(h6headingText == null || h6headingText.isEmpty())
				{
					h6Count++;
		
				}
				else
				{
					System.out.println("Heading Text : " + h6headingText);
					System.out.println("Count of characters in the Heading Text : " + h6headingText.length());
				}
			
			}
			
			System.out.println("Count of H6 Tag without heading text : " + h6Count);
			
			System.out.println();
		
			System.out.println("-------------------------------------------------------------------------------------------");
		
	}
	
	
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}
