package com.tenExperts.array;

/**
 * Class for adding numbers to an array in pairs
 */
public class PairSummater implements IArraySummater {
    /**
     * The method adds in pairs the numbers of the array
     *
     * @param mass array
     * @return max element
     * @throws ArraySummaterException exception for PairSummater
     */
    public int sum(final int[] mass) throws ArraySummaterException {
        int maxElement = Integer.MIN_VALUE;
        int a = 0;
        if (mass.length != 0) {
            if (mass.length % 2 == 0) {
                for (int i = 0; i < mass.length - 1; i += 2) {
//                    maxElement = mass[0] + mass[1];
                    if (mass[i] > maxElement) {
                        a = mass[i] + mass[i + 1];
                        if (maxElement < a) {
                            maxElement = a;
                        }
                    }
                }
            } else {
                throw new ArraySummaterException("The array entered is not a multiple of two");
            }

        } else {
            throw new ArraySummaterException("Entered empty array");
        }
        return maxElement;
    }
}
