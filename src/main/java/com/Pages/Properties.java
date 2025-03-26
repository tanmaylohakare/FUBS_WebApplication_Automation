package com.Pages;

import com.TestBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Properties extends TestBase {

public  Properties()
{
    PageFactory.initElements(driver,this);
}
    @FindBy(xpath = "//input[@placeholder='Search for products']")
    WebElement SearchBar;

    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement Input;

    @FindBy(xpath = "(//a[@class='t4s-full-width-link'])[3]")
    WebElement Ring1;

    @FindBy(xpath = "(//a[@class='t4s-full-width-link'])[4]")
    WebElement Ring2;

    @FindBy(xpath = "(//a[@class='t4s-full-width-link'])[5]")
    WebElement Ring3;

    @FindBy(xpath = "//a[@class='t4s-full-width-link']")
    WebElement Combo1;

    @FindBy(xpath = "//button[@name='add']")
    WebElement AddButton;

    public void SearchBarClick()
    {
        SearchBar.click();
    }
    public void Rings()
    {
        SearchBar.sendKeys("Rings");
    }

    public void ClickRing1()
    {
        Ring1.click();
    }

    public void ClickRing2()
    {
        Ring2.click();
    }

    public void ClickRing3()
    {
        Ring3.click();
    }

    public void clickCombo1()
    {
        Combo1.click();
    }

    public void minicombo()
    {
        SearchBar.sendKeys("mini combo");
    }

    public void AddButtonM()
    {
        AddButton.click();
    }
}
