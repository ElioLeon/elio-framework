package org.elioleon.testing;

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

    @Test
    void eightComponents() {
        String title = example.getTitle();
        Assertions.assertEquals("Google", title);
    }
}