package com.tenExperts;

import com.tenExperts.array.ArraySummaterException;
import com.tenExperts.array.PairSummater;

/**
 * Main application entry point
 */
public class Main {
    /**
     * Main function for app
     * @param args - console arguments
     */
    public static void main(final String [] args) {
        PairSummater summater = new PairSummater();
        int [] mass = {-10, -5, -5, -5};
        try {
            System.out.println(summater.sum(mass));
        } catch (ArraySummaterException e) {
            System.out.println("Inputed invalid array");
        }
    }
}
