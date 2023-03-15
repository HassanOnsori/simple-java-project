package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MySwingAppTest {


// Configuration to run in a headless environment
   @BeforeClass
   public static void setupHeadlessMode() {
       System.setProperty("java.awt.headless", "true");
   }

    @Test
    public void testLabel() {
        MySwingApp app = new MySwingApp();
        assertEquals("Hello, Swing!", app.label.getText());
    }
}
