package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
    private WebElement MyAccountButton;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[1]/div/div[2]/ul/li[2]/a")
    private WebElement AddressButton;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[2]/button")
    private WebElement AddNewButton;
    @FindBy(xpath = "//*[@id=\"Address_FirstName\"]")
    private WebElement FirstNameInput;
    @FindBy(xpath = "//*[@id=\"Address_LastName\"]")
    private WebElement LastNameInput;
    @FindBy(xpath = "//*[@id=\"Address_Email\"]")
    private WebElement EmailInput;
    @FindBy(xpath = "//*[@id=\"Address_CountryId\"]")
    private WebElement CountrySelection;
    @FindBy(xpath = "//*[@id=\"Address_City\"]")
    private WebElement CityInput;
    @FindBy(xpath = "//*[@id=\"Address_Address1\"]")
    private WebElement Address1Input;
    @FindBy(xpath = "//*[@id=\"Address_ZipPostalCode\"]")
    private WebElement PostalCodeInput;
    @FindBy(xpath = "//*[@id=\"Address_PhoneNumber\"]")
    private WebElement PhoneNumberInput;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/form/div/div[2]/div[2]/button")
    private WebElement SaveButton;
    public void AddBillingAddress(String fName,String lName,String email,String city,String address1,String postalCode, String phone){
        MyAccountButton.click();
        AddressButton.click();
        AddNewButton.click();
        FirstNameInput.sendKeys(fName);
        LastNameInput.sendKeys(lName);
        EmailInput.sendKeys(email);
        Select CountryDropDown = new Select(CountrySelection);
        CountryDropDown.selectByValue("123");
        CityInput.sendKeys(city);
        Address1Input.sendKeys(address1);
        PostalCodeInput.sendKeys(postalCode);
        PhoneNumberInput.sendKeys(phone);
        SaveButton.click();
    }

}
