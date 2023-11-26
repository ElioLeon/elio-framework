package org.elioleon.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BasePage {
    protected static WebDriver driver;

    protected BasePage() {
       initDriver();
    }

    protected static void initDriver(){
        driver = new ChromeDriver();
    }

    protected static void quitDriver(){
        driver.close();
    }
}
