package tests.hws;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseTest{

    @Test
    public void positiveRegistrationTest() throws InterruptedException {
        // btn register to click //a[@href='/register']
        driver.findElement(By.xpath("//a[@href='/register']")).click();

        // //input[@name='FirstName']
        sendTextBase(By.xpath("//input[@name='FirstName']"), "siuhfouwhe");

        // //input[@name='LastName']
        sendTextBase(By.xpath("//input[@name='LastName']"), "sgfr");

        //input[@name='Email']
        String email = "sdkfjkj@kdsfj.fjd";
        sendTextBase(By.xpath("//input[@name='Email']"), email);

        //input[@name='Password']
        sendTextBase(By.xpath("//input[@name='Password']"), "123456Aa$");

        //input[@name='ConfirmPassword']
        sendTextBase(By.xpath("//input[@name='ConfirmPassword']"), "123456Aa$");

        // button: //input[@name='register-button']
        driver.findElement(By.xpath("//input[@name='register-button']")).click();

        Thread.sleep(3000);

        // text email: //div[@class='header-links-wrapper']//a[@class='account']
        String actualRes = driver.findElement(
                By.xpath("//div[@class='header-links-wrapper']//a[@class='account']")
        ).getText().trim();
        System.out.println(actualRes);
        Assert.assertEquals(actualRes, email);
    }
}
