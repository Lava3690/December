package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentBrowser {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium class - Lavanya\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();

		//driver.get("https://facebook.com");
		
		//Trying with Edge driver:
		System.setProperty("webdriver.me.driver", "C:\\Selenium class - Lavanya\\MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();//if internet explorer is used,
		//write InternetExplorerDriver
		
		driver.manage().window().maximize();
		driver.get("https://facebook.com"); 
	
	}
}
