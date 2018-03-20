package edu.javatutorials.javadevmustknow._01___JAVA_CORE._12_Arrays.Examples.How_to_search_an_element_inside_an_array;

import java.util.Arrays;

/**
 * Question:
 * How to search an element inside an array?
 */

/**
 * Answer:
 * use Arrays.binarySearch(yourArray, searchingElement)
 */
public class Solution1_Arrays_binarySearch {
    public static void main(String[] args) {

        int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};

        /**
         * Before using Arrays.binarySearch()
         * you must sort yourArray
         */
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, 5);

        System.out.println(Arrays.toString(array));
        System.out.println("The index of element -2 is : " + index);
    }
}
