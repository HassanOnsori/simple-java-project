package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MySwingAppTest {

    // Configuration to run in a headless environment
    @BeforeClass
    public static void setUpClass() {
        System.setProperty("java.awt.headless", "true");
    }

    @Test
    public void testLabel() {
        MySwingApp app = new MySwingApp();
        assertEquals("Hello, Swing!", app.label.getText());
    }
}
