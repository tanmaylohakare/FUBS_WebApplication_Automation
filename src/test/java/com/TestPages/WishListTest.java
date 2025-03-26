package com.TestPages;

import com.Pages.AddToCart;
import com.Pages.AddToWishList;
import com.Pages.LoginPage;
import com.TestBase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileNotFoundException;

public class WishListTest extends TestBase {

    public LoginPage loginPage;
    public AddToWishList wishList;

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

}
