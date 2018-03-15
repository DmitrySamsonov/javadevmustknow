package edu.javatutorials.javadevmustknow._01___JAVA_CORE._40_IO._02__Stream._04__Standart_Streams;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program creates InputStreamReader to read standard input stream
 * until the user types a "q"
 */
public class ReadConsole {

    public static void main(String args[]) throws IOException {
        InputStreamReader cin = null;

        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter characters, 'q' to quit.");
            char c;
            do {
                c = (char) cin.read();
                System.out.print(c);
            } while (c != 'q');
        } finally {
            if (cin != null) {
                cin.close();
            }
        }
    }

}
