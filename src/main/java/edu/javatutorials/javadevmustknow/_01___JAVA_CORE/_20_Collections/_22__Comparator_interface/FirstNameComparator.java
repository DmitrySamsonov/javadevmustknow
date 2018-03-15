package edu.javatutorials.javadevmustknow._01___JAVA_CORE._20_Collections._22__Comparator_interface;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getFirstName().compareTo(person2.getFirstName());
    }
}
