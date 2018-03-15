package edu.javatutorials.javadevmustknow._01___JAVA_CORE._11_Strings_Class.String_methods.charAt;

public class charAt_Example {

    /*
      Syntax.
      public char charAt(int index)       Parameters:     index − Index of the character to be returned.

      Description.
      This method returns the character located at the String's specified index.
      The string indexes start from zero.

      Return Value.
      This method returns a char at the specified index.
    */

    public static void main(String args[]) {
        String s = "abcdef";
        char result = s.charAt(2);
        System.out.println(result);

        System.out.println("1234.charAt(3) = " + "1234".charAt(3));
    }
}
