package com.Pages;

import com.TestBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SearchPage extends TestBase {
//
//    public SearchPage() throws AWTException {
//        PageFactory.initElements(driver,this);
//    }
//
//    @FindBy(xpath = "//input[@placeholder='Search for products']")
//    WebElement SearchBar;
//
//    @FindBy(xpath = "//input[@placeholder='Search']")
//    WebElement Input;
//
//    @FindBy(xpath = "(//a[@class='t4s-full-width-link'])[3]")
//    WebElement Ring1;
//
//    @FindBy(xpath = "(//a[@class='t4s-full-width-link'])[4]")
//    WebElement Ring2;
//
//    @FindBy(xpath = "(//a[@class='t4s-full-width-link'])[5]")
//    WebElement Ring3;
//
//    @FindBy(xpath = "//a[@class='t4s-full-width-link']")
//    WebElement Combo1;
//
//    public void SearchBarClick()
//    {
//        SearchBar.click();
//    }
//    public void Rings()
//    {
//        SearchBar.sendKeys("Rings");
//    }
//
//    public void SearchRing1()
//    {
//        Ring1.click();
//    }
//
//    public void SearchRing2()
//    {
//        Ring2.click();
//    }
//
//    public void SearchRing3()
//    {
//        Ring3.click();
//    }
//
//    public void clickCombo1()
//    {
//        Combo1.click();
//    }

    Robot robot=new Robot();

    Properties properties=new Properties();

    public SearchPage() throws AWTException {
    }

    public void search() throws InterruptedException {
        properties.SearchBarClick();
        Thread.sleep(2000);
        properties.Rings();
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        properties.ClickRing1();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(1000);
        properties.ClickRing2();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(3000);
        properties.ClickRing2();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(1000);
        properties.minicombo();
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        properties.clickCombo1();



    }


}
