package edu.javatutorials.javadevmustknow._01___JAVA_CORE._20_Collections._22__Comparator_interface;

import java.util.Comparator;

public class LastNameComparator implements Comparator {
    @Override
    public int compare(Object object1, Object object2) {
        Person person1 = (Person) object1;
        Person person2 = (Person) object2;

        return person1.getLastName().compareTo(person2.getLastName());
    }
}
