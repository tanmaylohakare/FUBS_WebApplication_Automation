package com.TestPages;

import com.Pages.AddToCart;
import com.Pages.LoginPage;
import com.TestBase.TestBase;
import com.Util.TestUtil;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileNotFoundException;

public class AddToCartPageTest extends TestBase {

    public LoginPage loginPage;
    public AddToCart addToCart;

    String SheetName= "Sheet1";



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


    @DataProvider
    public Object[][] getLoginTestData () {
        Object data[][] = TestUtil.getTestData(SheetName);
        return data;
    }
    @Test(dataProvider = "getLoginTestData", priority = 2)
    public void multipleUserLoginTest (String username, String password) throws InterruptedException {
        loginPage.Login(username, password);
        addToCart.AddJewellery();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
