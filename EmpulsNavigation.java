package navigatingDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EmpulsNavigation {
	WebDriver driver;
	String url = "";
	
	@BeforeTest
	public void setUpBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/kailash.k/Downloads/chromedriver_mac64 (4)/chromedriver");
		
		System.out.println("About to start");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
	}
	
	@Test(priority=1)
	public void empulsWebsiteNavigationempulsHomepage()
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		driver.get("https://www.empuls.io/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
		System.out.println("Title of the page : " + title);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links available on this page : " + links.size());
		
		System.out.println("The available links on the page are :");
		//int c=0;
		/*for(int i=0; i<links.size(); i++)
		{
			c=i;
			System.out.println(links.get(i).getText());
			
		}
		
		System.out.println("Link count : "+ c); */
		
		
		for (WebElement link : links) 
		{
			url = link.getAttribute("href");
	        System.out.println(link.getText() + "--->" + url);
	    }
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total Available images on this page are : " + images.size());
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		
	}
	
	
	@Test
	public void employeeCommunication()
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		driver.navigate().to("https://www.empuls.io/employee-communication-networking-app");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
		System.out.println("Title of the page : " + title);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links available on this page : " + links.size());
		
		for (WebElement link : links) 
		{
			url = link.getAttribute("href");
	        System.out.println(link.getText() + "--->" + url);
	    }
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total Available images on this page are : " + images.size());
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		
		driver.navigate().back();
	}
	
	@Test
	public void surveyTool()
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		driver.navigate().to("https://www.empuls.io/employee-survey-tool");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
		System.out.println("Title of the page : " + title);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links available on this page : " + links.size());
		
		for (WebElement link : links) 
		{
			url = link.getAttribute("href");
	        System.out.println(link.getText() + "--->" + url);
	    }
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total Available images on this page are : " + images.size());
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		
		driver.navigate().back();
	}
	
	@Test
	public void employeeRecognition()
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		driver.navigate().to("https://www.empuls.io/employee-recognition-software");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
		System.out.println("Title of the page : " + title);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links available on this page : " + links.size());
		
		for (WebElement link : links) 
		{
			url = link.getAttribute("href");
	        System.out.println(link.getText() + "--->" + url);
	    }
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total Available images on this page are : " + images.size());
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		
		driver.navigate().back();
	}
	
	@Test
	public void employeeRewardsSystem()
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		driver.navigate().to("https://www.empuls.io/employee-rewards-system");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
		System.out.println("Title of the page : " + title);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links available on this page : " + links.size());
		
		for (WebElement link : links) 
		{
			url = link.getAttribute("href");
	        System.out.println(link.getText() + "--->" + url);
	    }
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total Available images on this page are : " + images.size());
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		
		driver.navigate().back();
	}
	
	@Test
	public void peopleAnalytics()
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		driver.navigate().to("https://www.empuls.io/people-analytics");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
		System.out.println("Title of the page : " + title);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links available on this page : " + links.size());
		
		for (WebElement link : links) 
		{
			url = link.getAttribute("href");
	        System.out.println(link.getText() + "--->" + url);
	    }
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total Available images on this page are : " + images.size());
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		
		driver.navigate().back();
	}
	
	@Test
	public void employeePerksPlatform()
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		driver.navigate().to("https://www.empuls.io/employee-perks-platform");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
		System.out.println("Title of the page : " + title);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links available on this page : " + links.size());
		
		for (WebElement link : links) 
		{
			url = link.getAttribute("href");
	        System.out.println(link.getText() + "--->" + url);
	    }
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total Available images on this page are : " + images.size());
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		
		driver.navigate().back();
	}
	
	
	
	@Test
	public void employeeDiscounts()
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		driver.navigate().to("https://www.empuls.io/employee-discounts-platform");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
		System.out.println("Title of the page : " + title);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links available on this page : " + links.size());
		
		for (WebElement link : links) 
		{
			url = link.getAttribute("href");
	        System.out.println(link.getText() + "--->" + url);
	    }
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total Available images on this page are : " + images.size());
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		
		driver.navigate().back();
	}
	
	
	@Test
	public void earlyWages()
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		driver.navigate().to("https://www.empuls.io/early-wages-and-loans");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
		System.out.println("Title of the page : " + title);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links available on this page : " + links.size());
		
		for (WebElement link : links) 
		{
			url = link.getAttribute("href");
	        System.out.println(link.getText() + "--->" + url);
	    }
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total Available images on this page are : " + images.size());
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		
		driver.navigate().back();
	}
	
	
	@Test
	public void multiTaxBenefits()
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		driver.navigate().to("https://www.empuls.io/multi-tax-benefits-card");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
		System.out.println("Title of the page : " + title);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links available on this page : " + links.size());
		
		for (WebElement link : links) 
		{
			url = link.getAttribute("href");
	        System.out.println(link.getText() + "--->" + url);
	    }
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total Available images on this page are : " + images.size());
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		
		driver.navigate().back();
	}
	
	
	
	@Test
	public void voluntaryBenefits()
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		driver.navigate().to("https://www.empuls.io/lifestyle-and-voluntary-benefits");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
		System.out.println("Title of the page : " + title);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links available on this page : " + links.size());
		
		for (WebElement link : links) 
		{
			url = link.getAttribute("href");
	        System.out.println(link.getText() + "--->" + url);
	    }
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total Available images on this page are : " + images.size());
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		
		driver.navigate().back();
	}
	
	
	@Test
	public void physicalAndMentalWellness()
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		driver.navigate().to("https://www.empuls.io/physical-and-mental-wellness");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
		System.out.println("Title of the page : " + title);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links available on this page : " + links.size());
		
		for (WebElement link : links) 
		{
			url = link.getAttribute("href");
	        System.out.println(link.getText() + "--->" + url);
	    }
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total Available images on this page are : " + images.size());
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		
		driver.navigate().back(); 
	}
	
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}
