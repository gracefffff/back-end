package com.tenexpert.summater.array;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PairSummaterTest {
    private PairSummater pairSummater;
    @Before
    public void setUp() {
        this.pairSummater = new PairSummater();
    }
    @Test
    public void testSum() throws ArraySummaterException{
        int[] original = {10,-4,15,5};
        int sum = this.pairSummater.sum(original);
        assertEquals("Wrong result", 20, sum);
    }
    @Test
    public void testSum1() throws ArraySummaterException{
        int[] original = {0,0,0,0};
        int sum = this.pairSummater.sum(original);
        assertEquals("Wrong result", 0, sum);
    }
    @Test(expected = ArraySummaterException.class)
    public void testSum2() throws ArraySummaterException{
        int[] original = {2,1,3};
        int sum = this.pairSummater.sum(original);

    }
}


