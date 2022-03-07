package AppTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest{
	
	
	@Test(priority=1)
	public void verifyTitleTest() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Your Store");
	}
	
}
