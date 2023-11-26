package org.elioleon.pages;

import org.elioleon.base.BasePage;
import org.elioleon.logs.LogsManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class ExamplePage extends BasePage {

    @FindBy(how = How.XPATH, using = "//button//div[contains(text(),'Aceptar todo')]")
    protected WebElement btnAceptar;

    public ExamplePage() {
        super();
        PageFactory.initElements(driver, this);
    }

    public void connection(String url){
        driver.navigate().to(url);
        LogsManager.info("Navigate to " + url);
    }

    public void closeConnection(){
        quitDriver();
    }

    public void takeScreenShot(String name) {
        screenShot(name);
    }

    public void aceptarAviso(){
        btnAceptar.click();
        LogsManager.info("Se pulsa el boton aceptar");
    }

    public String getTitle(){
        return  driver.getTitle();
    }

}
