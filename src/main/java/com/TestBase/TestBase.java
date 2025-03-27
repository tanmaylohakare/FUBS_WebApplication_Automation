package com.TestBase;

import com.Util.TestUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public Properties prop;

    public static Logger log = LogManager.getLogger(TestBase.class);




    public TestBase()
    {
        PageFactory.initElements(driver,this);

        try
        {
            prop=new Properties();
            FileInputStream ip = new FileInputStream("C:\\Users\\91749\\Desktop\\HBN\\GIva_Application_WebAutomation\\src\\main\\java\\com\\config\\config.properties");

            prop.load(ip);

        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    public  void initialization()
    {

        PropertyConfigurator.configure("C:\\Users\\91749\\Desktop\\HBN\\GIva_Application_WebAutomation\\src\\test\\java\\resources\\Log4j.properties");

        String browserName =prop.getProperty("browser");

        if (browserName.equals("chrome"))
        {
            driver =new ChromeDriver();
        }
        else if (browserName.equals("FF"))
        {
            driver =new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));

    }

    public static WebDriver getDriver()
    {
        return driver;
    }

}
