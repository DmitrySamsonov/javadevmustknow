package edu.javatutorials.javadevmustknow._01___JAVA_CORE._50_Java8._1_Interfaces_and_abstract_classes.Interface;

interface InterfaceJava8 {

    //private state
    int i = 3;


    /**
     * interfaces cannot have a Constructor
     */
//    InterfaceJava8() {
//        System.out.println("useful Functionality in constructor");
//    }

//    InterfaceJava8(int value) {
//        System.out.println("useful Functionality in user constructor");
//    }


    void abstractMethod();


    default void defaultMethod() {
        System.out.println("default Functionality");
    }


}
