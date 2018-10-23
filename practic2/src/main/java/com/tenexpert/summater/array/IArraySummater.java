package com.tenexpert.summater.array;

/**
 * IArraySummater - interface
 */
public interface IArraySummater {
    /**
     * sum function for summater
     * @param array  - array type of int
     *
     * @throws ArraySummaterException exception
     *  @return int - return value type of int
     */
    int sum(int[] array) throws ArraySummaterException;
}