import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikbaksh\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(5000);
		String vbgxpath="//*[local-name()='svg' and  @id='map-svg']//*[name()='g' and @id='states']//*[name()='g']/*[name()='path']";
		List<WebElement> graphList = driver.findElements(By.xpath(vbgxpath));
		Actions act =new Actions(driver);
		for(WebElement el:graphList) {
			act.moveToElement(el).perform();
			Thread.sleep(1000);
			String attribute= el.getAttribute("name");
			System.out.println(attribute);
			if (attribute.equals("Maryland")) {
				act.click(el).perform();
			}
			
			
		}
	}
		

	}
	


