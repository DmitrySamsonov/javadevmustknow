package edu.javatutorials.javadevmustknow._30___MyTestTasks.gpSolutions3.Task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.LinkedList;
import java.util.Scanner;

public class Samsonov_1 {
    private static final String PROJECT_PATH = System.getProperty("user.dir");
    private static final String MY_WORK_DIRECTORY = "/src/main/java/edu/javatutorials/javadevmustknow/_30___MyTestTasks/gpSolutions3/Task1";
    private static final String INPUT_FILE_PATH = PROJECT_PATH + MY_WORK_DIRECTORY + "/input.txt";
    private static final String OUTPUT_FILE_PATH = PROJECT_PATH + MY_WORK_DIRECTORY + "/output.txt";

    public static void main(String args[]) throws IOException {
        new Samsonov_1().start();
    }

    private void start() throws IOException {

        int[] array = getArrayFromInputData();

        int min = array[0];
        int max = array[0];
        int min_next = array[0];
        int max_previous = array[0];

        int current;
        for (int i = 1; i < array.length; i++) {
            current = array[i];

            if (min == min_next) {
                if (current > min) {
                    min_next = current;
                } else {
                    min = current;
                }
            } else {
                if (current < min_next) {
                    if (current < min) {
                        min_next = min;
                        min = current;
                    } else {
                        min_next = current;
                    }
                }
            }

            if (max == max_previous) {
                if (current < max) {
                    max_previous = current;
                } else {
                    max = current;
                }
            } else {
                if (current > max_previous) {
                    if (current > max) {
                        max_previous = max;
                        max = current;
                    } else {
                        max_previous = current;
                    }
                }
            }

        }

        writeDataToFile(OUTPUT_FILE_PATH, min, max, min_next, max_previous);
    }

    private int[] getArrayFromInputData() throws IOException {
        LinkedList<Integer> inputData = readDataFromFile(INPUT_FILE_PATH);

        int N = inputData.getFirst();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = inputData.get(i + 1);
        }
        return array;
    }


    private LinkedList<Integer> readDataFromFile(String inputFilePath) throws IOException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(inputFilePath));
            LinkedList<Integer> list = new LinkedList<>();
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
            return list;
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }


    private void writeDataToFile(String outputFilePath, int... integers) throws IOException {
        Writer writer = null;
        try {
            writer = new FileWriter(outputFilePath);
            for (int value : integers) {
                writer.write(String.valueOf(value) + " ");
            }
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
