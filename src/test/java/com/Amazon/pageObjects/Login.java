package com.Amazon.pageObjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.PrintStream;

public class Login {
    WebDriver lDriver;
    public Login(WebDriver rDriver){
        lDriver=rDriver;
        PageFactory.initElements(lDriver,this);
    }

    //Find elements
    @FindBy(xpath = "(//input[@type = 'email'])  | //input[@name = 'email']")
    @CacheLookup
    private WebElement txtUserid;

    @FindBy(name = "password")
    @CacheLookup
    private WebElement txtPassword;

    @FindBy(name = "password")
    @CacheLookup
    private WebElement txtPassword1;

    @FindBy(name = "rememberMe")
    @CacheLookup
    private WebElement chkRememberMe;

    @FindBy(xpath = "//input[@type= 'submit']")
    @CacheLookup
    private WebElement btnContinue;

    @FindBy(xpath = "//span[contains(text(), 'Account & Lists')]")
    @CacheLookup
    private WebElement lnkSignIn;

    @FindBy(xpath = "(//span[starts-with(text(), 'Sign in')])[2]")
    @CacheLookup
    private WebElement btnSignIn;

    @FindBy(xpath = "//input[@type= 'submit']")
    @CacheLookup
    private WebElement btnSubmit;

    @FindBy(xpath = "//input[@type= 'submit']")
    @CacheLookup
    private WebElement btnSubmit1;

    @FindBy(xpath ="//img[@alt= 'Bottomline Technologies logo']")
    @CacheLookup
    private WebElement imgLogo;

    @FindBy(xpath="//div[contains(text(), 'This is the first time')]")
    @CacheLookup
    private WebElement warnMsg1;

    @FindBy(xpath="//*[@class='ui-icon ui-icon-close']")
    @CacheLookup
    private WebElement btnWarnClose;

    //Actions methods
    public void setTxtUserid (String userid){
        txtUserid.sendKeys(userid);
    }

    public void setTxtPassword(String password){
        txtPassword.sendKeys(password);
    }

    public void setTxtPassword1(String password){
        txtPassword1.sendKeys(password);
    }

    public void selectRememberMe(){
        if (!(chkRememberMe.isSelected())) {
            chkRememberMe.click();
        } else {
            System.out.println("'Remember Me' checkbox already selected.");
        }
    }

    public void clickLogin(){
        btnSubmit.click();
    }

    public void clickLogin1(){
        btnSubmit1.click();
    }

    public void clickSigninLink(){
        lnkSignIn.click();
    }

    public void clickSignin() {
        try {
            if (btnSignIn.isDisplayed()) {
                btnSignIn.click();
            }
        }
        catch (Exception e){
            PrintStream printf = System.out.printf("Exception is : %s%n", e);
        }
    }


    public void clickContinue(){
        btnContinue.click();
    }
}
