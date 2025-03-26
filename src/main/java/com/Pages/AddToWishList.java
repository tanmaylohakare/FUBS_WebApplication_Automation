package com.Pages;

import com.TestBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToWishList extends TestBase {

    @FindBy(xpath = "//a[text()='JAIPURI SETS']")
    WebElement JaipuriSets;

    @FindBy(xpath = "(//span[@class=\"t4s-svg-pr-icon\"])[4]")
    WebElement DualToneJewelry;

    @FindBy(xpath = "(//span[@class=\"t4s-svg-pr-icon\"])[6]")
    WebElement Earingset;

    @FindBy(xpath = "//a[text()='WEDDING COLLECTION']")
    WebElement WeddingCollection;

    @FindBy(xpath = "(//span[@class='t4s-svg-pr-icon'])[4]")
    WebElement Dazzling_White;

    @FindBy(xpath = "(//span[@class='t4s-svg-pr-icon'])[6]")
    WebElement Timeless_Grace;

    @FindBy(xpath = "(//a[@class=\"t4s-pr\"])[2]")
    WebElement WishList;


    public AddToWishList()
    {
        PageFactory.initElements(driver,this);
    }

    public void AddToWishListM() throws InterruptedException {
        JaipuriSets.click();
        Thread.sleep(2000);

        DualToneJewelry.click();
        Thread.sleep(2000);

        Earingset.click();
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(2000);

        WeddingCollection.click();
        Thread.sleep(2000);

        Dazzling_White.click();
        Thread.sleep(2000);

        Timeless_Grace.click();
        Thread.sleep(2000);

        WishList.click();


    }



}
