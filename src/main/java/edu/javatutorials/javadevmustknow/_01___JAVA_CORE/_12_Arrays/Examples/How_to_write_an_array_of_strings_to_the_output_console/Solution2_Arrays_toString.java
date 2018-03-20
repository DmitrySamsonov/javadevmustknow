package edu.javatutorials.javadevmustknow._01___JAVA_CORE._12_Arrays.Examples.How_to_write_an_array_of_strings_to_the_output_console;

import java.util.Arrays;

/**
 * Question:
 * How to write an array of strings to the output console ?
 */

/**
 * Answer:
 * use Array.toString(yourArray)
 */
public class Solution2_Arrays_toString {
    public static void main(String[] args) {

        String[] arr = new String[]{"Tutorials", "Point", ".com"};

        System.out.println(Arrays.toString(arr));


        /*
        If Nested Array
        */
        String[][] deepArr = new String[][]{{"Sai", "Gopal"}, {"Pallavi", "Priya"}};
        System.out.println(Arrays.deepToString(deepArr));

    }
}
