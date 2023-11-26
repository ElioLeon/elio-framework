package org.elioleon.base;

import org.elioleon.logs.LogsManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BasePage {
    protected WebDriver driver;


    protected BasePage() {
       initDriver();
    }

    protected void initDriver(){
        driver = new ChromeDriver();
        LogsManager.info("Initialize driver");
    }

    protected void quitDriver(){
        driver.quit();
        LogsManager.info("Close driver");
    }
}
