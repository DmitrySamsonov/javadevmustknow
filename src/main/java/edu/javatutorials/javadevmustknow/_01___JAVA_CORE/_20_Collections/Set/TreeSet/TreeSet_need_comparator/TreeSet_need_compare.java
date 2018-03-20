package edu.javatutorials.javadevmustknow._01___JAVA_CORE._20_Collections.Set.TreeSet.TreeSet_need_comparator;

import java.util.TreeSet;

public class TreeSet_need_compare {
    public static void main(String args[]) {

        /**
         * Class Car must be cast to java.lang.Comparable,
         * otherwise you will get ClassCastException.
         */

        // Create a tree set
        TreeSet<Car> ts = new TreeSet();

        // Add elements to the tree set
        ts.add(new Car("BMW", 2000));
        ts.add(new Car("Audi", 2017));
        ts.add(new Car("Honda", 1998));
        ts.add(new Car("Lada", 2020));

    }
}
