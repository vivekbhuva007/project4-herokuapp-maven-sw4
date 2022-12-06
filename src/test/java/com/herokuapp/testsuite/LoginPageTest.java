package com.herokuapp.testsuite;

import com.herokuapp.pages.LoginPage;
import com.herokuapp.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Login with valid username
        loginPage.usernameField("tomsmith");

        // Login with valid password
        loginPage.passwordField("SuperSecretPassword!");

        // Click on login button
        loginPage.clickLoginButton();

        //verify Secure Area text
        String expectedText  = "Secure Area";
        Assert.assertEquals(loginPage.getSecureAreaMessage(),expectedText,"message not displayed");



    }
    @Test
    public void verifyTheUsernameErrorMessage() {
        //Login with valid username
        loginPage.usernameField("tomsmith1");

        // Login with valid password
        loginPage.passwordField("SuperSecretPassword!");

        // Click on login button
        loginPage.clickLoginButton();

        String expectedMessage = "Your username is invalid!\n" +
                "×";
        Assert.assertEquals(loginPage.usernameError(),expectedMessage,"Message Not Displayed");
        }

    @Test
    public void verifyThePasswordErrorMessage() {
        // enter username
        loginPage.usernameField("tomsmith");

        // Login with valid password
        loginPage.passwordField("SuperSecretPassword");

        // Click on login button
        loginPage.clickLoginButton();

        // Check valid message occur or not
        String expectedMessage = "Your password is invalid!\n" +
                "×";
        Assert.assertEquals(loginPage.passwordError(),expectedMessage,"Message not displayed");


    }





    }
