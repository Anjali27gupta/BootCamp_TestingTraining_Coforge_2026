/*
Test case 3: Negative password test
Open page
Type username student into Username field
Type password incorrectPassword into Password field
Push Submit button
Verify error message is displayed
Verify error message text is Your password is invalid!
*/

package NegativeTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Negative_Password_Testcase {

    WebDriver driver;

    @Test
    public void IDTest() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.name("password")).sendKeys("incorrectPassword");
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        String currentUrl = driver.getCurrentUrl();
        String originalUrl = "https://practicetestautomation.com/practice-test-login/";

        if (currentUrl.equals(originalUrl)) {
            System.out.println("Page shows incorrect Password: therefore remain on the same page: success");
        } else {
            System.out.println("New page opened with incorrect credentials: webpage doesnt work correctly");
        }

        driver.quit();
    }
}
