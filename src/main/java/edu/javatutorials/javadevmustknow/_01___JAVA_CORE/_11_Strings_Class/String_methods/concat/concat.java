package edu.javatutorials.javadevmustknow._01___JAVA_CORE._11_Strings_Class.String_methods.concat;

public class concat {

    /*
    Syntax
    public String concat(String s)      Parameters:     s − the String that is concatenated to the end of this String.

    Return Value
    This methods returns a string
    that represents the concatenation of this object's characters
    followed by the string argument's characters.

    Description
    This method appends one String to the end of another.
    The method returns a String with the value of the String passed into the method,
    appended to the end of the String, used to invoke this method.
    */

    public static void main(String[] args) {
        String s = "aaaaa";
        s = s.concat("bb");
        System.out.println(s);
    }
}
