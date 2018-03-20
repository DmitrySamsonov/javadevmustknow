package edu.javatutorials.javadevmustknow._01___JAVA_CORE._12_Arrays.Examples.How_to_search_an_element_inside_an_array;

/**
 * Question:
 * How to search an element inside an array?
 */

/**
 * Answer:
 * go through all the elements manually in the loop
 */
public class Solution2_Linear_Search {
    public static void main(String[] args) {

        int[] a = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};

        int searchingElement = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == searchingElement) {
                System.out.println("Element found at index " + i);
                break;
            }
        }
    }


}
