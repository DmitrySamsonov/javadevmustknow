package edu.javatutorials.javadevmustknow._01___JAVA_CORE._11_Strings_Class.String_methods.compareToIgnoreCase;

public class compareToIgnoreCase {

    /*
    Syntax
    int compareToIgnoreCase(String str)         Parameters:     str − the String to be compared.

    Description
    This method compares two strings lexicographically, ignoring case differences.

    Return Value
    0  - if str1 equal to str2, ignoring case considerations
    <0 - if str1 less than str2, ignoring case considerations
    >0 - if str1 grater than str2, ignoring case considerations
     This method returns a negative integer, zero, or a positive integer
    as the specified String is greater than, equal to, or less than this String, ignoring case considerations.
    */


    public static void main(String args[]) {
        String str1 = "aaa";
        String str2 = "aAa";
        System.out.println("aaa.compareTo(aAa) = " + str1.compareTo(str2) + "\n");

        System.out.println("aaa.compareToIgnoreCase(aAa) = " + str1.compareToIgnoreCase(str2) + "\n");
    }
}
