package com.TestPages;

import com.Pages.LoginPage;
import com.TestBase.TestBase;
import com.Util.TestUtil;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileNotFoundException;

public class LoginPageTest extends TestBase
{
    LoginPage loginPage;
    String SheetName= "Sheet1";



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


    @DataProvider
    public Object[][] getLoginTestData () {
        Object data[][] = TestUtil.getTestData(SheetName);
        return data;
    }
    @Test(dataProvider = "getLoginTestData", priority = 2)
    public void multipleUserLoginTest (String username, String password) throws InterruptedException {
        loginPage.Login(username, password);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
