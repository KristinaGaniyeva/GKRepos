package com.tenExperts.array;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleSummaterTest {
    private static SimpleSummater simpleSummater;

    @BeforeClass
    public static void setup(){
        simpleSummater = new SimpleSummater();
    }

    @Test
    public void testSimpleSummater() {
        int[] mass = {2, 2, 5, 5};
        assertEquals(14, simpleSummater.sum(mass));
    }

}