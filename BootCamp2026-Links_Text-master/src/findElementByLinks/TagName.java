// WAP using Selenium WebDriver with WebElement methods
// Count number of links present on Holland & Barrett homepage
// Click 4th link on the page

package findElementByLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

    public static void main(String[] args) throws Exception {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.hollandandbarrett.com/");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total links: " + allLinks.size());

        for (WebElement ele : allLinks) {
            System.out.println(ele.isDisplayed());
            System.out.println(ele.isEnabled());
            System.out.println(ele.getAttribute("href"));
            System.out.println(ele.isSelected());
            System.out.println(ele.getTagName());
            System.out.println("---------------");
        }

        // Click 4th link
        WebElement ele = allLinks.get(3);
        ele.click();
    }
}
