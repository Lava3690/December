package crossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CBT {

WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")//provides parameters. communicates with below string browser
	//-will take the parameters from the testng.xml.
	public void openBrowser(String browser){
		if (browser.equals("Firefox")){
	    driver = new FirefoxDriver();
	}
	else if (browser.equals("Chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium class - Lavanya\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	//else if (browser.equals("Microsoft Edge")){
		//System.setProperty("webdriver.microsoftedge.driver", "C:\\Selenium class - Lavanya\\MicrosoftWebDriver.exe");
		//driver = new InternetExplorerDriver();
	//}
		
	else if (browser.equals("Opera")){
		System.setProperty("webdriver.opera.driver", "C:\\Selenium class - Lavanya\\operadriver_win64\\operadriver.exe");
		driver = new OperaDriver();
	}
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		
	}
	
	@Test(priority=0)//prioritizing test cases to execute, else will be executed in 
	//alphabetical order. - prioritization of test cases
	public void verifyTitle(){
		String expectedTitle = "Facebook - Log In or Sign Up";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);//use assert class
		//to compare actual and expected titles. assertequals is a static method-
		//-declared in the assert class. assertequals is a static method that is already created
	}
	
	@Test(priority=1)
	public void verifyText(){
		String expectedText = "Facebook helps you connect and share with the people in your life.";
		String actualText = driver.findElement(By.xpath("id('content')/div/div/div/div/div[1]/div/div")).getText();
		Assert.assertEquals(actualText, expectedText);
		
	}
	
	@AfterTest
	public void closeBrowser(){
		driver.close(); 
	}
	
}
//note: use parallel=tests in testng.xml file for parallel testing.
