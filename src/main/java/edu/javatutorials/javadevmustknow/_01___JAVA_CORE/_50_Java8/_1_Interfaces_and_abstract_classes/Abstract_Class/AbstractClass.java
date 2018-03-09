package edu.javatutorials.javadevmustknow._01___JAVA_CORE._50_Java8._1_Interfaces_and_abstract_classes.Abstract_Class;

abstract public class AbstractClass {

    //private state
    int value = 4;

    AbstractClass() {
        System.out.println("useful Functionality in constructor");
    }

    AbstractClass(int value) {
        System.out.println("useful Functionality in user constructor");
        this.value = value;
    }


    void method() {
        System.out.println("useful Functionality in method");
    }

    abstract void abstractMethod();

}
