package com.nopcommerce.demo.testcases;

import com.nopcommerce.demo.base.BaseTest;
import com.nopcommerce.demo.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {
    @Test
    void shouldSearchSuccessfully(){

        // open website and login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        loginPage.login("sayed@gmail.com","sayed12345");
        // search for an item
        driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("Nikon D5500 DSLR");
        driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();

        boolean isItemDisplayed = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a")).isDisplayed();
        Assert.assertTrue(isItemDisplayed);

    }
}
