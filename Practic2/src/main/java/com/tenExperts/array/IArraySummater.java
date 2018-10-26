package com.tenExperts.array;

/**
 * Interface for determining the method of working with summater
 */
public interface IArraySummater {
    /**
     * Sum method
     * @param mass array
     * @return array
     * @throws ArraySummaterException exception for PairSummater
     */
    int sum(int[] mass) throws ArraySummaterException;
}
