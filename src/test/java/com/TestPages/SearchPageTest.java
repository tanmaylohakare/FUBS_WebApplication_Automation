package com.TestPages;

import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Pages.SearchPage;
import com.TestBase.TestBase;
import com.Util.TestUtil;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileNotFoundException;

public class SearchPageTest extends TestBase {

    LoginPage loginPage;
    SearchPage searchPage;

    String SheetName= "Sheet1";


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

    @DataProvider
    public Object[][] getLoginTestData () {
        Object data[][] = TestUtil.getTestData(SheetName);
        return data;
    }
    @Test(dataProvider = "getLoginTestData", priority = 2)
    public void multipleUserLoginTest (String username, String password) throws InterruptedException {
        loginPage.Login(username, password);
        searchPage.search();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
