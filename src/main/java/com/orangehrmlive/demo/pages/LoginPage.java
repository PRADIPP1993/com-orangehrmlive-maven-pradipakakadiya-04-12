package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By emailField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@type='submit']");

    By VerifyText = By.xpath("//h6[(text()='Dashboard')]");
    By Verify1Text = By.xpath("//h6[text()='Reset Password']");

    By Forgotpassword = By.xpath("//p[text()='Forgot your password? ']");




    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String getText(){
        return getTextFromElement(VerifyText);
    }
    public String get1Text(){
        return getTextFromElement(Verify1Text);
    }
    public void clickOnForgotpassword(){
        clickOnElement(Forgotpassword);
    }

}
