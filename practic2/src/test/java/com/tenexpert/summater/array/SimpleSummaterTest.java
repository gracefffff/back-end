package com.tenexpert.summater.array;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SimpleSummaterTest {
        private SimpleSummater simpleSummater;
        @Before
        public void setUp() {
            this.simpleSummater = new SimpleSummater();
        }
        @Test
        public void testSum(){
            int[] original = {10,-4,15,5,6};
            int sum = this.simpleSummater.sum(original);
            assertEquals("Wrong result", 32, sum);
        }
        @Test
        public void testSum1(){
        int[] original = {0,0,0,0};
        int sum = this.simpleSummater.sum(original);
        assertEquals("Wrong result", 0, sum);
    }
}


