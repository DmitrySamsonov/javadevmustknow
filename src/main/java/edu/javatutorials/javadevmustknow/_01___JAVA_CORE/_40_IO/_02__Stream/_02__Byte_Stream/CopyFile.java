package edu.javatutorials.javadevmustknow._01___JAVA_CORE._40_IO._02__Stream._02__Byte_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static javax.imageio.ImageIO.getCacheDirectory;

/**
 * Copy an input file into an output file.
 */
public class CopyFile {

    private static final String INPUT_FILE_PATH = "/src/main/java/edu/javatutorials/javadevmustknow/_01___JAVA_CORE/_40_IO/_02__Stream/_02__Byte_Stream/input.txt";
    private static final String OUTPUT_FILE_PATH = "/src/main/java/edu/javatutorials/javadevmustknow/_01___JAVA_CORE/_40_IO/_02__Stream/_02__Byte_Stream/output.txt";

    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            String projectPath = System.getProperty("user.dir");
            in = new FileInputStream(projectPath + INPUT_FILE_PATH);
            out = new FileOutputStream(projectPath + OUTPUT_FILE_PATH);

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