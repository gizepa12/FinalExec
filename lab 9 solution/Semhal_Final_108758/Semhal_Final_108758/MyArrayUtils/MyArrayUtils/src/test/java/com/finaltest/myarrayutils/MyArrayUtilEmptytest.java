package com.finaltest.myarrayutils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class MyArrayUtilEmptytest {
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
        int[] input =  {};

        boolean result = myArrayUtils.hasMultipleMaximum(input);
        assertFalse(result);

    }
}
