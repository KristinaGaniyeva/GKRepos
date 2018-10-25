package array;

import junit.framework.TestCase;

public class SummaterTest extends TestCase {

    public void testSimpleSummater() {
        Summater summater = new Summater();
        int[] mass = {10,5,1};
        assertEquals(16, summater.simpleSummater(mass));
    }

    public void testPairSummater() {
        Summater summater = new Summater();
        int[] mass = {7, 5, 1, 5};
        assertEquals(12, summater.pairSummater(mass));
    }

    public void testSumEven() {
        Summater summater = new Summater();
        int[] mass = {7, 5, 1, 5};
        assertTrue(mass.length % 2 == 0);
    }

    public void testPairSummaterMaxMinInt() {
        Summater summater = new Summater();
        int[] mass = {7, 5, 50, 12};
        int max = summater.pairSummater(mass);
        assertTrue(max <= 2147483647 && max >= -2147483647);
    }
}