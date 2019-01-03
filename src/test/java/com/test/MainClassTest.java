package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test
 */
public class MainClassTest {
    /**
     * Test 1 task
     */
    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();
        assertEquals("Actual number is not equal to expected 14", 14, mainClass.getLocalNumber());
    }
}
