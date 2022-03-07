package myTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {
	@BeforeSuite
	public void createUser() {
		System.out.println("BS create user");
	}
	
	@BeforeTest
	public void connectDB() {
		System.out.println("BT connect to db");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC launch browser");
	}

	
	@BeforeMethod
	public void login() {
		System.out.println("BM login to app");
	}
	
	@Test
	public void homepageTest() {
		System.out.println("Test homepagetest");
	}
	
	@Test
	public void searchTest()
	{
		System.out.println("Test2 search test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM logout");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC close browser");
	}
	
	@AfterTest
	public void disconnectDB() {
		System.out.println("AT disconnect db");
	}
	
	@AfterSuite
	public void deleteUser() {
		System.out.println("AS Delete user");
	}
}


