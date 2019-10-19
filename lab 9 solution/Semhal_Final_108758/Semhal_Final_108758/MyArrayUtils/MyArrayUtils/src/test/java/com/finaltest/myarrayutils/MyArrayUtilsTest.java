package com.finaltest.myarrayutils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayUtilsTest {
    MyArrayUtils myArrayUtils;
    @Before
    public void setUp() throws Exception {
        this.myArrayUtils = new MyArrayUtils();
    }

    @After
    public void tearDown() throws Exception {
        this.myArrayUtils = null;
    }

    @Test
    public void hasMultipleMaximum() {
        int[] input = {-6, 2, 5, 6, -6, 5, 6};

        boolean result = myArrayUtils.hasMultipleMaximum(input);
        boolean expected= true;
        assertEquals(result, expected);

    }
    /*@Test
    public void hasMultipleMaximum2() {
        int[] input = {-6, 2, 5, -6, 5, 6};
        boolean result = myArrayUtils.hasMultipleMaximum(input);
        boolean expected= true;
        assertEquals(result, expected);
    }*/
}