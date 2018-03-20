package edu.javatutorials.javadevmustknow._01___JAVA_CORE._20_Collections.Examples.How_to_convert_collection_to_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Question:
 * How to convert collection to array?
 */
/**
 * Answer:
 *
 * */

public class CollectionToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");

        String[] s1 = list.toArray(new String[0]);

        System.out.println(Arrays.toString(s1));
    }
}
