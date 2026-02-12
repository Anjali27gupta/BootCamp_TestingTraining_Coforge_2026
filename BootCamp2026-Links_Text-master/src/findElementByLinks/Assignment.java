// Compare clicked link and display the link which you have clicked
// Use String to store the link text

package findElementByLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.hollandandbarrett.com/");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();

        String clickedLink = "Vitamins & Supplements";
        driver.findElement(By.linkText(clickedLink)).click();

        List<WebElement> links = driver.findElements(By.xpath("//a"));

        System.out.println("Clicked Link Name: " + clickedLink);
        System.out.println("Matching Links:");

        for (WebElement ele : links) {
            String linkText = ele.getText();

            if (linkText.equals(clickedLink)) {
                System.out.println("Found clicked link: " + linkText);
            }
        }

        driver.quit();
    }
}
