package navigatingDemo;



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
			String imagelink = Link.getAttribute("src");
			System.out.println("Image source : " + imagelink);
			//System.out.println("Size of the image : " + Link.getSize());
			//System.out.println("Image size : " + Link.getSize());
			Dimension d = Link.getSize();
			
			int width=d.getWidth();
			int height=d.getHeight();
			
			if(width == 0 || height== 0)
			{
				System.out.println(imagelink + "  ---->  doesn't have height and width" );
			}
			else
			{
			System.out.println("Height = "+ height);
			System.out.println("Width = " + width);
			
			int totalpixels = height*width;
			System.out.println("Total Pixels = " + totalpixels);
			int sizeInBytes = totalpixels*3; // 1 pixel takes 3 bytes memory, so multiplying total pixels with 3 to get actual bytes.
			// converting image size into KB
			//System.out.println("Total bytes = " + sizeInBytes);
			
			int actual_size = sizeInBytes/1024;
			
			System.out.println("Size of the image : " + actual_size + "KB");
			}
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
