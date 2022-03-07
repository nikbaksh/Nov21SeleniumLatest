package myTest;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	@Test(expectedExceptions= {NullPointerException.class,ArithmeticException.class})
	public void logintest() {
		System.out.println("login to app");
		int i=9/0;
	}
	
	
	@Test(dependsOnMethods="logintest")
	public void searchTest() {
		System.out.println("search to app");
	}
	
	
	
	@Test(dependsOnMethods="logintest")
	public void homepageTest() {
		System.out.println("homepage testing");
	}

}
