package edu.javatutorials.javadevmustknow._01___JAVA_CORE._12_Arrays.Examples.How_to_search_min_and_max_element_in_array;

/**
 * Question:
 * How to search the minimum and the maximum element in an array ?
 */

/**
 * Answer:
 * do it manually
 */
public class Solution2_manually {
    public static void main(String[] args) {

        int numbers[] = new int[]{8, 2, 7, 1, 4, 9, 5};
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            else if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Largest Number is : " + max);
        System.out.println("Smallest Number is : " + min);
    }
}
