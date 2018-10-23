package com.tenexpert.summater.array;

/**
 * class SimpleSummater with method sum
 */
public class SimpleSummater implements IArraySummater {
    /**
     * sum- methods, which calculated sum of element of array
     * @param array  - array type of int
     * @return sumValue - sum of all elements in array
     */
    public  int sum(final int[] array) {
        int sumValue = 0;
        for (int i:array) {
            sumValue += i;
        }
return sumValue;
    }

}
