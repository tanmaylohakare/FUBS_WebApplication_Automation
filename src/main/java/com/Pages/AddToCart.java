package com.Pages;

import com.TestBase.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class AddToCart extends TestBase {

    Properties properties=new Properties();

    Logger log = Logger.getLogger(AddToCart.class);



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

        // Select For Ring1

        properties.ClickRing1();
        Thread.sleep(3000);
        properties.AddButtonM();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(1000);
        log.info("Ring 1 Added to Cart");


        //Select For Ring2

        properties.ClickRing2();
        Thread.sleep(3000);
        properties.AddButtonM();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(1000);
        log.info("Ring 2 Added to Cart");
        //Select for Ring 3

        properties.ClickRing3();
        Thread.sleep(3000);
        properties.AddButtonM();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(1000);
        log.info("Ring 3 Added to Cart");
        // Select For Mini Combo

        properties.minicombo();
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        properties.clickCombo1();
        Thread.sleep(2000);
        properties.AddButtonM();
        driver.navigate().back();
        log.info("Mini Combo Added to Cart");




    }






}
