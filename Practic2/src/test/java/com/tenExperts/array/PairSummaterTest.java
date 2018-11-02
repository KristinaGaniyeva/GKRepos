package com.tenExperts.array;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PairSummaterTest {
    private static PairSummater pairSummater;

    @BeforeClass
    public static void setup(){
        pairSummater = new PairSummater();
    }

    @Test
    public void testPairSummater() throws ArraySummaterException {
        int[] mass = {2, 2, 5, 5};
        assertEquals(10, pairSummater.sum(mass));
    }

    @Test
    public void testPairSummaterMaxMinInt() throws ArraySummaterException {
        int[] mass = {7, 5, 50, 12};
        int max = pairSummater.sum(mass);
        assertTrue(max >= -2147483647);
    }

    @Test(expected = ArraySummaterException.class)
    public void testPairSummaterException() throws ArraySummaterException {
        int[] mass = {};
        assertEquals(0, pairSummater.sum(mass));
    }

    @Test(expected = ArraySummaterException.class)
    public void testPairSummaterExceptionEven() throws ArraySummaterException {
        int[] mass = {2,3,5};
        assertEquals(0, pairSummater.sum(mass));
    }
}