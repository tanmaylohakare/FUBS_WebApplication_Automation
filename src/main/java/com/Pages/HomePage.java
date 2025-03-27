package com.Pages;

import com.TestBase.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.FileNotFoundException;

public class HomePage extends TestBase {

    Logger log = Logger.getLogger(HomePage.class);


    @FindBy(xpath = "//a[normalize-space()='HOME']")
    WebElement HomeButton;

    @FindBy(xpath = "//a[@class='t4s-full-width-link is--href-replaced']")
    WebElement jewelery;

    public HomePage() throws FileNotFoundException, AWTException {
        PageFactory.initElements(driver,this);
    }


    public void Search() throws InterruptedException {
        Thread.sleep(3000);
        HomeButton.click();
        log.info("Go To Home");
        Thread.sleep(1000);
        jewelery.click();
        log.info("Go on the Jewelery");
        Thread.sleep(2000);
        driver.navigate().back();


    }

}
