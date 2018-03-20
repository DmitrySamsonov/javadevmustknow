package edu.javatutorials.javadevmustknow._01___JAVA_CORE._12_Arrays.Examples.How_to_write_an_array_of_strings_to_the_output_console;


/**
 * Question:
 * How to write an array of strings to the output console ?
 */

/**
 * Answer:
 * loop for, foreach
 */
public class Solution1_loop_for_foreach {
    public static void main(String[] args) {

        String[] array = new String[3];
        array[0] = "aaa";
        array[1] = "bbb";
        array[2] = "ccc";

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (String s : array) {
            System.out.println(s);
        }

    }
}
