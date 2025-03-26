package com.Pages;

import com.TestBase.TestBase;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class AddToCart extends TestBase {

Properties properties=new Properties();

    public AddToCart() throws AWTException {
        PageFactory.initElements(driver,this);
    }

    Robot robot =new Robot();

    public void AddJewellery() throws InterruptedException {
        properties.SearchBarClick();
        Thread.sleep(2000);
        properties.Rings();
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);

        // Search For Ring1

        properties.ClickRing1();
        Thread.sleep(3000);
        properties.AddButtonM();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(1000);

        //Search For Ring2

        properties.ClickRing2();
        Thread.sleep(3000);
        properties.AddButtonM();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(1000);

        //search for Ring 3

        properties.ClickRing3();
        Thread.sleep(3000);
        properties.AddButtonM();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(1000);

        // Search For Mini Combo

        properties.minicombo();
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        properties.clickCombo1();
        Thread.sleep(2000);
        properties.AddButtonM();
        driver.navigate().back();



    }






}
