// WAP to use PartialLinkText locator
// Click on Vitamins link and print all link texts

package findElementByLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PartialLinkTextDemo {

    WebDriver driver;

    // Browser setup
    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void linkTest() throws Exception {

        driver.navigate().to("https://www.hollandandbarrett.com/");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();

        driver.findElement(By.partialLinkText("Vitamins")).click();

        List<WebElement> links = driver.findElements(By.xpath("//a"));
        int linkCount = links.size();
        System.out.println("Number of links in Application: " + linkCount);

        for (int i = 1; i < links.size(); i++) {
            System.out.println(links.get(i).getText());
            }
        }
    

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
