package navigatingDemo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BrokenLinks 
{
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/kailash.k/Downloads/chromedriver_mac64 (4)/chromedriver");
		
		System.out.println("About to start");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
	}
	
	@Test
	public void findBrokenLinks()
	{
		String homePage = "https://www.empuls.io/";
		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(homePage);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for (WebElement link : links) 
		{
	        //System.out.println(link.getText());
			url = link.getAttribute("href");
			System.out.println("URL : " + url);
			
			if(url == null || url.isEmpty())
			{
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}
			
			try {
				huc = (HttpURLConnection)(new URL(url).openConnection());

				huc.setRequestMethod("HEAD");

				huc.connect();

				respCode = huc.getResponseCode();

				if(respCode >= 400){
				System.out.println(url+" is a broken link");
				}
				else{
				System.out.println(url+" is a valid link");
				}

				} catch (MalformedURLException e) {
				
				e.printStackTrace();
				} catch (IOException e) {
				
				e.printStackTrace();
				}
			}
	    }

		
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
}

