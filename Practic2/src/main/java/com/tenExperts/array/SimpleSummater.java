package com.tenExperts.array;

/**
 * Class for adding all the numbers in an array
 */
public class SimpleSummater implements IArraySummater {
    /**
     * The method adds all the numbers of the array
     * @param mass array
     * @return sum
     */
    public int sum(final int[] mass) {
        int sum = 0;

        for (int mas : mass) {
            sum += mas;
        }
        return sum;
    }
}
