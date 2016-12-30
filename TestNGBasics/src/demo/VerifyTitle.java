package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class VerifyTitle {
 
	WebDriver driver; //variable needs to be declared here because it can be used by
	//all methods - beforeTest, test and aferTest. 
	
	@BeforeTest //in TestNG program, main method is not used, annotation is used instead. 
    public void openBrowser(){
		driver = new FirefoxDriver(); //if we write webdriver driver here, 
		//it becomes local to that method. called as scope of the variable.
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");	
	}
	
	@Test
		public void titleVerification(){
			String expectedTitle = "Facebook - Log In or Sign Up";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(expectedTitle, actualTitle);
			//assert is class. assert  equals is method which takes in 2 values/parameters - expected title and
			//actual title	
	}
	
	@AfterTest
	public void closeBrowser(){
		driver.close();
	}
	
}

