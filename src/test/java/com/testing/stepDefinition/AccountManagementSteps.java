package com.testing.stepDefinition;

import com.testing.pageObject.CreateAccountPagePO;
import com.testing.pageObject.HomePagePO;
import com.testing.pageObject.SignInPagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.testing.cucumber.Hooks.driver;

public class AccountManagementSteps {
    @Given("I am on create an account page")
    public void iAmOnCreateAnAccountPage() {
        HomePagePO homepagePO = new HomePagePO(driver);
        homepagePO.clickCreateAccountLink();
    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String FirstName, String LastName, String Email, String Password, String ConfirmPassword) {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(FirstName);
        createAccountPagePO.enterLastName(LastName);
        createAccountPagePO.enterEmail(Email);
        createAccountPagePO.enterPassword(Password);
        createAccountPagePO.enterConfirmPassword(ConfirmPassword);
    }

    @And("I click on create an account")
    public void iClickOnCreateAnAccount() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateAccountButton();
    }

    @Then("my account page is displayed")
    public void myAccountPageIsDisplayed() {
    }


    @Given("I am on customer login page")
    public void iAmOnCustomerLogInPage() {
        HomePagePO homepagePO = new HomePagePO(driver);
        homepagePO.clickSignInLink();
    }

    @And("I click on sign in")
    public void iClickOnSignIn() {
        SignInPagePO SignInPagePO = new SignInPagePO(driver);
        SignInPagePO.clickSignInButton();
    }

    @When("I enter {string} {string}")
    public void iEnter(String Email, String Password) {
        SignInPagePO SignInPagePO = new SignInPagePO(driver);
        SignInPagePO.enterEmail(Email);
        SignInPagePO.enterPassword(Password);
    }
}





