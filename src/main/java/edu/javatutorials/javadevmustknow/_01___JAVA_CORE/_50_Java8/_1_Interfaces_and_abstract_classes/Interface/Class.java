package edu.javatutorials.javadevmustknow._01___JAVA_CORE._50_Java8._1_Interfaces_and_abstract_classes.Interface;

public class Class implements InterfaceJava8 {

    public static void main(String[] args) {
        new Class().usingInterfaceJava8();
    }



    void usingInterfaceJava8() {

        abstractMethod();
        defaultMethod();


        /** cannot change state in interfaces */
        // i = 6;

    }


    @Override
    public void abstractMethod() {
        System.out.println("some Implementation");
    }
}
