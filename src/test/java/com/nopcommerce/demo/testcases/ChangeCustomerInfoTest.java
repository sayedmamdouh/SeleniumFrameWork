package com.nopcommerce.demo.testcases;

import com.nopcommerce.demo.base.BaseTest;
import com.nopcommerce.demo.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeCustomerInfoTest extends BaseTest {
    @Test
    void shouldLogoutSuccessfully(){

        // open website and login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        loginPage.login("sayed@gmail.com","sayed12345");
        // click on My account
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
        // click on customer info
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[1]/div/div[2]/ul/li[1]/a")).click();
        // change first name
        driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Ahmed");
        // change last name
        driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Ali");
        // click on save
        driver.findElement(By.xpath("//*[@id=\"save-info-button\"]")).click();

        boolean isLoginDisplayed = driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p")).isDisplayed();
        Assert.assertTrue(isLoginDisplayed);

    }
}
