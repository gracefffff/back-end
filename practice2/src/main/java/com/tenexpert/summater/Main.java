package com.tenexpert.summater;

import com.tenexpert.summater.array.SimpleSummater;

/**
 * class main
 */
public  final class Main {
    private Main() {

    }

    /**
     * this main for check working my method
     * @param args args for command line
     */
    public static void main(final String[] args) {

        SimpleSummater simpleSummater = new SimpleSummater();
        int[] array = {1, 1, 2, 2};
        System.out.println(simpleSummater.sum(array));
    }
}
