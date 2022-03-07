package AppTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest  extends BaseTest{

	
	@Test(priority=1)
	public void logoTest() {
		Assert.assertTrue(driver.findElement(By.className("nav-logo")).isDisplayed());
	}
	

	@Test(priority=2)
	public void ContactSLinkTest() {
		Assert.assertTrue(driver.findElement(By.linkText("CONTACT SALES")).isDisplayed());
	}
	
	
	@Test(priority=4)
	public void verifyTitleTest() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Sign Up for a Free HR Software Trial | OrangeHRM");
	}
	
	
}
