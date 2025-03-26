package com.TestPages;

import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Pages.SearchPage;
import com.TestBase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileNotFoundException;

public class SearchPageTest extends TestBase {

    LoginPage loginPage;
    SearchPage searchPage;

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
    }



}
