package com.nopcommerce.demo.testcases;

import com.nopcommerce.demo.base.BaseTest;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AARegisterTest extends BaseTest {

    @Test(enabled = true)
    void shouldRegisterSuccessfully(){

        // open website and login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        // enter registration data
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.register("sayed","mamdouh","sayed@gmail.com",
                "sayed12345", "sayed12345");

        // assert registration is complete
        boolean isYourRegistrationCompletedDisplayed = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")).isDisplayed();
        Assert.assertTrue(isYourRegistrationCompletedDisplayed);

    }
}
