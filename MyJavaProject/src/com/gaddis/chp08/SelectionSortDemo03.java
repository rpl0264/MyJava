package com.gaddis.chp08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * This program demonstrates the Arrays.sort method.
 *
 */
public class SelectionSortDemo03 {

    public static void main(String[] arg) {
        Integer[] arr = {12, 67, 1, 34, 9, 78, 6, 31};
        Integer[] arr01 = {4, 99, 1, 56, 3, 78, 6, 45};

        //You just need to write one string Arrays.sort(arr) for low to high 
        Arrays.sort(arr01);
        System.out.println("low to high:" + Arrays.toString(arr));



        //write one string Arrays.sort(arr) for low to hight 
        Arrays.sort(arr01, Collections.reverseOrder());

        System.out.println("high to low:" + Arrays.toString(arr01));

    }
}
