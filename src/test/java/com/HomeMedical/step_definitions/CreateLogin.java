package com.HomeMedical.step_definitions;

import com.HomeMedical.pages.BasePage;
import com.HomeMedical.utilities.BrowserUtils;
import com.HomeMedical.utilities.ConfigurationReader;
import com.HomeMedical.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateLogin {
   BasePage loghinPage = new BasePage();
    @Given("Dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("User clicks the Login module")
    public void user_clicks_the_module() {
        loghinPage.customerLogin.click();
        BrowserUtils.sleep(2);

    }


    @Given("user on the login page")
    public void user_on_the_login_page() {

        Driver.getDriver().get("https://my.180medical.com/account/login?ReturnUrl=%2F");
        String expectedTitle ="My.180Medical Online Customer Portal";
        String actualTitle= Driver.getDriver().getTitle();

       Assert.assertEquals("Title verification is failed!", expectedTitle,actualTitle);
    }
    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String mail, String password) {
        BrowserUtils.sleep(2);
        loghinPage.emailButton.sendKeys(mail);
        loghinPage.passwordButton.sendKeys(password);

    }
    @When("user click the login button")
    public void user_click_the_login_button() {
        loghinPage.loginButton.click();
    }
    @Then("verify {string} message should be display")
    public void verify_message_should_be_display(String message) {
        Assert.assertTrue(loghinPage.loginFailedMsg.isDisplayed());
        Assert.assertEquals(loghinPage.loginFailedMsg.getText(),"Invalid username or password.");

    }

    @When("use click the create account button")
    public void use_click_the_create_account_button() {
        loghinPage.createAccountBtn.click();
        BrowserUtils.sleep(2);


    }

    }