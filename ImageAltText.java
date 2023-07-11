package navigatingDemo;

import java.io.FileWriter;
import java.net.URL;
import java.net.URLConnection;
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

import com.opencsv.CSVWriter;

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
	
	@Test
	public void salesCommissionManagement()
	{
		String url = "https://www.empuls.io";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("Page Link : " + url);
		
		System.out.println("Page Title : " + driver.getTitle());
		
		List<WebElement> countOfImages = driver.findElements(By.tagName("img"));
		
		System.out.println("Count of Images on this page : " + countOfImages.size());
		
		try 
		{
			
			
			FileWriter outputfile = new FileWriter("/Users/kailash.k/Documents/EmpulsHomePageTestReport.csv");
			
			CSVWriter writer = new CSVWriter(outputfile);
			
			//Adding header to CSV file
			
			String[] header = {"S_No","Page Link","Image source","Image Size in Bytes","Image Alt Text"};
			
			writer.writeNext(header);
			
			//adding data to CSV file
			
			int sno = 1;
			
			for(WebElement record : countOfImages)
			{
				
				URLConnection urlConnection = new URL(record.getAttribute("src")).openConnection();
				
				int size = urlConnection.getContentLength();
				
				String altText = record.getAttribute("alt");
				
				if(altText==null || altText.isEmpty())
				{
					altText = "No alt text";
				}
				else
				{
					System.out.println("Alt Text = "+ altText);
				}
			
				String imgSrc = record.getAttribute("src");
				
				String id = Integer.toString(sno);
				
				String imgSize = Integer.toString(size);
				
				String[] data1 = {id, url, imgSrc, imgSize, altText};
				
				writer.writeNext(data1);
				
				sno++;
				
			}
			
			writer.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	

}
