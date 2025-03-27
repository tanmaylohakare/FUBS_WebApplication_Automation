package com.Pages;

import com.TestBase.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;

public class LoginPage extends TestBase {

    Logger log = Logger.getLogger(LoginPage.class);


    @FindBy(xpath = "//a[@class=\"t4s-pr\"]")
    WebElement LoginButton1;

    @FindBy(xpath="//input[@id='CustomerEmail']")
    WebElement email;

    @FindBy(xpath="//input[@id='CustomerPassword']")
    WebElement password;

    Robot robot=new Robot();

    public LoginPage() throws FileNotFoundException, AWTException {
        super();
        PageFactory.initElements(driver,this);
    }

    public void Login(String em, String pwd) throws InterruptedException {
        email.sendKeys(em);
        log.info("Entered email: " + em);
        Thread.sleep(1000);
        password.sendKeys(pwd);
        log.info("Entered password");
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        log.info("Login submitted");

    }

    }
