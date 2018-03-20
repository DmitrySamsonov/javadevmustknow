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
public class Solution2_Bubble_Sort {

    public static void main(String[] args) {

        int arr[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
