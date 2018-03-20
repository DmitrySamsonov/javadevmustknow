package edu.javatutorials.javadevmustknow._01___JAVA_CORE._20_Collections.Set.TreeSet.TreeSet_need_comparator;

public class Car implements Comparable{

    private String name;
    private int year;

    public Car() {
    }

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
