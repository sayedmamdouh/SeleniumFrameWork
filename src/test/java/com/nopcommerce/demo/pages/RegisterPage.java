package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
    private WebElement registerButtonStart;
    @FindBy(xpath = "//*[@id=\"gender-male\"]")
    private WebElement genderSelection;
    @FindBy(xpath = "//*[@id=\"FirstName\"]")
    private WebElement firstNameInput;
    @FindBy(xpath = "//*[@id=\"LastName\"]")
    private WebElement lastNameInput;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")
    private WebElement daySelection;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")
    private WebElement monthSelection;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")
    private WebElement yearSelection;
    @FindBy(xpath = "//*[@id=\"Email\"]")
    private WebElement emailInput;
    @FindBy(xpath = "//*[@id=\"Password\"]")
    private WebElement passwordInput;
    @FindBy(xpath = "//*[@id=\"ConfirmPassword\"]")
    private WebElement confirmPasswordInput;
    @FindBy(xpath = "//*[@id=\"register-button\"]")
    private WebElement registerButtonEnd;
    public void register(String fName,String lName,String email,String password,String confirmPassword){
        registerButtonStart.click();
        genderSelection.click();
        firstNameInput.sendKeys(fName);
        lastNameInput.sendKeys(lName);
        Select DayDropDown = new Select(daySelection);
        DayDropDown.selectByValue("20");
        Select MonthDropDown = new Select(monthSelection);
        MonthDropDown.selectByValue("9");
        Select YearDropDown = new Select(yearSelection);
        YearDropDown.selectByValue("1996");
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        confirmPasswordInput.sendKeys(confirmPassword);
        registerButtonEnd.click();
    }

}
