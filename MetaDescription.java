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

public class MetaDescription {
	
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver" , "/Users/kailash.k/Downloads/chromedriver_mac64 (4)/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		System.out.println("_____________________________________________________________________________________________");
		
		Date d = new Date();
		
		System.out.println("Report's Date : " + d.toString());
		
		System.out.println("_____________________________________________________________________________________________");
	}
	
	@Test
	public void homePageMetaDescription()
	{
		String url = "https://www.empuls.io/";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> metaTag = driver.findElements(By.tagName("meta"));
		
		System.out.println("Total Meta Tags : " + metaTag.size());
		
		int count = 0;
		
		String mDescription;
		
		for(WebElement metadescription : metaTag)
		{
			mDescription = metadescription.getAttribute("content");
			
			if(mDescription == null || mDescription.isEmpty())
			{
				count++;
			}
			else
			{
				System.out.println("Metadescription : " + mDescription);
			}
		}
		
		System.out.println("_____________________________________________________________________________________________");
		
		System.out.println("Number of Meta Tags Without description : " + count);
		
		System.out.println("_____________________________________________________________________________________________");
		
		
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}
