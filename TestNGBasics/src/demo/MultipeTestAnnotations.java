package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class MultipeTestAnnotations {
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser(){
		driver = new FirefoxDriver();
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
