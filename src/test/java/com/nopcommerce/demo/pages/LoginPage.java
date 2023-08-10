package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {super(driver);}
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    private WebElement login;
    @FindBy(xpath = "//*[@id=\"Email\"]")
    private WebElement emailInput;
    @FindBy(xpath = "//*[@id=\"Password\"]")
    private WebElement passwordInput;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
    private WebElement submit;

    public void load (){
        driver.get("https://demo.nopcommerce.com");
    }

    public void login(String email , String password){
        login.click();
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        submit.click();
    }
}
