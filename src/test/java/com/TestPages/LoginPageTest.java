package com.TestPages;

import com.Pages.LoginPage;
import com.TestBase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileNotFoundException;

public class LoginPageTest extends TestBase
{
    LoginPage loginPage;



    public LoginPageTest() throws FileNotFoundException {
        super();
    }

    @BeforeMethod
    public void setup() throws FileNotFoundException, AWTException {
        initialization();
        loginPage = new LoginPage();
    }

    @Test
    public void LoginTest() throws InterruptedException {
        loginPage.Login(prop.getProperty("email"),prop.getProperty("password"));
    }
}
