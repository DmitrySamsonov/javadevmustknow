package edu.javatutorials.javadevmustknow._01___JAVA_CORE._20_Collections._22__Comparator_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Comparator - provides multiple sorting sequence
 */
public class Program {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Leonard", "Vinchi", 4));
        personList.add(new Person("Mike", "Magen", 4));
        personList.add(new Person("Alex", "Ornaldo", 28));
        personList.add(new Person("Frad", "Trihtr", 32));
        personList.add(new Person("David", "Popils", 4));
        personList.add(new Person("John", "Gathro", 9));
        personList.add(new Person("Bobik", "Grinvi", 4));
        personList.add(new Person("Peter", "Tefaka", 22));

        System.out.println("Show personList:\n");
        showPersonList(personList);


        System.out.println("Sorting by firstName:\n");
        Collections.sort(personList, new FirstNameComparator());
        showPersonList(personList);


        System.out.println("Sorting by lastName:\n");
        Collections.sort(personList, new LastNameComparator());
        showPersonList(personList);


        System.out.println("\nSorting by age:\n");
        Collections.sort(personList, new AgeComparator());
        showPersonList(personList);


        System.out.println("Sorting by age, and then by firstName:\n");
        Collections.sort(personList, new AgeComparator().thenComparing(new FirstNameComparator()));
        showPersonList(personList);

    }

    private static void showPersonList(List<Person> personList) {
        for (Person person : personList) {
            System.out.println(person.getFirstName() + "\t\t" + person.getLastName() + "\t\t" + person.getAge());
        }
        System.out.println("--------------------------------\n");
    }
}
