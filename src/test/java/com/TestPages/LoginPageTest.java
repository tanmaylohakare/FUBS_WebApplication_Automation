package com.TestPages;

import com.Pages.LoginPage;
import com.TestBase.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileNotFoundException;

public class LoginPageTest extends TestBase
{
    LoginPage loginPage;

    Logger log = Logger.getLogger(LoginPageTest.class);

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
        log.info("Login test executed successfully");

    }

    @AfterMethod
    public void teardown()
    {
        driver.close();

    }
}
