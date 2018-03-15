package edu.javatutorials.javadevmustknow._01___JAVA_CORE._20_Collections._22__Comparator_interface;

import java.util.Comparator;

public class AgeComparator implements Comparator {
    @Override
    public int compare(Object object1, Object object2) {
        Person person1 = (Person) object1;
        Person person2 = (Person) object2;


        if (person1.getAge() == person2.getAge()) {
            return 0;
        } else if(person1.getAge() > person2.getAge()){
            return 1;
        } else {
            return -1;
        }
    }
}
