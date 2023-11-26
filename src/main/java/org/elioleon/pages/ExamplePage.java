package org.elioleon.pages;

import org.elioleon.base.BasePage;

public class ExamplePage extends BasePage {
    public ExamplePage() {
        super();
    }

    public void connection(String url){
        driver.navigate().to(url);
    }

    public void closeConnection(){
        BasePage.quitDriver();
    }

    public String getTitle(){
        return  driver.getTitle();
    }

}
