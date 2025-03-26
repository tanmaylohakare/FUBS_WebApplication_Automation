package com.TestPages;

import com.Pages.AddToCart;
import com.Pages.LoginPage;
import com.TestBase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileNotFoundException;

public class AddToCartPageTest extends TestBase {

    public LoginPage loginPage;
    public AddToCart addToCart;

    // Constructor to initialize the parent class (TestBase)
    public AddToCartPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() throws FileNotFoundException, AWTException {
        // Initialize browser and properties from TestBase
        initialization();

        // Instantiate required page objects
        loginPage = new LoginPage();
        addToCart = new AddToCart();
    }

    @Test

    public void AddToCartTest1() throws InterruptedException {
        loginPage.Login(prop.getProperty("email"), prop.getProperty("password"));

        addToCart.AddJewellery();

    }
}
