package org.elioleon.pages;

import org.elioleon.base.BasePage;
import org.elioleon.logs.LogsManager;


public class ExamplePage extends BasePage {
    public ExamplePage() {
        super();
    }

    public void connection(String url){
        driver.navigate().to(url);
        LogsManager.info("Navigate to " + url);
    }

    public void closeConnection(){
        quitDriver();
    }

    public void takeScreenShot() {
        screenShot();
    }

    public String getTitle(){
        return  driver.getTitle();
    }

}
