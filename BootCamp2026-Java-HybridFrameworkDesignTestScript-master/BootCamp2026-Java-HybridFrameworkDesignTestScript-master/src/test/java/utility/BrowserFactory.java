package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	WebDriver driver;
	public static WebDriver BrowserOptions(WebDriver driver, String browserName, String AppUrl) {
		if(browserName.equalsIgnoreCase("Chrome") || browserName.equalsIgnoreCase("GC")||
				browserName.equalsIgnoreCase("Google Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FF") || browserName.equalsIgnoreCase("Firefox")
				|| browserName.equalsIgnoreCase("Mozila")) {
			System.setProperty("webdriver.firefox.driver", "./BrowserDrivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge") || browserName.equalsIgnoreCase("EG")
				|| browserName.equalsIgnoreCase("Microsoft Edge")) {
			System.setProperty("webdriver.edge.driver", "./BrowserDrivers/msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("Sorry this browser do not support");
		}
		driver.manage().window().maximize();
		driver.get(AppUrl);
		return driver;
	}

public static void closeBrowser(WebDriver driver) {
	driver.quit();
}
}