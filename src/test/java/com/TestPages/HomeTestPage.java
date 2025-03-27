package com.TestPages;

import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.TestBase.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileNotFoundException;

public class HomeTestPage extends TestBase {

    LoginPage loginPage;
    HomePage homePage;

    Logger log = Logger.getLogger(HomeTestPage.class);


    public HomeTestPage()
    {
        super();
    }

    @BeforeMethod
    public void setup() throws FileNotFoundException, AWTException {
        initialization();
        loginPage=new LoginPage();
        homePage=new HomePage();
    }



    @Test(priority = 1)
    public void HomeTest() throws InterruptedException {

        loginPage.Login(prop.getProperty("email"),prop.getProperty("password"));
        homePage.Search();
        log.info("Home Test Completed");
    }

    @AfterMethod
    public void teardown()
    {
        driver.close();

    }

}
