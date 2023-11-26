package org.elioleon.base;

import org.elioleon.logs.LogsManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;

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

    protected  void screenShot() {
        try{
            File source = ((ChromeDriver)driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(source, new File("QED_Full_Page_Screenshot.png"));
        }catch (IOException ex){
            LogsManager.error(ex.getMessage());
        }
    }
}
