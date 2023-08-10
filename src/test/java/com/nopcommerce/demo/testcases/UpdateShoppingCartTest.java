package com.nopcommerce.demo.testcases;

import com.nopcommerce.demo.base.BaseTest;
import com.nopcommerce.demo.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateShoppingCartTest extends BaseTest {
    @Test
    void shouldRemoveSuccessfully(){

        // open website and login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        loginPage.login("sayed@gmail.com","sayed12345");
        // add item to cart
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]")).click();
        // Click on shopping cart
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
        // click on remove item
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr/td[7]/button")).click();

        boolean isYourRegistrationCompletedDisplayed = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div")).isDisplayed();
        Assert.assertTrue(isYourRegistrationCompletedDisplayed);

    }
}
