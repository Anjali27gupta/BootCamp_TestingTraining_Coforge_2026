/*
Test case 2: Negative username test
Open page
Type username incorrectUser into Username field
Type password Password123 into Password field
Push Submit button
Verify error message is displayed
Verify error message text is Your username is invalid!
*/

package NegativeTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NegativeTestCase {

    WebDriver driver;

    @Test
    public void IDTest() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("incorrectUser");
        driver.findElement(By.name("password")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        String currentUrl = driver.getCurrentUrl();
        String originalUrl = "https://practicetestautomation.com/practice-test-login/";

        if (currentUrl.equals(originalUrl)) {
            System.out.println("Page shows invalid username: therefore remain on the same page: success");
        } else {
            System.out.println("New page opened with incorrect credentials: webpage doesnt work correctly");
        }

        driver.quit();
    }
}
