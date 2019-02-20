package amTestJanFirst;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.AmazonHomePage;
import resources.InvokeBrowser;

public class SampleAmpageTest extends InvokeBrowser {
	
	@Test
	public void sampleTest() throws IOException {
		
		driver = intializeBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		AmazonHomePage amtest = new AmazonHomePage(driver);
		/*WebElement yo = amtest.yourOrders();
		Actions act = new Actions(driver);
		act.moveToElement(yo).perform();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement ya = amtest.yourAccount();
		wait.until(ExpectedConditions.visibilityOf(ya));
		act.moveToElement(ya).click().build().perform();*/
		amtest.searchBox().sendKeys("echo");
		amtest.searchSubmit().click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // wait is optional
		amtest.echoProduct().click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // wait is optional
		amtest.buyNow().click();
		//driver.switchTo().window(tabs.get(0));
		String titleText = driver.getTitle();
		Assert.assertTrue(titleText.contains("Amazon Echo"),"This is not Home Tab");
		System.out.println("This is Home Tab - Zero");
		
		
		
	}
	
		
		

}
