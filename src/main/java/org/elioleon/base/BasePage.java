package org.elioleon.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BasePage {
    protected static WebDriver driver;
    public static final Logger logger = LogManager.getLogger();


    protected BasePage() {
       initDriver();
    }

    protected static void initDriver(){
        driver = new ChromeDriver();
        logger.info("Initialize driver");
    }

    protected static void quitDriver(){
        driver.close();
        logger.info("Close driver");
    }
}
