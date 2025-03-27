package com.TestPages;

import com.Pages.AddToCart;
import com.Pages.AddToWishList;
import com.Pages.LoginPage;
import com.TestBase.TestBase;
import com.Util.TestUtil;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileNotFoundException;

public class WishListTest extends TestBase {

    public LoginPage loginPage;
    public AddToWishList wishList;
    String SheetName= "Sheet1";


    public WishListTest()
    {
        super();
    }

    @BeforeMethod
    public void setup() throws FileNotFoundException, AWTException {
        // Initialize browser and properties from TestBase
        initialization();

        // Instantiate required page objects
        loginPage = new LoginPage();
        wishList = new AddToWishList();
    }

    @Test
    public void WishListTest1() throws InterruptedException {
        loginPage.Login(prop.getProperty("email"), prop.getProperty("password"));
        wishList.AddToWishListM();
    }

    @DataProvider
    public Object[][] getLoginTestData () {
        Object data[][] = TestUtil.getTestData(SheetName);
        return data;
    }
    @Test(dataProvider = "getLoginTestData", priority = 2)
    public void multipleUserLoginTest (String username, String password) throws InterruptedException {
        loginPage.Login(username, password);
        wishList.AddToWishListM();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
