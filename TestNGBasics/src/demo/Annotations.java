package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeMethod
	public void beforeMethod(){
		System.out.println("BeforeMethod");
		
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("AfterMethod");
	}
	
	@BeforeClass //2 imports available. imported testng import because we are
	//working in TestNG program
	public void beforeClass(){
		System.out.println("BeforeClass");
	}
	@AfterClass
	public void afterClass(){
		System.out.println("AfterClass");
	}
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("BeforeSuite");
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("AfterSuite");	
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("BeforeTest");
	}
	@AfterTest 
	public void afterTest(){
		System.out.println("AfterTest");
	}
	
	@Test
	public void test(){
		System.out.println("Test");
	}
	
	@Test
	public void test2(){
	System.out.println("Test2");//2 test annotations can be used to test two different 
	//things on a webpage.
	}
	
	//output - beforemethod, test and aftermethod always come in pairs - 
	//- like a sandwich. the no. of times the program has test annotation, - 
	//before method and after method will get executed that many times. see eg:-
	//BeforeMethod
	//Test
	//AfterMethod
	//BeforeMethod
	//Test2
	//AfterMethod
}
