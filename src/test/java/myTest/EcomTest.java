package myTest;

import org.testng.annotations.Test;

public class EcomTest {

	
	@Test(priority=1)
	public void loginTest() {
		System.out.println("login test");
	}
	
	@Test(priority=5)
	public void homePageTest() {
		System.out.println("home test");
	}
	
	@Test(priority=2)
	public void  searchPageTest() {
		System.out.println("search test");
	}
	
	@Test()
	public void  m1Test() {
		System.out.println("m1 test");
	}
	@Test()
	public void m2Test() {
		System.out.println("m2 test");
	}
	@Test()
	public void  m3Test() {
		System.out.println("m3 test");
	}
}
