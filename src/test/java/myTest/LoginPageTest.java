package myTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTest {
	@DataProvider
	public Object[][] logintestData() {
		return new Object[][]{ {"admin@gmail.com","1234"},
				{"nikki@gmail.com","1456"},
				{"testing","test1234"}
		
			
		
		
	};
	}
	
	@Test(dataProvider="logintestData")
	public void loginTest(String userName,String password) {
		Assert.assertTrue(doLogin(userName,password));
	}
		
	
	
	
	public boolean doLogin(String userName,String password) {
		System.out.println("username:"+userName);
		System.out.println("password:"+password);
		System.out.println("login successful");
		return true;
	}

}
