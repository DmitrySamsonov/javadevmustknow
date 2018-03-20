package edu.javatutorials.javadevmustknow._01___JAVA_CORE._20_Collections.Examples.How_to_convert_an_array_into_a_collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
/**
 * Question:
 * How to convert an array into a collection?
 */

/**
 * Answer:
 * Arrays.asList(yourArray) return ArrayList
 */
public class ArrayToCollection {
    public static void main(String args[]) throws IOException {
        String[] name = createAndInitArrayFromConsole();

        List<String> list = Arrays.asList(name);
        System.out.println();

        for (String li : list) {
            String str = li;
            System.out.print(str + " ");
        }
    }

    private static String[] createAndInitArrayFromConsole() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many elements you want to add to the array: ");
        int n = Integer.parseInt(in.readLine());
        String[] name = new String[n];

        System.out.println("\nEnter elements:");
        for (int i = 0; i < n; i++) {
            name[i] = in.readLine();
        }
        return name;
    }
}
