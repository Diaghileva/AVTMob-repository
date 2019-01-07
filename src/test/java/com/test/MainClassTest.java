package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test
 */
public class MainClassTest {

    private MainClass mainClass;

    @Before
    public void init() {
        mainClass = new MainClass();
    }


    /**
     * Test 1 task
     */
    @Test
    public void testGetLocalNumber() {
        assertEquals("Actual number is not equal to expected 14", 14, mainClass.getLocalNumber());
    }
    /**
     * Test 2 task. Check that getClassNumber method returns a number larger than 45
     */
    @Test
    public void testGetClassNumber() {
        assertFalse("The returned value equals to 45",mainClass.getClassNumber() == 45);
        assertTrue("The returned value is less than 45",mainClass.getClassNumber() > 45);
    }
    /**
     * Test 3 task. Check that getClassString method returns a string containing "hello" or "Hello" substrings
     */
    @Test
    public void testGetClassString() {
        assertTrue("The required text is not found",mainClass.getClassString().contains("hello") || mainClass.getClassString().contains("Hello"));
    }
}

