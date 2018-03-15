package edu.javatutorials.javadevmustknow._01___JAVA_CORE._40_IO._02__Stream._03__Character_Stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Copy an input file (having 16-bit unicode characters) into an output file
 */
public class CopyFile {
    private static final String INPUT_FILE_PATH = "src/main/java/edu/javatutorials/javadevmustknow/_01___JAVA_CORE/_40_IO/_02__Stream/_03__Character_Stream/input.txt";
    private static final String OUTPUT_FILE_PATH = "src/main/java/edu/javatutorials/javadevmustknow/_01___JAVA_CORE/_40_IO/_02__Stream/_03__Character_Stream/output.txt";

    public static void main(String args[]) throws IOException {

        /*
        Character Streams (in this example FileReader, FileWriter)
        are used to perform input and output for 16-bit unicode.
        */

        FileReader in = null;
        FileWriter out = null;

        try {
            String projectPath = System.getProperty("user.dir");
            in = new FileReader(projectPath + INPUT_FILE_PATH);
            out = new FileWriter(projectPath + OUTPUT_FILE_PATH);

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
