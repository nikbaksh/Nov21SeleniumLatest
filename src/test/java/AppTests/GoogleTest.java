package AppTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	
	@Test(priority=1,enabled=false)
	public void searchTest() {
				Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
	}
	
	
	
	
	
	@Test(priority=4)
	public void verifyTitleTest() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
	}
	
	
}



