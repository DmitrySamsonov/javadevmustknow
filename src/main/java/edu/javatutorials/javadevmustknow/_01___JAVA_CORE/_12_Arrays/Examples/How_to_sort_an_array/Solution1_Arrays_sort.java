package edu.javatutorials.javadevmustknow._01___JAVA_CORE._12_Arrays.Examples.How_to_sort_an_array;

import java.util.Arrays;

/**
 * Question:
 * How to sort an array?
 */

/**
 * Answer:
 * use Arrays.sort(yourArray)
 */
public class Solution1_Arrays_sort {
    public static void main(String[] args) {

        int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
