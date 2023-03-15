package com.example;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class MySwingAppTest {

    @Test
    public void testLabel() {
        MySwingApp app = new MySwingApp();
        assertEquals("Hello, Swing!", app.label.getText());
    }
}
