// WAP to count number of links present in Vitamins & Supplements
// Print links in sequence order

package findElementByLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementByLinks {

    int total = 0;

    @Test
    public void findElementById() throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.hollandandbarrett.com/");
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();

        driver.findElement(By.linkText("Vitamins & Supplements")).click();

        List<WebElement> links = driver.findElements(By.xpath("//a"));
        int linkCount = links.size();

        total = total + links.size();

        System.out.println("Number of links: " + linkCount);

        for (int i = 1; i < links.size(); i++) {
            System.out.println(links.get(i).getText());
        }

        driver.quit();
    }
}
