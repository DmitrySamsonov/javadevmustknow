package edu.javatutorials.javadevmustknow._30___MyTestTasks.gpSolutions3.Task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.LinkedList;
import java.util.Scanner;

public class Samsonov_2 {
    private static final String PROJECT_PATH = System.getProperty("user.dir");
    private static final String MY_WORK_DIRECTORY = "/src/main/java/edu/javatutorials/javadevmustknow/_30___MyTestTasks/gpSolutions3/Task2";
    private static final String INPUT_FILE_PATH = PROJECT_PATH + MY_WORK_DIRECTORY + "/input.txt";
    private static final String OUTPUT_FILE_PATH = PROJECT_PATH + MY_WORK_DIRECTORY + "/output.txt";

    public static void main(String[] args) throws IOException {
        new Samsonov_2().start();
    }

    private void start() throws IOException {
        int[] array = getArrayFromInputData();

        bubbleSort(array);

        writeDataToFile(OUTPUT_FILE_PATH, array);
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

    private void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;
        int a, aLength;
        int b, bLength;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                a = arr[j - 1];
                b = arr[j];

                aLength = 0;
                bLength = 0;
                if (a < 0) {
                    a *= -1;
                }
                if (b < 0) {
                    b *= -1;
                }

                while (true) {
                    a = a / 10;
                    if (a > 0)
                        aLength++;
                    else
                        break;
                }

                while (true) {
                    b = b / 10;
                    if (b > 0)
                        bLength++;
                    else
                        break;
                }

                if (aLength > bLength) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public LinkedList<Integer> readDataFromFile(String inputFilePath) throws IOException {
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


    public void writeDataToFile(String outputFilePath, int... integers) throws IOException {
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
