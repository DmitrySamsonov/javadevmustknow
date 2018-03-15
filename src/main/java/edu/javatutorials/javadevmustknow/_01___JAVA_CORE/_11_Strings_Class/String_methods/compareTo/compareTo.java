package edu.javatutorials.javadevmustknow._01___JAVA_CORE._11_Strings_Class.String_methods.compareTo;

public class compareTo {

    /*
    Syntax
    int compareTo(String anotherString)         Parameters:    anotherString − the String to be compared.

    Description
    This method compares two strings lexicographically.

    Return Value
    0  - if this string is lexicographically equal to the argument string;
    <0 - if this string is  lexicographically less than the argument string;
    >0 - if this string is lexicographically greater than the argument string.
    */
    public static void main(String[] args) {
        String str1 = "aaa";
        String str2 = "aaa";

        System.out.println("\"aaa\".compareTo(\"aaa\") = " + str1.compareTo(str2) + "\n");

        String str3 = new String("aaa");
        System.out.println("\"aaa\".compareTo(new String(\"aaa\")) = " + str1.compareTo(str3) + "\n\n");


        String str4 = "aaa";
        String str5 = "ddd";
        String str6 = "fff";
        System.out.println(str5 + ".compareTo(" + str6 + ") = " + str5.compareTo(str6) + "\n");

        System.out.println(str5 + ".compareTo(" + str4 + ") = " + str5.compareTo(str4) + "\n");

    }

}
