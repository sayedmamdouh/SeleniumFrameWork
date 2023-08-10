package com.nopcommerce.demo.testcases;

import com.nopcommerce.demo.base.BaseTest;
import com.nopcommerce.demo.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    @Test
    void shouldAddSuccessfully(){

        // open website and login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        loginPage.login("sayed@gmail.com","sayed12345");
        // click on jewelry category
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a")).click();
        // click on add to cart
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]")).click();

        boolean isItemAdded = driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p")).isDisplayed();
        Assert.assertTrue(isItemAdded);
        
    }
}
