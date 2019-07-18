package com.gaddis.chp08;

import java.util.Arrays;
import java.util.Comparator;

/**
 * This program demonstrates the Arrays.sort method.
 *
 */
public class SelectionSortDemo02 {

    public static void main(String[] arg) {
        Integer[] arr = {12, 67, 1, 34, 9, 78, 6, 31};
        Integer[] arr01 = {4, 99, 1, 56, 3, 78, 6, 45};
        Arrays.sort(arr, new Comparator<Integer>() {

            @Override
            public int compare(Integer x, Integer y) {
                return x - y;
            }
        });

        System.out.println("low to high:" + Arrays.toString(arr));




        //if you need high to low change x-y to y-x in the comparator
        Arrays.sort(arr01, new Comparator<Integer>() {

            @Override
            public int compare(Integer x, Integer y) {
                return y - x;
            }
        });

        System.out.println("high to low:" + Arrays.toString(arr01));

    }
}
