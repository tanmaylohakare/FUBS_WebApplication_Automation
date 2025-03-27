package com.TestPages;

import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.TestBase.TestBase;
import com.Util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileNotFoundException;

public class HomeTestPage extends TestBase {

    LoginPage loginPage;
    HomePage homePage;

    String SheetName= "Sheet1";



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
    }


    @DataProvider
    public Object[][] getLoginTestData () {
        Object data[][] = TestUtil.getTestData(SheetName);
        return data;
    }
    @Test(dataProvider = "getLoginTestData", priority = 2)
    public void multipleUserLoginTest (String username, String password) throws InterruptedException {
        loginPage.Login(username, password);
        homePage.Search();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterMethod
    public void teardown()
    {
        driver.close();
    }

}
