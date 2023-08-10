package com.nopcommerce.demo.testcases;

import com.nopcommerce.demo.base.BaseTest;
import com.nopcommerce.demo.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOutTest extends BaseTest {
    @Test
    void shouldCheckoutSuccessfully(){

        // open website and login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        loginPage.login("sayed@gmail.com","sayed12345");

        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]")).click();

        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();

        boolean isBillingAddressAppeared = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[1]/h1")).isDisplayed();
        Assert.assertTrue(isBillingAddressAppeared);

    }
}
