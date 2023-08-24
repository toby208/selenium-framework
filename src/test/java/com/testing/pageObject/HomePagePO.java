package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {

    // Element Locator - Stage 1
    @FindBy(linkText = "Create an Account")
    public static WebElement CreateAccountLink;

    @FindBy(linkText = "Sign In")
    public static WebElement SignInLink;

    // Initialise Element To Use Selenium Webdriver - Stage 2
    public HomePagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    // Write Method To Describe Web Element Action
    public void clickCreateAccountLink(){
        CreateAccountLink.click();
    }

    public void clickSignInLink(){
        SignInLink.click();
    }

    }
