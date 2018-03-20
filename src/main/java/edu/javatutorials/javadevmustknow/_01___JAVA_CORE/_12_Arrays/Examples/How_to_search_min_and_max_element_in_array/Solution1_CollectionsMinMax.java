package edu.javatutorials.javadevmustknow._01___JAVA_CORE._12_Arrays.Examples.How_to_search_min_and_max_element_in_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Question:
 * How to search the minimum and the maximum element in an array?
 */

/**
 * Answer:
 * use Collections.max() and Collections.min()
 */
public class Solution1_CollectionsMinMax {
    public static void main(String[] args) {

        int[] numbers = {8, 2, 7, 1, 4, 9, 5};

        List list = Arrays.asList(numbers);

        int min = (int) Collections.min(list);
        int max = (int) Collections.max(list);

        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
    }
}
