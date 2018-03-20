package edu.javatutorials.javadevmustknow._01___JAVA_CORE._20_Collections.Set.TreeSet;

import java.util.TreeSet;

public class TreeSetSimple {
    public static void main(String args[]) {
        // Create a tree set
        TreeSet ts = new TreeSet();

        // Add elements to the tree set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);
    }
}
