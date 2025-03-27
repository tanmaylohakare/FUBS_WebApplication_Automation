package com.TestPages;

import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Pages.SearchPage;
import com.TestBase.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileNotFoundException;

public class SearchPageTest extends TestBase {

    LoginPage loginPage;
    SearchPage searchPage;

    Logger log = Logger.getLogger(SearchPageTest.class);


    public SearchPageTest()
    {
        super();
    }

    @BeforeMethod
    public void setup() throws FileNotFoundException, AWTException {
        initialization();
        loginPage =new LoginPage();
        searchPage=new SearchPage();

    }



    @Test
    public void SearchTest() throws InterruptedException {
        loginPage.Login(prop.getProperty("email"),prop.getProperty("password"));
        searchPage.search();
        log.info("Search Activity Completed");

    }

    @AfterMethod
    public void teardown()
    {
        driver.close();

    }

}
