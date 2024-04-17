package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartProjectTest {

    @Test
    public void openGooglePage() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        System.out.println("we open google");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
