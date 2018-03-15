package edu.javatutorials.javadevmustknow._04___JDBC._3___Connections._3_Register_JDBC_Driver;


/**
 * Approach I - charAt_Example.forName()
 * <p>
 * The most common approach to register a driver
 * is to use Java's charAt_Example.forName() method,
 * to dynamically load the driver's class file into memory,
 * which automatically registers it.
 * <p>
 * This method is preferable because it allows you
 * to make the driver registration configurable and portable.
 * The following example uses charAt_Example.forName( ) to register the Oracle driver −
 */
public class Approach_1 {

    public void driverRegistration1() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        }
    }

    /**
     * You can use getInstance() method
     * to work around noncompliant JVMs,
     * but then you'll have to code for two extra Exceptions as follows −
     */
    public void driverRegistration2() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();

        } catch (ClassNotFoundException ex) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        } catch (IllegalAccessException ex) {
            System.out.println("Error: access problem while loading!");
            System.exit(2);
        } catch (InstantiationException ex) {
            System.out.println("Error: unable to instantiate driver!");
            System.exit(3);
        }

    }

}
