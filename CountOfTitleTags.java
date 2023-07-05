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

public class CountOfTitleTags {
	
	WebDriver driver;
	
	@BeforeTest
	public void loadBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/kailash.k/Downloads/chromedriver_mac64 (4)/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		Date d = new Date();
		
		System.out.println("Date of the Test Execution : " + d.toString());
	}
	
	@Test
	public void titleHomePage()
	{
		String url = "https://www.empuls.io/";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("____________________________________________________________________________________________");
		
		System.out.println();
		
		System.out.println("Page Link : " + url);
		
		List<WebElement> titleList = driver.findElements(By.tagName("title"));
		
		System.out.println("Total Title tags available on this page : " + titleList.size());
		
		System.out.println();
		
		System.out.println("____________________________________________________________________________________________");
		
	}
	
	@Test
	public void employeeCommunication()
	{
		String url = "https://www.empuls.io/employee-communication-networking-app";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("____________________________________________________________________________________________");
		
		System.out.println();
		
		System.out.println("Page Link : " + url);
		
		List<WebElement> titleList = driver.findElements(By.tagName("title"));
		
		System.out.println("Total Title tags available on this page : " + titleList.size());
		
		System.out.println();
		
		System.out.println("____________________________________________________________________________________________");
		
	}
	
	@Test
	public void surveyTool()
	{
		String url = "https://www.empuls.io/employee-survey-tool";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("____________________________________________________________________________________________");
		
		System.out.println();
		
		System.out.println("Page Link : " + url);
		
		List<WebElement> titleList = driver.findElements(By.tagName("title"));
		
		System.out.println("Total Title tags available on this page : " + titleList.size());
		
		System.out.println();
		
		System.out.println("____________________________________________________________________________________________");
		
	}
	
	@Test
	public void employeeRecognition()
	{
		String url = "https://www.empuls.io/employee-recognition-software";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("____________________________________________________________________________________________");
		
		System.out.println();
		
		System.out.println("Page Link : " + url);
		
		List<WebElement> titleList = driver.findElements(By.tagName("title"));
		
		System.out.println("Total Title tags available on this page : " + titleList.size());
		
		System.out.println();
		
		System.out.println("____________________________________________________________________________________________");
		
	}
	
	@Test
	public void employeeRewards()
	{
		String url = "https://www.empuls.io/employee-rewards-system";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("____________________________________________________________________________________________");
		
		System.out.println();
		
		System.out.println("Page Link : " + url);
		
		List<WebElement> titleList = driver.findElements(By.tagName("title"));
		
		System.out.println("Total Title tags available on this page : " + titleList.size());
		
		System.out.println();
		
		System.out.println("____________________________________________________________________________________________");
		
	}
	
	@Test
	public void peopleAnalytics()
	{
		String url = "https://www.empuls.io/people-analytics";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("____________________________________________________________________________________________");
		
		System.out.println();
		
		System.out.println("Page Link : " + url);
		
		List<WebElement> titleList = driver.findElements(By.tagName("title"));
		
		System.out.println("Total Title tags available on this page : " + titleList.size());
		
		System.out.println();
		
		System.out.println("____________________________________________________________________________________________");
		
	}
	
	@Test
	public void employeePerks()
	{
		String url = "https://www.empuls.io/employee-perks-platform";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("____________________________________________________________________________________________");
		
		System.out.println();
		
		System.out.println("Page Link : " + url);
		
		List<WebElement> titleList = driver.findElements(By.tagName("title"));
		
		System.out.println("Total Title tags available on this page : " + titleList.size());
		
		System.out.println();
		
		System.out.println("____________________________________________________________________________________________");
		
	}
	
	@Test
	public void employeeDiscounts()
	{
		String url = "https://www.empuls.io/employee-discounts-platform";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("____________________________________________________________________________________________");
		
		System.out.println();
		
		System.out.println("Page Link : " + url);
		
		List<WebElement> titleList = driver.findElements(By.tagName("title"));
		
		System.out.println("Total Title tags available on this page : " + titleList.size());
		
		System.out.println();
		
		System.out.println("____________________________________________________________________________________________");
		
	}
	
	@Test
	public void earlyWages()
	{
		String url = "https://www.empuls.io/early-wages-and-loans";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("____________________________________________________________________________________________");
		
		System.out.println();
		
		System.out.println("Page Link : " + url);
		
		List<WebElement> titleList = driver.findElements(By.tagName("title"));
		
		System.out.println("Total Title tags available on this page : " + titleList.size());
		
		System.out.println();
		
		System.out.println("____________________________________________________________________________________________");
		
	}
	
	@Test
	public void multiTaxBenefits()
	{
		String url = "https://www.empuls.io/multi-tax-benefits-card";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("____________________________________________________________________________________________");
		
		System.out.println();
		
		System.out.println("Page Link : " + url);
		
		List<WebElement> titleList = driver.findElements(By.tagName("title"));
		
		System.out.println("Total Title tags available on this page : " + titleList.size());
		
		System.out.println();
		
		System.out.println("____________________________________________________________________________________________");
		
	}
	
	@Test
	public void lifeStyleAndVoluntary()
	{
		String url = "https://www.empuls.io/lifestyle-and-voluntary-benefits";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("____________________________________________________________________________________________");
		
		System.out.println();
		
		System.out.println("Page Link : " + url);
		
		List<WebElement> titleList = driver.findElements(By.tagName("title"));
		
		System.out.println("Total Title tags available on this page : " + titleList.size());
		
		System.out.println();
		
		System.out.println("____________________________________________________________________________________________");
		
	}
	
	@Test
	public void physicalAndMentalWellness()
	{
		String url = "https://www.empuls.io/physical-and-mental-wellness";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("____________________________________________________________________________________________");
		
		System.out.println();
		
		System.out.println("Page Link : " + url);
		
		List<WebElement> titleList = driver.findElements(By.tagName("title"));
		
		System.out.println("Total Title tags available on this page : " + titleList.size());
		
		System.out.println();
		
		System.out.println("____________________________________________________________________________________________");
		
	}
	
	@Test
	public void remoteEmployee()
	{
		String url = "https://www.empuls.io/remote-employee-engagement";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("____________________________________________________________________________________________");
		
		System.out.println();
		
		System.out.println("Page Link : " + url);
		
		List<WebElement> titleList = driver.findElements(By.tagName("title"));
		
		System.out.println("Total Title tags available on this page : " + titleList.size());
		
		System.out.println();
		
		System.out.println("____________________________________________________________________________________________");
		
	}
	
	@Test
	public void employeeRetention()
	{
		String url = "https://www.empuls.io/employee-retention-software";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("____________________________________________________________________________________________");
		
		System.out.println();
		
		System.out.println("Page Link : " + url);
		
		List<WebElement> titleList = driver.findElements(By.tagName("title"));
		
		System.out.println("Total Title tags available on this page : " + titleList.size());
		
		System.out.println();
		
		System.out.println("____________________________________________________________________________________________");
		
	}
	
	@Test
	public void cultureAndValue()
	{
		String url = "https://www.empuls.io/culture-and-values";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("____________________________________________________________________________________________");
		
		System.out.println();
		
		System.out.println("Page Link : " + url);
		
		List<WebElement> titleList = driver.findElements(By.tagName("title"));
		
		System.out.println("Total Title tags available on this page : " + titleList.size());
		
		System.out.println();
		
		System.out.println("____________________________________________________________________________________________");
		
	}
	
	@Test
	public void employeeExperience()
	{
		String url = "https://www.empuls.io/employee-experience-management-platform";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("____________________________________________________________________________________________");
		
		System.out.println();
		
		System.out.println("Page Link : " + url);
		
		List<WebElement> titleList = driver.findElements(By.tagName("title"));
		
		System.out.println("Total Title tags available on this page : " + titleList.size());
		
		System.out.println();
		
		System.out.println("____________________________________________________________________________________________");
		
	}
	
	@Test
	public void remoteRewards()
	{
		String url = "https://www.empuls.io/remote-rewards";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("____________________________________________________________________________________________");
		
		System.out.println();
		
		System.out.println("Page Link : " + url);
		
		List<WebElement> titleList = driver.findElements(By.tagName("title"));
		
		System.out.println("Total Title tags available on this page : " + titleList.size());
		
		System.out.println();
		
		System.out.println("____________________________________________________________________________________________");
		
	}
	
	@Test
	public void digitalHR()
	{
		String url = "https://www.empuls.io/digital-hr-transformation";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("____________________________________________________________________________________________");
		
		System.out.println();
		
		System.out.println("Page Link : " + url);
		
		List<WebElement> titleList = driver.findElements(By.tagName("title"));
		
		System.out.println("Total Title tags available on this page : " + titleList.size());
		
		System.out.println();
		
		System.out.println("____________________________________________________________________________________________");
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}
