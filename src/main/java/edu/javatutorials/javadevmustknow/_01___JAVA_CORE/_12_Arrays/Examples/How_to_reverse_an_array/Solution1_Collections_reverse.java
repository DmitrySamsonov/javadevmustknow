package edu.javatutorials.javadevmustknow._01___JAVA_CORE._12_Arrays.Examples.How_to_reverse_an_array;

/**
 * Question:
 * How to reverse an array list ?
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Answer:
 * use Collections.reverse(yourArrayList)
 */
public class Solution1_Collections_reverse {
    public static void main(String[] args) {

        int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};


        List list = Arrays.asList(array);

        Collections.reverse(list);

        Object[] objectsArray = list.toArray();
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = ((Integer) objectsArray[i]).intValue();
        }
        System.out.println(Arrays.toString(array));
    }
}
