package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import java.awt.GraphicsEnvironment;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

@ExtendWith(HeadlessExtension.class)
public class MySwingAppTest {

    private MySwingApp app;

    @BeforeAll
    public static void setUp() {
        Assertions.assertTrue(GraphicsEnvironment.isHeadless());
    }

    @Test
    public void testLabel() {
        app = new MySwingApp();
        String expectedText = "Hello, world!";
        String actualText = app.getLabelText();
        Assertions.assertEquals(expectedText, actualText);
    }
}

class HeadlessExtension implements ExecutionCondition {
    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
        return GraphicsEnvironment.isHeadless()
                ? ConditionEvaluationResult.enabled("Headless environment detected")
                : ConditionEvaluationResult.disabled("Test requires a headless environment");
    }
}
