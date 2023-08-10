package com.nopcommerce.demo.testcases;

import com.nopcommerce.demo.base.BaseTest;
import com.nopcommerce.demo.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

    @Test
    void shouldLogoutSuccessfully(){

        // open website and login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        loginPage.login("sayed@gmail.com","sayed12345");
        // click on logout button
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();

        boolean isLoginDisplayed = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).isDisplayed();
        Assert.assertTrue(isLoginDisplayed);

    }
}
