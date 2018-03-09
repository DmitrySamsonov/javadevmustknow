package edu.javatutorials.javadevmustknow._04___JDBC.JDBC_Examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {

    // _04___JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/";


    //  Database credentials
    static final String USER = "username";
    static final String PASSWORD = "password";

    Connection connection = null;
    Statement statement = null;

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        if (connection == null) {
            createConnection();
        }
        return connection;

    }

    private void createConnection() throws ClassNotFoundException, SQLException {
        //Load jdbc_driver class
        Class.forName(JDBC_DRIVER);

        //STEP 3: Open a connection
        System.out.println("Connecting to database...");
        connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }

    public void getStatement() {

    }

    public void method() {

        try {


            //STEP 4: Execute a query
            System.out.println("Creating database...");
            try {
                statement = connection.createStatement();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }

            String sql = "CREATE DATABASE STUDENTS";
            try {
                statement.executeUpdate(sql);
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            System.out.println("Database created successfully...");
        } catch ( Exception e)
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally

        {
            //finally block used to close resources
            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");


    }

}
