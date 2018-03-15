package edu.javatutorials.javadevmustknow._01___JAVA_CORE._11_Strings_Class.String_methods.contentEquals;

public class contentEquals {

    /*
    Syntax
    public boolean contentEquals(StringBuffer sb)       Parameters:     sb − the StringBuffer to compare.

    Return Value
    true - if and only if this String
    represents the same sequence of characters as specified in StringBuffer,
    else false.

    Description
    This method returns true if and only if this String
    represents the same sequence of characters as specified in StringBuffer.
    */

    public static void main(String[] args) {
        String str1 = "Search it";
        String str2 = "you Search";
        String str3 = "Search";
        String containsString = "Search";
        StringBuffer containsStringBuffer = new StringBuffer( "Search");

        System.out.println("\n\"Search it\".contentEquals(\"Search\") = " + str1.contentEquals(containsString));
        System.out.println("\n\"you Search\".contentEquals(\"Search\") = " + str2.contentEquals(containsString));
        System.out.println("\n\"Search\".contentEquals(\"Search\") = " + str3.contentEquals(containsString) );
        System.out.println("\n\"Search\".contentEquals(new StringBuffer(\"Search\")) = " + str3.contentEquals(containsStringBuffer) );
    }
}
