package com.Pages;

import com.TestBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;

public class LoginPage extends TestBase {

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
        Thread.sleep(1000);
        password.sendKeys(pwd);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    }
