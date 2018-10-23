package com.tenexpert.summater.array;

/**
 * classPairSummater with method sum
 */
public class PairSummater implements IArraySummater {
    /**
     *
     * @param array  - array type of int
     * @return maxValue - max sum of pairs in array
     * @throws ArraySummaterException exception
     *
     */
    public int sum(final int[] array) throws ArraySummaterException {
        if (array.length <= 0 || array.length % 2 != 0) {
            throw new ArraySummaterException("array's length is odd");
        }
        int maxValue = array[0] + array[1];
        for (int i = 2; i < array.length - 1; i += 2) {
            if (array[i] + array[i + 1] > maxValue) {
                maxValue = array[i] + array[i + 1];
            }
        }
        return maxValue;
    }
}
