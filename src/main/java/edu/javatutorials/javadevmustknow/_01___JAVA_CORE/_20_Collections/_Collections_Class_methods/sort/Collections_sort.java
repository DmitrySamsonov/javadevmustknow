package edu.javatutorials.javadevmustknow._01___JAVA_CORE._20_Collections._Collections_Class_methods.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_sort {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("elephant", 1800));
        animalList.add(new Animal("rabbit", 8));
        animalList.add(new Animal("dog", 40));
        animalList.add(new Animal("squirrel", 2));
        animalList.add(new Animal("cat", 5));

        Collections.sort(animalList);
    }
}
