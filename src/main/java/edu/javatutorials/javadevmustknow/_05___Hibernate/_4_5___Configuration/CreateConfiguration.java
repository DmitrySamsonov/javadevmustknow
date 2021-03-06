package edu.javatutorials.javadevmustknow._05___Hibernate._4_5___Configuration;

import org.hibernate.cfg.Configuration;

import java.util.Properties;

public class CreateConfiguration {

    public static void main(String[] args) {
        start();
    }


    /**
     * The Configuration object - is the first Hibernate object
     * you create in any Hibernate application.
     *  
     * It is usually created only once
     * during application initialization.
     *  
     * It represents a configuration or properties file required by the Hibernate.
     *  
     * The Configuration object provides two keys components −
     *  
     *   1.   Database Connection − This is handled through one or more configuration files supported by Hibernate.
     *                                These files are hibernate.properties and hibernate.cfg.xml.
     *  
     *  
     *   2.   charAt_Example Mapping Setup − This component creates the connection between the Java classes and database tables.
     */

    private static void start() {

        Configuration configuration = new Configuration();
        /**
         * By default configuration find hibernate.properties file
         */

        configuration.configure("edu/javatutorials/javadevmustknow/_05___Hibernate/_4_5___Configuration/hibernate.cfg.xml");

        /*
        If the mapping files are in the classpath, use addResource()
        for specifying XML mapping documents
        */
        configuration
//                .addResource("Animal.hbm.xml")
                .addResource("edu/javatutorials/javadevmustknow/_05___Hibernate/_4_5___Configuration/Employee.hbm.xml");

        /*
        Also you can to specify the mapped class and allow Hibernate to find the mapping document for you.

        Hibernate will then search for mapping files
        named /org/hibernate/auction/Animal.hbm.xml and /org/hibernate/auction/Car.hbm.xml in the classpath.

        This approach eliminates any hardcoded filenames.
        */
        configuration
//                .addClass(org.hibernate.auction.Car.class)
                .addClass(edu.javatutorials.javadevmustknow._05___Hibernate._4_5___Configuration.Employee.class);

        /*
        Also you can specify configuration properties manually
        */
        configuration
                .setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver")
                .setProperty("hibernate.connection.url","jdbc:mysql://localhost/test")
                .setProperty("hibernate.connection.username","root")
                .setProperty("hibernate.connection.password","root");

        /*
        Or you can Load properties from instance of java.util.Properties
        */
        Properties properties = new Properties();
        configuration
                .setProperties(properties);

    }


}
