package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {
	
	WebDriver driver;
	public AmazonHomePage(WebDriver driver) {
		this.driver= driver;	
	}
	
	public WebElement yourOrders() {
		
		WebElement yourOrdersButton = driver.findElement(By.xpath("//*[@class='nav-line-2' and contains(text(),'Orders')]"));
		return yourOrdersButton;
			
	}
	
	public WebElement yourAccount() {
		
		WebElement yourAccountButton = driver.findElement(By.xpath("//*[@class='nav-text' and contains(text(),'Your Account')]"));
		return yourAccountButton;
		
	}
	
	public WebElement searchBox() {
		
		WebElement searchBoxButton =driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		return searchBoxButton;
			
	}
	public WebElement searchSubmit() {
		
		WebElement searchButton =driver.findElement(By.xpath("//*[@class='nav-input' and @type='submit']"));
		return searchButton;
			
	}
	
   public WebElement echoProduct() {
		
		WebElement echoProductButton =driver.findElement(By.xpath("//*[contains(text(),'All-new Echo') and contains(text(),'Black') and contains(text(),'3rd')]"));
		return echoProductButton;
			
	}
  public WebElement buyNow() {
	
	WebElement buyNowButton =driver.findElement(By.xpath("//*[@id='buy-now-button']"));
	return buyNowButton;
		
}

}
