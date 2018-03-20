package edu.javatutorials.javadevmustknow._30___MyTestTasks.gpSolutions3.Task3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Samsonov_3 {
    private static final String PROJECT_PATH = System.getProperty("user.dir");
    private static final String MY_WORK_DIRECTORY = "/src/main/java/edu/javatutorials/javadevmustknow/_30___MyTestTasks/gpSolutions3/Task3";
    private static final String INPUT_FILE_PATH = PROJECT_PATH + MY_WORK_DIRECTORY + "/input.txt";
    private static final String OUTPUT_FILE_PATH = PROJECT_PATH + MY_WORK_DIRECTORY + "/output.txt";

    public static void main(String[] args) throws IOException {
        new Samsonov_3().start();
    }

    private void start() throws IOException {
        int N = readIntValueFromFile(INPUT_FILE_PATH);
        int digit = getDigitFromPosition(N);
        writeIntValueToFile(OUTPUT_FILE_PATH, digit);
    }

    private int getDigitFromPosition(int N) {
        int number = 1;
        int temp;
        int count;
        int firstDigit;

        while (true) {
            temp = number;
            count = howManyDigitsInNumber(number);
            while (true) {
                firstDigit = getFirstDigitFromNumber(temp);
                if (N == 1) {
                    return firstDigit;
                } else {
                    N--;
                    temp = deleteFirstDigitFromNumber(temp);
                    count--;
                    if (count == 0) {
                        break;
                    }
                }
            }
            number++;
        }

    }

    private int howManyDigitsInNumber(int number) {
        int count = 1;
        while (number / 10 > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    private int deleteFirstDigitFromNumber(int number) {
        int temp = number;
        int deep = 1;
        while (temp / 10 > 0) {
            temp = temp / 10;
            deep++;
        }
        for (int i = deep; i > 1; i--) {
            temp *= 10;
        }
        return number - temp;
    }

    private int getFirstDigitFromNumber(int number) {
        while (number / 10 > 0) {
            number = number / 10;
        }
        return number;
    }

    private int readIntValueFromFile(String inputFilePath) throws IOException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(inputFilePath));
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return 0;
    }

    private void writeIntValueToFile(String outputFilePath, int value) throws IOException {
        Writer writer = null;
        try {
            writer = new FileWriter(outputFilePath);
            writer.write(String.valueOf(value) + " ");
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }


}
