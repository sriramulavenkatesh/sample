package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeBrowser {

	public WebDriver driver;
	public Properties prop;

	public WebDriver intializeBrowser() throws IOException {

		FileInputStream fis = new FileInputStream("D:\\Start2019\\myApp\\src\\main\\java\\resources\\data.properties");
		prop = new Properties();
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "D:\\Automation Stuff\\Chrome driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "D:\\Automation Stuff\\Gecko2\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		return driver;

	}

}
