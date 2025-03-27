package com.Pages;

import com.TestBase.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SearchPage extends TestBase {

    Robot robot=new Robot();

    Properties properties=new Properties();

    Logger log = Logger.getLogger(SearchPage.class);


    public SearchPage() throws AWTException {
    }

    public void search() throws InterruptedException {
        properties.SearchBarClick();
        log.info("Clicked on Search Bar");
        Thread.sleep(2000);
        properties.Rings();
        log.info("Search for Rings");
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        properties.ClickRing1();
        log.info("Searched for Ring 1");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(1000);
        properties.ClickRing2();
        log.info("Searched for Ring 2");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(3000);
        properties.ClickRing3();
        log.info("Searched for Ring 3");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(1000);
        properties.minicombo();
        log.info("Searched for Mini Combo");
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        properties.clickCombo1();

    }


}
