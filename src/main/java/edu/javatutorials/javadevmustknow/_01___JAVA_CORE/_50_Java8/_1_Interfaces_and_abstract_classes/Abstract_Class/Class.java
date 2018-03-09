package edu.javatutorials.javadevmustknow._01___JAVA_CORE._50_Java8._1_Interfaces_and_abstract_classes.Abstract_Class;

public class Class extends AbstractClass {

    public static void main(String[] args) {
        new Class().usingAbstractClass();
    }

    /**
     * we can call Constructors from abstract class
     */
    public Class() {
        super();
    }

    public Class(int value) {
        super(value);
    }

    void usingAbstractClass() {

        abstractMethod();
        method();


        //new AbstractClass();    abastract class cannot be instantiated!
        //new AbstractClass(10);    abastract class cannot be instantiated!
        //but we can call Constructors from abstract class !
        int value = new Class(10).value;
        System.out.println(value);


        /** can change state in abstract class */
        value = 5;

    }

    @Override
    void abstractMethod() {
        System.out.println("some Implementation");
    }
}
