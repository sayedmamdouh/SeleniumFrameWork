package com.nopcommerce.demo.testcases;

import com.nopcommerce.demo.base.BaseTest;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.MyAccountPage;
import com.nopcommerce.demo.pages.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddBillingAddressTest extends BaseTest {
    @Test
    void shouldAddAddressSuccessfully() {

        // open website and login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        loginPage.login("sayed@gmail.com","sayed12345");
        // add billing address
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.AddBillingAddress("Sayed","Mamdouh","sayed10@gmail.com",
                "Minia","Minia","123456","01012345678");

        boolean isAddressSaved = driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p")).isDisplayed();
        Assert.assertTrue(isAddressSaved);
    }
}
