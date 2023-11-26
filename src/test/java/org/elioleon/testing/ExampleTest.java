package org.elioleon.testing;

import org.elioleon.logs.LogsManager;
import org.elioleon.pages.ExamplePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class ExampleTest {
    protected static ExamplePage example = new ExamplePage();

    @BeforeAll
    public static void connection(){
        example.connection("https://www.google.com/");
    }

    @AfterAll
    public static void closeConnection(){
        example.closeConnection();
    }

    public void checkTitle() {
        LogsManager.info("Step 1: Verify title");
        String title = example.getTitle();
        Assertions.assertEquals("Google", title);
        example.takeScreenShot("Title");
    }

    public void acceptCookies() {
        LogsManager.info("Step 2: Press accept all");
        example.aceptarAviso();
        example.takeScreenShot("Accept");
    }






    @Test
    void testExecution() {
        checkTitle();
        acceptCookies();
    }
}
