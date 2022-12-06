package com.herokuapp.pages;

import com.herokuapp.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By enterUsername = By.id("username");

    By enterPassword = By.id("password");

    By clickLogin = By.xpath("//button[@class='radius']");

    By passwordErrorMessage = By.xpath("//div[@class = 'flash error']");

    By usernameInvalidMessage = By.xpath("//div[@id = 'flash']");

    By secureAreaText = By.xpath("//h2[normalize-space()='Secure Area']");


    public void usernameField(String email) {
        sendTextToElement(enterUsername, email);
    }

    public void passwordField(String passcode) {
        sendTextToElement(enterPassword, passcode);


    }

    public void clickLoginButton() {
        clickOnElement(clickLogin);
    }

    public String passwordError() {
        return getTextFromElement(passwordErrorMessage);


    }

    public String usernameError() {
        return getTextFromElement(usernameInvalidMessage);

    }
    public String getSecureAreaMessage(){
        return getTextFromElement(secureAreaText);


    }
}
