package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Internationalization {

	WebDriver driver;
	@BeforeTest
	public void openBrowser(){
		FirefoxProfile profile = new FirefoxProfile();//set the profile for different languages
		profile.setPreference("intl.accept_languages", "es");//to find intl:accept languages-
		//type about:config in the browser>type in language in the search area.
		driver = new FirefoxDriver(profile);
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		
	}
	
	@Test
	public void credentialsTest(){
		driver.findElement(By.id("Email")).sendKeys("·ÈÌFrench@gmail.com");
	}

}

