package myTest;

import org.testng.annotations.Test;

public class invocationCountTest {
	@Test(invocationCount=10)
	public void login() {
		System.out.println("login to app");
	}

}
