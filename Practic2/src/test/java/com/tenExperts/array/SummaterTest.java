package com.tenExperts.array;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SummaterTest {
    private static SimpleSummater simpleSummater;
    private static PairSummater pairSummater;

    @BeforeClass
    public static void setup(){
        simpleSummater = new SimpleSummater();
        pairSummater = new PairSummater();
    }

    @Test
    public void testSimpleSummater() {
        int[] mass = {2, 2, 5, 5};
        assertEquals(14, simpleSummater.sum(mass));
    }

    @Test
    public void testPairSummater() throws ArraySummaterException {
        int[] mass = {2, 2, 5, 5};
        assertEquals(10, pairSummater.sum(mass));
    }

    @Test
    public void testSumEven() {
        int[] mass = {7, 5, 1, 5};
        assertEquals(0, mass.length % 2);
    }

    @Test
    public void testPairSummaterMaxMinInt() {
        int[] mass = {7, 5, 50, 12};
        int max = simpleSummater.sum(mass);
        assertTrue(max >= -2147483647);
    }
}