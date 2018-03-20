package edu.javatutorials.javadevmustknow._01___JAVA_CORE._11_Strings.String_methods.contains;

public class contains {

    public static void main(String[] args) {
        String str1 = "Search it";
        String str2 = "you Search";
        String str3 = "Search";
        String containsString = "Search";
        StringBuffer containsStringBuffer = new StringBuffer( "Search");

        System.out.println("\n\"Search it\".contentEquals(\"Search\") = " + str1.contains(containsString));
        System.out.println("\n\"you Search\".contentEquals(\"Search\") = " + str2.contains(containsString));
        System.out.println("\n\"Search\".contentEquals(\"Search\") = " + str3.contains(containsString) );
        System.out.println("\n\"Search\".contentEquals(new StringBuffer(\"Search\")) = " + str3.contains(containsStringBuffer) );
    }
}
