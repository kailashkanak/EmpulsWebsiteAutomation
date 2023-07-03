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

public class CountOfHeadingTag {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setUpBrowser()
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
	public void homePage()
	{
		System.out.println("___________________________________________________________________________________________");
		
		String homePage = "https://www.empuls.io/";
		
		driver.get(homePage);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String title = driver.getTitle();
		
		System.out.println("Link of the page : " + homePage);
		
		System.out.println("Title of the page : " + title);
		System.out.println("Length of the title text : " + title.length());
		
		System.out.println("___________________________________________________________________________________________");
		List<WebElement> links = driver.findElements(By.tagName("h1"));
		List<WebElement> links1 = driver.findElements(By.tagName("h2"));
		List<WebElement> links2 = driver.findElements(By.tagName("h3"));
		List<WebElement> links3 = driver.findElements(By.tagName("h4"));
		List<WebElement> links4 = driver.findElements(By.tagName("h5"));
		List<WebElement> links5 = driver.findElements(By.tagName("h6"));
		List<WebElement> links6 = driver.findElements(By.tagName("title"));
		System.out.println("Total Number of H1 tags : " + links.size());
		System.out.println("Total Number of H2 tags : " + links1.size());
		System.out.println("Total Number of H3 tags : " + links2.size());
		System.out.println("Total Number of H4 tags : " + links3.size());
		System.out.println("Total Number of H5 tags : " + links4.size());
		System.out.println("Total Number of H6 tags : " + links5.size());
		
		System.out.println("Total Number of title tages : " + links6.size());
		System.out.println("___________________________________________________________________________________________");
		
		String h1Text;
		String h2Text;
		String h3Text;
		String h4Text;
		String h5Text;
		String url;
		for (WebElement link : links) 
		{
			url = link.getAttribute("href");
			h1Text = link.getText();
	        System.out.println("H1 text : " + link.getText());
	        System.out.println("Page link:" + url);
	        System.out.println("Total characters of the heading H1 : "+ h1Text.length());
	    }
		
		System.out.println("___________________________________________________________________________________________");
		
		for (WebElement link1 : links1) 
		{
			//htext = link.getAttribute("text");
			h2Text = link1.getText();
	        System.out.println("H2 text : " + link1.getText());
	        System.out.println("Total characters of the heading H2 : "+ h2Text.length());
	    }
		
		System.out.println("___________________________________________________________________________________________");
		
		for (WebElement link2 : links2) 
		{
			//htext = link.getAttribute("text");
			h3Text = link2.getText();
	        System.out.println("H3 text : " + link2.getText());
	        System.out.println("Total characters of the heading H3 : "+ h3Text.length());
	    }
		
		System.out.println("___________________________________________________________________________________________");
		
		for (WebElement link4 : links4) 
		{
			//htext = link.getAttribute("text");
			h5Text = link4.getText();
	        System.out.println("H5 text : " + link4.getText());
	        System.out.println("Total characters of the heading H5 : "+ h5Text.length());
	    }
		
		System.out.println("___________________________________________________________________________________________");
		
	
	}
	
	@Test
	public void employeeCommunication()
	{
		
		System.out.println("___________________________________________________________________________________________");
		String pagelink = "https://www.empuls.io/employee-communication-networking-app";
		
		driver.get(pagelink);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
		System.out.println("Page Link : " + pagelink);
		System.out.println("Title of the page : " + title);
		System.out.println("Length of the title text : " + title.length());
		
		System.out.println("___________________________________________________________________________________________");
		
		List<WebElement> links = driver.findElements(By.tagName("h1"));
		List<WebElement> links1 = driver.findElements(By.tagName("h2"));
		List<WebElement> links2 = driver.findElements(By.tagName("h3"));
		List<WebElement> links3 = driver.findElements(By.tagName("h4"));
		List<WebElement> links4 = driver.findElements(By.tagName("h5"));
		List<WebElement> links5 = driver.findElements(By.tagName("h6"));
		List<WebElement> links6 = driver.findElements(By.tagName("title"));
		System.out.println("Total Number of H1 tags : " + links.size());
		System.out.println("Total Number of H2 tags : " + links1.size());
		System.out.println("Total Number of H3 tags : " + links2.size());
		System.out.println("Total Number of H4 tags : " + links3.size());
		System.out.println("Total Number of H5 tags : " + links4.size());
		System.out.println("Total Number of H6 tags : " + links5.size());
		System.out.println("Total Number of title tages : " + links6.size());
		
		System.out.println("___________________________________________________________________________________________");
		
		
		String h1Text;
		String h2Text;
		String h3Text;
		String h4Text;
		String h5Text;
		for (WebElement link : links) 
		{
			//htext = link.getAttribute("text");
			h1Text = link.getText();
	        System.out.println("H1 text : " + link.getText());
	        System.out.println("Total characters of the heading H1 : "+ h1Text.length());
	    }
		System.out.println("___________________________________________________________________________________________");
		
		for (WebElement link1 : links1) 
		{
			//htext = link.getAttribute("text");
			h2Text = link1.getText();
	        System.out.println("H2 text : " + link1.getText());
	        System.out.println("Total characters of the heading H2 : "+ h2Text.length());
	    }
		
		System.out.println("___________________________________________________________________________________________");
		
		for (WebElement link2 : links2) 
		{
			//htext = link.getAttribute("text");
			h3Text = link2.getText();
	        System.out.println("H3 text : " + link2.getText());
	        System.out.println("Total characters of the heading H3 : "+ h3Text.length());
	    }
		
		System.out.println("___________________________________________________________________________________________");
		
		for (WebElement link4 : links4) 
		{
			//htext = link.getAttribute("text");
			h5Text = link4.getText();
	        System.out.println("H5 text : " + link4.getText());
	        System.out.println("Total characters of the heading H5 : "+ h5Text.length());
	    }
		
		System.out.println("___________________________________________________________________________________________");
		
		
	
	}
	
	
	@AfterTest
	public void exitBrowser()
	{
		driver.close();
	}

}
