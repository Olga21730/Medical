package com.HomeMedical.pages;

import com.HomeMedical.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath= "(//a[contains(text(),'Customer Login')])[1]")
    public WebElement customerLogin;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailButton;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordButton;


    @FindBy(xpath= "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath= "//span[contains(text(),'Invalid username or password.')]")
    public WebElement loginFailedMsg;

    @FindBy(xpath = "//a[contains(text(),'Create an Account')]")
    public WebElement createAccountBtn;

    @FindBy(xpath = "//div[@id='credential-validation-section']/input[@id='create-form-first-name']")
    public WebElement firstNameBtn;

    @FindBy(xpath = "(//div[@id='credential-validation-section']/input)[2]")
    public WebElement lastNameBtn;












}
